package catchlol.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("open").setExecutor(new openGUI());
        getServer().getPluginManager().registerEvents(new modGUI(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
