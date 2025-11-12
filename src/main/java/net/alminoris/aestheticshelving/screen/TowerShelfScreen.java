package net.alminoris.aestheticshelving.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.alminoris.aestheticshelving.AestheticShelving;
import net.alminoris.aestheticshelving.block.ModBlocks;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.alminoris.aestheticshelving.util.helper.BlockSetsHelper.WOOD_COLORS;
import static net.alminoris.aestheticshelving.util.helper.BlockSetsHelper.getWoodName;

public class TowerShelfScreen extends HandledScreen<TowerShelfScreenHandler>
{
    private final Identifier TEXTURE = Identifier.of(AestheticShelving.MOD_ID,
            "textures/gui/"+ getWoodName(ModBlocks.TOWER_SHELVES, handler.blockEntity) +"_tower.png");;

    public TowerShelfScreen(TowerShelfScreenHandler handler, PlayerInventory inventory, Text title)
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
        playerInventoryTitleY = 80;
    }

    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY)
    {
        textRenderer.draw(matrices, this.title.asOrderedText(), this.titleX,
                this.titleY, WOOD_COLORS.get(getWoodName(ModBlocks.TOWER_SHELVES, handler.blockEntity)));
        textRenderer.draw(matrices, this.playerInventoryTitle.asOrderedText(),
                this.playerInventoryTitleX, this.playerInventoryTitleY, WOOD_COLORS.get(getWoodName(ModBlocks.TOWER_SHELVES, handler.blockEntity)));
    }

    @Override
    protected void drawBackground(MatrixStack context, float delta, int mouseX, int mouseY)
    {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        drawTexture(context, x, y, 0, 0, backgroundWidth, backgroundHeight+12);
    }

    @Override
    public void render(MatrixStack context, int mouseX, int mouseY, float delta)
    {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
