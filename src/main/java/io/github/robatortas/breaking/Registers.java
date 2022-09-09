package io.github.robatortas.breaking;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(BreakingBad.MOD_ID)
public class Registers {

	/*
	 * DEFFERED REGISTER: List that keeps track of all items, blocks and other things that get created on the mod
	 * 
	 *  Creates block and item (DEFERRED: put off (an action or event) to a later time; postpone).
	 *  This just means that the block has been created, but is waiting for minecraft to register it as an object.
	 */
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BreakingBad.MOD_ID);
	
	/*
	 * Now here we register our block or items,
	 * so that minecraft knows they exist and to use them in the game!
	 */
	
	// Lambda body methods (->) are methods but shortened and ALWAYS return something!
	public static final RegistryObject<Item> METH = ITEMS.register("meth", () -> new Item(new Item.Properties()
			.tab(ModItemGroup.BREAKING_GROUP)
			.tab(CreativeModeTab.TAB_FOOD)
			.food(new FoodProperties.Builder()
			.alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 60*4/*Time in ticks of the effect*/, 1 /*The strongness of the effect*/), 1/*Chance; Probability to get it*/)
			.effect(() -> new MobEffectInstance(MobEffects.POISON, 60*3, 1), (float) 0.1)
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60*25, 2), 1)
			.effect(() -> new MobEffectInstance(MobEffects.HEAL, 60*10, 2), 1)
			.effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 60*20, 2), 1)
			.build())));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
	
	public void items() {
		
	}
	
	public void blocks() {
		
	}
}