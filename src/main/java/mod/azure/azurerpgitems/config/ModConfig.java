package mod.azure.azurerpgitems.config;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = AzureRPGItemsMod.MODID)
@Config.LangKey("azurerpgitems.config.title")
public class ModConfig {

	@Config.Name("Enable Auto Mine and Slash Stats")
	@Config.Comment("Auto Compat with Mine and Slash")
	public static boolean USE_COMPATIBILITY_ON_ITEMS = true;

	@Mod.EventBusSubscriber(modid = AzureRPGItemsMod.MODID)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(AzureRPGItemsMod.MODID)) {
				ConfigManager.sync(AzureRPGItemsMod.MODID, Config.Type.INSTANCE);
			}
		}
	}
}