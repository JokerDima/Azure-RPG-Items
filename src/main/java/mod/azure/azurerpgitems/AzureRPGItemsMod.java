package mod.azure.azurerpgitems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.azurerpgitems.config.ModConfig;
import mod.azure.azurerpgitems.proxy.CommonProxy;
import mod.azure.azurerpgitems.util.MineSlashHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AzureRPGItemsMod.MODID, version = AzureRPGItemsMod.VERSION, dependencies = AzureRPGItemsMod.DEPENDENCIES)
public class AzureRPGItemsMod {
	public static final String MODID = "azurerpgitems";
	public static final String VERSION = "2.1.2";
	public static final String DEPENDENCIES = "required-after:mmorpg;required-after:baubles";
	public static final Logger LOGGER = LogManager.getLogger();
	
	@SidedProxy(clientSide = "mod.azure.azurerpgitems.proxy.ClientProxy", serverSide = "mod.azure.azurerpgitems.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static AzureRPGItemsMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		if (Loader.isModLoaded("mmorpg") && ModConfig.USE_COMPATIBILITY_ON_ITEMS) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}
}