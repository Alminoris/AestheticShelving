package net.alminoris.aestheticshelving.block.entity.renderer;

import net.alminoris.aestheticshelving.block.custom.LadderShelfBlock;
import net.alminoris.aestheticshelving.block.entity.LadderShelfBlockEntity;
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

import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LadderShelfBlockEntityRenderer implements BlockEntityRenderer<LadderShelfBlockEntity>
{
    public LadderShelfBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(LadderShelfBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        TreeMap<Integer, List<ItemStack>> oldStacks = entity.getRenderStack();

        Direction facing = entity.getCachedState().get(LadderShelfBlock.FACING);

        matrices.push();

        matrices.translate(0.5, 0.5, 0.5);
        switch (facing)
        {
            case Direction.NORTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
            case Direction.SOUTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            case Direction.WEST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
            case Direction.EAST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5);

        float[][] xArr = new float[][]
                {
                    new float[] { 0.375f, 0.625f },
                    new float[] { 0.3f, 0.5f, 0.7f },
                    new float[] { 0.35f, 0.35f, 0.65f, 0.65f },
                    new float[] { 0.3f, 0.3f, 0.5f, 0.7f, 0.7f}
                };
        float[][] zArr = new float[][]
                {
                        new float[] { 0.15f, 0.15f },
                        new float[] { 0.25f, 0.25f, 0.25f },
                        new float[] { 0.5f, 0.25f, 0.25f, 0.5f },
                        new float[] { 0.5f, 0.25f, 0.375f, 0.25f, 0.5f}
                };

        Map<Integer, List<ItemStack>> stacks = oldStacks.descendingMap();

        float[] yArr = new float[] { 1.6575f, 1.225f, 0.7825f, 0.3525f };

        for (int i = 0; i < stacks.size(); i++)
        {
            int j = 0;
            for (ItemStack stack : stacks.get(i))
            {
                matrices.push();
                matrices.translate(xArr[i][j], !(stack.getItem() instanceof BlockItem) ? (yArr[i] - 0.0525f) : yArr[i], zArr[i][j]);
                matrices.scale(0.2f, 0.2f, 0.2f);
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
                j++;
            }
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