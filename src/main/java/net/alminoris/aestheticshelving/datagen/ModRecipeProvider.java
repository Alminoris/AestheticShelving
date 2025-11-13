package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.block.ModBlocks;
import net.alminoris.aestheticshelving.item.ModItemGroups;
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
    public ModRecipeProvider(FabricDataGenerator output)
    {
        super(output);
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
            registerCornerShelf(recipeExporter, ModBlocks.CORNER_SHELVES.get(name), block1, block);
            registerTowerShelf(recipeExporter, ModBlocks.TOWER_SHELVES.get(name), block1, block);
            registerLadderShelf(recipeExporter, ModBlocks.LADDER_SHELVES.get(name), block1, block);
            registerCeilingShelf(recipeExporter, ModBlocks.CEILING_SHELVES.get(name), Blocks.CHAIN, block);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("corner_shelf_" + name, "4", "arborealnature:" + name + "_log",
                    "arborealnature:stripped_" + name + "_log",
                    "\"#/\",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("tower_shelf_" + name, "3", "arborealnature:" + name + "_log",
                    "arborealnature:stripped_" + name + "_log",
                    "\" / \",", "\"/#/\",", "\"/#/\"");

            ModJsonHelper.createShapedRecipe("ladder_shelf_" + name, "2", "arborealnature:" + name + "_log",
                    "arborealnature:stripped_" + name + "_log",
                    "\"#/ \",", "\"#/ \",", "\" #/\"");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "arborealnature:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("corner_shelf_" + name, "4", "wildfields:" + name + "_log",
                    "wildfields:stripped_" + name + "_log",
                    "\"#/\",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("tower_shelf_" + name, "3", "wildfields:" + name + "_log",
                    "wildfields:stripped_" + name + "_log",
                    "\" / \",", "\"/#/\",", "\"/#/\"");

            ModJsonHelper.createShapedRecipe("ladder_shelf_" + name, "2", "wildfields:" + name + "_log",
                    "wildfields:stripped_" + name + "_log",
                    "\"#/ \",", "\"#/ \",", "\" #/\"");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "wildfields:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("corner_shelf_" + name, "4", "whisperleaftrees:" + name + "_log",
                    "whisperleaftrees:stripped_" + name + "_log",
                    "\"#/\",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("tower_shelf_" + name, "3", "whisperleaftrees:" + name + "_log",
                    "whisperleaftrees:stripped_" + name + "_log",
                    "\" / \",", "\"/#/\",", "\"/#/\"");

            ModJsonHelper.createShapedRecipe("ladder_shelf_" + name, "2", "whisperleaftrees:" + name + "_log",
                    "whisperleaftrees:stripped_" + name + "_log",
                    "\"#/ \",", "\"#/ \",", "\" #/\"");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "whisperleaftrees:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("corner_shelf_" + name, "4", "silverwoodtrees:" + name + "_log",
                    "silverwoodtrees:stripped_" + name + "_log",
                    "\"#/\",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("tower_shelf_" + name, "3", "silverwoodtrees:" + name + "_log",
                    "silverwoodtrees:stripped_" + name + "_log",
                    "\" / \",", "\"/#/\",", "\"/#/\"");

            ModJsonHelper.createShapedRecipe("ladder_shelf_" + name, "2", "silverwoodtrees:" + name + "_log",
                    "silverwoodtrees:stripped_" + name + "_log",
                    "\"#/ \",", "\"#/ \",", "\" #/\"");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "silverwoodtrees:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("corner_shelf_" + name, "4", "missingtrees:" + name + "_log",
                    "missingtrees:stripped_" + name + "_log",
                    "\"#/\",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("tower_shelf_" + name, "3", "missingtrees:" + name + "_log",
                    "missingtrees:stripped_" + name + "_log",
                    "\" / \",", "\"/#/\",", "\"/#/\"");

            ModJsonHelper.createShapedRecipe("ladder_shelf_" + name, "2", "missingtrees:" + name + "_log",
                    "missingtrees:stripped_" + name + "_log",
                    "\"#/ \",", "\"#/ \",", "\" #/\"");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "missingtrees:stripped_" + name + "_log",
                    "\"# #\",", "\"///\"", "");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("shelf_" + name, "4", "natures_spirit:" + name.replace("_nss", "") + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"#/#\"", "", "");

            ModJsonHelper.createShapedRecipe("standing_shelf_" + name, "4", "natures_spirit:" + name.replace("_nss", "") + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("corner_shelf_" + name, "4", "natures_spirit:" + name.replace("_nss", "") + "_log",
                    "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"#/\",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("tower_shelf_" + name, "3", "natures_spirit:" + name.replace("_nss", "") + "_log",
                    "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\" / \",", "\"/#/\",", "\"/#/\"");

            ModJsonHelper.createShapedRecipe("ladder_shelf_" + name, "2", "natures_spirit:" + name.replace("_nss", "") + "_log",
                    "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"#/ \",", "\"#/ \",", "\" #/\"");

            ModJsonHelper.createShapedRecipe("ceiling_shelf_" + name, "4", "minecraft:chain", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
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

    private void registerCornerShelf(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("#/")
                .pattern(" #")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerTowerShelf(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 3)
                .pattern(" / ")
                .pattern("/#/")
                .pattern("/#/")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerLadderShelf(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 2)
                .pattern("#/ ")
                .pattern("#/ ")
                .pattern(" #/")
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