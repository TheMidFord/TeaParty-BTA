package malicedev.teaparty;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static malicedev.teaparty.Main.itemId;

public class ModItems {
	private ModItems(){}

	public static Item TeaBag;
	public static Item TeaBag_Rose;
	public static Item TeaBag_Dandelion;
	public static Item TeaBag_Orchid;
	public static Item TeaBag_Bluebell;
	public static Item TeaBag_Heather;
	public static Item TeaBag_Marigold;
	public static Item Kettle;
	public static Item TeaCup;
	public static Item TeaCup_HotWater;
	public static Item TeaCup_Rose;
	public static Item TeaCup_Dandelion;
	public static Item TeaCup_Orchid;
	public static Item TeaCup_Bluebell;
	public static Item TeaCup_Heather;
	public static Item TeaCup_Marigold;
	public static Item Cup_OfJava;

	public static void init(){

		Kettle = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemPlaceable("kettle_item","teaparty:item/kettle", itemId++, ModBlocks.KettleBlock));
		TeaCup = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new Item("teacup","teaparty:item/teacup", itemId++));
		TeaCup_HotWater = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new Item("teacup_hotwater","teaparty:item/teacup_hotwater", itemId++));
		TeaBag = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new Item("teabag_empty","teaparty:item/teabag_empty", itemId++));
		TeaBag_Rose = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new ItemFoodTeabag("teabag_rose","teaparty:item/teabag_rose", itemId++, 0, 1,false,16));
		TeaBag_Dandelion = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new ItemFoodTeabag("teabag_dandelion","teaparty:item/teabag_dandelion", itemId++, 0, 1,false,16));
		TeaBag_Orchid = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new ItemFoodTeabag("teabag_orchid","teaparty:item/teabag_orchid", itemId++, 0, 1,false,16));
		TeaBag_Bluebell = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new ItemFoodTeabag("teabag_blubell","teaparty:item/teabag_bluebell", itemId++, 0, 1,false,16));
		TeaBag_Heather = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new ItemFoodTeabag("teabag_heather","teaparty:item/teabag_heather", itemId++, 0, 1,false,16));
		TeaBag_Marigold = new ItemBuilder(Main.MOD_ID)
			.setStackSize(8)
			.build(new ItemFoodTeabag("teabag_marigold","teaparty:item/teabag_marigold", itemId++, 0, 1,false,16));
		TeaCup_Rose = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemFoodTea("teacup_rose","teaparty:item/teacup_rose", itemId++,2, 1));
		TeaCup_Dandelion = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemFoodTea("teacup_dandelion","teaparty:item/teacup_dandelion", itemId++,2, 1));
		TeaCup_Orchid = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemFoodTea("teacup_orchid","teaparty:item/teacup_orchid", itemId++,2, 1));
		TeaCup_Bluebell = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemFoodTea("teacup_bluebell","teaparty:item/teacup_bluebell", itemId++,2, 1));
		TeaCup_Heather = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemFoodTea("teacup_heather","teaparty:item/teacup_heather", itemId++,2, 1));
		TeaCup_Marigold = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemFoodTea("teacup_marigold","teaparty:item/teacup_marigold", itemId++,2, 1));
		Cup_OfJava = new ItemBuilder(Main.MOD_ID)
			.setStackSize(1)
			.build(new ItemCupOfJava("cup_ofjava","teaparty:item/cup_ofjava", itemId++,0, 0));



	}

}
