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
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				AzureRPGItems.ring1 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("ring1")),
				AzureRPGItems.ring2 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("ring2")),
				AzureRPGItems.ring3 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("ring3")),
				AzureRPGItems.ring4 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("ring4")),

				AzureRPGItems.necklace1 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("necklace1")),
				AzureRPGItems.necklace2 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("necklace2")),
				AzureRPGItems.necklace3 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("necklace3")),
				AzureRPGItems.necklace4 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("necklace4")),

				AzureRPGItems.belt1 = new Item(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("belt1")),

				AzureRPGItems.axe1 = new AxeItem(ItemTier.DIAMOND, 3, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("axe1")),
				AzureRPGItems.axe2 = new AxeItem(ItemTier.DIAMOND, 3, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("axe2")),
				AzureRPGItems.axe3 = new AxeItem(ItemTier.DIAMOND, 3, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("axe3")),
				AzureRPGItems.axe4 = new AxeItem(ItemTier.DIAMOND, 3, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("axe4")),

				AzureRPGItems.shield1 = new ShieldItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("shield1")),
				AzureRPGItems.shield2 = new ShieldItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("shield2")),
				AzureRPGItems.shield3 = new ShieldItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("shield3")),
				AzureRPGItems.shield4 = new ShieldItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("shield4")),

				AzureRPGItems.sword1 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword1")),
				AzureRPGItems.sword2 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword2")),
				AzureRPGItems.sword3 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword3")),
				AzureRPGItems.sword4 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword4")),
				AzureRPGItems.sword5 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword5")),
				AzureRPGItems.sword6 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword6")),
				AzureRPGItems.sword7 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword7")),
				AzureRPGItems.sword8 = new SwordItem(ItemTier.DIAMOND, 7, 1,
						new Item.Properties().group(AzureRPGItemsTab.TabItemGroup)).setRegistryName(location("sword8")),

				AzureRPGItems.bow1 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow1")),
				AzureRPGItems.bow2 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow2")),
				AzureRPGItems.bow3 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow3")),
				AzureRPGItems.bow4 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow4")),
				AzureRPGItems.bow5 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow5")),
				AzureRPGItems.bow6 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow6")),
				AzureRPGItems.bow7 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow7")),
				AzureRPGItems.bow8 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow8")),
				AzureRPGItems.bow9 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow9")),
				AzureRPGItems.bow10 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow10")),
				AzureRPGItems.bow11 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow11")),
				AzureRPGItems.bow12 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow12")),
				AzureRPGItems.bow13 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow13")),
				AzureRPGItems.bow14 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow14")),
				AzureRPGItems.bow15 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow15")),
				AzureRPGItems.bow16 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow16")),
				AzureRPGItems.bow17 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow17")),
				AzureRPGItems.bow18 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow18")),
				AzureRPGItems.bow19 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow19")),
				AzureRPGItems.bow20 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow20")),
				AzureRPGItems.bow21 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow21")),
				AzureRPGItems.bow22 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow22")),
				AzureRPGItems.bow23 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow23")),
				AzureRPGItems.bow24 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow24")),
				AzureRPGItems.bow25 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow25")),
				AzureRPGItems.bow26 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow26")),
				AzureRPGItems.bow27 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow27")),
				AzureRPGItems.bow28 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow28")),
				AzureRPGItems.bow29 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow29")),
				AzureRPGItems.bow30 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow30")),
				AzureRPGItems.bow31 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow31")),
				AzureRPGItems.bow32 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow32")),
				AzureRPGItems.bow33 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow33")),
				AzureRPGItems.bow34 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow34")),
				AzureRPGItems.bow35 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow35")),
				AzureRPGItems.bow36 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow36")),
				AzureRPGItems.bow37 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow37")),
				AzureRPGItems.bow38 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow38")),
				AzureRPGItems.bow39 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow39")),
				AzureRPGItems.bow40 = new BowItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup))
						.setRegistryName(location("bow40")),

				AzureRPGItems.staff1 = new StaffItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup), 0)
						.setRegistryName(location("staff1")),
				AzureRPGItems.staff2 = new StaffItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup), 0)
						.setRegistryName(location("staff2")),
				AzureRPGItems.staff3 = new StaffItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup), 0)
						.setRegistryName(location("staff3")),
				AzureRPGItems.staff4 = new StaffItem(new Item.Properties().group(AzureRPGItemsTab.TabItemGroup), 0)
						.setRegistryName(location("staff4")));
		AzureRPGItemsMod.LOGGER.info("All Items registered.");
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(AzureRPGItemsMod.MODID, name);
	}
}