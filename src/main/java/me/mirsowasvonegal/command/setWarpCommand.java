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
public class setWarpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.sendMessage("§e/setwarp <name>");
            } else if (args.length == 1) {
                if (Warp.getWarps().containsKey(args[0])) {
                    player.sendMessage("§cDiesen Warp gibt es schon!");
                } else {
                    player.sendMessage("§7Du hast den Warp §3" + args[0] + "§7 erstellt!");
                    new Warp(args[0], player.getLocation()).set();
                }
            } else {
                player.sendMessage("§e/setwarp <name>");
            }
        }
        return false;
    }

}