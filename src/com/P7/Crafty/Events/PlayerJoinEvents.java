package com.P7.Crafty.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.P7.Crafty.Main;

public class PlayerJoinEvents implements Listener{
	
	private final Main plugin;
	 
	public PlayerJoinEvents(Main plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void PlayerJoinMSG(PlayerJoinEvent e){
		Player player = (Player) e.getPlayer();
		/**Add Config **/ e.setJoinMessage("");
	}
	
}
