package com.P7.Crafty;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.P7.Crafty.Commands.Crafty;
import com.P7.Crafty.Commands.GM;
import com.P7.Crafty.Commands.Heal;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		//Commands
		this.getCommand("Crafty").setExecutor(new Crafty(this));
		this.getCommand("Heal").setExecutor(new Heal(this));
		this.getCommand("GM").setExecutor(new GM(this));

		
	}
	
	public void onDisable(){
		
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
    	
		return false;
    }
}
