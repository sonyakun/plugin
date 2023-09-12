package com.sonyakun.earth.util.Commands.Commands;

import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class nickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        Player player = (Player) sender;
        if (!sender.hasPermission("sonyautil.nick")) {
            player.sendMessage(ChatColor.GREEN + "[SYSTEM]" + ChatColor.RED + " あなたはこのコマンドを実行するのに十分な権限がありません！" + ChatColor.RESET);
            return false;
        }
        if ( args.length == 0 ) {
            player.setDisplayName(player.getName());
            player.setPlayerListName(player.getName());
            player.setCustomName(player.getName());
            player.sendMessage("set player name to " + player.getName());
            return true;
        }
        player.setDisplayName(args[0]);
        player.setPlayerListName(args[0]);
        player.setCustomName(args[0]);
        player.sendMessage("set player name to " + args[0]);
        return true;
    }
}
                        