package de.tempoo50.system.signmanager;

import com.google.common.collect.Lists;
import de.tempoo50.system.utils.MessagesUtil;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.SimpleDateFormat;
import java.util.List;

public class SignManager {

	private ItemStack itemStack;

	public SignManager(final ItemStack itemStack) {

		this.itemStack = itemStack;

	}

	public ItemStack sign(final String name, final String message, Player player) {

/*		if (!isSigned()) {
			setSigned(true);
		}
*/
		ItemMeta itemMeta = itemStack.getItemMeta();

		List<String> lore;

		if (itemMeta.getLore() == null) {
			lore = Lists.newArrayList();
		} else {
			lore = itemMeta.getLore();
		}

		if (lore.isEmpty()) {

			lore.add("§7" + message.replace('&', '§'));
			lore.add("§7§m-----------------------------------");
			lore.add("§aSigniert von §b" + name + " §aam §c" + fortmatTime(System.currentTimeMillis()));

			itemMeta.setLore(lore);
			itemStack.setItemMeta(itemMeta);
			player.sendMessage(MessagesUtil.SIGN);

		}else {

			lore = itemMeta.getLore();
			player.sendMessage(MessagesUtil.ISSIGN);

		}

		return itemStack;

	}

	public ItemStack unSign() {

//		if (isSigned()) {
//			setSigned(false);
//		}

		ItemMeta itemMeta = itemStack.getItemMeta();
		List<String> lore = itemMeta.getLore();

		for (int i = 0; i < 3; i++) {
			lore.remove(lore.size() - 1);
		}

		itemMeta.setLore(lore);
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

/*	public boolean isSigned() {

		ItemMeta itemMeta = itemStack.getItemMeta();
		List<String> lore;

		if (itemMeta.getLore() != null) {

			lore = itemMeta.getLore();
			lore.
		}

		return true;

	}
~/
/*	public void setSigned(final boolean signed) {
		net.minecraft.world.item.ItemStack nms = CraftItemStack.asNMSCopy(itemStack);
		NBTTagCompound nbt;

		if (nms.getTag() != null) {
			nbt = nms.get Tag();
		} else {
			nbt = new NBTTagCompound();
		}

		nbt.setboolean("signed", signed);
		nms.setTag(nbt);
		itemStack = CraftItemStack.asCraftMirror(nms);
	}
*/
	private String fortmatTime(final Long millis) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		return simpleDateFormat.format(millis);
	}

}