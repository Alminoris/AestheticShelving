package net.alminoris.aestheticshelving.util.helper;

import net.alminoris.aestheticshelving.item.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class BlockSetsHelper
{
    public static final String[] COLORS =
            {
                    "black", "brown", "gray", "light_gray",
                    "white", "red", "orange", "yellow",
                    "purple", "magenta", "pink", "blue",
                    "cyan", "light_blue", "green", "lime"
            };

    public static final String[] STONES =
            {
                    "stone", "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt_side",
                    "quartz_block_bottom", "stone_bricks", "bricks", "sandstone"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped"
            };

    public static String getKeyByValue(Hashtable<String, Block> table, Block value)
    {
        for (Map.Entry<String, Block> entry : table.entrySet())
        {
            if (entry.getValue().equals(value))
            {
                return entry.getKey();
            }
        }
        return null;
    }

    public static String getWoodName(Dictionary<String, Block> blocks, BlockEntity blockEntity)
    {
        Block block = Objects.requireNonNull(blockEntity.getWorld()).getBlockState(blockEntity.getPos()).getBlock();

        if (getKeyByValue((Hashtable<String, Block>) blocks, block) != null)
            return getKeyByValue((Hashtable<String, Block>) blocks, block);

        return "";
    }

    public static final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("acacia", 0x542d19);
        put("alder", 0x56241a);
        put("apple", 0x583e2a);
        put("araucaria", 0x4b330a);
        put("aspen_nss", 0x6c5726);
        put("aspen", 0x6a6354);
        put("azalea", 0x4b372c);
        put("bald_cypress", 0x39392c);
        put("bamboo", 0x605628);
        put("bauhinia", 0x372a20);
        put("birch", 0x60573c);
        put("cedar_nss", 0x4f2f2c);
        put("cedar", 0x463126);
        put("cherry", 0x715956);
        put("coconut_nss", 0x674336);
        put("cottonwood", 0x443d32);
        put("crimson", 0x321823);
        put("cryptomeria", 0x57452e);
        put("cypress_nss", 0x433a2c);
        put("dark_oak", 0x21150a);
        put("fig", 0x5f5041);
        put("fir_nss", 0x2e221e);
        put("fir", 0x452e1a);
        put("ghaf_nss", 0x46301d);
        put("hawthorn", 0x442210);
        put("hazelnut", 0x4b3f2d);
        put("hornbeam", 0x5d5c51);
        put("jungle", 0x503928);
        put("juniper", 0x5c3624);
        put("larch_nss", 0x282b2e);
        put("larch", 0x54473a);
        put("mahogany_nss", 0x371c14);
        put("mango", 0x593c23);
        put("mangrove", 0x3a1b18);
        put("maple_nss", 0x5b3f23);
        put("mountain_hemlock", 0x584531);
        put("oak", 0x514127);
        put("olive_nss", 0x2e2917);
        put("olive", 0x393428);
        put("palo_verde_nss", 0x444117);
        put("pine", 0x574a35);
        put("plum", 0x483337);
        put("poplar", 0x6e6142);
        put("quince", 0x664c35);
        put("redwood_nss", 0x27100e);
        put("saxaul_nss", 0x332b23);
        put("scots_pine", 0x645043);
        put("sequoia", 0x4f2f26);
        put("silverberry", 0x5d5845);
        put("silver_maple", 0x6d5b4c);
        put("spruce", 0x392a18);
        put("staghorn_sumac", 0x603931);
        put("sugi_nss", 0x2f1c15);
        put("swamp_oak", 0x3f3223);
        put("tamarisk", 0x271917);
        put("thuja", 0x3b2722);
        put("trembling_aspen", 0x4a473b);
        put("viburnum", 0x4e3428);
        put("walnut", 0x3e2f22);
        put("warped", 0x153431);
        put("western_serviceberry", 0x473325);
        put("white_mulberry", 0x594c18);
        put("wild_cherry", 0x6f512f);
        put("willow_nss", 0x18120a);
        put("willow", 0x5b5438);
        put("wisteria_nss", 0x564c43);
        put("yew", 0x483218);
    }};

    public static String[] getWoods()
    {
        int totalSize = WOODS.length
                + ModItemGroups.AN_WOOD_NAMES.size()
                + ModItemGroups.WF_WOOD_NAMES.size()
                + ModItemGroups.ST_WOOD_NAMES.size()
                + ModItemGroups.WT_WOOD_NAMES.size()
                + ModItemGroups.MT_WOOD_NAMES.size()
                + ModItemGroups.NSS_WOOD_NAMES.size();

        String[] combinedWoods = new String[totalSize];

        int currentIndex = 0;

        System.arraycopy(WOODS, 0, combinedWoods, currentIndex, WOODS.length);
        currentIndex += WOODS.length;

        System.arraycopy(ModItemGroups.AN_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.AN_WOOD_NAMES.size());
        currentIndex += ModItemGroups.AN_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.WF_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.WF_WOOD_NAMES.size());
        currentIndex += ModItemGroups.WF_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.ST_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.ST_WOOD_NAMES.size());
        currentIndex += ModItemGroups.ST_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.WT_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.WT_WOOD_NAMES.size());
        currentIndex += ModItemGroups.WT_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.MT_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.MT_WOOD_NAMES.size());
        currentIndex += ModItemGroups.MT_WOOD_NAMES.size();

        System.arraycopy(ModItemGroups.NSS_WOOD_NAMES.toArray(new String[0]), 0, combinedWoods, currentIndex, ModItemGroups.NSS_WOOD_NAMES.size());

        return combinedWoods;
    }

    public static String[] getStones()
    {
        int totalSize = STONES.length + ModItemGroups.EXTRA_STONES_WF.size();

        String[] combinedStones = new String[totalSize];

        int currentIndex = 0;

        System.arraycopy(STONES, 0, combinedStones, currentIndex, STONES.length);
        currentIndex += STONES.length;

        System.arraycopy(ModItemGroups.EXTRA_STONES_WF.toArray(new String[0]), 0, combinedStones, currentIndex, ModItemGroups.EXTRA_STONES_WF.size());

        return combinedStones;
    }

    public static String[] getWoodsNStones()
    {
        String[] combined = new String[getWoods().length + getStones().length];
        System.arraycopy(getWoods(), 0, combined, 0, getWoods().length);
        System.arraycopy(getStones(), 0, combined, getWoods().length, getStones().length);
        return combined;
    }
}