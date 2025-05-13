package net.alminoris.aestheticshelving.screen;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class NoBlockItemSlot extends Slot
{
    public NoBlockItemSlot(Inventory inventory, int index, int x, int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack)
    {
        return !(stack.getItem() instanceof BlockItem);
    }
}

