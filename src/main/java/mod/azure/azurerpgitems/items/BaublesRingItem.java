package mod.azure.azurerpgitems.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaublesRingItem extends Item implements IBauble {

	public BaublesRingItem() {
		super();
	}
	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

}