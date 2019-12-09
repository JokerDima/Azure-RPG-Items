package mod.azure.azurerpgitems.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Bracelet;
import com.robertx22.database.gearitemslots.Necklace;
import com.robertx22.database.gearitemslots.Ring;
import com.robertx22.database.gearitemslots.Shield;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.azurerpgitems.AzureRPGItemsMod;

public class MineSlashHandler {

	public MineSlashHandler() {
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":axe" + i,
					new ConfigItem().setType(new Axe()).setSalvagable(true));
		for (int i = 1; i <= 9; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":staff" + i,
					new ConfigItem().setType(new Staff()).setSalvagable(true));
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":shield" + i,
					new ConfigItem().setType(new Shield()).setSalvagable(true));
		for (int i = 1; i <= 10; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":sword" + i,
					new ConfigItem().setType(new Sword()).setSalvagable(true));
		for (int i = 1; i <= 43; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":bow" + i,
					new ConfigItem().setType(new Bow()).setSalvagable(true));
		for (int i = 1; i <= 9; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":ring" + i,
					new ConfigItem().setType(new Ring()).setSalvagable(true));
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":necklace" + i,
					new ConfigItem().setType(new Necklace()).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(AzureRPGItemsMod.MODID + ":belt1",
				new ConfigItem().setType(new Bracelet()).setSalvagable(true));
		AzureRPGItemsMod.LOGGER.info("Registered Everything with Mine and Slash");
	}
}