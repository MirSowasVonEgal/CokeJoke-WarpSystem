package me.mirsowasvonegal.utils;

import com.google.common.collect.Maps;
import org.bukkit.Location;

import java.util.HashMap;
import java.util.UUID;

/**
 * @Projekt: CokeJoke-WarpPlugin
 * @Created: 08.07.2020
 * @By: MirSowasVonEgal | Timo
 */
public class Data {

    public static HashMap<String, Location> getWarps() {
        return warps;
    }

    private static HashMap<String, Location> warps = Maps.newHashMap();

}
