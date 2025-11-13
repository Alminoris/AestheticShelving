package net.alminoris.aestheticshelving.block.entity;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ModBlockEntities
{
    public static final BlockEntityType<ShelfBlockEntity> SHELF_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticShelving.MOD_ID, "shelf_be"),
                    FabricBlockEntityTypeBuilder.create(ShelfBlockEntity::new,
                            toBlockArray(ModBlocks.SHELVES.elements())).build());

    public static final BlockEntityType<StandingShelfBlockEntity> STANDING_SHELF_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticShelving.MOD_ID, "standing_shelf_be"),
                    FabricBlockEntityTypeBuilder.create(StandingShelfBlockEntity::new,
                            toBlockArray(ModBlocks.STANDING_SHELVES.elements())).build());

    public static final BlockEntityType<CeilingShelfBlockEntity> CEILING_SHELF_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticShelving.MOD_ID, "ceiling_shelf_be"),
                    FabricBlockEntityTypeBuilder.create(CeilingShelfBlockEntity::new,
                            toBlockArray(ModBlocks.CEILING_SHELVES.elements())).build());

    public static final BlockEntityType<CornerShelfBlockEntity> CORNER_SHELF_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticShelving.MOD_ID, "corner_shelf_be"),
                    FabricBlockEntityTypeBuilder.create(CornerShelfBlockEntity::new,
                            toBlockArray(ModBlocks.CORNER_SHELVES.elements())).build());

    public static final BlockEntityType<LadderShelfBlockEntity> LADDER_SHELF_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticShelving.MOD_ID, "ladder_shelf_be"),
                    FabricBlockEntityTypeBuilder.create(LadderShelfBlockEntity::new,
                            toBlockArray(ModBlocks.LADDER_SHELVES.elements())).build());

    public static final BlockEntityType<TowerShelfBlockEntity> TOWER_SHELF_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticShelving.MOD_ID, "tower_shelf_be"),
                    FabricBlockEntityTypeBuilder.create(TowerShelfBlockEntity::new,
                            toBlockArray(ModBlocks.TOWER_SHELVES.elements())).build());

    public static void registerBlockEntities()
    {

    }

    private static Block[] toBlockArray(Enumeration<Block> enumeration)
    {
        List<Block> blocks = new ArrayList<>();
        while (enumeration.hasMoreElements())
        {
            blocks.add(enumeration.nextElement());
        }
        return blocks.toArray(new Block[0]);
    }
}
