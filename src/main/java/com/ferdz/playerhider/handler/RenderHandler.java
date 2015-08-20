package com.ferdz.playerhider.handler;

import com.ferdz.playerhider.PlayerHider;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderHandler {

	@SubscribeEvent
	public void onEntityRender(RenderLivingEvent.Pre event) {
		if (event.entity instanceof EntityPlayer && !event.entity.equals(event.renderer) && PlayerHider.enabled) {
			event.setCanceled(true);
		}
	}
}
