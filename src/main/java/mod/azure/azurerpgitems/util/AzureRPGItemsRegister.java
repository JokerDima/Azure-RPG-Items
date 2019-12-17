package mod.azure.azurerpgitems.util;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import mod.azure.azurerpgitems.items.StaffItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AzureRPGItemsRegister {
	public static Item ring;
	public static Item necklace;
	public static Item belt;
	public static Item axe;
	public static Item staff;
	public static Item shield;
	public static Item sword;
	public static Item bow;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		for (int i = 1; i <= 43; i++)
			event.getRegistry()
					.register(bow = new BowItem(new Item.Properties().group(AzureRPGItemsTab.WeaponItemGroup))
							.setRegistryName(location("bow" + i)));
		for (int i = 1; i <= 10; i++)
			event.getRegistry()
					.register(sword = new SwordItem(ItemTier.DIAMOND, 7, 1,
							new Item.Properties().group(AzureRPGItemsTab.WeaponItemGroup))
									.setRegistryName(location("sword" + i + "")));
		for (int i = 1; i <= 9; i++)
			event.getRegistry()
					.register(ring = new Item(new Item.Properties().group(AzureRPGItemsTab.AccessoriesItemGroup))
							.setRegistryName(location("ring" + i + "")));
		for (int i = 1; i <= 9; i++)
			event.getRegistry()
					.register(staff = new StaffItem(new Item.Properties().group(AzureRPGItemsTab.WeaponItemGroup), 0)
							.setRegistryName(location("staff" + i + "")));
		for (int i = 1; i <= 4; i++)
			event.getRegistry()
					.register(necklace = new Item(new Item.Properties().group(AzureRPGItemsTab.AccessoriesItemGroup))
							.setRegistryName(location("necklace" + i + "")));
		for (int i = 1; i <= 4; i++)
			event.getRegistry()
					.register(axe = new AxeItem(ItemTier.DIAMOND, 3, 1,
							new Item.Properties().group(AzureRPGItemsTab.WeaponItemGroup))
									.setRegistryName(location("axe" + i + "")));
		for (int i = 1; i <= 4; i++)
			event.getRegistry()
					.register(shield = new ShieldItem(new Item.Properties().group(AzureRPGItemsTab.WeaponItemGroup))
							.setRegistryName(location("shield" + i + "")));
		event.getRegistry().register(belt = new Item(new Item.Properties().group(AzureRPGItemsTab.AccessoriesItemGroup))
				.setRegistryName(location("belt1")));
		AzureRPGItemsMod.LOGGER.info("All Items registered.");
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(AzureRPGItemsMod.MODID, name);
	}
}