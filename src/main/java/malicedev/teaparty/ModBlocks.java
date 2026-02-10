package malicedev.teaparty;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;


import static malicedev.teaparty.Main.blockId;

public class ModBlocks {
	private ModBlocks(){}

	public static Block KettleBlock;

	public static void init(){

		KettleBlock = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.GLASS)
			.build("kettle_block","kettle_block",blockId++,
				(block) -> new BlockLogicKettle(block, Material.stone));
	}

}
