package com.P7.Crafty.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.P7.Crafty.Main;

public class Crafty implements CommandExecutor{
	
	private final Main plugin;
	 
	public Crafty(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		if(cmd.getLabel().equalsIgnoreCase("Crafty")){
			
			Player player = (Player) sender;
			player.sendMessage(ChatColor.RED + "Crafty | V 0.1 | Author : P7 | To get more information type '/Help Crafty'");
		}
		return false;
	}

}
