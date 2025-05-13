package net.alminoris.aestheticshelving.block.entity.renderer;

import net.alminoris.aestheticshelving.block.custom.StandingShelfBlock;
import net.alminoris.aestheticshelving.block.entity.StandingShelfBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.Dictionary;
import java.util.List;

public class StandingShelfBlockEntityRenderer implements BlockEntityRenderer<StandingShelfBlockEntity>
{
    public StandingShelfBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(StandingShelfBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        Dictionary<Integer, List<ItemStack>> stacks = entity.getRenderStack();

        // Враховуємо facing
        Direction facing = entity.getCachedState().get(StandingShelfBlock.FACING);

        matrices.push();

        // Центруємо і повертаємо полку згідно з facing
        matrices.translate(0.5, 0.5, 0.5); // центр блоку
        switch (facing) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case WEST  -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
            case EAST  -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5); // повертаємо назад

        float f = 0.25f;
        for (ItemStack stack : stacks.get(0))
        {
            matrices.push();
            matrices.translate(f, 0.875f, 0.65f);
            matrices.scale(0.25f, 0.25f, 0.25f);
            matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(270));

            itemRenderer.renderItem(stack, ModelTransformation.Mode.GUI,
                    getLightLevel(entity.getWorld(), entity.getPos()), OverlayTexture.DEFAULT_UV,
                    matrices, vertexConsumers, 1);

            matrices.pop();
            f += 1f / stacks.get(0).size();
        }

        f = 0.25f;
        for (ItemStack stack : stacks.get(1))
        {
            matrices.push();
            matrices.translate(f, 0.375f, 0.65f);
            matrices.scale(0.25f, 0.25f, 0.25f);
            matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(270));

            itemRenderer.renderItem(stack, ModelTransformation.Mode.GUI,
                    getLightLevel(entity.getWorld(), entity.getPos()), OverlayTexture.DEFAULT_UV,
                    matrices, vertexConsumers, 1);

            matrices.pop();
            f += 1f / stacks.get(1).size();
        }

        matrices.pop(); // головний push
    }


    private int getLightLevel(World world, BlockPos pos)
    {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}