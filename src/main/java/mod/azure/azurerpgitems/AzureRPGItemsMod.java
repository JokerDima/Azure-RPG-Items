package mod.azure.azurerpgitems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.azurerpgitems.config.Config;
import mod.azure.azurerpgitems.util.LootHandler;
import mod.azure.azurerpgitems.util.MineSlashHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import top.theillusivec4.curios.api.CuriosAPI;
import top.theillusivec4.curios.api.imc.CurioIMCMessage;

@Mod(AzureRPGItemsMod.MODID)
public class AzureRPGItemsMod {
	public static AzureRPGItemsMod instance;
	public static final String MODID = "azurerpgitems";
	public static final Logger LOGGER = LogManager.getLogger();

	public AzureRPGItemsMod() {
		instance = this;
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::enqueueIMC);
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC, "azurerpgitems-config.toml");
		Config.loadConfig(Config.SERVER_SPEC,
				FMLPaths.CONFIGDIR.get().resolve("azurerpgitems-config.toml").toString());
	}

	private void setup(final FMLCommonSetupEvent event) {
		if (Config.SERVER.USE_CHESTLOOTSYSTEM.get()) {
			MinecraftForge.EVENT_BUS.register(new LootHandler());
		}
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("necklace"));
		InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("belt"));
		InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("ring").setSize(2));
		if (Config.SERVER.USE_COMPATIBILITY_ON_ITEMS.get()) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}
}
