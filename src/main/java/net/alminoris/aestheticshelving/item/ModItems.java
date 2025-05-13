package net.alminoris.aestheticshelving.item;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(AestheticShelving.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
