package net.alminoris.aestheticshelving.screen;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class OneItemSlot extends Slot
{
    public OneItemSlot(Inventory inventory, int index, int x, int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public int getMaxItemCount()
    {
        return 1;
    }
}

