package me.mirsowasvonegal.data;

import com.google.common.collect.Maps;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Projekt: CokeJoke-WarpPlugin
 * @Created: 08.07.2020
 * @By: MirSowasVonEgal | Timo
 */
public class Warp {

    public static List<Warp> getWarpList() {
        return warpList;
    }

    private static List<Warp> warpList = new ArrayList<>();

    private String name;
    private Location location;
    private Player player;

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Warp(String name, Player player) {
        this.name = name;
        this.location = player.getLocation();
        this.player = player;
    }

    public void set() {
        for (Warp warp : getWarpList()) {
            if (warp.getName().equals(name)) {
                player.sendMessage("§cDiesen Warp gibt es schon!");
                return;
            }
        };
        player.sendMessage("§7Du hast den Warp §3" + name + "§7 erstellt!");
        getWarpList().add(new Warp(name, player));
    }

    public void removeWarp() {
        for (Warp warp : getWarpList()) {
            if (warp.getName().equals(name)) {
                getWarpList().remove(warp);
                player.sendMessage("§7Du hast den Warp gelöscht!");
                return;
            }
        };
        player.sendMessage("§cDiesen Warp gibt es nicht!");
    }

    public void teleport() {
        for (Warp warp : getWarpList()) {
            if (warp.getName().equals(name)) {
                player.teleport(warp.getLocation());
                player.sendMessage("§aDu wurdest zu §3" + name + " §7teleportiert!");
                return;
            }
        };
        player.sendMessage("§cDiesen Warp gibt es nicht!");
    }


}
