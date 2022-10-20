package catchlol.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class modGUI implements Listener {
    private final Inventory inv;

    public modGUI() {
        inv = Bukkit.createInventory(null, 9, "ModGUI");

        initializeItems();
    }

    public void initializeItems() {
        inv.addItem(createGuiItem(Material.BARRIER, "Ban", "Ban the player."));
        inv.addItem(createGuiItem(Material.ICE, "Freeze", "Freeze the player."));

    }

    protected ItemStack createGuiItem(final Material material, final String name, final String... lore){
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);

        return item;
    }

    public void openInventory(final HumanEntity ent){
        ent.openInventory(inv);
    }
}
