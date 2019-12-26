package me.Rexy.Liseners;

import org.bukkit.plugin.java.JavaPlugin;

import me.Rexy.Liseners.Join.JoinListener;
import me.Rexy.Liseners.Join.QuitEvent;
import me.Rexy.Liseners.Join.RemoveJoin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this);
		new RemoveJoin(this);
		new QuitEvent(this);
	}

}
