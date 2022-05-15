package moe.myuuiii.leathercrafting;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class LeatherCraftingRecipe extends ShapelessRecipe {
	public LeatherCraftingRecipe(Plugin plugin) {
		super(new NamespacedKey(plugin, "leathercrafting.craft"), new ItemStack(Material.LEATHER, 1));
		addIngredient(4, Material.ROTTEN_FLESH);
	}
}