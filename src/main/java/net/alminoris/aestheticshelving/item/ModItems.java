package net.alminoris.aestheticshelving.item;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AestheticShelving.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
