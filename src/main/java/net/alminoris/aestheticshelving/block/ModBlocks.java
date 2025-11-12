package net.alminoris.aestheticshelving.block;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.custom.*;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> SHELVES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("shelf_"+name, new ShelfBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> STANDING_SHELVES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("standing_shelf_"+name, new StandingShelfBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> CEILING_SHELVES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("ceiling_shelf_"+name, new CeilingShelfBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> CORNER_SHELVES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("corner_shelf_"+name, new CornerShelfBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> TOWER_SHELVES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("tower_shelf_"+name, new TowerShelfBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> LADDER_SHELVES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("ladder_shelf_"+name, new LadderShelfBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticShelving.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticShelving.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}