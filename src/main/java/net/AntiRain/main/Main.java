package net.AntiRain.main;

import net.AntiRain.main.norain.AntiRain;
import net.AntiRain.main.utils.Utils;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	ConsoleCommandSender console = Bukkit.getConsoleSender();
	
	public void onEnable(){
		registerListeners();
		console.sendMessage(Utils.color("&8[&eAntiRain&8] &aAntiRain enabled!"));
	}
	
	public void onDisable(){
		console.sendMessage(Utils.color("&8[&eAntiRain&8] &cAntiRain disabled!"));
	}
	
	public void registerListeners(){
		PluginManager manager = Bukkit.getPluginManager();
		manager.registerEvents(new AntiRain (this), this);
		manager.registerEvents(new Utils (this), this);
	}

}
