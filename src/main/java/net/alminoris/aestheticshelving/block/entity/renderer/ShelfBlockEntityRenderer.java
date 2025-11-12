package net.alminoris.aestheticshelving.block.entity.renderer;

import net.alminoris.aestheticshelving.block.custom.ShelfBlock;
import net.alminoris.aestheticshelving.block.entity.ShelfBlockEntity;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.List;

public class ShelfBlockEntityRenderer implements BlockEntityRenderer<ShelfBlockEntity>
{
    public ShelfBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(ShelfBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        List<ItemStack> stacks = entity.getRenderStack();

        // Враховуємо facing
        Direction facing = entity.getCachedState().get(ShelfBlock.FACING);

        matrices.push();

        // Центруємо і повертаємо полку згідно з facing
        matrices.translate(0.5, 0.5, 0.5); // центр блоку
        switch (facing) {
            case Direction.NORTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
            case Direction.SOUTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            case Direction.WEST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
            case Direction.EAST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5); // повертаємо назад

        float f = 0.175f;
        for (ItemStack stack : stacks)
        {
            matrices.push();
            matrices.translate(f, (stack.getItem() instanceof BlockItem) ? 0.64f : 0.5875f, 0.20f);
            matrices.scale(0.25f, 0.25f, 0.25f);
            if (stack.getItem() instanceof BlockItem)
            {
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(315));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(330));
            }
            else
            {
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(270));
            }

            itemRenderer.renderItem(stack, ModelTransformationMode.GUI,
                    getLightLevel(entity.getWorld(), entity.getPos()), OverlayTexture.DEFAULT_UV,
                    matrices, vertexConsumers, entity.getWorld(), 1);

            matrices.pop();
            f += 1f / stacks.size();
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
