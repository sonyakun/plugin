package com.sonyakun.earth.util.Commands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class flyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        Player player = (Player) sender;
        if (player.getAllowFlight()){
            player.setAllowFlight(false);
            player.sendMessage("flyを無効にしました");
            return true;
        }
        if (!sender.hasPermission("sonyautil.fly")) {
            player.sendMessage(ChatColor.GREEN + "[SYSTEM]" + ChatColor.RED + " あなたはこのコマンドを実行するのに十分な権限がありません！" + ChatColor.RESET);
            return false;
        }
        player.setAllowFlight(true);
        player.sendMessage("flyを有効にしました");
        return true;
    }
}