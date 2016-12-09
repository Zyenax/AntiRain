package net.AntiRain.main.norain;

import net.AntiRain.main.Main;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class AntiRain implements Listener{
	
	@SuppressWarnings("unused")
	private static Main plugin;

	public AntiRain(Main hub) {
		AntiRain.plugin = hub;
	}
	
	@EventHandler
	  public void weatherChange(WeatherChangeEvent event)
	  {
	    if (event.toWeatherState()) {
	        World world = event.getWorld();
	          event.setCancelled(true);
	          world.setStorm(false);
	          world.setThundering(false);
	          world.setWeatherDuration(0);
	    }
	  }

}
