package mod.azure.azurerpgitems.util;

import java.util.ArrayList;
import java.util.List;

import com.robertx22.items.gearitems.weapons.ItemStaff;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import mod.azure.azurerpgitems.items.BaublesBeltItem;
import mod.azure.azurerpgitems.items.BaublesNecklaceItem;
import mod.azure.azurerpgitems.items.BaublesRingItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(AzureRPGItemsMod.MODID)
public class AzureRPGItems {
	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;
	static {
		List<Item> items = new ArrayList<Item>();
		for (int i = 1; i <= 43; i++)
			items.add(new ItemBow().setRegistryName(new ResourceLocation(AzureRPGItemsMod.MODID, "bow" + i))
					.setTranslationKey("bow" + i).setCreativeTab(AzureRPGItemsTab.TAB));
		for (int i = 1; i <= 10; i++)
			items.add(new ItemSword(ToolMaterial.DIAMOND).setRegistryName(location("sword" + i))
					.setTranslationKey("sword" + i).setCreativeTab(AzureRPGItemsTab.TAB));
		for (int i = 1; i <= 9; i++)
			items.add(new BaublesRingItem().setRegistryName(location("ring" + i)).setTranslationKey("ring" + i)
					.setCreativeTab(AzureRPGItemsTab.TAB));
		for (int i = 1; i <= 9; i++)
			items.add(new ItemStaff().setRegistryName(location("staff" + i)).setTranslationKey("staff" + i)
					.setCreativeTab(AzureRPGItemsTab.TAB));
		for (int i = 1; i <= 4; i++)
			items.add(new BaublesNecklaceItem().setRegistryName(location("necklace" + i)).setTranslationKey("necklace" + i)
					.setCreativeTab(AzureRPGItemsTab.TAB));
		for (int i = 1; i <= 4; i++)
			items.add(new ItemSword(ToolMaterial.DIAMOND).setRegistryName(location("axe" + i))
					.setTranslationKey("axe" + i).setCreativeTab(AzureRPGItemsTab.TAB));
		for (int i = 1; i <= 4; i++)
			items.add(new ItemShield().setRegistryName(location("shield" + i)).setCreativeTab(AzureRPGItemsTab.TAB));
		items.add(new BaublesBeltItem().setRegistryName(location("belt1")).setTranslationKey("belt1")
				.setCreativeTab(AzureRPGItemsTab.TAB));
		AzureRPGItemsMod.LOGGER.info("All Items registered.");
		itemList = items.toArray(new Item[items.size()]);
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(AzureRPGItemsMod.MODID, name);
	}
}