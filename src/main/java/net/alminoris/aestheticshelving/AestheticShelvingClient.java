package net.alminoris.aestheticshelving;

import net.alminoris.aestheticshelving.block.entity.ModBlockEntities;
import net.alminoris.aestheticshelving.block.entity.renderer.CeilingShelfBlockEntityRenderer;
import net.alminoris.aestheticshelving.block.entity.renderer.ShelfBlockEntityRenderer;
import net.alminoris.aestheticshelving.block.entity.renderer.StandingShelfBlockEntityRenderer;
import net.alminoris.aestheticshelving.screen.CeilingShelfScreen;
import net.alminoris.aestheticshelving.screen.ModScreenHandlers;
import net.alminoris.aestheticshelving.screen.ShelfScreen;
import net.alminoris.aestheticshelving.screen.StandingShelfScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class AestheticShelvingClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        HandledScreens.register(ModScreenHandlers.SHELF_SCREEN_HANDLER, ShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.STANDING_SHELF_SCREEN_HANDLER, StandingShelfScreen::new);
        HandledScreens.register(ModScreenHandlers.CEILING_SHELF_SCREEN_HANDLER, CeilingShelfScreen::new);

        BlockEntityRendererRegistry.register(ModBlockEntities.SHELF_BLOCK_ENTITY, ShelfBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.STANDING_SHELF_BLOCK_ENTITY, StandingShelfBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.CEILING_SHELF_BLOCK_ENTITY, CeilingShelfBlockEntityRenderer::new);
    }
}