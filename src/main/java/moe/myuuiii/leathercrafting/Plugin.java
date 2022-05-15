package moe.myuuiii.leathercrafting;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.addRecipe(new LeatherCraftingRecipe(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
