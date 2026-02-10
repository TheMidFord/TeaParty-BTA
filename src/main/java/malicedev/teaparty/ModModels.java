package malicedev.teaparty;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import org.useless.DragonFly;
import org.useless.dragonfly.models.block.BlockModelDFJava;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class ModModels implements ModelEntrypoint {
	@Override
	public void initBlockModels(BlockModelDispatcher blockModelDispatcher) {
		ModelHelper.setBlockModel(ModBlocks.KettleBlock, ()->
			new BlockModelDFJava<>(ModBlocks.KettleBlock, DragonFly.loadBlockModel("teaparty:block/kettle_0")).setStateData("teaparty:kettle").setStateInterpreter(new RotatableStateInterpreter())
		);

	}

	@Override
	public void initItemModels(ItemModelDispatcher itemModelDispatcher) {
		itemModelDispatcher.addDispatch(new ItemModelStandard(ModItems.TeaCup_Rose, null).setIcon("minecraft:item/stick"));
		itemModelDispatcher.addDispatch(new ItemModelStandard(ModItems.TeaCup, null).setIcon("minecraft:item/bowl"));

	}

	@Override
	public void initEntityModels(EntityRenderDispatcher entityRenderDispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher tileEntityRenderDispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher blockColorDispatcher) {

	}
}
