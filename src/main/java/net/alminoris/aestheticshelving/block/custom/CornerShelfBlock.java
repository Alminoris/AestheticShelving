package net.alminoris.aestheticshelving.block.custom;

import com.mojang.serialization.MapCodec;
import net.alminoris.aestheticshelving.block.entity.ModBlockEntities;
import net.alminoris.aestheticshelving.block.entity.CornerShelfBlockEntity;
import net.alminoris.aestheticshelving.block.entity.ShelfBlockEntity;
import net.alminoris.aestheticshelving.util.helper.VoxelShapeHelper;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CornerShelfBlock extends BlockWithEntity implements BlockEntityProvider
{
    private static final VoxelShape SHAPE = Block.createCuboidShape(9, 7, 0, 16, 9, 7);
    private static final VoxelShape SHAPE1 = Block.createCuboidShape(6, 7, 0, 16, 9, 4);
    private static final VoxelShape SHAPE2 = Block.createCuboidShape(12, 7, 0, 16, 9, 10);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public CornerShelfBlock(Settings settings)
    {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        boxes.add(SHAPE.getBoundingBox());
        boxes.add(SHAPE1.getBoundingBox());
        boxes.add(SHAPE2.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state)
    {
        return new CornerShelfBlockEntity(pos, state);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        boolean waterlogged = ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER;
        return this.getDefaultState().with(FACING, ctx.getPlayer().getHorizontalFacing()).with(WATERLOGGED, waterlogged);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
        Direction facing = state.get(FACING);
        BlockPos supportPos = pos.offset(facing);
        BlockPos supportPos1 = pos.offset(facing.rotateYClockwise());
        return world.getBlockState(supportPos).isSolidBlock(world, supportPos) && world.getBlockState(supportPos1).isSolidBlock(world, supportPos1);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (state.get(WATERLOGGED))
        {
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        Direction facing = state.get(FACING);
        if (direction == facing || direction == facing.rotateYClockwise())
        {
            BlockPos supportPos = pos.offset(facing);
            BlockPos supportPos1 = pos.offset(facing.rotateYClockwise());

            if (!world.getBlockState(supportPos).isSolidBlock(world, supportPos) || !world.getBlockState(supportPos1).isSolidBlock(world, supportPos1))
            {
                if (world instanceof World realWorld)
                {
                    realWorld.breakBlock(pos, true);
                }
                return Blocks.AIR.getDefaultState();
            }
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }


    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved)
    {
        if (state.getBlock() != newState.getBlock())
        {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CornerShelfBlockEntity)
            {
                ItemScatterer.spawn(world, pos, (CornerShelfBlockEntity)blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if (!world.isClient)
        {
            NamedScreenHandlerFactory screenHandlerFactory = ((CornerShelfBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null)
                player.openHandledScreen(screenHandlerFactory);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type)
    {
        return type == ModBlockEntities.CORNER_SHELF_BLOCK_ENTITY ? (world1, pos, state1, blockEntity) ->
        {
            if (blockEntity instanceof CornerShelfBlockEntity shelfBlockEntity)
            {
                shelfBlockEntity.tick(world1, pos, state1);
            }
        } : null;
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
    }
}