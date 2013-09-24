package kdbacho.physical.manipulation.recipes;

import kdbacho.physical.manipulation.blocks.BlockDeclarations;
import kdbacho.physical.manipulation.items.ItemDeclarations;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;


public class InitializeRecipes 
{
  
	public static void initShapedRecipes()
	{
		// Ferromagnetic Cell
		GameRegistry.addRecipe(new ItemStack(ItemDeclarations.ferromagneticCell), new Object[]
    		{
    			"XXX",
    			"XCX",
    			"XXX",
    			'X', Item.ingotIron, 'C', Item.glassBottle
    		});
		
		GameRegistry.addRecipe(new ItemStack(BlockDeclarations.basicElectronIsolator), new Object[]
				{
			    	"IXI",
				    "III",
				    "XCX",
				    'X', Block.blockIron, 'I', Item.ingotIron, 'C', ItemDeclarations.ferromagneticCell
				});

		

       
	}
	
	public static void initFurnaceRecipes()
	{
		FurnaceRecipes.smelting().addSmelting(500, 0, new ItemStack(Item.diamond), 0.1F);
	}
}
