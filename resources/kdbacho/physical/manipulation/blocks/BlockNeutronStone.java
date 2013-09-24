package kdbacho.physical.manipulation.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kdbacho.physical.manipulation.PhysicalManipulation;
import kdbacho.physical.manipulation.library.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNeutronStone extends Block
{
	public int id;
	
	public BlockNeutronStone(int id, Material rock) 
	{		
		super(id, rock);
		this.setCreativeTab(PhysicalManipulation.kdpmTab);
	}
	
	 protected String returnUnlocalizedName(String unlocalizedName) 
	 {

		 return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
	 
	 }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{

		 this.blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MOD_ID.toLowerCase(),
				 									returnUnlocalizedName(this.getUnlocalizedName().substring(5))));
		
    }
	
}
