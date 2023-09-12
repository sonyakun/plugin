package com.sonyakun.earth.util.Events;

import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerjoinEvent implements Listener  {
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location loc = player.getLocation();
        event.setJoinMessage("[" + ChatColor.WHITE + ChatColor.GREEN + "●" + ChatColor.WHITE + "] " + ChatColor.YELLOW + event.getPlayer().getName() + "が参加しました！" + ChatColor.RESET);
        player.playSound(
            loc,
            Sound.ENTITY_PLAYER_LEVELUP,
            1,
            1
        );
        
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        event.setQuitMessage("[" + ChatColor.WHITE + ChatColor.RED + "●" + ChatColor.WHITE + "] " + ChatColor.YELLOW + event.getPlayer().getName() + "が退出しました！" + ChatColor.RESET);
    }

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        Bukkit.getLogger().info(player.getName() + "が接続を試行しました");
    }
}