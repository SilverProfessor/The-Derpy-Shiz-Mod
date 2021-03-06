package net.wuerfel21.derpyshiz;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.wuerfel21.derpyshiz.items.DarkCloak;
import net.wuerfel21.derpyshiz.items.DarkSword;
import net.wuerfel21.derpyshiz.items.DerpyArmor;
import net.wuerfel21.derpyshiz.items.DerpyAxe;
import net.wuerfel21.derpyshiz.items.DerpyCircuits;
import net.wuerfel21.derpyshiz.items.DerpyDusts;
import net.wuerfel21.derpyshiz.items.DerpyGears;
import net.wuerfel21.derpyshiz.items.DerpyHammer;
import net.wuerfel21.derpyshiz.items.DerpyHoe;
import net.wuerfel21.derpyshiz.items.DerpyNuggets;
import net.wuerfel21.derpyshiz.items.DerpyPickaxe;
import net.wuerfel21.derpyshiz.items.DerpyShovel;
import net.wuerfel21.derpyshiz.items.DerpySword;
import net.wuerfel21.derpyshiz.items.ExtraIngots;
import net.wuerfel21.derpyshiz.items.HorseLasagne;
import net.wuerfel21.derpyshiz.items.ItemRotameter;
import net.wuerfel21.derpyshiz.items.ItemTDM;
import net.wuerfel21.derpyshiz.items.OreItems;
import net.wuerfel21.derpyshiz.items.WuerfeliumPickaxe;
import net.wuerfel21.derpyshiz.items.WuerfeliumSword;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class DerpyItems {
	public static ToolMaterial TITANIUM;
	public static ToolMaterial RUBY;
	public static ToolMaterial AMETHYST;
	public static ToolMaterial AMBER;
	public static ToolMaterial LAPIS;
	public static ToolMaterial TURQUOISE;
	public static ToolMaterial FAKEDIAMOND;
	public static ToolMaterial COPPER;
	public static ToolMaterial ENDERIUM;
	public static ToolMaterial DARKNESS;
	public static ToolMaterial WUERFELIUM;
	
	public static ArmorMaterial ARMOR_TITANIUM;
	public static ArmorMaterial ARMOR_RUBY;
	public static ArmorMaterial ARMOR_AMETHYST;
	public static ArmorMaterial ARMOR_COPPER;
	
	public static ArmorMaterial ARMOR_CIRCLET_DIAMOND;
	public static ArmorMaterial ARMOR_CIRCLET_RUBY;
	public static ArmorMaterial ARMOR_CIRCLET_AMETHYST;
	public static ArmorMaterial ARMOR_CIRCLET_TURQUOISE;
	public static ArmorMaterial ARMOR_CIRCLET_FAKEDIAMOND;
	
	public static ArmorMaterial ARMOR_DARK_CLOAK;
	
	public static Item shearIcon;
	public static Item derpyShears;
	public static Item oreItems;
	public static Item extraIngots;
	public static Item dusts;
	
	public static final void init() {
		TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 1000, 5.75f, 2.25f, 10);
		RUBY = EnumHelper.addToolMaterial("RUBY", 3, 1000, 6f, 2.75f, 15);
		AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 4, 3000, 11.0f, 4.0f, 18);
		AMBER = EnumHelper.addToolMaterial("AMBER", 1, 300, 5.0f, 1.50f, 25);
		LAPIS = EnumHelper.addToolMaterial("LAPIS", 1, 180, 4.5f, 1.25f, 35);
		TURQUOISE = EnumHelper.addToolMaterial("TURQUOISE",3,450,2.0f,1.5f,20);
		FAKEDIAMOND = EnumHelper.addToolMaterial("FAKEDIAMOND", 0, 400, 5.25f, 0f, 1);
		COPPER = EnumHelper.addToolMaterial("COPPER", 1, 200, 5f, 1.75f, 10);
		ENDERIUM = EnumHelper.addToolMaterial("ENDERIUM", 3, 1500, 9.5f, 4.75f, 5);
		DARKNESS = EnumHelper.addToolMaterial("DARKNESS", 2, 750, 1f, 2.25f, 20);
		WUERFELIUM = EnumHelper.addToolMaterial("WUERFELIUM", 2, 300, 3f, 2.1f, 2);
		
		ARMOR_TITANIUM = EnumHelper.addArmorMaterial("ARMOR_TITANIUM", 25, new int[]{2, 7, 5, 3}, 8);
		ARMOR_RUBY = EnumHelper.addArmorMaterial("ARMOR_RUBY", 30, new int[]{3, 7, 6, 3}, 8);
		ARMOR_AMETHYST = EnumHelper.addArmorMaterial("ARMOR_AMETHYST", 40, new int[]{4, 9, 7, 4}, 16);
		ARMOR_COPPER = EnumHelper.addArmorMaterial("ARMOR_COPPER", 10, new int[]{2, 4, 4, 2}, 6);
		
		ARMOR_CIRCLET_DIAMOND = EnumHelper.addArmorMaterial("ARMOR_CIRCLET_DIAMOND", 20, new int[]{2, 0, 0, 0}, 8);
		ARMOR_CIRCLET_RUBY = EnumHelper.addArmorMaterial("ARMOR_CIRCLET_RUBY", 19, new int[]{2, 0, 0, 0}, 6);
		ARMOR_CIRCLET_AMETHYST = EnumHelper.addArmorMaterial("ARMOR_CIRCLET_AMETHYST", 22, new int[]{3, 0, 0, 0}, 10);
		ARMOR_CIRCLET_TURQUOISE = EnumHelper.addArmorMaterial("ARMOR_CIRCLET_TURQUOISE", 15, new int[]{1, 0, 0, 0}, 4);
		ARMOR_CIRCLET_FAKEDIAMOND = EnumHelper.addArmorMaterial("ARMOR_CIRCLET_DIAMOND", 5, new int[]{0, 0, 0, 0}, 0);
		
		ARMOR_DARK_CLOAK = EnumHelper.addArmorMaterial("ARMOR_DARK_CLOAK", 20, new int[]{0, 3, 0, 0}, 7);
		
		GameRegistry.registerItem(oreItems = new OreItems(), "ore_item");
		GameRegistry.registerItem(extraIngots = new ExtraIngots(), "extra_ingot");
		GameRegistry.registerItem(dusts = new DerpyDusts(), "dust");
		
		
		GameRegistry.registerItem(new DerpyHammer(ToolMaterial.IRON).setTextureName("derpyshiz:hammer").setUnlocalizedName("hammer"), "hammer");
		
		GameRegistry.registerItem(new DerpyPickaxe(TITANIUM,oreItems,2).setUnlocalizedName("pickaxe_titanium").setTextureName("derpyshiz:pickaxe_titanium"), "pickaxe_titanium");
		GameRegistry.registerItem(new DerpySword(TITANIUM,oreItems,2).setUnlocalizedName("sword_titanium").setTextureName("derpyshiz:sword_titanium"), "sword_titanium");
		GameRegistry.registerItem(new DerpyHoe(TITANIUM,oreItems,2).setUnlocalizedName("hoe_titanium").setTextureName("derpyshiz:hoe_titanium"), "hoe_titanium");
		GameRegistry.registerItem(new DerpyShovel(TITANIUM,oreItems,2).setUnlocalizedName("shovel_titanium").setTextureName("derpyshiz:shovel_titanium"), "shovel_titanium");
		GameRegistry.registerItem(new DerpyAxe(TITANIUM,oreItems,2).setUnlocalizedName("axe_titanium").setTextureName("derpyshiz:axe_titanium"), "axe_titanium");
		
		GameRegistry.registerItem(new DerpyPickaxe(RUBY,oreItems,3).setUnlocalizedName("pickaxe_ruby").setTextureName("derpyshiz:pickaxe_ruby"), "pickaxe_ruby");
		GameRegistry.registerItem(new DerpySword(RUBY,oreItems,3).setUnlocalizedName("sword_ruby").setTextureName("derpyshiz:sword_ruby"), "sword_ruby");
		GameRegistry.registerItem(new DerpyHoe(RUBY,oreItems,3).setUnlocalizedName("hoe_ruby").setTextureName("derpyshiz:hoe_ruby"), "hoe_ruby");
		GameRegistry.registerItem(new DerpyShovel(RUBY,oreItems,3).setUnlocalizedName("shovel_ruby").setTextureName("derpyshiz:shovel_ruby"), "shovel_ruby");
		GameRegistry.registerItem(new DerpyAxe(RUBY,oreItems,3).setUnlocalizedName("axe_ruby").setTextureName("derpyshiz:axe_ruby"), "axe_ruby");
		
		GameRegistry.registerItem(new DerpyPickaxe(AMETHYST,oreItems,5).setUnlocalizedName("pickaxe_amethyst").setTextureName("derpyshiz:pickaxe_amethyst"), "pickaxe_amethyst");
		GameRegistry.registerItem(new DerpySword(AMETHYST,oreItems,5).setUnlocalizedName("sword_amethyst").setTextureName("derpyshiz:sword_amethyst"), "sword_amethyst");
		GameRegistry.registerItem(new DerpyHoe(AMETHYST,oreItems,5).setUnlocalizedName("hoe_amethyst").setTextureName("derpyshiz:hoe_amethyst"), "hoe_amethyst");
		GameRegistry.registerItem(new DerpyShovel(AMETHYST,oreItems,5).setUnlocalizedName("shovel_amethyst").setTextureName("derpyshiz:shovel_amethyst"), "shovel_amethyst");
		GameRegistry.registerItem(new DerpyAxe(AMETHYST,oreItems,5).setUnlocalizedName("axe_amethyst").setTextureName("derpyshiz:axe_amethyst"), "axe_amethyst");
		
		GameRegistry.registerItem(new DerpyPickaxe(COPPER,oreItems,9).setUnlocalizedName("pickaxe_copper").setTextureName("derpyshiz:pickaxe_copper"), "pickaxe_copper");
		GameRegistry.registerItem(new DerpySword(COPPER,oreItems,9).setUnlocalizedName("sword_copper").setTextureName("derpyshiz:sword_copper"), "sword_copper");
		GameRegistry.registerItem(new DerpyHoe(COPPER,oreItems,9).setUnlocalizedName("hoe_copper").setTextureName("derpyshiz:hoe_copper"), "hoe_copper");
		GameRegistry.registerItem(new DerpyShovel(COPPER,oreItems,9).setUnlocalizedName("shovel_copper").setTextureName("derpyshiz:shovel_copper"), "shovel_copper");
		GameRegistry.registerItem(new DerpyAxe(COPPER,oreItems,9).setUnlocalizedName("axe_copper").setTextureName("derpyshiz:axe_copper"), "axe_copper");
		
		GameRegistry.registerItem(new DerpySword(AMBER,oreItems,0).setUnlocalizedName("sword_amber").setTextureName("derpyshiz:sword_amber"), "sword_amber");
		
		GameRegistry.registerItem(new DerpySword(LAPIS,Item.getItemFromBlock(Blocks.lapis_block),0).setUnlocalizedName("sword_lapis").setTextureName("derpyshiz:sword_lapis"), "sword_lapis");
		
		GameRegistry.registerItem(new DerpySword(ENDERIUM,oreItems,10).setUnlocalizedName("sword_enderium").setTextureName("derpyshiz:sword_enderium"), "sword_enderium");
		
		GameRegistry.registerItem(new DarkSword(DARKNESS,oreItems,12).setUnlocalizedName("sword_darkness").setTextureName("derpyshiz:sword_darkness"), "sword_darkness");
		
		GameRegistry.registerItem(new DerpyAxe(TURQUOISE,oreItems,4).setUnlocalizedName("axe_turquoise").setTextureName("derpyshiz:axe_turquoise"), "axe_turquoise");
		
		GameRegistry.registerItem(new DerpyHoe(FAKEDIAMOND,oreItems,1).setUnlocalizedName("hoe_fakediamond").setTextureName("derpyshiz:hoe_fakediamond"), "hoe_fakediamond");
		
		GameRegistry.registerItem(new WuerfeliumSword(WUERFELIUM,oreItems,15).setUnlocalizedName("sword_wuerfelium"), "sword_wuerfelium");
		GameRegistry.registerItem(new WuerfeliumPickaxe(WUERFELIUM,oreItems,15).setUnlocalizedName("pickaxe_wuerfelium"), "pickaxe_wuerfelium");
		
		GameRegistry.registerItem(new DerpyArmor(ARMOR_TITANIUM,0,oreItems,2,"titanium").setUnlocalizedName("helmet_titanium").setTextureName("derpyshiz:helmet_titanium"), "helmet_titanium");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_TITANIUM,1,oreItems,2,"titanium").setUnlocalizedName("chestplate_titanium").setTextureName("derpyshiz:chestplate_titanium"), "chestplate_titanium");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_TITANIUM,2,oreItems,2,"titanium").setUnlocalizedName("leggings_titanium").setTextureName("derpyshiz:leggings_titanium"), "leggings_titanium");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_TITANIUM,3,oreItems,2,"titanium").setUnlocalizedName("boots_titanium").setTextureName("derpyshiz:boots_titanium"), "boots_titanium");
		
		GameRegistry.registerItem(new DerpyArmor(ARMOR_RUBY,0,oreItems,3,"ruby").setUnlocalizedName("helmet_ruby").setTextureName("derpyshiz:helmet_ruby"), "helmet_ruby");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_RUBY,1,oreItems,3,"ruby").setUnlocalizedName("chestplate_ruby").setTextureName("derpyshiz:chestplate_ruby"), "chestplate_ruby");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_RUBY,2,oreItems,3,"ruby").setUnlocalizedName("leggings_ruby").setTextureName("derpyshiz:leggings_ruby"), "leggings_ruby");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_RUBY,3,oreItems,3,"ruby").setUnlocalizedName("boots_ruby").setTextureName("derpyshiz:boots_ruby"), "boots_ruby");
		
		GameRegistry.registerItem(new DerpyArmor(ARMOR_AMETHYST,0,oreItems,5,"amethyst").setUnlocalizedName("helmet_amethyst").setTextureName("derpyshiz:helmet_amethyst"), "helmet_amethyst");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_AMETHYST,1,oreItems,5,"amethyst").setUnlocalizedName("chestplate_amethyst").setTextureName("derpyshiz:chestplate_amethyst"), "chestplate_amethyst");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_AMETHYST,2,oreItems,5,"amethyst").setUnlocalizedName("leggings_amethyst").setTextureName("derpyshiz:leggings_amethyst"), "leggings_amethyst");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_AMETHYST,3,oreItems,5,"amethyst").setUnlocalizedName("boots_amethyst").setTextureName("derpyshiz:boots_amethyst"), "boots_amethyst");
		
		GameRegistry.registerItem(new DerpyArmor(ARMOR_COPPER,0,oreItems,9,"copper").setUnlocalizedName("helmet_copper").setTextureName("derpyshiz:helmet_copper"), "helmet_copper");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_COPPER,1,oreItems,9,"copper").setUnlocalizedName("chestplate_copper").setTextureName("derpyshiz:chestplate_copper"), "chestplate_copper");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_COPPER,2,oreItems,9,"copper").setUnlocalizedName("leggings_copper").setTextureName("derpyshiz:leggings_copper"), "leggings_copper");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_COPPER,3,oreItems,9,"copper").setUnlocalizedName("boots_copper").setTextureName("derpyshiz:boots_copper"), "boots_copper");
		
		GameRegistry.registerItem(new DerpyArmor(ARMOR_CIRCLET_DIAMOND,0,Items.gold_ingot,0,"circlet_diamond").setUnlocalizedName("circlet_diamond").setTextureName("derpyshiz:circlet_diamond").setCreativeTab(CreativeTabs.tabMisc), "circlet_diamond");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_CIRCLET_RUBY,0,Items.gold_ingot,0,"circlet_ruby").setUnlocalizedName("circlet_ruby").setTextureName("derpyshiz:circlet_ruby").setCreativeTab(CreativeTabs.tabMisc), "circlet_ruby");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_CIRCLET_AMETHYST,0,Items.gold_ingot,0,"circlet_amethyst").setUnlocalizedName("circlet_amethyst").setTextureName("derpyshiz:circlet_amethyst").setCreativeTab(CreativeTabs.tabMisc), "circlet_amethyst");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_CIRCLET_TURQUOISE,0,Items.gold_ingot,0,"circlet_turquoise").setUnlocalizedName("circlet_turquoise").setTextureName("derpyshiz:circlet_turquoise").setCreativeTab(CreativeTabs.tabMisc), "circlet_turquoise");
		GameRegistry.registerItem(new DerpyArmor(ARMOR_CIRCLET_FAKEDIAMOND,0,Items.gold_ingot,0,"circlet_diamond").setUnlocalizedName("circlet_fakediamond").setTextureName("derpyshiz:circlet_diamond").setCreativeTab(CreativeTabs.tabMisc), "circlet_fakediamond");
		
		GameRegistry.registerItem(new DarkCloak(ARMOR_DARK_CLOAK,1,oreItems,12).setUnlocalizedName("dark_cloak").setTextureName("derpyshiz:dark_cloak"), "dark_cloak");
		
		GameRegistry.registerItem(new Item().setUnlocalizedName("horn").setTextureName("derpyshiz:horn").setCreativeTab(CreativeTabs.tabMaterials), "horn");
		
		GameRegistry.registerItem(new HorseLasagne(), "lasagne");
		
		GameRegistry.registerItem(new DerpyNuggets(), "nugget");
		GameRegistry.registerItem(new DerpyGears(), "gear");
		GameRegistry.registerItem(new ItemRotameter(), "rotameter");
		
		GameRegistry.registerItem(new DerpyCircuits(), "circuit");
		
		GameRegistry.registerItem(new ItemTDM(), "tdm");
	}
	
}
