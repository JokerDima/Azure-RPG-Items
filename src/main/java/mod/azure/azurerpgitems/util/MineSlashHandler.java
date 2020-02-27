package mod.azure.azurerpgitems.util;

import java.util.ArrayList;
import java.util.List;

import com.robertx22.mine_and_slash.config.compatible_items.OldConfigItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItemProvider;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Bracelet;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.onevent.data_gen.providers.SlashDataProvider;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import mod.azure.azurerpgitems.config.Config;
import net.minecraft.data.DataGenerator;

public class MineSlashHandler {

	public static String ID = "compatible_items";

	public MineSlashHandler() {
	}

	@SuppressWarnings("rawtypes")
	public SlashDataProvider getDataPackCreator(DataGenerator gen) {
		return new CompatibleItemProvider(gen, getList(), ID);
	}

	public static List<CompatibleItem> getList() {
		List<CompatibleItem> items = new ArrayList<>();
		try {
			for (int type = 1; type <= 1; type++)
				switch (type) {
				case 1:
					for (int i = 1; i <= 4; i++) {
						OldConfigItem axeconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Axe.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id = AzureRPGItemsMod.MODID + ":axe" + i;

						CompatibleItem axe = axeconfig.convertToNewFormat();
						axe.guid = id;
						axe.item_id = id;

						items.add(axe);
					}
				case 2:
					for (int i = 1; i <= 9; i++) {
						OldConfigItem staffsconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id2 = AzureRPGItemsMod.MODID + ":staff" + i;

						CompatibleItem staffs = staffsconfig.convertToNewFormat();
						staffs.guid = id2;
						staffs.item_id = id2;

						items.add(staffs);
					}
				case 3:
					for (int i = 1; i <= 4; i++) {
						OldConfigItem shieldconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Shield.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id3 = AzureRPGItemsMod.MODID + ":shield" + i;

						CompatibleItem shield = shieldconfig.convertToNewFormat();
						shield.guid = id3;
						shield.item_id = id3;

						items.add(shield);
					}
				case 4:
					for (int i = 1; i <= 10; i++) {
						OldConfigItem swordconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id4 = AzureRPGItemsMod.MODID + ":sword" + i;

						CompatibleItem sword = swordconfig.convertToNewFormat();
						sword.guid = id4;
						sword.item_id = id4;

						items.add(sword);
					}
				case 5:
					for (int i = 1; i <= 43; i++) {
						OldConfigItem bowconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Bow.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id5 = AzureRPGItemsMod.MODID + ":bow" + i;

						CompatibleItem bow = bowconfig.convertToNewFormat();
						bow.guid = id5;
						bow.item_id = id5;

						items.add(bow);
					}
				case 6:
					for (int i = 1; i <= 9; i++) {
						OldConfigItem ringconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Ring.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id6 = AzureRPGItemsMod.MODID + ":ring" + i;

						CompatibleItem ring = ringconfig.convertToNewFormat();
						ring.guid = id6;
						ring.item_id = id6;

						items.add(ring);
					}
				case 7:
					for (int i = 1; i <= 4; i++) {
						OldConfigItem necklaceconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Necklace.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id7 = AzureRPGItemsMod.MODID + ":necklace" + i;

						CompatibleItem necklace = necklaceconfig.convertToNewFormat();
						necklace.guid = id7;
						necklace.item_id = id7;

						items.add(necklace);
					}
				case 8:
					OldConfigItem beltconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
							.setMinRarity(0).setSalvagable(true).setType(Bracelet.INSTANCE)
							.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

					String id8 = AzureRPGItemsMod.MODID + ":belt1";

					CompatibleItem belt = beltconfig.convertToNewFormat();
					belt.guid = id8;
					belt.item_id = id8;

					items.add(belt);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return items;
	}
}