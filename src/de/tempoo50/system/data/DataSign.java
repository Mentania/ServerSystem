package de.tempoo50.system.data;

import de.tempoo50.system.utils.MessagesUtil;

public class DataSign {

	private static String prefix = "§8§ §bSign §8§ §7";

	private static String noPerm = MessagesUtil.NOPERM;

	public static String getNoPerm() {
		return noPerm;
	}

	public static void setNoPerm(String noPerm) {
		DataSign.noPerm = noPerm;
	}

	public static String getPrefix() {
		return null;
	}

}