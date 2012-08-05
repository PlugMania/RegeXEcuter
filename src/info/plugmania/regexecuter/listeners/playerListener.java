package info.plugmania.regexecuter.listeners;

import info.plugmania.regexecuter.RegeXEcuter;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;

public class playerListener implements Listener {

	RegeXEcuter plugin;

	public playerListener(RegeXEcuter instance) {
		plugin = instance;
	}	

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent  event) {
		Player player = event.getPlayer();
		String msg = event.getMessage();
		if(plugin.debug && player.isOp()) plugin.getLogger().info("DEBUG: Player is OP");
		if(plugin.debug) plugin.getLogger().info("DEBUG: Chat tracked, msg:" + msg);
		if(!player.hasPermission("regex.safe")) {
			if(
					plugin.util.regexJudge(msg + " ", "([a-zA-Z0-9\\-]+)(\\.)([a-zA-Z]{2,4})( )") ||
					plugin.util.regexJudge(msg, "(:)([0-9]{4,5})") ||
					plugin.util.regexJudge(msg, "([0-9]{1,3})(\\.)([0-9]{1,3})(\\.)([0-9]{1,3})(\\.)([0-9]{1,3})")
					){
				player.kickPlayer("Why? Did you advertise in chat?");
				event.setCancelled(true);
				plugin.getLogger().info(player.getName() + " was kicked, msg:" + msg);
			} 
		}
	}
	
}
