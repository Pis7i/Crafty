package com.P7.Crafty.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.P7.Crafty.Main;

public class Heal implements CommandExecutor{
	
	private final Main plugin;
	 
	public Heal(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String args[]) {
		
		if(cmd.getLabel().equalsIgnoreCase("heal")){
			Player player = (Player) sender;
				player.setHealth(20);
				player.setFoodLevel(20);
				player.setFireTicks(0);
				for (PotionEffect effect : player.getActivePotionEffects())
				{
					player.removePotionEffect(effect.getType());
				}
			if(args.length == 1){
	            if (player.getServer().getPlayer(args[0]) != null) {
	                Player targetPlayer = plugin.getServer().getPlayer(args[0]);
	                targetPlayer.setHealth(20.0);
	                targetPlayer.setFoodLevel(20);
	                targetPlayer.setFireTicks(0);
	        		for (PotionEffect effect : targetPlayer.getActivePotionEffects())
	        		{
	        			targetPlayer.removePotionEffect(effect.getType());
	        		}
	            }
	        }   
		}
		
		return false;
	}

}
