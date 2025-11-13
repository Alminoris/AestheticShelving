package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ModLanguageProviderEnUs extends FabricLanguageProvider
{
    public ModLanguageProviderEnUs(FabricDataGenerator dataOutput)
    {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Registry.BLOCK.stream()
                .filter(block ->
                {
                    Identifier id = Registry.BLOCK.getId(block);
                    return AestheticShelving.MOD_ID.equals(id.getNamespace());
                })
                .forEach(block ->
                {
                    Identifier id = Registry.BLOCK.getId(block);
                    String path = id.getPath();

                    String pathNew = path;

                    pathNew = movePrefix(movePrefix(path, BlockSetsHelper.getStones()), BlockSetsHelper.getWoods());

                    String[] parts = pathNew.split("_");

                    String displayName = Arrays.stream(parts)
                            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                            .collect(Collectors.joining(" "));

                    displayName = displayName.replace(" Nss", "");

                    translationBuilder.add("block." + AestheticShelving.MOD_ID + "." + path, displayName);
                });

        translationBuilder.add("itemGroup.aestheticshelving.ashelftab", "Aesthetic Shelving");
    }

    public static String movePrefix(String input, String[] arr)
    {
        String[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted, (a, b) -> Integer.compare(b.length(), a.length()));

        for (String el : sorted)
        {
            String suffix = "_" + el;
            if (input.endsWith(suffix))
            {
                String base = input.substring(0, input.length() - suffix.length());

                return base.isEmpty() ? el : el + "_" + base;
            }
        }
        return input;
    }
}