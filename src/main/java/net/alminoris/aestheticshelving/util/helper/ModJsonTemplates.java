package net.alminoris.aestheticshelving.util.helper;

public class ModJsonTemplates
{
    public static String SHAPED_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "category": "building",
              "key": {
                "#": {
                  "item": "INGREDIENT1_NAME"
                },
                "/": {
                  "item": "INGREDIENT2_NAME"
                }
              },
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "result": {
                "count": COUNT,
                "item": "aestheticshelving:OUTPUT_NAME"
              }
            }
            """;

    public static String SHELF_BLOCKSTATE = """
            {
              "variants": {
                "facing=north,variant=normal": { "model": "aestheticshelving:block/NAME" },
                "facing=south,variant=normal": { "model": "aestheticshelving:block/NAME", "y": 180 },
                "facing=west,variant=normal": { "model": "aestheticshelving:block/NAME", "y": 270 },
                "facing=east,variant=normal": { "model": "aestheticshelving:block/NAME", "y": 90 },
                "facing=north,variant=center": { "model": "aestheticshelving:block/NAME_center" },
                "facing=south,variant=center": { "model": "aestheticshelving:block/NAME_center", "y": 180 },
                "facing=west,variant=center": { "model": "aestheticshelving:block/NAME_center", "y": 270 },
                "facing=east,variant=center": { "model": "aestheticshelving:block/NAME_center", "y": 90 },
                "facing=north,variant=left": { "model": "aestheticshelving:block/NAME_left" },
                "facing=south,variant=left": { "model": "aestheticshelving:block/NAME_left", "y": 180 },
                "facing=west,variant=left": { "model": "aestheticshelving:block/NAME_left", "y": 270 },
                "facing=east,variant=left": { "model": "aestheticshelving:block/NAME_left", "y": 90 },
                "facing=north,variant=right": { "model": "aestheticshelving:block/NAME_right" },
                "facing=south,variant=right": { "model": "aestheticshelving:block/NAME_right", "y": 180 },
                "facing=west,variant=right": { "model": "aestheticshelving:block/NAME_right", "y": 270 },
                "facing=east,variant=right": { "model": "aestheticshelving:block/NAME_right", "y": 90 }
              }
            }
            """;

    public static String BLOCKSTATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticshelving:block/NAME" },
                "facing=south": { "model": "aestheticshelving:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticshelving:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticshelving:block/NAME", "y": 90 }
              }
            }
            """;

    public static String CORNER_SHELF = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [1.35355, 7, 0.14645],
            			"to": [22.35355, 9, 8.14645],
            			"rotation": {"angle": -45, "axis": "y", "origin": [11.85355, 8, 4.14645]},
            			"faces": {
            				"north": {"uv": [0, 8, 16, 10], "texture": "#1"},
            				"east": {"uv": [0, 10, 8, 12], "texture": "#1"},
            				"south": {"uv": [0, 8, 16, 10], "texture": "#1"},
            				"west": {"uv": [0, 10, 8, 12], "texture": "#1"},
            				"up": {"uv": [16, 8, 0, 0], "texture": "#1"},
            				"down": {"uv": [16, 0, 0, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.5, 2.29289, 6],
            			"to": [15.5, 9.29289, 9],
            			"rotation": {"angle": 45, "axis": "z", "origin": [14.5, 5.79289, 7.50711]},
            			"faces": {
            				"north": {"uv": [3, 5, 5, 12], "texture": "#0"},
            				"east": {"uv": [0, 5, 3, 12], "texture": "#0"},
            				"south": {"uv": [8, 5, 10, 12], "texture": "#0"},
            				"west": {"uv": [5, 5, 8, 12], "texture": "#0"},
            				"up": {"uv": [5, 5, 3, 2], "texture": "#0"},
            				"down": {"uv": [7, 2, 5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [7, 2.29289, 0.70711],
            			"to": [10, 9.29289, 2.70711],
            			"rotation": {"angle": 45, "axis": "x", "origin": [8.25, 5.79289, 1.70711]},
            			"faces": {
            				"north": {"uv": [2, 4, 5, 11], "texture": "#0"},
            				"east": {"uv": [0, 4, 2, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 10, 11], "texture": "#0"},
            				"west": {"uv": [5, 4, 7, 11], "texture": "#0"},
            				"up": {"uv": [5, 4, 2, 2], "texture": "#0"},
            				"down": {"uv": [8, 2, 5, 4], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [0, 45, 0],
            			"translation": [1.75, 1.5, 4.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [0, -45, 0],
            			"translation": [1.75, 1.5, 4.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"rotation": [0, 45, 0],
            			"translation": [-1.25, 3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"rotation": [0, -45, 0],
            			"translation": [-1.25, 3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 0.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [17.5, 90, 0],
            			"translation": [2, 0, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 45, 0],
            			"translation": [0, 0, 2.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"rotation": [0, 45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String TOWER_SHELF = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [3, 2, 3],
            			"to": [13, 3, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 10], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 10], "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 7, 3],
            			"to": [13, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 10], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 10], "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 12, 3],
            			"to": [13, 13, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 10], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 10], "texture": "#1"}
            			}
            		},
            		{
            			"from": [5, 15, 5],
            			"to": [11, 16, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [6, 0, 6],
            			"to": [10, 2, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 3, 6],
            			"to": [10, 7, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 8, 6],
            			"to": [10, 12, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 13, 6],
            			"to": [10, 15, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 12, 4],
            			"to": [3, 13, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 12.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 8], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 7, 4],
            			"to": [3, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 7.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 8], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 2, 4],
            			"to": [3, 3, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 2.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 8], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 2, 4],
            			"to": [14, 3, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 2.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 8], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 7, 4],
            			"to": [14, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 7.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 8], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 12, 4],
            			"to": [14, 13, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 12.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 8], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 8], "texture": "#1"}
            			}
            		},
            		{
            			"from": [11, 15, 6],
            			"to": [12, 16, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.5, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 15, 6],
            			"to": [5, 16, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.5, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 2, 13],
            			"to": [12, 3, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2.5, 13.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 7, 13],
            			"to": [12, 8, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 13.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 12, 13],
            			"to": [12, 13, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.5, 13.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [6, 15, 11],
            			"to": [10, 16, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 11.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [6, 15, 4],
            			"to": [10, 16, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 4.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 12, 2],
            			"to": [12, 13, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.5, 2.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 7, 2],
            			"to": [12, 8, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 2.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 2, 2],
            			"to": [12, 3, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2.5, 2.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, 3, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, 3, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String LADDER_SHELF = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BASE_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0.5, -2, 4.48528],
            			"to": [2, 32, 6.48528],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [1.25, 15.00002, 5.48528]},
            			"faces": {
            				"north": {"uv": [0, 0, 1.5, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 1.5, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 1.5, 2], "texture": "#0"},
            				"down": {"uv": [0, 0, 1.5, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, -2, 4.48528],
            			"to": [15.5, 32, 6.48528],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [14.75, 15, 5.48528]},
            			"faces": {
            				"north": {"uv": [0, 0, 1.5, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 1.5, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 1.5, 2], "texture": "#0"},
            				"down": {"uv": [0, 0, 1.5, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 3, 0],
            			"to": [14, 4.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 3.75, 6.375]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 12.75, 1.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 12.75, 1.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 12, 12.75], "texture": "#1"},
            				"down": {"uv": [0, 0, 12, 12.75], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 10, 0],
            			"to": [14, 11.5, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10.75, 5]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 10, 1.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 10, 1.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 12, 10], "texture": "#1"},
            				"down": {"uv": [0, 0, 12, 10], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 17, 0],
            			"to": [14, 18.5, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 17.75, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 12, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 12, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 24, 0],
            			"to": [14, 25.5, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 24.75, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 1.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 12, 1.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 1.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 12, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 12, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 25.5, 0],
            			"to": [3, 28, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 26.75, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 25.5, 0],
            			"to": [14, 28, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 26.75, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 18.5, 0],
            			"to": [3, 21, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 19.75, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 18.5, 0],
            			"to": [14, 21, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 19.75, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 11.5, 0],
            			"to": [3, 14, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 12.75, 4.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 9, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 9, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 9], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 9], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 11.5, 0],
            			"to": [14, 14, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 12.75, 4.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 9, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 9, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 9], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 9], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 4.5, 0],
            			"to": [3, 7, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 5.75, 5.875]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 11.75, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 11.75, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 11.75], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 11.75], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, 4.5, 0],
            			"to": [14, 7, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 5.75, 5.875]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 11.75, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 11.75, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 11.75], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 11.75], "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 25.5, 0],
            			"to": [13, 28, 1],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 26.75, 0.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 18.5, 0],
            			"to": [13, 21, 1],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 19.75, 0.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 11.5, 0],
            			"to": [13, 14, 1],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12.75, 0.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [3, 4.5, 0],
            			"to": [13, 7, 1],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 5.75, 0.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 10, 2.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 10, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 10, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 33, -15],
            			"translation": [0.5, -0.75, 0.5],
            			"scale": [0.3, 0.3, 0.3]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 33, -15],
            			"translation": [0.5, -0.75, 0.5],
            			"scale": [0.3, 0.3, 0.3]
            		},
            		"firstperson_righthand": {
            			"rotation": [-15, -120, -15],
            			"translation": [0.25, 2.75, 1.25],
            			"scale": [0.3, 0.3, 0.3]
            		},
            		"firstperson_lefthand": {
            			"rotation": [-15, -120, -15],
            			"translation": [0.25, 2.75, 1.25],
            			"scale": [0.3, 0.3, 0.3]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.3, 0.3, 0.3]
            		},
            		"gui": {
            			"rotation": [25, 45, 0],
            			"translation": [0.5, -2.5, 0],
            			"scale": [0.35, 0.35, 0.35]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -2, -1.75],
            			"scale": [0.35, 0.35, 0.35]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -1.25],
            			"scale": [0.35, 0.35, 0.35]
            		}
            	}
            }
            """;

    public static String CEILING_SHELF = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "minecraft:block/cyan_terracotta",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 4],
            			"to": [16, 4, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 3, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 5, 7.5],
            			"to": [14, 8, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 5, 7.5],
            			"to": [15.5, 8, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 5, 7.5],
            			"to": [15, 5.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 7.5, 7.5],
            			"to": [15, 8, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 9, 7.5],
            			"to": [15.5, 12, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.5, 9, 7.5],
            			"to": [14, 12, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 13, 7.5],
            			"to": [15.5, 16, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.5, 13, 7.5],
            			"to": [14, 16, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 11.5, 7.5],
            			"to": [15, 12, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 9, 7.5],
            			"to": [15, 9.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 7, 8.5],
            			"to": [15, 10, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 7, 7],
            			"to": [15, 10, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 7, 7.5],
            			"to": [15, 7.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 9.5, 7.5],
            			"to": [15, 10, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 3, 7.5],
            			"to": [15, 3.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"color": 9,
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#missing"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#missing"}
            			}
            		},
            		{
            			"from": [14, 3, 7],
            			"to": [15, 6, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 5, 7.5],
            			"to": [15, 5.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"color": 9,
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#missing"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#missing"}
            			}
            		},
            		{
            			"from": [14, 3, 8.5],
            			"to": [15, 6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 5.5, 7.5],
            			"to": [15, 6, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 11, 7.5],
            			"to": [15, 11.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 11, 7],
            			"to": [15, 14, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 13, 7.5],
            			"to": [15, 13.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 11, 8.5],
            			"to": [15, 14, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, 13.5, 7.5],
            			"to": [15, 14, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.5, 5, 7.5],
            			"to": [1, 8, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 5, 7.5],
            			"to": [2.5, 8, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 5, 7.5],
            			"to": [2, 5.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7.5, 7.5],
            			"to": [2, 8, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 9, 7.5],
            			"to": [2.5, 12, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.5, 9, 7.5],
            			"to": [1, 12, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [2, 13, 7.5],
            			"to": [2.5, 16, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.5, 13, 7.5],
            			"to": [1, 16, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 0.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 0.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 11.5, 7.5],
            			"to": [2, 12, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 9, 7.5],
            			"to": [2, 9.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 8.5],
            			"to": [2, 10, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 7],
            			"to": [2, 10, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 7.5],
            			"to": [2, 7.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 9.5, 7.5],
            			"to": [2, 10, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 3, 7.5],
            			"to": [2, 3.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"color": 9,
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#missing"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#missing"}
            			}
            		},
            		{
            			"from": [1, 3, 7],
            			"to": [2, 6, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 5, 7.5],
            			"to": [2, 5.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"color": 9,
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#missing"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#missing"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#missing"}
            			}
            		},
            		{
            			"from": [1, 3, 8.5],
            			"to": [2, 6, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 5.5, 7.5],
            			"to": [2, 6, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 11, 7.5],
            			"to": [2, 11.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 11, 7],
            			"to": [2, 14, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 13, 7.5],
            			"to": [2, 13.5, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 11, 8.5],
            			"to": [2, 14, 9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"east": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 3], "texture": "#1"},
            				"west": {"uv": [0, 0, 0.5, 3], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 0.5], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 13.5, 7.5],
            			"to": [2, 14, 8.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 0.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.75, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.75, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.75, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.75, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -50, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		{
            			"name": "chainRight",
            			"origin": [15, 15, 7.5],
            			"color": 0,
            			"children": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]
            		},
            		{
            			"name": "chainLeft",
            			"origin": [15, 15, 7.5],
            			"color": 0,
            			"children": [25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48]
            		}
            	]
            }
            """;

    public static String STANDING_SHELF = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [4, 0, 0],
            			"to": [12, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 0, 0],
            			"to": [15, 16, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 8, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#1"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [4, 16, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.5, 8, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 3, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#1"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 3, 7],
            			"to": [15, 5, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [6, 3, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 11, 7],
            			"to": [15, 13, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 12, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 1.61173, 0.10761],
            			"to": [14, 3.61173, 7.70761],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [13, 2.61173, 3.90761]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 7.6], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 7.6], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 7.6], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 7.6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 1.61173, 0.10761],
            			"to": [4, 3.61173, 7.70761],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [3, 2.61173, 3.90761]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 7.6], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 7.6], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 7.6], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 7.6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 9.61173, 0.10761],
            			"to": [14, 11.61173, 7.70761],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [13, 10.61173, 3.90761]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 7.6], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 7.6], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 7.6], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 7.6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 9.61173, 0.10761],
            			"to": [4, 11.61173, 7.70761],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [3, 10.61173, 3.90761]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 7.6], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 2, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 7.6], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 2, 7.6], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 2, 7.6], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2, 0.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2, 0.75],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [3.25, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.25, 2, 1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.75, -1, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -2.25],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String SHELF_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 9, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 4.39645, -1.35355],
            			"to": [4, 5.39645, 5.64645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [3, 4.89645, 2.14645]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 7], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 7], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 7], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 7], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SHELF_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 9, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 4.39645, -1.35355],
            			"to": [14, 5.39645, 5.64645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [13, 4.89645, 2.14645]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 7], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 7], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 7], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 7], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String SHELF = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 9, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 4.39645, -1.35355],
            			"to": [4, 5.39645, 5.64645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [3, 4.89645, 2.14645]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 7], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 7], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 7], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 4.39645, -1.35355],
            			"to": [14, 5.39645, 5.64645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [13, 4.89645, 2.14645]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 1], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 7], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 7], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 7], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 7], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 1.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 1.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 3, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 3, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-2.5, -0.75, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, 0, -7]
            		}
            	}
            }
            """;

    public static String SHELF_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 7, 0],
            			"to": [16, 9, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 6, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 6], "texture": "#0"}
            			}
            		}
            	]
            }
            """;
}
