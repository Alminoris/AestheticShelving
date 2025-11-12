package net.alminoris.aestheticshelving.item;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.ModBlocks;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup ASHELF_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticShelving.MOD_ID, "ashelftab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ashelftab"))
                    .icon(() -> new ItemStack(ModBlocks.SHELVES.get("oak"))).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.SHELVES.get(name));
                            entries.add(ModBlocks.STANDING_SHELVES.get(name));
                            entries.add(ModBlocks.CEILING_SHELVES.get(name));
                            entries.add(ModBlocks.CORNER_SHELVES.get(name));
                            entries.add(ModBlocks.LADDER_SHELVES.get(name));
                            entries.add(ModBlocks.TOWER_SHELVES.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.SHELVES.get(name));
                                entries.add(ModBlocks.STANDING_SHELVES.get(name));
                                entries.add(ModBlocks.CEILING_SHELVES.get(name));
                                entries.add(ModBlocks.CORNER_SHELVES.get(name));
                                entries.add(ModBlocks.LADDER_SHELVES.get(name));
                                entries.add(ModBlocks.TOWER_SHELVES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.SHELVES.get(name));
                                entries.add(ModBlocks.STANDING_SHELVES.get(name));
                                entries.add(ModBlocks.CEILING_SHELVES.get(name));
                                entries.add(ModBlocks.CORNER_SHELVES.get(name));
                                entries.add(ModBlocks.LADDER_SHELVES.get(name));
                                entries.add(ModBlocks.TOWER_SHELVES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : BlockSetsHelper.WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SHELVES.get(name));
                                entries.add(ModBlocks.STANDING_SHELVES.get(name));
                                entries.add(ModBlocks.CEILING_SHELVES.get(name));
                                entries.add(ModBlocks.CORNER_SHELVES.get(name));
                                entries.add(ModBlocks.LADDER_SHELVES.get(name));
                                entries.add(ModBlocks.TOWER_SHELVES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : BlockSetsHelper.ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SHELVES.get(name));
                                entries.add(ModBlocks.STANDING_SHELVES.get(name));
                                entries.add(ModBlocks.CEILING_SHELVES.get(name));
                                entries.add(ModBlocks.CORNER_SHELVES.get(name));
                                entries.add(ModBlocks.LADDER_SHELVES.get(name));
                                entries.add(ModBlocks.TOWER_SHELVES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : BlockSetsHelper.MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SHELVES.get(name));
                                entries.add(ModBlocks.STANDING_SHELVES.get(name));
                                entries.add(ModBlocks.CEILING_SHELVES.get(name));
                                entries.add(ModBlocks.CORNER_SHELVES.get(name));
                                entries.add(ModBlocks.LADDER_SHELVES.get(name));
                                entries.add(ModBlocks.TOWER_SHELVES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SHELVES.get(name));
                                entries.add(ModBlocks.STANDING_SHELVES.get(name));
                                entries.add(ModBlocks.CEILING_SHELVES.get(name));
                                entries.add(ModBlocks.CORNER_SHELVES.get(name));
                                entries.add(ModBlocks.LADDER_SHELVES.get(name));
                                entries.add(ModBlocks.TOWER_SHELVES.get(name));
                            }
                        }

                    }).build());

    public static void registerItemGroups()
    {

    }
}