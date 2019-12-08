package mod.azure.azurerpgitems.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AzureRPGItemsTab {

	public static final ItemGroup TabItemGroup = (new ItemGroup("azurerpgitems") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(AzureRPGItems.ring1);
		}
	});
}