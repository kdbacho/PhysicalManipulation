package kdbacho.physical.manipulation.items;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class InitializeItems 
{

	public static void init()
	{
		//Declare
		ItemDeclarations.neutronCell = new ItemNeutronCell(5000).setUnlocalizedName("NeutronCell");
		ItemDeclarations.ferromagneticCell = new ItemFerromagneticCell(5001).setUnlocalizedName("FerromagneticCell");
	
		//Add to Registry
        LanguageRegistry.addName(ItemDeclarations.neutronCell, "Neutron Cell");
        LanguageRegistry.addName(ItemDeclarations.ferromagneticCell, "Ferromagnetic Cell");
	}
	
}
