package kdbacho.physical.manipulation.utility;


import net.minecraft.util.ResourceLocation;

import kdbacho.physical.manipulation.library.References;

public class ExternalResourceLoader 
{


	    public static ResourceLocation getResourceLocation(String modId, String path) {

	        return new ResourceLocation(modId, path);
	    }

	    public static ResourceLocation getResourceLocation(String path) {

	        return getResourceLocation(References.MOD_ID.toLowerCase(), path);
	    }
}

