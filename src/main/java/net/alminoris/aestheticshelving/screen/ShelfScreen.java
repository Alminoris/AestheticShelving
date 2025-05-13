package net.alminoris.aestheticshelving.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.alminoris.aestheticshelving.AestheticShelving;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Objects;

public class ShelfScreen extends HandledScreen<ShelfScreenHandler>
{
    private final String NAME = Registries.BLOCK.getId(Objects.requireNonNull(handler.blockEntity.getWorld())
            .getBlockState(handler.blockEntity.getPos()).getBlock()).getPath();

    private final Identifier TEXTURE = Identifier.of(AestheticShelving.MOD_ID, "textures/gui/"+ NAME +".png");;

    private final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("shelf_oak", 0x836b3f);
        put("shelf_birch", 0xbdab77);
        put("shelf_spruce", 0x694f30);
        put("shelf_jungle", 0x937143);
        put("shelf_acacia", 0x954727);
        put("shelf_dark_oak", 0x40321f);
        put("shelf_crimson", 0x712f4a);
        put("shelf_warped", 0x408d8b);
        put("shelf_mangrove", 0x662b2b);
        put("shelf_cherry", 0xcb7075);
        put("shelf_bamboo", 0xccb038);
        put("shelf_hazelnut", 0x856b42);
        put("shelf_hawthorn", 0x81421f);
        put("shelf_hornbeam", 0xb7b59a);
        put("shelf_quince", 0xc78955);
        put("shelf_plum", 0x8e656c);
        put("shelf_mango", 0xb4733c);
        put("shelf_fig", 0xbc9e80);
        put("shelf_viburnum", 0x895943);
        put("shelf_white_mulberry", 0xc1a630);
        put("shelf_wild_cherry", 0xd49549);
        put("shelf_bauhinia", 0x53412f);
        put("shelf_pine", 0xa88e65);
        put("shelf_olive", 0x605842);
        put("shelf_tamarisk", 0x553430);
        put("shelf_fir", 0x825a38);
        put("shelf_cedar", 0x875e4a);
        put("shelf_araucaria", 0x855e1c);
        put("shelf_juniper", 0xa75d38);
    }};

    public ShelfScreen(ShelfScreenHandler handler, PlayerInventory inventory, Text title)
    {
        super(handler, inventory, title);

    }

    @Override
    protected void init()
    {
        super.init();
        titleY = 10;
        titleX = 10;
        playerInventoryTitleX = 10;
        playerInventoryTitleY = 68;
    }

    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY)
    {
        textRenderer.draw(matrices, this.title.asOrderedText(), this.titleX, this.titleY, WOOD_COLORS.get(NAME));
        textRenderer.draw(matrices, this.playerInventoryTitle.asOrderedText(), this.playerInventoryTitleX, this.playerInventoryTitleY, WOOD_COLORS.get(NAME));
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY)
    {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        // Draw background texture
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta)
    {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
