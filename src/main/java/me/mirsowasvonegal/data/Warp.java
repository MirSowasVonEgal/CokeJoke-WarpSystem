package me.mirsowasvonegal.data;

import com.google.common.collect.Maps;
import org.bukkit.Location;

import java.util.HashMap;

/**
 * @Projekt: CokeJoke-WarpPlugin
 * @Created: 08.07.2020
 * @By: MirSowasVonEgal | Timo
 */
public class Warp {

    public static HashMap<String, Location> getWarps() {
        return warps;
    }

    private static HashMap<String, Location> warps = Maps.newHashMap();

    private String name;
    private Location location;

    public Warp(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public void set() {
        getWarps().put(name, location);
    }

    public void remove() {
        getWarps().remove(name);
    }

    public Location get() {
        return getWarps().get(name);
    }


}
