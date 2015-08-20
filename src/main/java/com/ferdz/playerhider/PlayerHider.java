package com.ferdz.playerhider;

import com.ferdz.playerhider.command.PlayerHiderCommand;
import com.ferdz.playerhider.handler.RenderHandler;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PlayerHider.MODID, version = PlayerHider.VERSION)
public class PlayerHider {
	public static final String MODID = "playerhider";
	public static final String VERSION = "1.0";
	
	public static boolean enabled;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		if(event.getSide().isServer()) {
			System.out.println("**** This mod cannot be installed server-side, disabling ****");
			return;
		}
		MinecraftForge.EVENT_BUS.register(new RenderHandler());
		ClientCommandHandler.instance.registerCommand(new PlayerHiderCommand());
		
		enabled = false;
	}
}
