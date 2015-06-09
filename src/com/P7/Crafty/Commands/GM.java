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
				//Throws Error Fix This.
			if(args.length == 0){
				player.sendMessage(ChatColor.RED + "Usage: /<Command> <Player> <GameMode>");
			}else
				if(args[0].equalsIgnoreCase("0")){
					player.setGameMode(GameMode.SURVIVAL);
					player.sendMessage("Your GameMode is changed to Survival.");
				}else if(args[0].equalsIgnoreCase("1")){
					player.setGameMode(GameMode.CREATIVE);
					player.sendMessage("Your GameMode is changed to Creative.");
				}else if(args[0].equalsIgnoreCase("2")){
					player.setGameMode(GameMode.ADVENTURE);
					player.sendMessage("Your GameMode is changed to Adventure.");
				}else if(args[0].equalsIgnoreCase("3")){
					player.setGameMode(GameMode.SPECTATOR);
					player.sendMessage("Your GameMode is changed to Spectator.");
				}else 	 
			if(args.length == 1){
				player.sendMessage(ChatColor.RED + "Usage: /<Command> <Player> <GameMode>");
			}else
			if (player.getServer().getPlayer(args[0]) != null) {
	            Player targetPlayer = plugin.getServer().getPlayer(args[0]);
	            player.sendMessage("GameMode of the target has changed!");
				if(args[1].equalsIgnoreCase("0")){
					player.setGameMode(GameMode.SURVIVAL);
					targetPlayer.sendMessage("Your GameMode is changed to Survival.");
				}else if(args[1].equalsIgnoreCase("1")){
					player.setGameMode(GameMode.CREATIVE);
					targetPlayer.sendMessage("Your GameMode is changed to Creative.");
				}else if(args[1].equalsIgnoreCase("2")){
					player.setGameMode(GameMode.ADVENTURE);
					targetPlayer.sendMessage("Your GameMode is changed to Adventure.");
				}else if(args[1].equalsIgnoreCase("3")){
					player.setGameMode(GameMode.SPECTATOR);
					targetPlayer.sendMessage("Your GameMode is changed to Spectator.");
	            }
			}
		}

		return false;
	}

}
