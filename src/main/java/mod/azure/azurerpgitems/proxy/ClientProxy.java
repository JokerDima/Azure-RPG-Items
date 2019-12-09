package mod.azure.azurerpgitems.proxy;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = AzureRPGItemsMod.MODID, value = CLIENT)
public class ClientProxy extends CommonProxy {
	@SubscribeEvent
	public static void onRegisterModelsEvent(ModelRegistryEvent e) {
		ForgeRegistries.ITEMS.getValuesCollection().stream()
				.filter(item -> item.getRegistryName().getNamespace().equals(AzureRPGItemsMod.MODID)).forEach(item -> {
					ModelLoader.setCustomModelResourceLocation(item, 0,
							new ModelResourceLocation(item.getRegistryName(), "inventory"));
				});
		AzureRPGItemsMod.LOGGER.info("Registered models");
	}
}
