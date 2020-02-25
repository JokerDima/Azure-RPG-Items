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
			builder.push("general");
			USE_COMPATIBILITY_ON_ITEMS = builder.comment("Mine and Slash Compatibility")
					.translation(AzureRPGItemsMod.MODID + ".config.use_compatibility_on_items")
					.define("USE_COMPATIBILITY_ON_ITEMS", true);
			USE_CHESTLOOTSYSTEM = builder.comment("Add loot to Chest loot system")
					.translation(AzureRPGItemsMod.MODID + ".config.use_chestlootsystem")
					.define("USE_CHESTLOOTSYSTEM", true);
			USE_MINESLASHLOOTSYSTEM = builder.comment("Add loot to Mine and Slash Loot System")
					.translation(AzureRPGItemsMod.MODID + ".config.use_mineslashlootsystem")
					.define("USE_MINESLASHLOOTSYSTEM", true);
			builder.pop();
			builder.push("gear");
			BELT_MAXDAMAGE = builder.comment("Belt Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.belt_maxdamage").define("BELT_MAXDAMAGE", 1000);
			AXE_MAXDAMAGE = builder.comment("Axe Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.axe_maxdamage").define("AXE_MAXDAMAGE", 1000);
			STAFF_MAXDAMAGE = builder.comment("Staff Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.staff_maxdamage").define("STAFF_MAXDAMAGE", 1000);
			SWORD_MAXDAMAGE = builder.comment("Sword Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.sword_maxdamage").define("SWORD_MAXDAMAGE", 1000);
			BOW_MAXDAMAGE = builder.comment("Bow Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.bow_maxdamage").define("BOW_MAXDAMAGE", 1000);
			RING_MAXDAMAGE = builder.comment("Lance Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.ring_maxdamage").define("RING_MAXDAMAGE", 1000);
			SHIELD_MAXDAMAGE = builder.comment("Broad Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.shield_maxdamage").define("SHIELD_MAXDAMAGE", 1000);
			NECKLACE_MAXDAMAGE = builder.comment("Hand Weapons Max Damage")
					.translation(AzureRPGItemsMod.MODID + ".config.necklace_maxdamage")
					.define("NECKLACE_MAXDAMAGE", 1000);
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