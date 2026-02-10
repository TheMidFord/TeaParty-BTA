package malicedev.teaparty;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;

public class ItemFoodTea extends ItemFood {
	public ItemFoodTea(String name, String namespaceId, int id, int healAmount, int ticksPerHeal) {
		super(name, namespaceId, id, healAmount, ticksPerHeal, false, 1);
		this.maxStackSize = 1;
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, Player entityplayer) {
		if (itemstack.consumeItem(entityplayer)) {
			entityplayer.eatFood(this);
			world.playSoundAtEntity(entityplayer, entityplayer, "random.splash", 0.5F + (itemRand.nextFloat() - itemRand.nextFloat()) * 0.1F, 1.1F + (itemRand.nextFloat() - itemRand.nextFloat()) * 0.1F);
			return new ItemStack(ModItems.TeaCup);
		}
		else {
			return itemstack;
		}
	}
}
