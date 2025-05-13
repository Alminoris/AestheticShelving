package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.block.ModBlocks;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.alminoris.aestheticshelving.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator dataGenerator) 
    {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block = Registry.BLOCK.get(new Identifier("minecraft","stripped_"+name+"_"+blockName));
            Block block1 = Registry.BLOCK.get(new Identifier("minecraft",name+"_"+blockName));
            registerShelf(recipeExporter, ModBlocks.SHELVES.get(name), block1, block);
            registerStandingShelf(recipeExporter, ModBlocks.STANDING_SHELVES.get(name), block1, block);
            registerCeilingShelf(recipeExporter, ModBlocks.CEILING_SHELVES.get(name), Blocks.CHAIN, block);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "arborealnature:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "wildfields:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }
    }

    private void registerShelf(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("#/#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerStandingShelf(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("/#")
                .pattern("/#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCeilingShelf(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("# #")
                .pattern("///")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }
}