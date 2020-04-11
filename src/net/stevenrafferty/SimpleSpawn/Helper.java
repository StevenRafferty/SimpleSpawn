package net.stevenrafferty.SimpleSpawn;

import org.bukkit.plugin.Plugin;
import org.bukkit.ChatColor;

public class Helper {

    private Plugin plugin = Main.getPlugin(Main.class);

    public String getConfigMessage(String path) {
        return plugin.getConfig().getString(path).replaceAll("(&([a-f0-9]))", "\u00A7$2");
    }

}
