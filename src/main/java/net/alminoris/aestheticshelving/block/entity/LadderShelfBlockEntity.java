package net.alminoris.aestheticshelving.block.entity;


import net.alminoris.aestheticshelving.screen.LadderShelfScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class LadderShelfBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory
{
    private final DefaultedList<ItemStack> INVENTORY = DefaultedList.ofSize(14, ItemStack.EMPTY);
    private String name;

    public LadderShelfBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.LADDER_SHELF_BLOCK_ENTITY, pos, state);
    }

    public TreeMap<Integer, List<ItemStack>> getRenderStack()
    {
        TreeMap<Integer, List<ItemStack>> result = new TreeMap<>();

        List<ItemStack> res1 = new ArrayList<>();
        List<ItemStack> res2 = new ArrayList<>();
        List<ItemStack> res3 = new ArrayList<>();
        List<ItemStack> res4 = new ArrayList<>();

        for (int i = 0; i < INVENTORY.size(); i++)
        {
            ItemStack stack = this.getStack(i);
            if (stack.isEmpty()) continue;

            if (i < 2) res1.add(stack);
            else if (i < 5) res2.add(stack);
            else if (i < 9) res3.add(stack);
            else res4.add(stack);
        }

        result.put(0, res1);
        result.put(1, res2);
        result.put(2, res3);
        result.put(3, res4);

        return result;
    }

    public void tick(World world, BlockPos pos, BlockState state)
    {
        if (world.isClient)
            return;

        name = Registry.BLOCK.getId(state.getBlock()).getPath();
    }

    @Override
    public void markDirty()
    {
        world.updateListeners(pos, getCachedState(), getCachedState(), 14);
        super.markDirty();
    }

    @Override
    public DefaultedList<ItemStack> getItems()
    {
        return INVENTORY;
    }

    @Override
    protected void writeNbt(NbtCompound nbt)
    {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, INVENTORY);
    }

    @Override
    public void readNbt(NbtCompound nbt)
    {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, INVENTORY);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity serverPlayerEntity, PacketByteBuf packetByteBuf)
    {
        packetByteBuf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName()
    {
        return new TranslatableText("block.aestheticshelving." + name);
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player)
    {
        return new LadderShelfScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public @Nullable Packet<ClientPlayPacketListener> toUpdatePacket()
    {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt()
    {
        return createNbt();
    }
}