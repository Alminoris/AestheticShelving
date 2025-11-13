package net.alminoris.aestheticshelving.datagen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderUkUa extends FabricLanguageProvider
{
    public ModLanguageProviderUkUa(FabricDataGenerator dataOutput)
    {
        super(dataOutput, "uk_ua");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> woodNStoneObjects = new LinkedHashMap<>();

        Map<String, String> stoneObjects = new LinkedHashMap<>();

        Map<String, String> woodObjects = new LinkedHashMap<>();
        woodObjects.put("shelf_", "Полиця з %s");
        woodObjects.put("standing_shelf_", "Стояча полиця з %s");
        woodObjects.put("ceiling_shelf_", "Стельова полиця з %s");
        woodObjects.put("corner_shelf_", "Кутова полиця з %s");
        woodObjects.put("ladder_shelf_", "Полиця-драбина з %s");
        woodObjects.put("tower_shelf_", "Полиця-вежа з %s");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "каменю");
        stoneMaterials.put("tuff", "туфу");
        stoneMaterials.put("blackstone", "чорного каменю");
        stoneMaterials.put("andesite", "андезиту");
        stoneMaterials.put("diorite", "діориту");
        stoneMaterials.put("granite", "граніту");
        stoneMaterials.put("deepslate", "глибокої сланцю");
        stoneMaterials.put("basalt_side", "базальту");
        stoneMaterials.put("quartz_block_bottom", "кварцу");
        stoneMaterials.put("stone_bricks", "кам’яної цегли");
        stoneMaterials.put("bricks", "цегли");
        stoneMaterials.put("mud_bricks", "глиняної цегли");
        stoneMaterials.put("sandstone", "піщанику");
        stoneMaterials.put("dolomite_block", "доломіту");
        stoneMaterials.put("saltmarsh_block", "солончака");
        stoneMaterials.put("loessic_marl_block", "лессового мергеля");
        stoneMaterials.put("loamy_marl_block", "суглинкового мергеля");
        stoneMaterials.put("fossil_marlstone_block", "викопного мергеля");
        stoneMaterials.put("limestone_block", "вапняку");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "болотного кипариса");
        woodMaterials.put("thuja", "туї");
        woodMaterials.put("sequoia", "секвої");
        woodMaterials.put("mountain_hemlock", "гірської тсуги");
        woodMaterials.put("cryptomeria", "криптомерії");
        woodMaterials.put("yew", "тису");
        woodMaterials.put("larch", "модрини");
        woodMaterials.put("olive", "оливи");
        woodMaterials.put("tamarisk", "тамаріску");
        woodMaterials.put("western_serviceberry", "ірги західної");
        woodMaterials.put("trembling_aspen", "осики");
        woodMaterials.put("cottonwood", "тополі бавовникової");
        woodMaterials.put("walnut", "горіха");
        woodMaterials.put("silver_maple", "сріблястого клена");
        woodMaterials.put("staghorn_sumac", "сузу");
        woodMaterials.put("silverberry", "лохини сріблястої");
        woodMaterials.put("willow", "верби");
        woodMaterials.put("poplar", "тополі");
        woodMaterials.put("alder", "вільхи");
        woodMaterials.put("aspen", "осики");
        woodMaterials.put("azalea", "азалії");
        woodMaterials.put("apple", "яблуні");
        woodMaterials.put("scots_pine", "сосни звичайної");
        woodMaterials.put("swamp_oak", "болотного дуба");
        woodMaterials.put("aspen_nss", "осики");
        woodMaterials.put("cedar_nss", "кедра");
        woodMaterials.put("coconut_nss", "кокосової пальми");
        woodMaterials.put("cypress_nss", "кипариса");
        woodMaterials.put("fir_nss", "ялиці");
        woodMaterials.put("ghaf_nss", "гафу");
        woodMaterials.put("larch_nss", "модрини");
        woodMaterials.put("mahogany_nss", "махаґоні");
        woodMaterials.put("maple_nss", "клена");
        woodMaterials.put("olive_nss", "оливи");
        woodMaterials.put("palo_verde_nss", "пало верде");
        woodMaterials.put("redwood_nss", "секвої");
        woodMaterials.put("saxaul_nss", "саксаулу");
        woodMaterials.put("sugi_nss", "суґі");
        woodMaterials.put("willow_nss", "верби");
        woodMaterials.put("wisteria_nss", "гліцинії");
        woodMaterials.put("oak", "дуба");
        woodMaterials.put("birch", "берези");
        woodMaterials.put("spruce", "ялиці");
        woodMaterials.put("jungle", "тропічного дерева");
        woodMaterials.put("acacia", "акації");
        woodMaterials.put("dark_oak", "темного дуба");
        woodMaterials.put("crimson", "пурпурового дерева");
        woodMaterials.put("warped", "деформованого дерева");
        woodMaterials.put("mangrove", "мангрового дерева");
        woodMaterials.put("cherry", "вишні");
        woodMaterials.put("bamboo", "бамбука");
        woodMaterials.put("hazelnut", "ліщини");
        woodMaterials.put("hornbeam", "грабу");
        woodMaterials.put("hawthorn", "глоду");
        woodMaterials.put("quince", "айви");
        woodMaterials.put("plum", "сливи");
        woodMaterials.put("mango", "манго");
        woodMaterials.put("fig", "інжиру");
        woodMaterials.put("viburnum", "калини");
        woodMaterials.put("white_mulberry", "білої шовковиці");
        woodMaterials.put("wild_cherry", "черешні");
        woodMaterials.put("bauhinia", "баухінії");
        woodMaterials.put("pine", "сосни");
        woodMaterials.put("fir", "ялини");
        woodMaterials.put("cedar", "кедра");
        woodMaterials.put("araucaria", "араукарії");
        woodMaterials.put("juniper", "ялівця");

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