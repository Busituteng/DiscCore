
package net.mcreator.disccore.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.disccore.item.ItemEmptydisc;
import net.mcreator.disccore.ElementsDiscCore;

@ElementsDiscCore.ModElement.Tag
public class OreDictOd extends ElementsDiscCore.ModElement {
	public OreDictOd(ElementsDiscCore instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("empty_disc", new ItemStack(ItemEmptydisc.block, (int) (1)));
	}
}
