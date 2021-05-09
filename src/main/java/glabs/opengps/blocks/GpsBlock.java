package glabs.opengps.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import javax.annotation.Nullable;

public class GpsBlock extends BlockBase implements ITileEntityProvider {
    public GpsBlock() {
        super("gpsblock", Material.IRON, MapColor.IRON);
        setHardness(.5f);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new GpsBlockTileEntity();
    }
}
