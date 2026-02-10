package malicedev.teaparty;

import net.minecraft.client.render.texture.stitcher.AtlasStitcher;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import turniplabs.halplibe.helper.TextureHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;

public class MainClient implements ClientStartEntrypoint {
	@Override
	public void beforeClientStart() {
		for (AtlasStitcher stitcher : TextureRegistry.stitcherMap.values()) {
			TextureHelper.initializeAllFiles(Main.MOD_ID, stitcher);
		}
	}

	@Override
	public void afterClientStart() {

	}
}
