package net.alminoris.aestheticshelving.util.helper;

import net.alminoris.aestheticshelving.item.ModItemGroups;

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
                    "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt", "quartz", "blackstonebricks"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper"
            };

    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk"
            };

    public static String[] getWoods()
    {
        String[] combinedWoods = new String[WOODS.length + ModItemGroups.EXTRA_WOODS_AN.size() + ModItemGroups.EXTRA_WOODS_WF.size()];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(ModItemGroups.EXTRA_WOODS_AN.toArray(new String[ModItemGroups.EXTRA_WOODS_AN.size()]), 0, combinedWoods, WOODS.length, ModItemGroups.EXTRA_WOODS_AN.size());
        System.arraycopy(ModItemGroups.EXTRA_WOODS_WF.toArray(new String[ModItemGroups.EXTRA_WOODS_WF.size()]), 0, combinedWoods, WOODS.length+ModItemGroups.EXTRA_WOODS_AN.size(), ModItemGroups.EXTRA_WOODS_WF.size());
        return combinedWoods;
    }
}