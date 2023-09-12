// death event
package com.sonyakun.earth.util.Events;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class deathEvent implements Listener  {

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        
        Player player = event.getEntity().getPlayer();
        player.sendMessage("[death location] " + ChatColor.RED + "X; " + Math.floor(player.getLocation().getX()) + " Y; " + Math.floor(player.getLocation().getY()) + " Z; " + Math.floor(player.getLocation().getZ()) + ChatColor.RESET);
    }
}