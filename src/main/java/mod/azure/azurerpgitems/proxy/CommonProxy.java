package mod.azure.azurerpgitems.proxy;

import mod.azure.azurerpgitems.util.AzureRPGItems;
import mod.azure.azurerpgitems.util.AzureRPGItemsTab;
import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class CommonProxy {
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> e) {
			IForgeRegistry<Item> registry = e.getRegistry();

			for (Item item : AzureRPGItems.itemList) {
				registry.register(item);
			}

			AzureRPGItems.variantList = NonNullList.create();
			for (Item item : AzureRPGItems.itemList) {
				item.getSubItems(AzureRPGItemsTab.TAB, AzureRPGItems.variantList);
			}
		}
	}
}
