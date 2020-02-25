package mod.azure.azurerpgitems.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Bracelet;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

import mod.azure.azurerpgitems.AzureRPGItemsMod;
import mod.azure.azurerpgitems.config.Config;

public class MineSlashHandler {

	public MineSlashHandler() {
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":axe" + i,
					new ConfigItem().setType(Axe.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 9; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":staff" + i, new ConfigItem()
					.setType(Staff.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":shield" + i, new ConfigItem()
					.setType(Shield.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 10; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":sword" + i, new ConfigItem()
					.setType(Sword.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 43; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":bow" + i,
					new ConfigItem().setType(Bow.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 9; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":ring" + i,
					new ConfigItem().setType(Ring.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":necklace" + i, new ConfigItem()
					.setType(Necklace.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":belt1",
				new ConfigItem().setType(Bracelet.INSTANCE).setSalvagable(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		AzureRPGItemsMod.LOGGER.info("Registered Everything with Mine and Slash");
	}
}