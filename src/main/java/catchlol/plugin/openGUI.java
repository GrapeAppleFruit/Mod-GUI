package catchlol.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class openGUI implements CommandExecutor {
    modGUI modGUI = new modGUI();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("open")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                Player target = Bukkit.getPlayer(args[0]);
                if (args.length == 0){
                    player.sendMessage(ChatColor.RED + "Include a player's name.");
                } else {
                    modGUI.openInventory(player);
                }
            } else {
                System.out.println("Please run the command using a player client.");
            }
        }
        return false;
    }

}
