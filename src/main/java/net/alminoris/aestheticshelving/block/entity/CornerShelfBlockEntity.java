package net.alminoris.aestheticshelving.block.entity;


import net.alminoris.aestheticshelving.screen.CornerShelfScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class CornerShelfBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory
{
    private final DefaultedList<ItemStack> INVENTORY = DefaultedList.ofSize(2, ItemStack.EMPTY);
    private String name;

    public CornerShelfBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.CORNER_SHELF_BLOCK_ENTITY, pos, state);
    }

    public List<ItemStack> getRenderStack()
    {
        Dictionary<Integer, List<ItemStack>> result = new Hashtable<>();
        List<ItemStack> res1 = new ArrayList<>();
        for(int i = 0; i < INVENTORY.size(); i++)
        {
            if (!this.getStack(i).isEmpty())
                res1.add(this.getStack(i));
        }

        return res1;
    }

    public void tick(World world, BlockPos pos, BlockState state)
    {
        if (world.isClient)
            return;

        name = Registries.BLOCK.getId(state.getBlock()).getPath();
    }

    @Override
    public void markDirty()
    {
        world.updateListeners(pos, getCachedState(), getCachedState(), 2);
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
    public Text getDisplayName()
    {
        return Text.translatable("block.aestheticshelving." + name);
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player)
    {
        return new CornerShelfScreenHandler(syncId, playerInventory, this);
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

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity serverPlayerEntity, PacketByteBuf packetByteBuf)
    {
        packetByteBuf.writeBlockPos(this.pos);
    }
}
