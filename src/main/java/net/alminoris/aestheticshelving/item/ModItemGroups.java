package net.alminoris.aestheticshelving.item;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.ModBlocks;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar"
            };

    public static final ItemGroup ASURF_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticShelving.MOD_ID, "asurftab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.asurftab"))
                    .icon(() -> new ItemStack(Blocks.RED_CARPET)).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.COLORS)
                        {
                            entries.add(ModBlocks.SIMPLE_SHELVES.get(name));
                        }
                        for(String name : BlockSetsHelper.COLORS)
                        {
                            entries.add(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name));
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}