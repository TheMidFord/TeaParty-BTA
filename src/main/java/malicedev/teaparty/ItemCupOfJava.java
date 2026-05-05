package malicedev.teaparty;

import net.minecraft.core.Global;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;

public class ItemCupOfJava extends ItemFood {
	public ItemCupOfJava(String name, String namespaceId, int id, int healAmount, int ticksPerHeal) {
		super(name, namespaceId, id, healAmount, ticksPerHeal, false, 1);
		this.maxStackSize = 1;
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, Player entityplayer) {
		if (world.isClientSide) {
			itemstack.consumeItem(entityplayer);
			entityplayer.eatFood(this);
			throw new NullPointerException("lmao.");
		}
		if (!Global.isServer && !world.isClientSide) {
				entityplayer.eatFood(this);
				itemstack.consumeItem(entityplayer);
				entityplayer.hurt(entityplayer, 200, DamageType.GENERIC);
				return itemstack;
		}
		else {
				String PlayerName = entityplayer.username;
			itemstack.consumeItem(entityplayer);
				entityplayer.eatFood(this);
				world.sendGlobalMessage("§eException in thread " + "main" + " java.lang.NullPointerException");
				world.sendGlobalMessage("§e    at " + PlayerName + ".main(" + PlayerName + ".java:10)");
				return itemstack;
		}
	}
}
