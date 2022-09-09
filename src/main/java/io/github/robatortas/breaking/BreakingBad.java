package io.github.robatortas.breaking;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BreakingBad.MOD_ID)
public class BreakingBad
{
	// Global ModID
	public static final String MOD_ID = "breaking";
	
    public BreakingBad() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	Registers.register(bus);
    }
}
