package com.P7.Crafty.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.P7.Crafty.Main;

public class GM implements CommandExecutor{
	
	private final Main plugin;
	 
	public GM(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String args[]) {
		
		if(cmd.getLabel().equalsIgnoreCase("GM")){
			Player player = (Player) sender;
			if(args.length == 1){
				//Throws Error Fix This.
				if(args[1].equalsIgnoreCase("0")){
					player.setGameMode(GameMode.SURVIVAL);
				}
				
				if(args[1].equalsIgnoreCase("1")){
					player.setGameMode(GameMode.CREATIVE);
				}
				
				if(args[1].equalsIgnoreCase("2")){
					player.setGameMode(GameMode.ADVENTURE);

				}
				
				if(args[1].equalsIgnoreCase("3")){
					player.setGameMode(GameMode.SPECTATOR);
				}
			}else {
				player.sendMessage(ChatColor.RED + "Usage: /<Command> <Player> <GameMode>");

			}
		}
		
		return false;
	}

}
