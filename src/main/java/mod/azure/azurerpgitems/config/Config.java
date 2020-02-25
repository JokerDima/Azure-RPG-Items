package mod.azure.azurerpgitems.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public final BooleanValue USE_COMPATIBILITY_ON_ITEMS;
		public final BooleanValue USE_CHESTLOOTSYSTEM;
		public final BooleanValue USE_MINESLASHLOOTSYSTEM;
		public ConfigValue<Integer> BELT_MAXDAMAGE;
		public ConfigValue<Integer> RING_MAXDAMAGE;
		public ConfigValue<Integer> SHIELD_MAXDAMAGE;
		public ConfigValue<Integer> NECKLACE_MAXDAMAGE;
		public ConfigValue<Integer> AXE_MAXDAMAGE;
		public ConfigValue<Integer> STAFF_MAXDAMAGE;
		public ConfigValue<Integer> SWORD_MAXDAMAGE;
		public ConfigValue<Integer> BOW_MAXDAMAGE;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.comment("Mine and Slash Compatibility").push("Mine and Slash Compatibility")
					.translation("azurerpgitems.config.use_compatibility_on_items");
			USE_COMPATIBILITY_ON_ITEMS = builder.define("Enable", true);
			builder.comment("Chest Loot Setting").push("Chest Loot Setting")
					.translation("azurerpgitems.config.use_chestlootsystem");
			USE_CHESTLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Mine and Slash Loot Setting").push("Mine and Slash Loot Setting")
					.translation("azurerpgitems.config.use_mineslashlootsystem");
			USE_MINESLASHLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Sets the max duriabily of Accessories").push("Sets the max duriabily of Belts.")
					.translation("azurerpgitems.config.accessory_maxdamage");
			BELT_MAXDAMAGE = builder.define("BELT_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Rings.").push("Sets the max duriabily of Rings.")
					.translation("azurerpgitems.config.ring_maxdamage");
			RING_MAXDAMAGE = builder.define("RING_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Shields.").push("Sets the max duriabily of Shields.")
					.translation("azurerpgitems.config.shields_maxdamage");
			SHIELD_MAXDAMAGE = builder.define("SHIELD_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Necklaces.").push("Sets the max duriabily of Necklaces.")
					.translation("azurerpgitems.config.necklace_maxdamage");
			NECKLACE_MAXDAMAGE = builder.define("NECKLACE_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Axes.").push("Sets the max duriabily of Axes.")
					.translation("azurerpgitems.config.axe_maxdamage");
			AXE_MAXDAMAGE = builder.define("AXE_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Staffs.").push("Sets the max duriabily of Staffs.")
					.translation("azurerpgitems.config.staff_maxdamage");
			STAFF_MAXDAMAGE = builder.define("STAFF_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Swords.").push("Sets the max duriabily of Swords.")
					.translation("azurerpgitems.config.sword_maxdamage");
			SWORD_MAXDAMAGE = builder.define("SWORD_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Bows.").push("Sets the max duriabily of Bows.")
					.translation("azurerpgitems.config.bow_maxdamage");
			BOW_MAXDAMAGE = builder.define("BOW_MAXDAMAGE", 1000);
			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		AzureRPGItemsMod.LOGGER.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		AzureRPGItemsMod.LOGGER.info("Built config: " + path);
		file.load();
		AzureRPGItemsMod.LOGGER.info("Loaded config: " + path);
		config.setConfig(file);
	}
}