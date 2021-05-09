package glabs.opengps.blocks;

import glabs.opengps.OpenGPS;
import li.cil.oc.api.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
public class BlockBase extends Block {
    public BlockBase(String name ,Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
        setRegistryName(name);
        setTranslationKey(OpenGPS.MOD_ID + "." + name);
        setCreativeTab(CreativeTab.instance);
    }
}
