package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderDeDe extends FabricLanguageProvider
{
    public ModLanguageProviderDeDe(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("cupboard_", "Schrank aus %s");
        woodObjects.put("cabinet_", "Schränkchen aus %s");
        woodObjects.put("cabinet_flipup", "Oberschrank aus %s");
        woodObjects.put("cabinet_flipdown_", "Unterschrank aus %s");
        woodObjects.put("halfcupboard_", "Kleiner Schrank aus %s");
        woodObjects.put("halfcabinet_", "Kleines Schränkchen aus %s");
        woodObjects.put("halfcabinet_flipup", "Oberer kleiner Schrank aus %s");
        woodObjects.put("halfcabinet_flipdown_", "Unterer kleiner Schrank aus %s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "Stein");
        stoneMaterials.put("tuff", "Tuff");
        stoneMaterials.put("blackstone", "Schwarzstein");
        stoneMaterials.put("andesite", "Andesit");
        stoneMaterials.put("diorite", "Diorit");
        stoneMaterials.put("granite", "Granit");
        stoneMaterials.put("deepslate", "Tiefenschiefer");
        stoneMaterials.put("basalt_side", "Basalt");
        stoneMaterials.put("quartz_block_bottom", "Quarz");
        stoneMaterials.put("stone_bricks", "Steinziegel");
        stoneMaterials.put("bricks", "Ziegel");
        stoneMaterials.put("mud_bricks", "Lehmziegel");
        stoneMaterials.put("sandstone", "Sandstein");
        stoneMaterials.put("dolomite_block", "Dolomit");
        stoneMaterials.put("saltmarsh_block", "Salzmarschstein");
        stoneMaterials.put("loessic_marl_block", "Lössmergel");
        stoneMaterials.put("loamy_marl_block", "Lehmmergel");
        stoneMaterials.put("fossil_marlstone_block", "Fossiler Mergelstein");
        stoneMaterials.put("limestone_block", "Kalkstein");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "Sumpfzypresse");
        woodMaterials.put("thuja", "Lebensbaum");
        woodMaterials.put("sequoia", "Mammutbaum");
        woodMaterials.put("mountain_hemlock", "Berg-Hemlocktanne");
        woodMaterials.put("cryptomeria", "Kryptomerie");
        woodMaterials.put("yew", "Eibe");
        woodMaterials.put("larch", "Lärche");
        woodMaterials.put("olive", "Olive");
        woodMaterials.put("tamarisk", "Tamariske");
        woodMaterials.put("western_serviceberry", "Felsenmispel");
        woodMaterials.put("trembling_aspen", "Zitterpappel");
        woodMaterials.put("cottonwood", "Pappel");
        woodMaterials.put("walnut", "Walnuss");
        woodMaterials.put("silver_maple", "Silberahorn");
        woodMaterials.put("staghorn_sumac", "Essigbaum");
        woodMaterials.put("silverberry", "Silberbeere");
        woodMaterials.put("willow", "Weide");
        woodMaterials.put("poplar", "Pappel");
        woodMaterials.put("alder", "Erle");
        woodMaterials.put("aspen", "Espe");
        woodMaterials.put("azalea", "Azalee");
        woodMaterials.put("apple", "Apfelbaum");
        woodMaterials.put("scots_pine", "Waldkiefer");
        woodMaterials.put("swamp_oak", "Sumpfeiche");
        woodMaterials.put("aspen_nss", "Espe");
        woodMaterials.put("cedar_nss", "Zeder");
        woodMaterials.put("coconut_nss", "Kokospalme");
        woodMaterials.put("cypress_nss", "Zypresse");
        woodMaterials.put("fir_nss", "Tanne");
        woodMaterials.put("ghaf_nss", "Ghaf");
        woodMaterials.put("larch_nss", "Lärche");
        woodMaterials.put("mahogany_nss", "Mahagoni");
        woodMaterials.put("maple_nss", "Ahorn");
        woodMaterials.put("olive_nss", "Olive");
        woodMaterials.put("palo_verde_nss", "Palo Verde");
        woodMaterials.put("redwood_nss", "Riesenmammutbaum");
        woodMaterials.put("saxaul_nss", "Saxaul");
        woodMaterials.put("sugi_nss", "Sugi");
        woodMaterials.put("willow_nss", "Weide");
        woodMaterials.put("wisteria_nss", "Glyzinie");
        woodMaterials.put("oak", "Eiche");
        woodMaterials.put("birch", "Birke");
        woodMaterials.put("spruce", "Fichte");
        woodMaterials.put("jungle", "Tropenholz");
        woodMaterials.put("acacia", "Akazie");
        woodMaterials.put("dark_oak", "Dunkeleiche");
        woodMaterials.put("crimson", "Purpurholz");
        woodMaterials.put("warped", "Wirrholz");
        woodMaterials.put("mangrove", "Mangrovenholz");
        woodMaterials.put("cherry", "Kirschbaum");
        woodMaterials.put("bamboo", "Bambus");
        woodMaterials.put("hazelnut", "Hasel");
        woodMaterials.put("hornbeam", "Hainbuche");
        woodMaterials.put("hawthorn", "Weißdorn");
        woodMaterials.put("quince", "Quitte");
        woodMaterials.put("plum", "Pflaume");
        woodMaterials.put("mango", "Mango");
        woodMaterials.put("fig", "Feige");
        woodMaterials.put("viburnum", "Schneeball");
        woodMaterials.put("white_mulberry", "Weiße Maulbeere");
        woodMaterials.put("wild_cherry", "Wildkirsche");
        woodMaterials.put("bauhinia", "Bauhinie");
        woodMaterials.put("pine", "Kiefer");
        woodMaterials.put("fir", "Tanne");
        woodMaterials.put("cedar", "Zeder");
        woodMaterials.put("araucaria", "Araukarie");
        woodMaterials.put("juniper", "Wacholder");

        for (Map.Entry<String, String> type : woodObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "block." + AestheticShelving.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("item." + AestheticShelving.MOD_ID + ".wrench", "Schraubenschlüssel");

        translationBuilder.add("itemgroup.ashelftab", "Aesthetic Shelving");
    }
}