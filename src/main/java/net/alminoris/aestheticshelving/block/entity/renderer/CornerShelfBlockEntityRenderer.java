package net.alminoris.aestheticshelving.block.entity.renderer;

import net.alminoris.aestheticshelving.block.custom.CornerShelfBlock;
import net.alminoris.aestheticshelving.block.entity.CornerShelfBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;

import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.Dictionary;
import java.util.List;

import static net.minecraft.util.math.Vec3f.POSITIVE_X;
import static net.minecraft.util.math.Vec3f.POSITIVE_Y;

public class CornerShelfBlockEntityRenderer implements BlockEntityRenderer<CornerShelfBlockEntity>
{
    public CornerShelfBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(CornerShelfBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        List<ItemStack> stacks = entity.getRenderStack();

        Direction facing = entity.getCachedState().get(CornerShelfBlock.FACING);

        matrices.push();

        matrices.translate(0.5, 0.5, 0.5);
        switch (facing) {
            case NORTH -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(180));
            case WEST  -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(90));
            case EAST  -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5);

        float[] xArr = new float[] { 0.525f, 0.85f };
        float[] zArr = new float[] { 0.15f, 0.475f };
        int i = 0;
        for (ItemStack stack : stacks)
        {
            matrices.push();
            matrices.translate(xArr[i], (stack.getItem() instanceof BlockItem) ? 0.64f : 0.5875f, zArr[i]);
            matrices.scale(0.25f, 0.25f, 0.25f);
            if (stack.getItem() instanceof BlockItem)
            {
                matrices.multiply(POSITIVE_Y.getDegreesQuaternion(315));
                matrices.multiply(POSITIVE_X.getDegreesQuaternion(330));
            }
            else
            {
                matrices.multiply(POSITIVE_X.getDegreesQuaternion(270));
            }

            itemRenderer.renderItem(stack, ModelTransformation.Mode.GUI,
                    getLightLevel(entity.getWorld(), entity.getPos()), OverlayTexture.DEFAULT_UV,
                    matrices, vertexConsumers, 1);

            matrices.pop();
            i++;
        }

        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos)
    {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}