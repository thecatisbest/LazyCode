package me.thecatisbest.LazyCode.events;

import me.thecatisbest.LazyCode.Main;
import me.thecatisbest.LazyCode.utilis.CC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {

    private final Main plugin;

    public LeaveEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        e.setQuitMessage(CC.color(plugin.config.getString("Join-Leave.Leave-message")
                .replaceAll("%player%", player.getName())
                .replaceAll("%player_DisplayName%", player.getDisplayName())));
    }
}