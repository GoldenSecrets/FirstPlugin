package me.goldensecrets;

import kr.entree.spigradle.annotations.PluginMain;
import org.bukkit.plugin.java.JavaPlugin;

@PluginMain
public class FirstPlugin extends JavaPlugin {

	//	This is required for all plugins. This happens when your plugin is loaded
	//	It will do things like setup config file or other basic things plugin needs.
	// Even if you don't do anything here it is needed to load.
	@Override
	public void onDisable () {
	}

	// This will happen when plugin is disabled, such as shutdown or if unloaded
	// for any other reason. It can be blank.
	@Override
	public void onEnable () {
	}
}
