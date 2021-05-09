package glabs.opengps.items;
import glabs.opengps.OpenGPS;
import net.minecraft.item.Item;
import li.cil.oc.api.CreativeTab;
public class ItemBase extends Item{
    public ItemBase(String name){
        setRegistryName(name);
        setTranslationKey(OpenGPS.MOD_ID + "." + name);
        setCreativeTab(CreativeTab.instance);
        ItemInit.ITEMS.add(this);
    }
}
