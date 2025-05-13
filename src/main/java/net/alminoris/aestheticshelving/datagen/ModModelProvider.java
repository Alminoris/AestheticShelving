package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.ModBlocks;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.alminoris.aestheticshelving.util.helper.ModJsonHelper;
import net.alminoris.aestheticshelving.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            registerShelf(blockStateModelGenerator,  ModBlocks.SHELVES.get(name),"minecraft:block/", "shelf_"+name, "stripped_"+name+"_"+logName, name+"_"+logName);
            registerStandingShelf(blockStateModelGenerator,  ModBlocks.STANDING_SHELVES.get(name),"minecraft:block/", "standing_shelf_"+name, "stripped_"+name+"_"+logName, name+"_"+logName);
            registerCeilingShelf(blockStateModelGenerator,  ModBlocks.CEILING_SHELVES.get(name),"minecraft:block/", "ceiling_shelf_"+name, "stripped_"+name+"_"+logName);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            registerShelf(blockStateModelGenerator,  ModBlocks.SHELVES.get(name),"aestheticshelving:block/", "shelf_"+name, "stripped_"+name+"_log", name+"_log");
            registerStandingShelf(blockStateModelGenerator,  ModBlocks.STANDING_SHELVES.get(name),"aestheticshelving:block/", "standing_shelf_"+name, "stripped_"+name+"_log", name+"_log");
            registerCeilingShelf(blockStateModelGenerator,  ModBlocks.CEILING_SHELVES.get(name),"aestheticshelving:block/", "ceiling_shelf_"+name, "stripped_"+name+"_log");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            registerShelf(blockStateModelGenerator, ModBlocks.SHELVES.get(name), "aestheticshelving:block/", "shelf_"+name, "stripped_"+name+"_log", name+"_log");
            registerStandingShelf(blockStateModelGenerator,  ModBlocks.STANDING_SHELVES.get(name),"aestheticshelving:block/", "standing_shelf_"+name, "stripped_"+name+"_log", name+"_log");
            registerCeilingShelf(blockStateModelGenerator,  ModBlocks.CEILING_SHELVES.get(name),"aestheticshelving:block/", "ceiling_shelf_"+name, "stripped_"+name+"_log");
        }
    }

    public void registerShelf(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName, String legName)
    {
        ModJsonHelper.registerShelfBlockModel(ModJsonTemplates.SHELF, name, modId+baseName, modId+legName, "normal");
        ModJsonHelper.registerShelfBlockModel(ModJsonTemplates.SHELF_CENTER, name, modId+baseName, modId+legName, "center");
        ModJsonHelper.registerShelfBlockModel(ModJsonTemplates.SHELF_LEFT, name, modId+baseName, modId+legName, "left");
        ModJsonHelper.registerShelfBlockModel(ModJsonTemplates.SHELF_RIGHT, name, modId+baseName, modId+legName, "right");
        ModJsonHelper.createBlockstate(ModJsonTemplates.SHELF_BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticShelving.MOD_ID, "block/"+ name));
    }

    public void registerStandingShelf(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName, String legName)
    {
        ModJsonHelper.registerStandingShelfBlockModel(ModJsonTemplates.STANDING_SHELF, name, modId+baseName, modId+legName);
        ModJsonHelper.createBlockstate(ModJsonTemplates.BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticShelving.MOD_ID, "block/"+ name));
    }

    public void registerCeilingShelf(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName)
    {
        ModJsonHelper.registerCeilingShelfBlockModel(ModJsonTemplates.CEILING_SHELF, name, modId+baseName);
        ModJsonHelper.createBlockstate(ModJsonTemplates.BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticShelving.MOD_ID, "block/"+ name));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}