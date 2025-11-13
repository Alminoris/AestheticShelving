package net.alminoris.aestheticshelving.screen;

import net.alminoris.aestheticshelving.AestheticShelving;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModScreenHandlers
{
    public static final ScreenHandlerType<ShelfScreenHandler> SHELF_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "shelf"),
                    new ExtendedScreenHandlerType<>(ShelfScreenHandler::new));

    public static final ScreenHandlerType<StandingShelfScreenHandler> STANDING_SHELF_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "standing_shelf"),
                    new ExtendedScreenHandlerType<>(StandingShelfScreenHandler::new));

    public static final ScreenHandlerType<CeilingShelfScreenHandler> CEILING_SHELF_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "ceiling_shelf"),
                    new ExtendedScreenHandlerType<>(CeilingShelfScreenHandler::new));

    public static final ScreenHandlerType<CornerShelfScreenHandler> CORNER_SHELF_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "corner_shelf"),
                    new ExtendedScreenHandlerType<>(CornerShelfScreenHandler::new));

    public static final ScreenHandlerType<TowerShelfScreenHandler> TOWER_SHELF_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "tower_shelf"),
                    new ExtendedScreenHandlerType<>(TowerShelfScreenHandler::new));

    public static final ScreenHandlerType<LadderShelfScreenHandler> LADDER_SHELF_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "ladder_shelf"),
                    new ExtendedScreenHandlerType<>(LadderShelfScreenHandler::new));

    public static void registerScreenHandlers()
    {

    }
}