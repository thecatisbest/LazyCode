package me.thecatisbest.LazyCode.events;

import me.thecatisbest.LazyCode.Main;
import me.thecatisbest.LazyCode.utilis.CC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    private final Main plugin;

    public JoinEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage(CC.color(plugin.config.getString("Join-Leave.Join-message")
                    .replaceAll("%player%", player.getName())
                    .replaceAll("%player_DisplayName%", player.getDisplayName())));
        }
    }
}
