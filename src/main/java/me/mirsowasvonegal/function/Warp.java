package me.mirsowasvonegal.function;

import me.mirsowasvonegal.utils.Data;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @Projekt: CokeJoke-WarpPlugin
 * @Created: 08.07.2020
 * @By: MirSowasVonEgal | Timo
 */
public class Warp {

    private String name;

    public Warp(String name) {
        this.name = name;
    }

    public void set(Location location) {
        Data.getWarps().put(name, location);
    }

    public void remove() {
        Data.getWarps().remove(name);
    }

    public Location get() {
        return Data.getWarps().get(name);
    }

    public Boolean exist() {
        return Data.getWarps().containsKey(name);
    }

}
