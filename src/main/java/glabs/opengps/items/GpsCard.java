package glabs.opengps.items;
import li.cil.oc.api.driver.DriverItem;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class GpsCard extends ItemBase implements DriverItem {

    public GpsCard() {
        super("gpscard");
    }

    //@Override
    public boolean worksWith(ItemStack itemStack) {
        return true;
    }

    //@Override
    public ManagedEnvironment createEnvironment(ItemStack itemStack, EnvironmentHost environmentHost) {
        return null;
    }

    //@Override
    public String slot(ItemStack itemStack) {
        return null;
    }

    //@Override
    public int tier(ItemStack itemStack) {
        return 0;
    }

    //@Override
    public NBTTagCompound dataTag(ItemStack itemStack) {
        return null;
    }
}