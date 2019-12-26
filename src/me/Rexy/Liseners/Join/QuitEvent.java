package me.Rexy.Liseners.Join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.Rexy.Liseners.Main;
import me.Rexy.Liseners.Utils.Utils;

public class QuitEvent implements Listener {
	
	private static Main plugin;
	
	public QuitEvent(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
		
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent q) {
		Player p = q.getPlayer();
		Bukkit.broadcastMessage(
				Utils.chat(plugin.getConfig().getString("quit_message").replace("{player}", p.getDisplayName())));
	}

}
