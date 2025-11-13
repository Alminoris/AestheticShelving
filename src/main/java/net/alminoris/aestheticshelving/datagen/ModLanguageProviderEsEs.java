package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderEsEs extends FabricLanguageProvider
{
    public ModLanguageProviderEsEs(FabricDataGenerator dataOutput)
    {
        super(dataOutput, "es_es");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("shelf_", "Estante de %s");
        woodObjects.put("standing_shelf_", "Estante de pie de %s");
        woodObjects.put("ceiling_shelf_", "Estante de techo de %s");
        woodObjects.put("corner_shelf_", "Estante de esquina de %s");
        woodObjects.put("ladder_shelf_", "Estante escalera de %s");
        woodObjects.put("tower_shelf_", "Estante torre de %s");


        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "piedra");
        stoneMaterials.put("tuff", "toba");
        stoneMaterials.put("blackstone", "piedra negra");
        stoneMaterials.put("andesite", "andesita");
        stoneMaterials.put("diorite", "diorita");
        stoneMaterials.put("granite", "granito");
        stoneMaterials.put("deepslate", "pizarra profunda");
        stoneMaterials.put("basalt_side", "basalto");
        stoneMaterials.put("quartz_block_bottom", "cuarzo");
        stoneMaterials.put("stone_bricks", "ladrillos de piedra");
        stoneMaterials.put("bricks", "ladrillos");
        stoneMaterials.put("mud_bricks", "ladrillos de barro");
        stoneMaterials.put("sandstone", "arenisca");
        stoneMaterials.put("dolomite_block", "dolomita");
        stoneMaterials.put("saltmarsh_block", "bloque de marisma salina");
        stoneMaterials.put("loessic_marl_block", "marga loésica");
        stoneMaterials.put("loamy_marl_block", "marga arcillosa");
        stoneMaterials.put("fossil_marlstone_block", "marga fósil");
        stoneMaterials.put("limestone_block", "caliza");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "ciprés calvo");
        woodMaterials.put("thuja", "tuya");
        woodMaterials.put("sequoia", "secuoya");
        woodMaterials.put("mountain_hemlock", "abeto de montaña");
        woodMaterials.put("cryptomeria", "criptomeria");
        woodMaterials.put("yew", "tejo");
        woodMaterials.put("larch", "alerce");
        woodMaterials.put("olive", "olivo");
        woodMaterials.put("tamarisk", "tamarisco");
        woodMaterials.put("western_serviceberry", "amelanchier occidental");
        woodMaterials.put("trembling_aspen", "álamo temblón");
        woodMaterials.put("cottonwood", "álamo algodonoso");
        woodMaterials.put("walnut", "nogal");
        woodMaterials.put("silver_maple", "arce plateado");
        woodMaterials.put("staghorn_sumac", "zumaque");
        woodMaterials.put("silverberry", "elaeagnus plateado");
        woodMaterials.put("willow", "sauce");
        woodMaterials.put("poplar", "álamo");
        woodMaterials.put("alder", "aliso");
        woodMaterials.put("aspen", "álamo temblón");
        woodMaterials.put("azalea", "azalea");
        woodMaterials.put("apple", "manzano");
        woodMaterials.put("scots_pine", "pino silvestre");
        woodMaterials.put("swamp_oak", "roble pantanoso");
        woodMaterials.put("aspen_nss", "álamo temblón");
        woodMaterials.put("cedar_nss", "cedro");
        woodMaterials.put("coconut_nss", "palmera de coco");
        woodMaterials.put("cypress_nss", "ciprés");
        woodMaterials.put("fir_nss", "abeto");
        woodMaterials.put("ghaf_nss", "ghaf");
        woodMaterials.put("larch_nss", "alerce");
        woodMaterials.put("mahogany_nss", "caoba");
        woodMaterials.put("maple_nss", "arce");
        woodMaterials.put("olive_nss", "olivo");
        woodMaterials.put("palo_verde_nss", "palo verde");
        woodMaterials.put("redwood_nss", "secuoya roja");
        woodMaterials.put("saxaul_nss", "saxaul");
        woodMaterials.put("sugi_nss", "sugi");
        woodMaterials.put("willow_nss", "sauce");
        woodMaterials.put("wisteria_nss", "glicinia");
        woodMaterials.put("oak", "roble");
        woodMaterials.put("birch", "abedul");
        woodMaterials.put("spruce", "abeto");
        woodMaterials.put("jungle", "madera selvática");
        woodMaterials.put("acacia", "acacia");
        woodMaterials.put("dark_oak", "roble oscuro");
        woodMaterials.put("crimson", "madera carmesí");
        woodMaterials.put("warped", "madera deformada");
        woodMaterials.put("mangrove", "madera de mangle");
        woodMaterials.put("cherry", "cerezo");
        woodMaterials.put("bamboo", "bambú");
        woodMaterials.put("hazelnut", "avellano");
        woodMaterials.put("hornbeam", "carpe");
        woodMaterials.put("hawthorn", "espino");
        woodMaterials.put("quince", "membrillo");
        woodMaterials.put("plum", "ciruelo");
        woodMaterials.put("mango", "mango");
        woodMaterials.put("fig", "higuera");
        woodMaterials.put("viburnum", "viburno");
        woodMaterials.put("white_mulberry", "moral blanco");
        woodMaterials.put("wild_cherry", "cerezo silvestre");
        woodMaterials.put("bauhinia", "bauhinia");
        woodMaterials.put("pine", "pino");
        woodMaterials.put("fir", "abeto");
        woodMaterials.put("cedar", "cedro");
        woodMaterials.put("araucaria", "araucaria");
        woodMaterials.put("juniper", "enebro");

        for (Map.Entry<String, String> type : woodObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "block." + AestheticShelving.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("itemgroup.ashelftab", "Aesthetic Shelving");
    }
}