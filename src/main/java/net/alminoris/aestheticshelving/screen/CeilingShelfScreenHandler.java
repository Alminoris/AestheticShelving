package net.alminoris.aestheticshelving.screen;

import net.alminoris.aestheticshelving.block.entity.CeilingShelfBlockEntity;
import net.alminoris.aestheticshelving.network.BlockPosPayload;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class CeilingShelfScreenHandler extends ScreenHandler
{
    private final Inventory INVENTORY;
    public final CeilingShelfBlockEntity blockEntity;

    //Client
    public CeilingShelfScreenHandler(int syncId, PlayerInventory inventory, BlockPosPayload payload)
    {
        this(syncId, inventory, (CeilingShelfBlockEntity) inventory.player.getWorld().getBlockEntity(payload.pos()));
    }

    //Server
    public CeilingShelfScreenHandler(int syncId, PlayerInventory playerInventory,
                                     CeilingShelfBlockEntity blockEntity)
    {
        super(ModScreenHandlers.CEILING_SHELF_SCREEN_HANDLER, syncId);
        checkSize(blockEntity, 3);
        this.INVENTORY = blockEntity;
        INVENTORY.onOpen(playerInventory.player);
        this.blockEntity = blockEntity;

        this.addSlot(new Slot(INVENTORY, 0, 62, 34));
        this.addSlot(new Slot(INVENTORY, 1, 80, 34));
        this.addSlot(new Slot(INVENTORY, 2, 98, 34));

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