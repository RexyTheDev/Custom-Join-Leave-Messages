package me.Rexy.Liseners.Join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Rexy.Liseners.Main;
import me.Rexy.Liseners.Utils.Utils;

public class JoinListener implements Listener {
	
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()){
			Bukkit.broadcastMessage(
					Utils.chat(plugin.getConfig().getString("firstjoin_message").replace("{player}", p.getDisplayName())));
		} else {
			Bukkit.broadcastMessage(
					Utils.chat(plugin.getConfig().getString("join_message").replace("{player}", p.getDisplayName())));
		}
	}
}
