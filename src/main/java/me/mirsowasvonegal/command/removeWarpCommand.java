package me.mirsowasvonegal.command;

import me.mirsowasvonegal.data.Warp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @Projekt: CokeJoke-WarpPlugin
 * @Created: 08.07.2020
 * @By: MirSowasVonEgal | Timo
 */
public class removeWarpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.sendMessage("§e/removewarp <name>");
            } else if (args.length == 1) {
                if (Warp.getWarps().containsKey(args[0])) {
                    player.sendMessage("§7Du hast den Warp gelöscht!");
                    new Warp(args[0], player.getLocation()).remove();
                } else {
                    player.sendMessage("§cDiesen Warp gibt es nicht!");
                }
            } else {
                player.sendMessage("§e/removewarp <name>");
            }
        }
        return false;
    }

}
