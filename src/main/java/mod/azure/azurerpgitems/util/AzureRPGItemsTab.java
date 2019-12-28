package mod.azure.azurerpgitems.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AzureRPGItemsTab {

	public static final ItemGroup AccessoriesItemGroup = (new ItemGroup("accessories") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(AzureRPGItems.ring);
		}
	});
	
	public static final ItemGroup WeaponItemGroup = (new ItemGroup("weapons") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(AzureRPGItems.axe);
		}
	});
}