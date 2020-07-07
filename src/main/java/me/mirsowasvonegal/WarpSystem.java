package me.mirsowasvonegal;

import me.mirsowasvonegal.command.WarpCommand;
import me.mirsowasvonegal.command.removeWarpCommand;
import me.mirsowasvonegal.command.setWarpCommand;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @Projekt: CokeJoke-WarpPlugin
 * @Created: 08.07.2020
 * @By: MirSowasVonEgal | Timo
 */
public class WarpSystem extends JavaPlugin {


    @Override
    public void onEnable() {
        init();
    }

    private void init() {
        registerCommand();
        registerListener();
    }

    private void registerCommand() {
        getCommand("removewarp").setExecutor(new removeWarpCommand());
        getCommand("setwarp").setExecutor(new setWarpCommand());
        getCommand("warp").setExecutor(new WarpCommand());
    }

    private void registerListener() {

    }

    @Override
    public void onDisable() {

    }

}
