package kdbacho.physical.manipulation.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kdbacho.physical.manipulation.PhysicalManipulation;
import kdbacho.physical.manipulation.library.References;
import kdbacho.physical.manipulation.library.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemFerromagneticCell extends Item{

	public ItemFerromagneticCell(int id) 
	{
		super(id);
		this.setCreativeTab(PhysicalManipulation.kdpmTab);
		this.setUnlocalizedName(Strings.FERROMAGNETIC_CELL_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(String.format("%s:%s", References.MOD_ID.toLowerCase(),getUnwrappedUnlocalizedName( this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String name)
	{
		return name.substring(name.indexOf(".") + 1);
	} 
	
	 
	
}
	
