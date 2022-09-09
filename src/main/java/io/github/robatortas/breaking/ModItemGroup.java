package io.github.robatortas.breaking;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod(BreakingBad.MOD_ID)
public class ModItemGroup {
	
	public static final CreativeModeTab BREAKING_GROUP = new CreativeModeTab("BreakingBad") {
		public ItemStack makeIcon() {
			return new ItemStack(Registers.METH.get());
		}
		
	};
}