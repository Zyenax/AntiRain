package net.AntiRain.main.utils;

import net.AntiRain.main.Main;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;

public class Utils implements Listener{
	
	@SuppressWarnings("unused")
	private static Main plugin;

	public Utils(Main hub) {
		Utils.plugin = hub;
	}

	public static String color(String string){
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
}
