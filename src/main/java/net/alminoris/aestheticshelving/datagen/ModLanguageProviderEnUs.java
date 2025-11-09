package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModLanguageProviderEnUs extends FabricLanguageProvider
{
    public ModLanguageProviderEnUs(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Registries.BLOCK.stream()
                .filter(block ->
                {
                    Identifier id = Registries.BLOCK.getId(block);
                    return AestheticShelving.MOD_ID.equals(id.getNamespace());
                })
                .forEach(block ->
                {
                    Identifier id = Registries.BLOCK.getId(block);
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

        translationBuilder.add("itemgroup.ashelftab", "Aesthetic Shelving");
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