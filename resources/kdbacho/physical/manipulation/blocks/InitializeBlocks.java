package kdbacho.physical.manipulation.blocks;

import net.minecraft.block.material.Material;
import kdbacho.physical.manipulation.core.ClientProxy;
import kdbacho.physical.manipulation.entities.EntityTileEntityBasicElectronIsolator;
import kdbacho.physical.manipulation.library.References;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class InitializeBlocks 
{
	public static void init()
	{
		//Declare
		BlockDeclarations.neutronStone = new BlockNeutronStone(500, Material.rock).setUnlocalizedName("neutronHardenedStone");
        BlockDeclarations.basicElectronIsolator = new BlockTileEntityBasicElectronIsolator(501, Material.iron).setUnlocalizedName("bsi");
		
		//Special Declarations
        ClientProxy.registerRenderThings();
        GameRegistry.registerTileEntity(EntityTileEntityBasicElectronIsolator.class, "tileEntityTrafficLight");
		
		//Add to Registry
		LanguageRegistry.addName(BlockDeclarations.neutronStone, "Neutron Hardend Stone");
		LanguageRegistry.addName(BlockDeclarations.basicElectronIsolator, "Basic Electron Isolator");
		
		//Add to GameRegistry
        GameRegistry.registerBlock(BlockDeclarations.neutronStone, References.MOD_ID 
                   + BlockDeclarations.neutronStone.getUnlocalizedName().substring(5));
        
        GameRegistry.registerBlock(BlockDeclarations.basicElectronIsolator, References.MOD_ID 
                + BlockDeclarations.basicElectronIsolator.getUnlocalizedName().substring(5));
        

	}
	
	
}
