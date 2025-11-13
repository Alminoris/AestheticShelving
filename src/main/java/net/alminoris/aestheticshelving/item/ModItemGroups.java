package net.alminoris.aestheticshelving.item;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups
{
    public static List<String> WF_WOOD_NAMES = List.of("olive", "tamarisk", "western_serviceberry", "trembling_aspen", "cottonwood");

    public static List<String> AN_WOOD_NAMES = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
            "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper",
            "bald_cypress", "thuja", "sequoia", "mountain_hemlock", "cryptomeria", "yew", "larch");

    public static List<String> EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block", "limestone_block");

    public static List<String> ST_WOOD_NAMES = List.of( "walnut", "silver_maple", "staghorn_sumac", "silverberry");

    public static List<String> WT_WOOD_NAMES = List.of("willow", "poplar", "alder", "aspen");

    public static List<String> MT_WOOD_NAMES = List.of("azalea", "apple", "scots_pine", "swamp_oak");

    public static List<String> NSS_WOOD_NAMES = List.of("aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
            "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss");

    public static final ItemGroup ASHELF_TAB = FabricItemGroupBuilder.build(new Identifier(AestheticShelving.MOD_ID, "ashelftab"),
            () -> new ItemStack(ModBlocks.SHELVES.get("oak")));

    public static void registerItemGroups()
    {
        WF_WOOD_NAMES = new ArrayList<>();

        AN_WOOD_NAMES = new ArrayList<>();

        EXTRA_STONES_WF = new ArrayList<>();

        ST_WOOD_NAMES = new ArrayList<>();

        WT_WOOD_NAMES = new ArrayList<>();

        MT_WOOD_NAMES = new ArrayList<>();

        NSS_WOOD_NAMES = new ArrayList<>();

        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
        {
            AN_WOOD_NAMES = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
                    "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper");
        }
        if (FabricLoader.getInstance().isModLoaded("wildfields"))
        {
            WF_WOOD_NAMES = List.of("olive", "tamarisk", "western_serviceberry");
            EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block");
        }
        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
        {
            ST_WOOD_NAMES = List.of( "walnut", "silver_maple", "staghorn_sumac", "silverberry");
        }
        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
        {
            WT_WOOD_NAMES = List.of("willow", "poplar", "alder", "aspen");
        }
        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
        {
            MT_WOOD_NAMES = List.of("azalea", "apple", "scots_pine", "swamp_oak");
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
        {
            NSS_WOOD_NAMES = List.of("aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
                    "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss");
        }
    }
}