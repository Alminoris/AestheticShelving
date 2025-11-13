package net.alminoris.aestheticshelving.block.entity.renderer;

import net.alminoris.aestheticshelving.block.custom.TowerShelfBlock;
import net.alminoris.aestheticshelving.block.entity.TowerShelfBlockEntity;
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

import java.util.*;
import java.util.stream.Collectors;

import static net.minecraft.util.math.Vec3f.*;

public class TowerShelfBlockEntityRenderer implements BlockEntityRenderer<TowerShelfBlockEntity>
{
    public TowerShelfBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(TowerShelfBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        TreeMap<Integer, List<ItemStack>> oldStacks = entity.getRenderStack();

        Direction facing = entity.getCachedState().get(TowerShelfBlock.FACING);

        matrices.push();

        matrices.translate(0.5, 0.5, 0.5);
        switch (facing)
        {
            case NORTH -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(180));
            case WEST  -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(90));
            case EAST  -> matrices.multiply(POSITIVE_Y.getDegreesQuaternion(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5);

        float[] xArr = new float[] { 0.5f, 0.765f, 0.5f, 0.245f };
        float[] yArr = new float[] { 0.275f, 0.58f, 0.8875f };
        float[] zArr = new float[] { 0.245f, 0.5f, 0.765f, 0.5f };
        float[] yDegrees = new float[] { 0f, 90f, 180f, 270f };

        Map<Integer, List<ItemStack>> stacks = oldStacks.descendingMap();

        for (int i = 0; i < 3; i++)
        {
            List<ItemStack> layerStacks = stacks.get(i);
            if (layerStacks == null) continue;

            int j = 0;
            for (ItemStack stack : layerStacks)
            {
                if (j >= xArr.length) break;

                matrices.push();
                matrices.translate(xArr[j], (stack.getItem() instanceof BlockItem) ? yArr[i] : (yArr[i] - 0.0525f), zArr[j]);
                matrices.scale(0.2f, 0.2f, 0.2f);

                matrices.multiply(NEGATIVE_Y.getDegreesQuaternion(yDegrees[j]));

                if (stack.getItem() instanceof BlockItem)
                {
                    matrices.multiply(POSITIVE_Y.getDegreesQuaternion(135));
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