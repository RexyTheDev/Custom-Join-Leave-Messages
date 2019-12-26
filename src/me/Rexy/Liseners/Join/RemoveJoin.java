package me.Rexy.Liseners.Join;

import org.bukkit.Bukkit;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.Rexy.Liseners.Main;

public class RemoveJoin implements Listener {
	
	@SuppressWarnings("unused")
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public RemoveJoin(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage("");
	}
	
	public void onQuit(PlayerQuitEvent q) {
		q.setQuitMessage("");
	}
}
