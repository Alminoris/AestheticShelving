package net.alminoris.aestheticshelving.block.entity.renderer;

import net.alminoris.aestheticshelving.block.custom.CeilingShelfBlock;
import net.alminoris.aestheticshelving.block.entity.CeilingShelfBlockEntity;
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

public class CeilingShelfBlockEntityRenderer implements BlockEntityRenderer<CeilingShelfBlockEntity>
{
    public CeilingShelfBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(CeilingShelfBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        List<ItemStack> stacks = entity.getRenderStack();

        Direction facing = entity.getCachedState().get(CeilingShelfBlock.FACING);

        matrices.push();

        matrices.translate(0.5, 0.5, 0.5);
        switch (facing) {
            case NORTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
            case SOUTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            case WEST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
            case EAST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5);

        float[] xArr = new float[] { 0.3f, 0.5f, 0.7f };

        int f = 0;
        for (ItemStack stack : stacks)
        {
            matrices.push();
            matrices.translate(xArr[f], (stack.getItem() instanceof BlockItem) ? 0.3275f : 0.275f, 0.5f);
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
            f++;
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