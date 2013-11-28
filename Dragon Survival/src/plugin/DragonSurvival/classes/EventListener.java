package plugin.DragonSurvival.classes;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.BlockBreakEvent;

public class EventListener implements Listener {
	public DragonSurvival m_plugin;

	public EventListener(DragonSurvival p) {
		p.getServer().getPluginManager().registerEvents(this, p);
		m_plugin = p;
	}

	@EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
	public void onPlayerInteractEntity(PlayerInteractEntityEvent evt)
	{
	}

	@EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
	public void onBlockBreak(BlockBreakEvent evt)
	{
		
	}

}
