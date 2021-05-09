package glabs.opengps.items;

import glabs.opengps.blocks.BlockInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final GpsCard GpsCard = new GpsCard();
    public static final Item GpsBlock = new ItemBlock(BlockInit.GpsBlock).setRegistryName(BlockInit.GpsBlock.getRegistryName());

}
