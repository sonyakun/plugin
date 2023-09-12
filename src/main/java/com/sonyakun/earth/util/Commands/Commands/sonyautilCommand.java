package com.sonyakun.earth.util.Commands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sonyautilCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        Player player = (Player) sender;
        player.performCommand("help sonyaUtil");
        return true;
    }
}
                        