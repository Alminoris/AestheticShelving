package net.alminoris.aestheticshelving.screen;

import net.alminoris.aestheticshelving.block.entity.StandingShelfBlockEntity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class StandingShelfScreenHandler extends ScreenHandler
{
    private final Inventory INVENTORY;
    public final StandingShelfBlockEntity blockEntity;

    //Client
    public StandingShelfScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf)
    {
        this(syncId, inventory, (StandingShelfBlockEntity) inventory.player.getWorld().getBlockEntity(buf.readBlockPos()));
    }

    //Server
    public StandingShelfScreenHandler(int syncId, PlayerInventory playerInventory,
                                      StandingShelfBlockEntity blockEntity)
    {
        super(ModScreenHandlers.STANDING_SHELF_SCREEN_HANDLER, syncId);
        checkSize(blockEntity, 4);
        this.INVENTORY = blockEntity;
        INVENTORY.onOpen(playerInventory.player);
        this.blockEntity = blockEntity;

        this.addSlot(new OneItemSlot(INVENTORY, 0, 71, 21));
        this.addSlot(new OneItemSlot(INVENTORY, 1, 89, 21));
        this.addSlot(new OneItemSlot(INVENTORY, 2, 71, 48));
        this.addSlot(new OneItemSlot(INVENTORY, 3, 89, 48));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot)
    {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);

        if (slot != null && slot.hasStack())
        {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();

            int containerSize = this.INVENTORY.size();
            int totalSlots = this.slots.size();

            if (invSlot < containerSize)
            {
                if (!this.insertItem(originalStack, containerSize, totalSlots, true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else
            {
                if (!this.insertItem(originalStack, 0, containerSize, false))
                {
                    return ItemStack.EMPTY;
                }
            }

            if (originalStack.isEmpty())
            {
                slot.setStack(ItemStack.EMPTY);
            }
            else
            {
                slot.markDirty();
            }
        }
        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player)
    {
        return this.INVENTORY.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory)
    {
        for (int i = 0; i < 3; ++i)
        {
            for (int l = 0; l < 9; ++l)
            {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory)
    {
        for (int i = 0; i < 9; ++i)
        {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}