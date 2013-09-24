package kdbacho.physical.manipulation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import kdbacho.physical.manipulation.library.References;
import kdbacho.physical.manipulation.recipes.InitializeRecipes;
import kdbacho.physical.manipulation.blocks.InitializeBlocks;
import kdbacho.physical.manipulation.core.ClientProxy;
import kdbacho.physical.manipulation.entities.EntityTileEntityBasicElectronIsolator;
import kdbacho.physical.manipulation.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod
(
	name = References.MOD_NAME,
	modid = References.MOD_ID, 
	version = References.VERSION 
)

@NetworkMod
(
   clientSideRequired = true,		
   serverSideRequired = false
)

public class PhysicalManipulation 
{
	
   public static CreativeTabs kdpmTab = new CreativeTabs("kdbacho_pm") 
   {
	   public ItemStack getIconItemStack() 
	   {
		   return new ItemStack(ItemDeclarations.ferromagneticCell, 1, 0);
	   }
   };
   
	@EventHandler
	public void LoadBlocks(FMLInitializationEvent event)
	{
        
		InitializeItems.init();
		InitializeBlocks.init();
		InitializeRecipes.initShapedRecipes();
		InitializeRecipes.initFurnaceRecipes();
		
        LanguageRegistry.instance().addStringLocalization("itemGroup.kdbacho_pm", "Physical Manipulation");
		
	}
	
	
}
