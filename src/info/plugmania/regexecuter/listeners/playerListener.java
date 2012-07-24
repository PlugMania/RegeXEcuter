package info.plugmania.regexecuter.listeners;

import info.plugmania.regexecuter.RegeXEcuter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class playerListener implements Listener {

	RegeXEcuter plugin;

	public playerListener(RegeXEcuter instance) {
		plugin = instance;
	}	

	@EventHandler
	public void onPlayerChat(PlayerChatEvent  event) {
		
	}
	
}
