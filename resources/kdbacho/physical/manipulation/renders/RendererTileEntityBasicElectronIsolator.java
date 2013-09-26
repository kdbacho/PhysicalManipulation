package kdbacho.physical.manipulation.renders;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import kdbacho.physical.manipulation.core.ClientProxy;
import kdbacho.physical.manipulation.library.Textures;
import kdbacho.physical.manipulation.models.ModelBasicElectronIsolator;



public class RendererTileEntityBasicElectronIsolator extends TileEntitySpecialRenderer
{
	 
    //Block Model: Basic Electron Isolator
    private final ModelBasicElectronIsolator model;
    
    public RendererTileEntityBasicElectronIsolator() 
    {
            this.model = new ModelBasicElectronIsolator();
    }
    
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) 
    {
            int meta = world.getBlockMetadata(x, y, z);
            GL11.glPushMatrix();
            GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    }


    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) 
    {

            GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.BASIC_ELECTRON_ISOLATOR_MODEL);

    //Minecraft standard tileEntity rotation fix
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            
    //A reference to the Model file. 
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            
    //stop rendering for the PushMatrix's
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }
    

    //Lighting settings      
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
            Tessellator tess = Tessellator.instance;
            float brightness = block.getBlockBrightness(world, i, j, k);
            int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
            int modulousModifier = skyLight % 65536;
            int divModifier = skyLight / 65536;
            tess.setColorOpaque_F(brightness, brightness, brightness);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    }
}

