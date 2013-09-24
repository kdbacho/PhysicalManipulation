package kdbacho.physical.manipulation.core;
import kdbacho.physical.manipulation.entities.EntityTileEntityBasicElectronIsolator;
import kdbacho.physical.manipulation.renders.RendererTileEntityBasicElectronIsolator;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy 
{
	public static int RENDER_MACHINE_ID = RenderingRegistry.getNextAvailableRenderId();
	
	@Override
	public void registerRenderers() 
	{
		
	}
	
	public static void registerRenderThings() {
          ClientRegistry.bindTileEntitySpecialRenderer(EntityTileEntityBasicElectronIsolator.class, new RendererTileEntityBasicElectronIsolator());
    }

}
