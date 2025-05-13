package net.alminoris.aestheticshelving.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.alminoris.aestheticshelving.AestheticShelving;
import net.minecraft.client.gui.DrawableHelper;
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

public class CeilingShelfScreen extends HandledScreen<CeilingShelfScreenHandler>
{
    private final String NAME = Registries.BLOCK.getId(Objects.requireNonNull(handler.blockEntity.getWorld())
            .getBlockState(handler.blockEntity.getPos()).getBlock()).getPath();

    private final Identifier TEXTURE = Identifier.of(AestheticShelving.MOD_ID, "textures/gui/"+ NAME.split("_", 2)[1] +".png");;

    private final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("ceiling_shelf_oak", 0x836b3f);
        put("ceiling_shelf_birch", 0xbdab77);
        put("ceiling_shelf_spruce", 0x694f30);
        put("ceiling_shelf_jungle", 0x937143);
        put("ceiling_shelf_acacia", 0x954727);
        put("ceiling_shelf_dark_oak", 0x40321f);
        put("ceiling_shelf_crimson", 0x712f4a);
        put("ceiling_shelf_warped", 0x408d8b);
        put("ceiling_shelf_mangrove", 0x662b2b);
        put("ceiling_shelf_cherry", 0xcb7075);
        put("ceiling_shelf_bamboo", 0xccb038);
        put("ceiling_shelf_hazelnut", 0x856b42);
        put("ceiling_shelf_hawthorn", 0x81421f);
        put("ceiling_shelf_hornbeam", 0xb7b59a);
        put("ceiling_shelf_quince", 0xc78955);
        put("ceiling_shelf_plum", 0x8e656c);
        put("ceiling_shelf_mango", 0xb4733c);
        put("ceiling_shelf_fig", 0xbc9e80);
        put("ceiling_shelf_viburnum", 0x895943);
        put("ceiling_shelf_white_mulberry", 0xc1a630);
        put("ceiling_shelf_wild_cherry", 0xd49549);
        put("ceiling_shelf_bauhinia", 0x53412f);
        put("ceiling_shelf_pine", 0xa88e65);
        put("ceiling_shelf_olive", 0x605842);
        put("ceiling_shelf_tamarisk", 0x553430);
        put("ceiling_shelf_fir", 0x825a38);
        put("ceiling_shelf_cedar", 0x875e4a);
        put("ceiling_shelf_araucaria", 0x855e1c);
        put("ceiling_shelf_juniper", 0xa75d38);
    }};

    public CeilingShelfScreen(CeilingShelfScreenHandler handler, PlayerInventory inventory, Text title)
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