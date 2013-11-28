package plugin.DragonSurvival.classes;

import org.bukkit.plugin.java.JavaPlugin;

public class DragonSurvival extends JavaPlugin {
	
	public void onEnable() {
		new EventListener(this);
	}

}
