package net.alminoris.aestheticshelving.screen;

import net.alminoris.aestheticshelving.AestheticShelving;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers
{
    public static final ScreenHandlerType<ShelfScreenHandler> SHELF_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "shelf"),
                    new ExtendedScreenHandlerType<>(ShelfScreenHandler::new));

    public static final ScreenHandlerType<StandingShelfScreenHandler> STANDING_SHELF_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "standing_shelf"),
                    new ExtendedScreenHandlerType<>(StandingShelfScreenHandler::new));

    public static final ScreenHandlerType<CeilingShelfScreenHandler> CEILING_SHELF_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AestheticShelving.MOD_ID, "ceiling_shelf"),
                    new ExtendedScreenHandlerType<>(CeilingShelfScreenHandler::new));

    public static void registerScreenHandlers()
    {

    }
}
