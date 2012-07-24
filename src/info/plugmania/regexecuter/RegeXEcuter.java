package info.plugmania.regexecuter;

import info.plugmania.regexecuter.Util;
import info.plugmania.regexecuter.listeners.playerListener;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RegeXEcuter extends JavaPlugin {

	public Util util=new Util(this);
	public boolean debug=false;
	
	public void onDisable() {
		getLogger().info(this.getDescription().getName() + " is now disabled.");
	}
	
	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new playerListener(this), this);
	}
	
}
