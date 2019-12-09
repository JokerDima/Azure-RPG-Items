package mod.azure.azurerpgitems.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaublesBeltItem extends Item implements IBauble {

	public BaublesBeltItem() {
		super();
	}
	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}

}