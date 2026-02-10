package malicedev.teaparty;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicRotatable;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class BlockLogicKettle extends BlockLogicRotatable {
	public BlockLogicKettle(Block<?> block, Material material) {
		super(block, material);

	}

	public boolean onBlockRightClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
		ItemStack currentEquippedItem = player.getCurrentEquippedItem();
		if (currentEquippedItem != null) {
			if (currentEquippedItem.getItem().id == ModItems.TeaCup.id){
				player.inventory.consumeInventoryItem(ModItems.TeaCup.id);
				player.inventory.insertItem(ModItems.TeaCup_HotWater.getDefaultStack(),false);

			}
			else {}
		}
		return true;

	}
}
