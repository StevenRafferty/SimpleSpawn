package net.stevenrafferty.SimpleSpawn;

import net.stevenrafferty.SimpleSpawn.Commands.SetSpawn;
import net.stevenrafferty.SimpleSpawn.Commands.Spawn;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        // Commands
        getCommand("setspawn").setExecutor(new SetSpawn());
        getCommand("spawn").setExecutor(new Spawn());

        // Load config
        loadConfig();

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "SimpleSpawn has been Enabled");
    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "SimpleSpawn has been Disabled");
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
