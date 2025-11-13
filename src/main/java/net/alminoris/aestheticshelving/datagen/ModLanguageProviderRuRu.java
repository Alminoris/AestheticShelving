package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderRuRu extends FabricLanguageProvider
{
    public ModLanguageProviderRuRu(FabricDataGenerator dataOutput)
    {
        super(dataOutput, "ru_ru");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("shelf_", "Полка из %s");
        woodObjects.put("standing_shelf_", "Стоячая полка из %s");
        woodObjects.put("ceiling_shelf_", "Потолочная полка из %s");
        woodObjects.put("corner_shelf_", "Угловая полка из %s");
        woodObjects.put("ladder_shelf_", "Полка-лестница из %s");
        woodObjects.put("tower_shelf_", "Полка-башня из %s");


        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "камня");
        stoneMaterials.put("tuff", "туфа");
        stoneMaterials.put("blackstone", "чёрного камня");
        stoneMaterials.put("andesite", "андезита");
        stoneMaterials.put("diorite", "диорита");
        stoneMaterials.put("granite", "гранита");
        stoneMaterials.put("deepslate", "глубинного сланца");
        stoneMaterials.put("basalt_side", "базальта");
        stoneMaterials.put("quartz_block_bottom", "кварца");
        stoneMaterials.put("stone_bricks", "каменного кирпича");
        stoneMaterials.put("bricks", "кирпича");
        stoneMaterials.put("mud_bricks", "глиняного кирпича");
        stoneMaterials.put("sandstone", "песчаника");
        stoneMaterials.put("dolomite_block", "доломита");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лессового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинистого мергеля");
        stoneMaterials.put("fossil_marlstone_block", "ископаемого мергеля");
        stoneMaterials.put("limestone_block", "известняка");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туи");
        woodMaterials.put("sequoia", "секвойи");
        woodMaterials.put("mountain_hemlock", "горной тсуги");
        woodMaterials.put("cryptomeria", "криптомерии");
        woodMaterials.put("yew", "тиса");
        woodMaterials.put("larch", "лиственницы");
        woodMaterials.put("olive", "оливы");
        woodMaterials.put("tamarisk", "тамариска");
        woodMaterials.put("western_serviceberry", "ирги западной");
        woodMaterials.put("trembling_aspen", "осины");
        woodMaterials.put("cottonwood", "тополя хлопкового");
        woodMaterials.put("walnut", "грецкого ореха");
        woodMaterials.put("silver_maple", "серебристого клёна");
        woodMaterials.put("staghorn_sumac", "сумаха");
        woodMaterials.put("silverberry", "лохины серебристой");
        woodMaterials.put("willow", "ивы");
        woodMaterials.put("poplar", "тополя");
        woodMaterials.put("alder", "ольхи");
        woodMaterials.put("aspen", "осины");
        woodMaterials.put("azalea", "азалии");
        woodMaterials.put("apple", "яблони");
        woodMaterials.put("scots_pine", "сосны обыкновенной");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осины");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосовой пальмы");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "пихты");
        woodMaterials.put("ghaf_nss", "гафа");
        woodMaterials.put("larch_nss", "лиственницы");
        woodMaterials.put("mahogany_nss", "махагони");
        woodMaterials.put("maple_nss", "клёна");
        woodMaterials.put("olive_nss", "оливы");
        woodMaterials.put("palo_verde_nss", "пало верде");
        woodMaterials.put("redwood_nss", "секвойи");
        woodMaterials.put("saxaul_nss", "саксаула");
        woodMaterials.put("sugi_nss", "суги");
        woodMaterials.put("willow_nss", "ивы");
        woodMaterials.put("wisteria_nss", "глицинии");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берёзы");
        woodMaterials.put("spruce", "ели");
        woodMaterials.put("jungle", "тропического дерева");
        woodMaterials.put("acacia", "акации");
        woodMaterials.put("dark_oak", "тёмного дуба");
        woodMaterials.put("crimson", "багрового дерева");
        woodMaterials.put("warped", "искажённого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишни");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "фундука");
        woodMaterials.put("hornbeam", "граба");
        woodMaterials.put("hawthorn", "боярышника");
        woodMaterials.put("quince", "айвы");
        woodMaterials.put("plum", "сливы");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "инжира");
        woodMaterials.put("viburnum", "калины");
        woodMaterials.put("white_mulberry", "белой шелковицы");
        woodMaterials.put("wild_cherry", "черешни");
        woodMaterials.put("bauhinia", "баухинии");
        woodMaterials.put("pine", "сосны");
        woodMaterials.put("fir", "ели");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарии");
        woodMaterials.put("juniper", "можжевельника");

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