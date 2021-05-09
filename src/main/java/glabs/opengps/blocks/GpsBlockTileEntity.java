package glabs.opengps.blocks;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Optional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Optional.Interface(iface = "li.cil.oc.api.network.SimpleComponent", modid = "OpenComputers")
public class GpsBlockTileEntity extends TileEntity implements SimpleComponent{


    //TileEntity Test

    @Override
    public String getComponentName() {
        //return "gps"; //Make sure to remove once gps card replaces this.
        return "fancy_thing";
    }

    @Callback
    //@Optional.Method(modid = "OpenComputers")
    public Object[] greet(Context context, Arguments args) {
        return new Object[]{String.format("Hello, %s!", args.checkString(0))};
    }

    /*@Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getX(){
        int position = 0;
        return new Object[]{position};
    }

    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getY(){
        int position = 1;
        return new Object[]{position};
    }

    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getZ(){
        int position = 2;
        return new Object[]{position};
    }

    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getPosition(){
        int x = 3;
        int y = 4;
        int z = 5;
        return new Object[]{x,y,z};
    }*/
}
