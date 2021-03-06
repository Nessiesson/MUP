package org.gr1m.mc.mup.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import org.gr1m.mc.mup.config.gui.IMupConfigElement;

public interface ICustomizablePatch
{
    void loadConfig(Configuration config, String parentCategory);
    
    // Return true if config was changed
    boolean sanitizeConfig(ConfigCategory category);
    
    GuiScreen createGuiScreen(GuiConfig owningScreen, IMupConfigElement patchProperty);
}
