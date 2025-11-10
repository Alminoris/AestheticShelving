package net.alminoris.aestheticshelving;

import net.alminoris.aestheticshelving.block.entity.ModBlockEntities;
import net.alminoris.aestheticshelving.block.entity.renderer.*;
import net.alminoris.aestheticshelving.screen.*;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AestheticShelvingClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        HandledScreens.register(ModScreenHandlers.SHELF_SCREEN_HANDLER, ShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.STANDING_SHELF_SCREEN_HANDLER, StandingShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.CEILING_SHELF_SCREEN_HANDLER, CeilingShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.CORNER_SHELF_SCREEN_HANDLER, CornerShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.LADDER_SHELF_SCREEN_HANDLER, LadderShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.TOWER_SHELF_SCREEN_HANDLER, TowerShelfScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.SHELF_BLOCK_ENTITY, ShelfBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.STANDING_SHELF_BLOCK_ENTITY, StandingShelfBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.CEILING_SHELF_BLOCK_ENTITY, CeilingShelfBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.CORNER_SHELF_BLOCK_ENTITY, CornerShelfBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.LADDER_SHELF_BLOCK_ENTITY, LadderShelfBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.TOWER_SHELF_BLOCK_ENTITY, TowerShelfBlockEntityRenderer::new);
    }
}