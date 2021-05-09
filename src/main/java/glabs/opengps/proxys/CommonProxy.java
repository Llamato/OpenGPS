package glabs.opengps.proxys;

import glabs.opengps.OpenGPS;
import glabs.opengps.blocks.BlockInit;
import glabs.opengps.blocks.GpsBlockTileEntity;
import glabs.opengps.items.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.ref.Reference;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //GameRegistry.registerTileEntity(GpsBlockTileEntity.class,new ResourceLocation(OpenGPS.MOD_ID,"gpsblock"));
        event.getRegistry().register(BlockInit.GpsBlock); //Temporary. Replace with gps card later.
        registerTileEntity( GpsBlockTileEntity.class, "gpsblock" );
    }
    private static void registerTileEntity( Class< ? extends TileEntity > tileEntityClass, String key )
    {
        // For better readability
        GameRegistry.registerTileEntity( tileEntityClass, new ResourceLocation( OpenGPS.MOD_ID, key ) );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ItemInit.GpsBlock);
        //event.getRegistry().register(ItemInit.GpsCard);
    }
}