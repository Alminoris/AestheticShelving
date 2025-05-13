package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.block.ModBlocks;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            addDrop(ModBlocks.SHELVES.get(name));
            addDrop(ModBlocks.STANDING_SHELVES.get(name));
            addDrop(ModBlocks.CEILING_SHELVES.get(name));
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            addDrop(ModBlocks.SHELVES.get(name));
            addDrop(ModBlocks.STANDING_SHELVES.get(name));
            addDrop(ModBlocks.CEILING_SHELVES.get(name));
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            addDrop(ModBlocks.SHELVES.get(name));
            addDrop(ModBlocks.STANDING_SHELVES.get(name));
            addDrop(ModBlocks.CEILING_SHELVES.get(name));
        }
    }
}