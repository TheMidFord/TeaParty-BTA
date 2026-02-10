package malicedev.teaparty;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;

public class ItemFoodTeabag extends ItemFood {
	public ItemFoodTeabag(String name, String namespaceId, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfMeat, int maxStackSize) {
		super(name, namespaceId, id, 0, 1, false, 16);
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, Player entityplayer) {
		ItemStack i = super.onUseItem(itemstack, world, entityplayer);
		entityplayer.hurt(entityplayer, 1, DamageType.GENERIC);
		return itemstack;
	}
}
