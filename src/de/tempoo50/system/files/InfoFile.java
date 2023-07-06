package de.tempoo50.system.files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.YamlConfiguration;

public class InfoFile {

	public static void loadInfo() {

		File file = new File("plugins//ServerSystem//Info.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
//1		
		List<String> info1Command1 = new ArrayList<>();
		info1Command1.add((String) config.get("Lore.Info1.Command1_1"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_2"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_3"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_4"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_5"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_6"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_7"));
		info1Command1.add((String) config.get("Lore.Info1.Command1_8"));

		List<String> info1Command2 = new ArrayList<>();
		info1Command2.add((String) config.get("Lore.Info1.Command2_1"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_2"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_3"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_4"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_5"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_6"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_7"));
		info1Command2.add((String) config.get("Lore.Info1.Command2_8"));

		List<String> info1Command3 = new ArrayList<>();
		info1Command3.add((String) config.get("Lore.Info1.Command3_1"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_2"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_3"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_4"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_5"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_6"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_7"));
		info1Command3.add((String) config.get("Lore.Info1.Command3_8"));

		List<String> info1Command4 = new ArrayList<>();
		info1Command4.add((String) config.get("Lore.Info1.Command4_1"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_2"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_3"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_4"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_5"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_6"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_7"));
		info1Command4.add((String) config.get("Lore.Info1.Command4_8"));

		List<String> info1Command5 = new ArrayList<>();
		info1Command5.add((String) config.get("Lore.Info1.Command5_1"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_2"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_3"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_4"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_5"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_6"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_7"));
		info1Command5.add((String) config.get("Lore.Info1.Command5_8"));

		List<String> info1Command6 = new ArrayList<>();
		info1Command6.add((String) config.get("Lore.Info1.Command6_1"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_2"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_3"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_4"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_5"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_6"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_7"));
		info1Command6.add((String) config.get("Lore.Info1.Command6_8"));

		List<String> info1Command7 = new ArrayList<>();
		info1Command7.add((String) config.get("Lore.Info1.Command7_1"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_2"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_3"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_4"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_5"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_6"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_7"));
		info1Command7.add((String) config.get("Lore.Info1.Command7_8"));

		List<String> info1Command8 = new ArrayList<>();
		info1Command8.add((String) config.get("Lore.Info1.Command8_1"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_2"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_3"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_4"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_5"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_6"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_7"));
		info1Command8.add((String) config.get("Lore.Info1.Command8_8"));

		List<String> info1Command9 = new ArrayList<>();
		info1Command9.add((String) config.get("Lore.Info1.Command9_1"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_2"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_3"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_4"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_5"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_6"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_7"));
		info1Command9.add((String) config.get("Lore.Info1.Command9_8"));

		List<String> info1Command10 = new ArrayList<>();
		info1Command10.add((String) config.get("Lore.Info1.Command10_1"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_2"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_3"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_4"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_5"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_6"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_7"));
		info1Command10.add((String) config.get("Lore.Info1.Command10_8"));

		List<String> info1Command11 = new ArrayList<>();
		info1Command11.add((String) config.get("Lore.Info1.Command11_1"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_2"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_3"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_4"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_5"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_6"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_7"));
		info1Command11.add((String) config.get("Lore.Info1.Command11_8"));

		List<String> info1Command12 = new ArrayList<>();
		info1Command12.add((String) config.get("Lore.Info1.Command12_1"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_2"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_3"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_4"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_5"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_6"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_7"));
		info1Command12.add((String) config.get("Lore.Info1.Command12_8"));

		List<String> info1Command13 = new ArrayList<>();
		info1Command13.add((String) config.get("Lore.Info1.Command13_1"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_2"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_3"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_4"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_5"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_6"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_7"));
		info1Command13.add((String) config.get("Lore.Info1.Command13_8"));

		List<String> info1Command14 = new ArrayList<>();
		info1Command14.add((String) config.get("Lore.Info1.Command14_1"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_2"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_3"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_4"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_5"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_6"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_7"));
		info1Command14.add((String) config.get("Lore.Info1.Command14_8"));

		List<String> info1Command15 = new ArrayList<>();
		info1Command15.add((String) config.get("Lore.Info1.Command15_1"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_2"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_3"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_4"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_5"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_6"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_7"));
		info1Command15.add((String) config.get("Lore.Info1.Command15_8"));

		List<String> info1Command16 = new ArrayList<>();
		info1Command16.add((String) config.get("Lore.Info1.Command16_1"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_2"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_3"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_4"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_5"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_6"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_7"));
		info1Command16.add((String) config.get("Lore.Info1.Command16_8"));

		List<String> info1Command17 = new ArrayList<>();
		info1Command17.add((String) config.get("Lore.Info1.Command17_1"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_2"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_3"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_4"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_5"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_6"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_7"));
		info1Command17.add((String) config.get("Lore.Info1.Command17_8"));

		List<String> info1Command18 = new ArrayList<>();
		info1Command18.add((String) config.get("Lore.Info1.Command18_1"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_2"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_3"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_4"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_5"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_6"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_7"));
		info1Command18.add((String) config.get("Lore.Info1.Command18_8"));
//2		
		List<String> info2Command1 = new ArrayList<>();
		info2Command1.add((String) config.get("Lore.Info2.Command1_1"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_2"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_3"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_4"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_5"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_6"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_7"));
		info2Command1.add((String) config.get("Lore.Info2.Command1_8"));

		List<String> info2Command2 = new ArrayList<>();
		info2Command2.add((String) config.get("Lore.Info2.Command2_1"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_2"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_3"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_4"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_5"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_6"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_7"));
		info2Command2.add((String) config.get("Lore.Info2.Command2_8"));

		List<String> info2Command3 = new ArrayList<>();
		info2Command3.add((String) config.get("Lore.Info2.Command3_1"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_2"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_3"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_4"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_5"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_6"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_7"));
		info2Command3.add((String) config.get("Lore.Info2.Command3_8"));

		List<String> info2Command4 = new ArrayList<>();
		info2Command4.add((String) config.get("Lore.Info2.Command4_1"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_2"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_3"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_4"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_5"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_6"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_7"));
		info2Command4.add((String) config.get("Lore.Info2.Command4_8"));

		List<String> info2Command5 = new ArrayList<>();
		info2Command5.add((String) config.get("Lore.Info2.Command5_1"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_2"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_3"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_4"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_5"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_6"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_7"));
		info2Command5.add((String) config.get("Lore.Info2.Command5_8"));

		List<String> info2Command6 = new ArrayList<>();
		info2Command6.add((String) config.get("Lore.Info2.Command6_1"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_2"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_3"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_4"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_5"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_6"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_7"));
		info2Command6.add((String) config.get("Lore.Info2.Command6_8"));

		List<String> info2Command7 = new ArrayList<>();
		info2Command7.add((String) config.get("Lore.Info2.Command7_1"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_2"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_3"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_4"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_5"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_6"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_7"));
		info2Command7.add((String) config.get("Lore.Info2.Command7_8"));

		List<String> info2Command8 = new ArrayList<>();
		info2Command8.add((String) config.get("Lore.Info2.Command8_1"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_2"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_3"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_4"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_5"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_6"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_7"));
		info2Command8.add((String) config.get("Lore.Info2.Command8_8"));

		List<String> info2Command9 = new ArrayList<>();
		info2Command9.add((String) config.get("Lore.Info2.Command9_1"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_2"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_3"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_4"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_5"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_6"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_7"));
		info2Command9.add((String) config.get("Lore.Info2.Command9_8"));

		List<String> info2Command10 = new ArrayList<>();
		info2Command10.add((String) config.get("Lore.Info2.Command10_1"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_2"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_3"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_4"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_5"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_6"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_7"));
		info2Command10.add((String) config.get("Lore.Info2.Command10_8"));

		List<String> info2Command11 = new ArrayList<>();
		info2Command11.add((String) config.get("Lore.Info2.Command11_1"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_2"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_3"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_4"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_5"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_6"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_7"));
		info2Command11.add((String) config.get("Lore.Info2.Command11_8"));

		List<String> info2Command12 = new ArrayList<>();
		info2Command12.add((String) config.get("Lore.Info2.Command12_1"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_2"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_3"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_4"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_5"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_6"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_7"));
		info2Command12.add((String) config.get("Lore.Info2.Command12_8"));

		List<String> info2Command13 = new ArrayList<>();
		info2Command13.add((String) config.get("Lore.Info2.Command13_1"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_2"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_3"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_4"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_5"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_6"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_7"));
		info2Command13.add((String) config.get("Lore.Info2.Command13_8"));

		List<String> info2Command14 = new ArrayList<>();
		info2Command14.add((String) config.get("Lore.Info2.Command14_1"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_2"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_3"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_4"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_5"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_6"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_7"));
		info2Command14.add((String) config.get("Lore.Info2.Command14_8"));

		List<String> info2Command15 = new ArrayList<>();
		info2Command15.add((String) config.get("Lore.Info2.Command15_1"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_2"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_3"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_4"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_5"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_6"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_7"));
		info2Command15.add((String) config.get("Lore.Info2.Command15_8"));

		List<String> info2Command16 = new ArrayList<>();
		info2Command16.add((String) config.get("Lore.Info2.Command16_1"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_2"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_3"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_4"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_5"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_6"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_7"));
		info2Command16.add((String) config.get("Lore.Info2.Command16_8"));

		List<String> info2Command17 = new ArrayList<>();
		info2Command17.add((String) config.get("Lore.Info2.Command17_1"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_2"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_3"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_4"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_5"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_6"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_7"));
		info2Command17.add((String) config.get("Lore.Info2.Command17_8"));

		List<String> info2Command18 = new ArrayList<>();
		info2Command18.add((String) config.get("Lore.Info2.Command18_1"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_2"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_3"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_4"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_5"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_6"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_7"));
		info2Command18.add((String) config.get("Lore.Info2.Command18_8"));
//3		
		List<String> info3Command1 = new ArrayList<>();
		info3Command1.add((String) config.get("Lore.Info3.Command1_1"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_2"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_3"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_4"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_5"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_6"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_7"));
		info3Command1.add((String) config.get("Lore.Info3.Command1_8"));

		List<String> info3Command2 = new ArrayList<>();
		info3Command2.add((String) config.get("Lore.Info3.Command2_1"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_2"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_3"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_4"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_5"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_6"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_7"));
		info3Command2.add((String) config.get("Lore.Info3.Command2_8"));

		List<String> info3Command3 = new ArrayList<>();
		info3Command3.add((String) config.get("Lore.Info3.Command3_1"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_2"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_3"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_4"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_5"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_6"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_7"));
		info3Command3.add((String) config.get("Lore.Info3.Command3_8"));

		List<String> info3Command4 = new ArrayList<>();
		info3Command4.add((String) config.get("Lore.Info3.Command4_1"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_2"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_3"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_4"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_5"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_6"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_7"));
		info3Command4.add((String) config.get("Lore.Info3.Command4_8"));

		List<String> info3Command5 = new ArrayList<>();
		info3Command5.add((String) config.get("Lore.Info3.Command5_1"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_2"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_3"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_4"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_5"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_6"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_7"));
		info3Command5.add((String) config.get("Lore.Info3.Command5_8"));

		List<String> info3Command6 = new ArrayList<>();
		info3Command6.add((String) config.get("Lore.Info3.Command6_1"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_2"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_3"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_4"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_5"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_6"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_7"));
		info3Command6.add((String) config.get("Lore.Info3.Command6_8"));

		List<String> info3Command7 = new ArrayList<>();
		info3Command7.add((String) config.get("Lore.Info3.Command7_1"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_2"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_3"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_4"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_5"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_6"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_7"));
		info3Command7.add((String) config.get("Lore.Info3.Command7_8"));

		List<String> info3Command8 = new ArrayList<>();
		info3Command8.add((String) config.get("Lore.Info3.Command8_1"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_2"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_3"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_4"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_5"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_6"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_7"));
		info3Command8.add((String) config.get("Lore.Info3.Command8_8"));

		List<String> info3Command9 = new ArrayList<>();
		info3Command9.add((String) config.get("Lore.Info3.Command9_1"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_2"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_3"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_4"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_5"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_6"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_7"));
		info3Command9.add((String) config.get("Lore.Info3.Command9_8"));

		List<String> info3Command10 = new ArrayList<>();
		info3Command10.add((String) config.get("Lore.Info3.Command10_1"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_2"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_3"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_4"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_5"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_6"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_7"));
		info3Command10.add((String) config.get("Lore.Info3.Command10_8"));

		List<String> info3Command11 = new ArrayList<>();
		info3Command11.add((String) config.get("Lore.Info3.Command11_1"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_2"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_3"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_4"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_5"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_6"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_7"));
		info3Command11.add((String) config.get("Lore.Info3.Command11_8"));

		List<String> info3Command12 = new ArrayList<>();
		info3Command12.add((String) config.get("Lore.Info3.Command12_1"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_2"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_3"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_4"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_5"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_6"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_7"));
		info3Command12.add((String) config.get("Lore.Info3.Command12_8"));

		List<String> info3Command13 = new ArrayList<>();
		info3Command13.add((String) config.get("Lore.Info3.Command13_1"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_2"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_3"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_4"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_5"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_6"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_7"));
		info3Command13.add((String) config.get("Lore.Info3.Command13_8"));

		List<String> info3Command14 = new ArrayList<>();
		info3Command14.add((String) config.get("Lore.Info3.Command14_1"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_2"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_3"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_4"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_5"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_6"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_7"));
		info3Command14.add((String) config.get("Lore.Info3.Command14_8"));

		List<String> info3Command15 = new ArrayList<>();
		info3Command15.add((String) config.get("Lore.Info3.Command15_1"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_2"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_3"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_4"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_5"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_6"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_7"));
		info3Command15.add((String) config.get("Lore.Info3.Command15_8"));

		List<String> info3Command16 = new ArrayList<>();
		info3Command16.add((String) config.get("Lore.Info3.Command16_1"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_2"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_3"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_4"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_5"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_6"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_7"));
		info3Command16.add((String) config.get("Lore.Info3.Command16_8"));

		List<String> info3Command17 = new ArrayList<>();
		info3Command17.add((String) config.get("Lore.Info3.Command17_1"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_2"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_3"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_4"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_5"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_6"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_7"));
		info3Command17.add((String) config.get("Lore.Info3.Command17_8"));

		List<String> info3Command18 = new ArrayList<>();
		info3Command18.add((String) config.get("Lore.Info3.Command18_1"));
		info3Command18.add((String) config.get("Lore.Info3.Command18_2"));
		info3Command18.add((String) config.get("Lore.Info3.Command18_3"));
		info3Command18.add((String) config.get("Lore.Info3.Command18_4"));
		info3Command18.add((String) config.get("Lore.Info1.Command18_5"));
		info3Command18.add((String) config.get("Lore.Info3.Command18_6"));
		info3Command18.add((String) config.get("Lore.Info3.Command18_7"));
		info3Command18.add((String) config.get("Lore.Info3.Command18_8"));
//4		
		List<String> info4Command1 = new ArrayList<>();
		info4Command1.add((String) config.get("Lore.Info4.Command1_1"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_2"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_3"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_4"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_5"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_6"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_7"));
		info4Command1.add((String) config.get("Lore.Info4.Command1_8"));

		List<String> info4Command2 = new ArrayList<>();
		info4Command2.add((String) config.get("Lore.Info4.Command2_1"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_2"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_3"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_4"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_5"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_6"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_7"));
		info4Command2.add((String) config.get("Lore.Info4.Command2_8"));

		List<String> info4Command3 = new ArrayList<>();
		info4Command3.add((String) config.get("Lore.Info4.Command3_1"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_2"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_3"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_4"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_5"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_6"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_7"));
		info4Command3.add((String) config.get("Lore.Info4.Command3_8"));

		List<String> info4Command4 = new ArrayList<>();
		info4Command4.add((String) config.get("Lore.Info4.Command4_1"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_2"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_3"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_4"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_5"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_6"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_7"));
		info4Command4.add((String) config.get("Lore.Info4.Command4_8"));

		List<String> info4Command5 = new ArrayList<>();
		info4Command5.add((String) config.get("Lore.Info4.Command5_1"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_2"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_3"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_4"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_5"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_6"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_7"));
		info4Command5.add((String) config.get("Lore.Info4.Command5_8"));

		List<String> info4Command6 = new ArrayList<>();
		info4Command6.add((String) config.get("Lore.Info4.Command6_1"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_2"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_3"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_4"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_5"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_6"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_7"));
		info4Command6.add((String) config.get("Lore.Info4.Command6_8"));

		List<String> info4Command7 = new ArrayList<>();
		info4Command7.add((String) config.get("Lore.Info4.Command7_1"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_2"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_3"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_4"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_5"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_6"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_7"));
		info4Command7.add((String) config.get("Lore.Info4.Command7_8"));

		List<String> info4Command8 = new ArrayList<>();
		info4Command8.add((String) config.get("Lore.Info4.Command8_1"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_2"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_3"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_4"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_5"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_6"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_7"));
		info4Command8.add((String) config.get("Lore.Info4.Command8_8"));

		List<String> info4Command9 = new ArrayList<>();
		info4Command9.add((String) config.get("Lore.Info4.Command9_1"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_2"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_3"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_4"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_5"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_6"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_7"));
		info4Command9.add((String) config.get("Lore.Info4.Command9_8"));

		List<String> info4Command10 = new ArrayList<>();
		info4Command10.add((String) config.get("Lore.Info4.Command10_1"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_2"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_3"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_4"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_5"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_6"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_7"));
		info4Command10.add((String) config.get("Lore.Info4.Command10_8"));

		List<String> info4Command11 = new ArrayList<>();
		info4Command11.add((String) config.get("Lore.Info4.Command11_1"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_2"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_3"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_4"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_5"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_6"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_7"));
		info4Command11.add((String) config.get("Lore.Info4.Command11_8"));

		List<String> info4Command12 = new ArrayList<>();
		info4Command12.add((String) config.get("Lore.Info4.Command12_1"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_2"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_3"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_4"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_5"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_6"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_7"));
		info4Command12.add((String) config.get("Lore.Info4.Command12_8"));

		List<String> info4Command13 = new ArrayList<>();
		info4Command13.add((String) config.get("Lore.Info4.Command13_1"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_2"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_3"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_4"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_5"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_6"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_7"));
		info4Command13.add((String) config.get("Lore.Info4.Command13_8"));

		List<String> info4Command14 = new ArrayList<>();
		info4Command14.add((String) config.get("Lore.Info4.Command14_1"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_2"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_3"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_4"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_5"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_6"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_7"));
		info4Command14.add((String) config.get("Lore.Info4.Command14_8"));

		List<String> info4Command15 = new ArrayList<>();
		info4Command15.add((String) config.get("Lore.Info4.Command15_1"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_2"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_3"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_4"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_5"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_6"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_7"));
		info4Command15.add((String) config.get("Lore.Info4.Command15_8"));

		List<String> info4Command16 = new ArrayList<>();
		info4Command16.add((String) config.get("Lore.Info4.Command16_1"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_2"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_3"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_4"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_5"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_6"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_7"));
		info4Command16.add((String) config.get("Lore.Info4.Command16_8"));

		List<String> info4Command17 = new ArrayList<>();
		info4Command17.add((String) config.get("Lore.Info4.Command17_1"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_2"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_3"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_4"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_5"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_6"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_7"));
		info4Command17.add((String) config.get("Lore.Info4.Command17_8"));

		List<String> info4Command18 = new ArrayList<>();
		info4Command18.add((String) config.get("Lore.Info4.Command18_1"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_2"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_3"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_4"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_5"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_6"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_7"));
		info4Command18.add((String) config.get("Lore.Info4.Command18_8"));
//5		
		List<String> info5Command1 = new ArrayList<>();
		info5Command1.add((String) config.get("Lore.Info5.Command1_1"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_2"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_3"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_4"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_5"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_6"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_7"));
		info5Command1.add((String) config.get("Lore.Info5.Command1_8"));

		List<String> info5Command2 = new ArrayList<>();
		info5Command2.add((String) config.get("Lore.Info5.Command2_1"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_2"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_3"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_4"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_5"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_6"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_7"));
		info5Command2.add((String) config.get("Lore.Info5.Command2_8"));

		List<String> info5Command3 = new ArrayList<>();
		info5Command3.add((String) config.get("Lore.Info5.Command3_1"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_2"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_3"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_4"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_5"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_6"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_7"));
		info5Command3.add((String) config.get("Lore.Info5.Command3_8"));

		List<String> info5Command4 = new ArrayList<>();
		info5Command4.add((String) config.get("Lore.Info5.Command4_1"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_2"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_3"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_4"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_5"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_6"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_7"));
		info5Command4.add((String) config.get("Lore.Info5.Command4_8"));

		List<String> info5Command5 = new ArrayList<>();
		info5Command5.add((String) config.get("Lore.Info5.Command5_1"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_2"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_3"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_4"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_5"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_6"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_7"));
		info5Command5.add((String) config.get("Lore.Info5.Command5_8"));

		List<String> info5Command6 = new ArrayList<>();
		info5Command6.add((String) config.get("Lore.Info5.Command6_1"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_2"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_3"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_4"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_5"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_6"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_7"));
		info5Command6.add((String) config.get("Lore.Info5.Command6_8"));

		List<String> info5Command7 = new ArrayList<>();
		info5Command7.add((String) config.get("Lore.Info5.Command7_1"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_2"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_3"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_4"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_5"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_6"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_7"));
		info5Command7.add((String) config.get("Lore.Info5.Command7_8"));

		List<String> info5Command8 = new ArrayList<>();
		info5Command8.add((String) config.get("Lore.Info5.Command8_1"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_2"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_3"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_4"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_5"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_6"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_7"));
		info5Command8.add((String) config.get("Lore.Info5.Command8_8"));

		List<String> info5Command9 = new ArrayList<>();
		info5Command9.add((String) config.get("Lore.Info5.Command9_1"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_2"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_3"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_4"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_5"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_6"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_7"));
		info5Command9.add((String) config.get("Lore.Info5.Command9_8"));

		List<String> info5Command10 = new ArrayList<>();
		info5Command10.add((String) config.get("Lore.Info5.Command10_1"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_2"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_3"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_4"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_5"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_6"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_7"));
		info5Command10.add((String) config.get("Lore.Info5.Command10_8"));

		List<String> info5Command11 = new ArrayList<>();
		info5Command11.add((String) config.get("Lore.Info5.Command11_1"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_2"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_3"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_4"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_5"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_6"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_7"));
		info5Command11.add((String) config.get("Lore.Info5.Command11_8"));

		List<String> info5Command12 = new ArrayList<>();
		info5Command12.add((String) config.get("Lore.Info5.Command12_1"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_2"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_3"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_4"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_5"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_6"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_7"));
		info5Command12.add((String) config.get("Lore.Info5.Command12_8"));

		List<String> info5Command13 = new ArrayList<>();
		info5Command13.add((String) config.get("Lore.Info5.Command13_1"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_2"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_3"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_4"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_5"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_6"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_7"));
		info5Command13.add((String) config.get("Lore.Info5.Command13_8"));

		List<String> info5Command14 = new ArrayList<>();
		info5Command14.add((String) config.get("Lore.Info5.Command14_1"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_2"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_3"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_4"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_5"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_6"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_7"));
		info5Command14.add((String) config.get("Lore.Info5.Command14_8"));

		List<String> info5Command15 = new ArrayList<>();
		info5Command15.add((String) config.get("Lore.Info5.Command15_1"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_2"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_3"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_4"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_5"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_6"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_7"));
		info5Command15.add((String) config.get("Lore.Info5.Command15_8"));

		List<String> info5Command16 = new ArrayList<>();
		info5Command16.add((String) config.get("Lore.Info5.Command16_1"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_2"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_3"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_4"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_5"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_6"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_7"));
		info5Command16.add((String) config.get("Lore.Info5.Command16_8"));

		List<String> info5Command17 = new ArrayList<>();
		info5Command17.add((String) config.get("Lore.Info5.Command17_1"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_2"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_3"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_4"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_5"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_6"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_7"));
		info5Command17.add((String) config.get("Lore.Info5.Command17_8"));

		List<String> info5Command18 = new ArrayList<>();
		info5Command18.add((String) config.get("Lore.Info5.Command18_1"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_2"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_3"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_4"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_5"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_6"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_7"));
		info5Command18.add((String) config.get("Lore.Info5.Command18_8"));
//6		
		List<String> info6Command1 = new ArrayList<>();
		info6Command1.add((String) config.get("Lore.Info6.Command1_1"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_2"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_3"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_4"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_5"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_6"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_7"));
		info6Command1.add((String) config.get("Lore.Info6.Command1_8"));

		List<String> info6Command2 = new ArrayList<>();
		info6Command2.add((String) config.get("Lore.Info6.Command2_1"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_2"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_3"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_4"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_5"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_6"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_7"));
		info6Command2.add((String) config.get("Lore.Info6.Command2_8"));

		List<String> info6Command3 = new ArrayList<>();
		info6Command3.add((String) config.get("Lore.Info6.Command3_1"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_2"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_3"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_4"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_5"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_6"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_7"));
		info6Command3.add((String) config.get("Lore.Info6.Command3_8"));

		List<String> info6Command4 = new ArrayList<>();
		info6Command4.add((String) config.get("Lore.Info6.Command4_1"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_2"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_3"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_4"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_5"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_6"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_7"));
		info6Command4.add((String) config.get("Lore.Info6.Command4_8"));

		List<String> info6Command5 = new ArrayList<>();
		info6Command5.add((String) config.get("Lore.Info6.Command5_1"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_2"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_3"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_4"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_5"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_6"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_7"));
		info6Command5.add((String) config.get("Lore.Info6.Command5_8"));

		List<String> info6Command6 = new ArrayList<>();
		info6Command6.add((String) config.get("Lore.Info6.Command6_1"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_2"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_3"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_4"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_5"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_6"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_7"));
		info6Command6.add((String) config.get("Lore.Info6.Command6_8"));

		List<String> info6Command7 = new ArrayList<>();
		info6Command7.add((String) config.get("Lore.Info6.Command7_1"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_2"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_3"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_4"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_5"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_6"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_7"));
		info6Command7.add((String) config.get("Lore.Info6.Command7_8"));

		List<String> info6Command8 = new ArrayList<>();
		info6Command8.add((String) config.get("Lore.Info6.Command8_1"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_2"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_3"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_4"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_5"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_6"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_7"));
		info6Command8.add((String) config.get("Lore.Info6.Command8_8"));

		List<String> info6Command9 = new ArrayList<>();
		info6Command9.add((String) config.get("Lore.Info6.Command9_1"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_2"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_3"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_4"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_5"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_6"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_7"));
		info6Command9.add((String) config.get("Lore.Info6.Command9_8"));

		List<String> info6Command10 = new ArrayList<>();
		info6Command10.add((String) config.get("Lore.Info6.Command10_1"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_2"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_3"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_4"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_5"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_6"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_7"));
		info6Command10.add((String) config.get("Lore.Info6.Command10_8"));

		List<String> info6Command11 = new ArrayList<>();
		info6Command11.add((String) config.get("Lore.Info6.Command11_1"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_2"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_3"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_4"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_5"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_6"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_7"));
		info6Command11.add((String) config.get("Lore.Info6.Command11_8"));

		List<String> info6Command12 = new ArrayList<>();
		info6Command12.add((String) config.get("Lore.Info6.Command12_1"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_2"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_3"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_4"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_5"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_6"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_7"));
		info6Command12.add((String) config.get("Lore.Info6.Command12_8"));

		List<String> info6Command13 = new ArrayList<>();
		info6Command13.add((String) config.get("Lore.Info6.Command13_1"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_2"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_3"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_4"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_5"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_6"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_7"));
		info6Command13.add((String) config.get("Lore.Info6.Command13_8"));

		List<String> info6Command14 = new ArrayList<>();
		info6Command14.add((String) config.get("Lore.Info6.Command14_1"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_2"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_3"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_4"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_5"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_6"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_7"));
		info6Command14.add((String) config.get("Lore.Info6.Command14_8"));

		List<String> info6Command15 = new ArrayList<>();
		info6Command15.add((String) config.get("Lore.Info6.Command15_1"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_2"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_3"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_4"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_5"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_6"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_7"));
		info6Command15.add((String) config.get("Lore.Info6.Command15_8"));

		List<String> info6Command16 = new ArrayList<>();
		info6Command16.add((String) config.get("Lore.Info6.Command16_1"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_2"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_3"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_4"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_5"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_6"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_7"));
		info6Command16.add((String) config.get("Lore.Info6.Command16_8"));

		List<String> info6Command17 = new ArrayList<>();
		info6Command17.add((String) config.get("Lore.Info6.Command17_1"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_2"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_3"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_4"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_5"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_6"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_7"));
		info6Command17.add((String) config.get("Lore.Info6.Command17_8"));

		List<String> info6Command18 = new ArrayList<>();
		info6Command18.add((String) config.get("Lore.Info6.Command18_1"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_2"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_3"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_4"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_5"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_6"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_7"));
		info6Command18.add((String) config.get("Lore.Info6.Command18_8"));
//7		
		List<String> info7Command1 = new ArrayList<>();
		info7Command1.add((String) config.get("Lore.Info7.Command1_1"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_2"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_3"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_4"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_5"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_6"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_7"));
		info7Command1.add((String) config.get("Lore.Info7.Command1_8"));

		List<String> info7Command2 = new ArrayList<>();
		info7Command2.add((String) config.get("Lore.Info7.Command2_1"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_2"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_3"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_4"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_5"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_6"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_7"));
		info7Command2.add((String) config.get("Lore.Info7.Command2_8"));

		List<String> info7Command3 = new ArrayList<>();
		info7Command3.add((String) config.get("Lore.Info7.Command3_1"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_2"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_3"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_4"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_5"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_6"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_7"));
		info7Command3.add((String) config.get("Lore.Info7.Command3_8"));

		List<String> info7Command4 = new ArrayList<>();
		info7Command4.add((String) config.get("Lore.Info7.Command4_1"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_2"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_3"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_4"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_5"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_6"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_7"));
		info7Command4.add((String) config.get("Lore.Info7.Command4_8"));

		List<String> info7Command5 = new ArrayList<>();
		info7Command5.add((String) config.get("Lore.Info7.Command5_1"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_2"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_3"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_4"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_5"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_6"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_7"));
		info7Command5.add((String) config.get("Lore.Info7.Command5_8"));

		List<String> info7Command6 = new ArrayList<>();
		info7Command6.add((String) config.get("Lore.Info7.Command6_1"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_2"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_3"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_4"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_5"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_6"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_7"));
		info7Command6.add((String) config.get("Lore.Info7.Command6_8"));

		List<String> info7Command7 = new ArrayList<>();
		info7Command7.add((String) config.get("Lore.Info7.Command7_1"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_2"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_3"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_4"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_5"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_6"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_7"));
		info7Command7.add((String) config.get("Lore.Info7.Command7_8"));

		List<String> info7Command8 = new ArrayList<>();
		info7Command8.add((String) config.get("Lore.Info7.Command8_1"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_2"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_3"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_4"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_5"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_6"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_7"));
		info7Command8.add((String) config.get("Lore.Info7.Command8_8"));

		List<String> info7Command9 = new ArrayList<>();
		info7Command9.add((String) config.get("Lore.Info7.Command9_1"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_2"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_3"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_4"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_5"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_6"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_7"));
		info7Command9.add((String) config.get("Lore.Info7.Command9_8"));

		List<String> info7Command10 = new ArrayList<>();
		info7Command10.add((String) config.get("Lore.Info7.Command10_1"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_2"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_3"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_4"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_5"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_6"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_7"));
		info7Command10.add((String) config.get("Lore.Info7.Command10_8"));

		List<String> info7Command11 = new ArrayList<>();
		info7Command11.add((String) config.get("Lore.Info7.Command11_1"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_2"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_3"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_4"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_5"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_6"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_7"));
		info7Command11.add((String) config.get("Lore.Info7.Command11_8"));

		List<String> info7Command12 = new ArrayList<>();
		info7Command12.add((String) config.get("Lore.Info7.Command12_1"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_2"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_3"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_4"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_5"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_6"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_7"));
		info7Command12.add((String) config.get("Lore.Info7.Command12_8"));

		List<String> info7Command13 = new ArrayList<>();
		info7Command13.add((String) config.get("Lore.Info7.Command13_1"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_2"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_3"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_4"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_5"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_6"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_7"));
		info7Command13.add((String) config.get("Lore.Info7.Command13_8"));

		List<String> info7Command14 = new ArrayList<>();
		info7Command14.add((String) config.get("Lore.Info7.Command14_1"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_2"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_3"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_4"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_5"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_6"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_7"));
		info7Command14.add((String) config.get("Lore.Info7.Command14_8"));

		List<String> info7Command15 = new ArrayList<>();
		info7Command15.add((String) config.get("Lore.Info7.Command15_1"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_2"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_3"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_4"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_5"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_6"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_7"));
		info7Command15.add((String) config.get("Lore.Info7.Command15_8"));

		List<String> info7Command16 = new ArrayList<>();
		info7Command16.add((String) config.get("Lore.Info7.Command16_1"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_2"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_3"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_4"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_5"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_6"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_7"));
		info7Command16.add((String) config.get("Lore.Info7.Command16_8"));

		List<String> info7Command17 = new ArrayList<>();
		info7Command17.add((String) config.get("Lore.Info7.Command17_1"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_2"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_3"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_4"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_5"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_6"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_7"));
		info7Command17.add((String) config.get("Lore.Info7.Command17_8"));

		List<String> info7Command18 = new ArrayList<>();
		info7Command18.add((String) config.get("Lore.Info7.Command18_1"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_2"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_3"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_4"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_5"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_6"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_7"));
		info7Command18.add((String) config.get("Lore.Info7.Command18_8"));
//8		
		List<String> info8Command1 = new ArrayList<>();
		info8Command1.add((String) config.get("Lore.Info8.Command1_1"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_2"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_3"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_4"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_5"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_6"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_7"));
		info8Command1.add((String) config.get("Lore.Info8.Command1_8"));

		List<String> info8Command2 = new ArrayList<>();
		info8Command2.add((String) config.get("Lore.Info8.Command2_1"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_2"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_3"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_4"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_5"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_6"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_7"));
		info8Command2.add((String) config.get("Lore.Info8.Command2_8"));

		List<String> info8Command3 = new ArrayList<>();
		info8Command3.add((String) config.get("Lore.Info8.Command3_1"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_2"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_3"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_4"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_5"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_6"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_7"));
		info8Command3.add((String) config.get("Lore.Info8.Command3_8"));

		List<String> info8Command4 = new ArrayList<>();
		info8Command4.add((String) config.get("Lore.Info8.Command4_1"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_2"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_3"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_4"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_5"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_6"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_7"));
		info8Command4.add((String) config.get("Lore.Info8.Command4_8"));

		List<String> info8Command5 = new ArrayList<>();
		info8Command5.add((String) config.get("Lore.Info8.Command5_1"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_2"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_3"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_4"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_5"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_6"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_7"));
		info8Command5.add((String) config.get("Lore.Info8.Command5_8"));

		List<String> info8Command6 = new ArrayList<>();
		info8Command6.add((String) config.get("Lore.Info8.Command6_1"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_2"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_3"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_4"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_5"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_6"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_7"));
		info8Command6.add((String) config.get("Lore.Info8.Command6_8"));

		List<String> info8Command7 = new ArrayList<>();
		info8Command7.add((String) config.get("Lore.Info8.Command7_1"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_2"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_3"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_4"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_5"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_6"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_7"));
		info8Command7.add((String) config.get("Lore.Info8.Command7_8"));

		List<String> info8Command8 = new ArrayList<>();
		info8Command8.add((String) config.get("Lore.Info8.Command8_1"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_2"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_3"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_4"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_5"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_6"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_7"));
		info8Command8.add((String) config.get("Lore.Info8.Command8_8"));

		List<String> info8Command9 = new ArrayList<>();
		info8Command9.add((String) config.get("Lore.Info8.Command9_1"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_2"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_3"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_4"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_5"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_6"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_7"));
		info8Command9.add((String) config.get("Lore.Info8.Command9_8"));

		List<String> info8Command10 = new ArrayList<>();
		info8Command10.add((String) config.get("Lore.Info8.Command10_1"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_2"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_3"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_4"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_5"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_6"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_7"));
		info8Command10.add((String) config.get("Lore.Info8.Command10_8"));

		List<String> info8Command11 = new ArrayList<>();
		info8Command11.add((String) config.get("Lore.Info8.Command11_1"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_2"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_3"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_4"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_5"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_6"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_7"));
		info8Command11.add((String) config.get("Lore.Info8.Command11_8"));

		List<String> info8Command12 = new ArrayList<>();
		info8Command12.add((String) config.get("Lore.Info8.Command12_1"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_2"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_3"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_4"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_5"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_6"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_7"));
		info8Command12.add((String) config.get("Lore.Info8.Command12_8"));

		List<String> info8Command13 = new ArrayList<>();
		info8Command13.add((String) config.get("Lore.Info8.Command13_1"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_2"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_3"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_4"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_5"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_6"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_7"));
		info8Command13.add((String) config.get("Lore.Info8.Command13_8"));

		List<String> info8Command14 = new ArrayList<>();
		info8Command14.add((String) config.get("Lore.Info8.Command14_1"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_2"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_3"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_4"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_5"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_6"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_7"));
		info8Command14.add((String) config.get("Lore.Info8.Command14_8"));

		List<String> info8Command15 = new ArrayList<>();
		info8Command15.add((String) config.get("Lore.Info8.Command15_1"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_2"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_3"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_4"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_5"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_6"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_7"));
		info8Command15.add((String) config.get("Lore.Info8.Command15_8"));

		List<String> info8Command16 = new ArrayList<>();
		info8Command16.add((String) config.get("Lore.Info8.Command16_1"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_2"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_3"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_4"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_5"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_6"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_7"));
		info8Command16.add((String) config.get("Lore.Info8.Command16_8"));

		List<String> info8Command17 = new ArrayList<>();
		info8Command17.add((String) config.get("Lore.Info8.Command17_1"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_2"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_3"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_4"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_5"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_6"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_7"));
		info8Command17.add((String) config.get("Lore.Info8.Command17_8"));

		List<String> info8Command18 = new ArrayList<>();
		info8Command18.add((String) config.get("Lore.Info8.Command18_1"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_2"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_3"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_4"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_5"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_6"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_7"));
		info8Command18.add((String) config.get("Lore.Info8.Command18_8"));
//9		
		List<String> info9Command1 = new ArrayList<>();
		info9Command1.add((String) config.get("Lore.Info9.Command1_1"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_2"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_3"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_4"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_5"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_6"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_7"));
		info9Command1.add((String) config.get("Lore.Info9.Command1_8"));

		List<String> info9Command2 = new ArrayList<>();
		info9Command2.add((String) config.get("Lore.Info9.Command2_1"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_2"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_3"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_4"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_5"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_6"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_7"));
		info9Command2.add((String) config.get("Lore.Info9.Command2_8"));

		List<String> info9Command3 = new ArrayList<>();
		info9Command3.add((String) config.get("Lore.Info9.Command3_1"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_2"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_3"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_4"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_5"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_6"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_7"));
		info9Command3.add((String) config.get("Lore.Info9.Command3_8"));

		List<String> info9Command4 = new ArrayList<>();
		info9Command4.add((String) config.get("Lore.Info9.Command4_1"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_2"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_3"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_4"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_5"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_6"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_7"));
		info9Command4.add((String) config.get("Lore.Info9.Command4_8"));

		List<String> info9Command5 = new ArrayList<>();
		info9Command5.add((String) config.get("Lore.Info9.Command5_1"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_2"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_3"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_4"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_5"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_6"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_7"));
		info9Command5.add((String) config.get("Lore.Info9.Command5_8"));

		List<String> info9Command6 = new ArrayList<>();
		info9Command6.add((String) config.get("Lore.Info9.Command6_1"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_2"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_3"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_4"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_5"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_6"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_7"));
		info9Command6.add((String) config.get("Lore.Info9.Command6_8"));

		List<String> info9Command7 = new ArrayList<>();
		info9Command7.add((String) config.get("Lore.Info9.Command7_1"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_2"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_3"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_4"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_5"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_6"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_7"));
		info9Command7.add((String) config.get("Lore.Info9.Command7_8"));

		List<String> info9Command8 = new ArrayList<>();
		info9Command8.add((String) config.get("Lore.Info9.Command8_1"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_2"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_3"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_4"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_5"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_6"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_7"));
		info9Command8.add((String) config.get("Lore.Info9.Command8_8"));

		List<String> info9Command9 = new ArrayList<>();
		info9Command9.add((String) config.get("Lore.Info9.Command9_1"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_2"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_3"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_4"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_5"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_6"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_7"));
		info9Command9.add((String) config.get("Lore.Info9.Command9_8"));

		List<String> info9Command10 = new ArrayList<>();
		info9Command10.add((String) config.get("Lore.Info9.Command10_1"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_2"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_3"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_4"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_5"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_6"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_7"));
		info9Command10.add((String) config.get("Lore.Info9.Command10_8"));

		List<String> info9Command11 = new ArrayList<>();
		info9Command11.add((String) config.get("Lore.Info9.Command11_1"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_2"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_3"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_4"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_5"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_6"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_7"));
		info9Command11.add((String) config.get("Lore.Info9.Command11_8"));

		List<String> info9Command12 = new ArrayList<>();
		info9Command12.add((String) config.get("Lore.Info9.Command12_1"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_2"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_3"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_4"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_5"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_6"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_7"));
		info9Command12.add((String) config.get("Lore.Info9.Command12_8"));

		List<String> info9Command13 = new ArrayList<>();
		info9Command13.add((String) config.get("Lore.Info9.Command13_1"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_2"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_3"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_4"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_5"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_6"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_7"));
		info9Command13.add((String) config.get("Lore.Info9.Command13_8"));

		List<String> info9Command14 = new ArrayList<>();
		info9Command14.add((String) config.get("Lore.Info9.Command14_1"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_2"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_3"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_4"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_5"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_6"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_7"));
		info9Command14.add((String) config.get("Lore.Info9.Command14_8"));

		List<String> info9Command15 = new ArrayList<>();
		info9Command15.add((String) config.get("Lore.Info9.Command15_1"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_2"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_3"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_4"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_5"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_6"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_7"));
		info9Command15.add((String) config.get("Lore.Info9.Command15_8"));

		List<String> info9Command16 = new ArrayList<>();
		info9Command16.add((String) config.get("Lore.Info9.Command16_1"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_2"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_3"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_4"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_5"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_6"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_7"));
		info9Command16.add((String) config.get("Lore.Info9.Command16_8"));

		List<String> info9Command17 = new ArrayList<>();
		info9Command17.add((String) config.get("Lore.Info9.Command17_1"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_2"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_3"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_4"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_5"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_6"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_7"));
		info9Command17.add((String) config.get("Lore.Info9.Command17_8"));

		List<String> info9Command18 = new ArrayList<>();
		info9Command18.add((String) config.get("Lore.Info9.Command18_1"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_2"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_3"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_4"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_5"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_6"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_7"));
		info9Command18.add((String) config.get("Lore.Info9.Command18_8"));
//10		
		List<String> info10Command1 = new ArrayList<>();
		info10Command1.add((String) config.get("Lore.Info10.Command1_1"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_2"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_3"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_4"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_5"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_6"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_7"));
		info10Command1.add((String) config.get("Lore.Info10.Command1_8"));

		List<String> info10Command2 = new ArrayList<>();
		info10Command2.add((String) config.get("Lore.Info10.Command2_1"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_2"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_3"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_4"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_5"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_6"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_7"));
		info10Command2.add((String) config.get("Lore.Info10.Command2_8"));

		List<String> info10Command3 = new ArrayList<>();
		info10Command3.add((String) config.get("Lore.Info10.Command3_1"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_2"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_3"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_4"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_5"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_6"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_7"));
		info10Command3.add((String) config.get("Lore.Info10.Command3_8"));

		List<String> info10Command4 = new ArrayList<>();
		info10Command4.add((String) config.get("Lore.Info10.Command4_1"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_2"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_3"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_4"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_5"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_6"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_7"));
		info10Command4.add((String) config.get("Lore.Info10.Command4_8"));

		List<String> info10Command5 = new ArrayList<>();
		info10Command5.add((String) config.get("Lore.Info10.Command5_1"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_2"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_3"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_4"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_5"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_6"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_7"));
		info10Command5.add((String) config.get("Lore.Info10.Command5_8"));

		List<String> info10Command6 = new ArrayList<>();
		info10Command6.add((String) config.get("Lore.Info10.Command6_1"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_2"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_3"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_4"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_5"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_6"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_7"));
		info10Command6.add((String) config.get("Lore.Info10.Command6_8"));

		List<String> info10Command7 = new ArrayList<>();
		info10Command7.add((String) config.get("Lore.Info10.Command7_1"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_2"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_3"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_4"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_5"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_6"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_7"));
		info10Command7.add((String) config.get("Lore.Info10.Command7_8"));

		List<String> info10Command8 = new ArrayList<>();
		info10Command8.add((String) config.get("Lore.Info10.Command8_1"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_2"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_3"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_4"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_5"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_6"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_7"));
		info10Command8.add((String) config.get("Lore.Info10.Command8_8"));

		List<String> info10Command9 = new ArrayList<>();
		info10Command9.add((String) config.get("Lore.Info10.Command9_1"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_2"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_3"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_4"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_5"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_6"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_7"));
		info10Command9.add((String) config.get("Lore.Info10.Command9_8"));

		List<String> info10Command10 = new ArrayList<>();
		info10Command10.add((String) config.get("Lore.Info10.Command10_1"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_2"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_3"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_4"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_5"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_6"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_7"));
		info10Command10.add((String) config.get("Lore.Info10.Command10_8"));

		List<String> info10Command11 = new ArrayList<>();
		info10Command11.add((String) config.get("Lore.Info10.Command11_1"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_2"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_3"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_4"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_5"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_6"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_7"));
		info10Command11.add((String) config.get("Lore.Info10.Command11_8"));

		List<String> info10Command12 = new ArrayList<>();
		info10Command12.add((String) config.get("Lore.Info10.Command12_1"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_2"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_3"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_4"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_5"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_6"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_7"));
		info10Command12.add((String) config.get("Lore.Info10.Command12_8"));

		List<String> info10Command13 = new ArrayList<>();
		info10Command13.add((String) config.get("Lore.Info10.Command13_1"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_2"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_3"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_4"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_5"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_6"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_7"));
		info10Command13.add((String) config.get("Lore.Info10.Command13_8"));

		List<String> info10Command14 = new ArrayList<>();
		info10Command14.add((String) config.get("Lore.Info10.Command14_1"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_2"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_3"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_4"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_5"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_6"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_7"));
		info10Command14.add((String) config.get("Lore.Info10.Command14_8"));

		List<String> info10Command15 = new ArrayList<>();
		info10Command15.add((String) config.get("Lore.Info10.Command15_1"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_2"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_3"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_4"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_5"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_6"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_7"));
		info10Command15.add((String) config.get("Lore.Info10.Command15_8"));

		List<String> info10Command16 = new ArrayList<>();
		info10Command16.add((String) config.get("Lore.Info10.Command16_1"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_2"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_3"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_4"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_5"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_6"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_7"));
		info10Command16.add((String) config.get("Lore.Info10.Command16_8"));

		List<String> info10Command17 = new ArrayList<>();
		info10Command17.add((String) config.get("Lore.Info10.Command17_1"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_2"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_3"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_4"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_5"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_6"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_7"));
		info10Command17.add((String) config.get("Lore.Info10.Command17_8"));

		List<String> info10Command18 = new ArrayList<>();
		info10Command18.add((String) config.get("Lore.Info10.Command18_1"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_2"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_3"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_4"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_5"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_6"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_7"));
		info10Command18.add((String) config.get("Lore.Info10.Command18_8"));

		List<String> info11Shop1 = new ArrayList<>();
		info11Shop1.add((String) config.get("Lore.Info11.Shop1"));

		List<String> info11Shop2 = new ArrayList<>();
		info11Shop2.add((String) config.get("Lore.Info11.Shop2"));

		List<String> info11Shop3 = new ArrayList<>();
		info11Shop3.add((String) config.get("Lore.Info11.Shop3"));

		List<String> info11Shop4 = new ArrayList<>();
		info11Shop4.add((String) config.get("Lore.Info11.Shop4"));

		List<String> info11Shop5 = new ArrayList<>();
		info11Shop5.add((String) config.get("Lore.Info11.Shop5"));

		List<String> info11Shop6 = new ArrayList<>();
		info11Shop6.add((String) config.get("Lore.Info11.Shop6"));

		List<String> info11Shop7 = new ArrayList<>();
		info11Shop7.add((String) config.get("Lore.Info11.Shop7"));

		List<String> info11Shop8 = new ArrayList<>();
		info11Shop8.add((String) config.get("Lore.Info11.Shop8"));

		List<String> info11Shop9 = new ArrayList<>();
		info11Shop9.add((String) config.get("Lore.Info11.Shop9"));

		List<String> info11Shop10 = new ArrayList<>();
		info11Shop10.add((String) config.get("Lore.Info11.Shop10"));

		List<String> info11Shop11 = new ArrayList<>();
		info11Shop11.add((String) config.get("Lore.Info11.Shop11"));

		List<String> info11Shop12 = new ArrayList<>();
		info11Shop12.add((String) config.get("Lore.Info11.Shop12"));

		List<String> info11Shop13 = new ArrayList<>();
		info11Shop13.add((String) config.get("Lore.Info11.Shop13"));

		List<String> info11Shop14 = new ArrayList<>();
		info11Shop14.add((String) config.get("Lore.Info11.Shop14"));

		List<String> info11Shop15 = new ArrayList<>();
		info11Shop15.add((String) config.get("Lore.Info11.Shop15"));

		List<String> info11Shop16 = new ArrayList<>();
		info11Shop16.add((String) config.get("Lore.Info11.Shop16"));

		List<String> info11Shop17 = new ArrayList<>();
		info11Shop17.add((String) config.get("Lore.Info11.Shop17"));

		List<String> info11Shop18 = new ArrayList<>();
		info11Shop18.add((String) config.get("Lore.Info11.Shop18"));

		config.addDefault("DisplayName1", "Freund");
		config.addDefault("DisplayName2", "YT+");
		config.addDefault("DisplayName3", "Drachent§ter");
		config.addDefault("DisplayName4", "EnderDrache");
		config.addDefault("DisplayName5", "Drache");
		config.addDefault("DisplayName6", "YT");
		config.addDefault("DisplayName7", "Enderman");
		config.addDefault("DisplayName8", "Ultra");
		config.addDefault("DisplayName9", "Premium");
		config.addDefault("DisplayName10", "Spieler");
		config.addDefault("DisplayName11", "Shops");

		config.addDefault("DisplayRang1.Command1", "");
		config.addDefault("DisplayRang1.Command2", "");
		config.addDefault("DisplayRang1.Command3", "");
		config.addDefault("DisplayRang1.Command4", "");
		config.addDefault("DisplayRang1.Command5", "");
		config.addDefault("DisplayRang1.Command6", "");
		config.addDefault("DisplayRang1.Command7", "");
		config.addDefault("DisplayRang1.Command8", "");
		config.addDefault("DisplayRang1.Command9", "");
		config.addDefault("DisplayRang1.Command10", "");
		config.addDefault("DisplayRang1.Command11", "");
		config.addDefault("DisplayRang1.Command12", "");
		config.addDefault("DisplayRang1.Command13", "");
		config.addDefault("DisplayRang1.Command14", "");
		config.addDefault("DisplayRang1.Command15", "");
		config.addDefault("DisplayRang1.Command16", "");
		config.addDefault("DisplayRang1.Command17", "");
		config.addDefault("DisplayRang1.Command18", "");

		config.addDefault("DisplayRang2.Command1", "");
		config.addDefault("DisplayRang2.Command2", "");
		config.addDefault("DisplayRang2.Command3", "");
		config.addDefault("DisplayRang2.Command4", "");
		config.addDefault("DisplayRang2.Command5", "");
		config.addDefault("DisplayRang2.Command6", "");
		config.addDefault("DisplayRang2.Command7", "");
		config.addDefault("DisplayRang2.Command8", "");
		config.addDefault("DisplayRang2.Command9", "");
		config.addDefault("DisplayRang2.Command10", "");
		config.addDefault("DisplayRang2.Command11", "");
		config.addDefault("DisplayRang2.Command12", "");
		config.addDefault("DisplayRang2.Command13", "");
		config.addDefault("DisplayRang2.Command14", "");
		config.addDefault("DisplayRang2.Command15", "");
		config.addDefault("DisplayRang2.Command16", "");
		config.addDefault("DisplayRang2.Command17", "");
		config.addDefault("DisplayRang2.Command18", "");

		config.addDefault("DisplayRang3.Command1", "");
		config.addDefault("DisplayRang3.Command2", "");
		config.addDefault("DisplayRang3.Command3", "");
		config.addDefault("DisplayRang3.Command4", "");
		config.addDefault("DisplayRang3.Command5", "");
		config.addDefault("DisplayRang3.Command6", "");
		config.addDefault("DisplayRang3.Command7", "");
		config.addDefault("DisplayRang3.Command8", "");
		config.addDefault("DisplayRang3.Command9", "");
		config.addDefault("DisplayRang3.Command10", "");
		config.addDefault("DisplayRang3.Command11", "");
		config.addDefault("DisplayRang3.Command12", "");
		config.addDefault("DisplayRang3.Command13", "");
		config.addDefault("DisplayRang3.Command14", "");
		config.addDefault("DisplayRang3.Command15", "");
		config.addDefault("DisplayRang3.Command16", "");
		config.addDefault("DisplayRang3.Command17", "");
		config.addDefault("DisplayRang3.Command18", "");

		config.addDefault("DisplayRang4.Command1", "");
		config.addDefault("DisplayRang4.Command2", "");
		config.addDefault("DisplayRang4.Command3", "");
		config.addDefault("DisplayRang4.Command4", "");
		config.addDefault("DisplayRang4.Command5", "");
		config.addDefault("DisplayRang4.Command6", "");
		config.addDefault("DisplayRang4.Command7", "");
		config.addDefault("DisplayRang4.Command8", "");
		config.addDefault("DisplayRang4.Command9", "");
		config.addDefault("DisplayRang4.Command10", "");
		config.addDefault("DisplayRang4.Command11", "");
		config.addDefault("DisplayRang4.Command12", "");
		config.addDefault("DisplayRang4.Command13", "");
		config.addDefault("DisplayRang4.Command14", "");
		config.addDefault("DisplayRang4.Command15", "");
		config.addDefault("DisplayRang4.Command16", "");
		config.addDefault("DisplayRang4.Command17", "");
		config.addDefault("DisplayRang4.Command18", "");

		config.addDefault("DisplayRang5.Command1", "");
		config.addDefault("DisplayRang5.Command2", "");
		config.addDefault("DisplayRang5.Command3", "");
		config.addDefault("DisplayRang5.Command4", "");
		config.addDefault("DisplayRang5.Command5", "");
		config.addDefault("DisplayRang5.Command6", "");
		config.addDefault("DisplayRang5.Command7", "");
		config.addDefault("DisplayRang5.Command8", "");
		config.addDefault("DisplayRang5.Command9", "");
		config.addDefault("DisplayRang5.Command10", "");
		config.addDefault("DisplayRang5.Command11", "");
		config.addDefault("DisplayRang5.Command12", "");
		config.addDefault("DisplayRang5.Command13", "");
		config.addDefault("DisplayRang5.Command14", "");
		config.addDefault("DisplayRang5.Command15", "");
		config.addDefault("DisplayRang5.Command16", "");
		config.addDefault("DisplayRang5.Command17", "");
		config.addDefault("DisplayRang5.Command18", "");

		config.addDefault("DisplayRang6.Command1", "");
		config.addDefault("DisplayRang6.Command2", "");
		config.addDefault("DisplayRang6.Command3", "");
		config.addDefault("DisplayRang6.Command4", "");
		config.addDefault("DisplayRang6.Command5", "");
		config.addDefault("DisplayRang6.Command6", "");
		config.addDefault("DisplayRang6.Command7", "");
		config.addDefault("DisplayRang6.Command8", "");
		config.addDefault("DisplayRang6.Command9", "");
		config.addDefault("DisplayRang6.Command10", "");
		config.addDefault("DisplayRang6.Command11", "");
		config.addDefault("DisplayRang6.Command12", "");
		config.addDefault("DisplayRang6.Command13", "");
		config.addDefault("DisplayRang6.Command14", "");
		config.addDefault("DisplayRang6.Command15", "");
		config.addDefault("DisplayRang6.Command16", "");
		config.addDefault("DisplayRang6.Command17", "");
		config.addDefault("DisplayRang6.Command18", "");

		config.addDefault("DisplayRang7.Command1", "");
		config.addDefault("DisplayRang7.Command2", "");
		config.addDefault("DisplayRang7.Command3", "");
		config.addDefault("DisplayRang7.Command4", "");
		config.addDefault("DisplayRang7.Command5", "");
		config.addDefault("DisplayRang7.Command6", "");
		config.addDefault("DisplayRang7.Command7", "");
		config.addDefault("DisplayRang7.Command8", "");
		config.addDefault("DisplayRang7.Command9", "");
		config.addDefault("DisplayRang7.Command10", "");
		config.addDefault("DisplayRang7.Command11", "");
		config.addDefault("DisplayRang7.Command12", "");
		config.addDefault("DisplayRang7.Command13", "");
		config.addDefault("DisplayRang7.Command14", "");
		config.addDefault("DisplayRang7.Command15", "");
		config.addDefault("DisplayRang7.Command16", "");
		config.addDefault("DisplayRang7.Command17", "");
		config.addDefault("DisplayRang7.Command18", "");

		config.addDefault("DisplayRang8.Command1", "");
		config.addDefault("DisplayRang8.Command2", "");
		config.addDefault("DisplayRang8.Command3", "");
		config.addDefault("DisplayRang8.Command4", "");
		config.addDefault("DisplayRang8.Command5", "");
		config.addDefault("DisplayRang8.Command6", "");
		config.addDefault("DisplayRang8.Command7", "");
		config.addDefault("DisplayRang8.Command8", "");
		config.addDefault("DisplayRang8.Command9", "");
		config.addDefault("DisplayRang8.Command10", "");
		config.addDefault("DisplayRang8.Command11", "");
		config.addDefault("DisplayRang8.Command12", "");
		config.addDefault("DisplayRang8.Command13", "");
		config.addDefault("DisplayRang8.Command14", "");
		config.addDefault("DisplayRang8.Command15", "");
		config.addDefault("DisplayRang8.Command16", "");
		config.addDefault("DisplayRang8.Command17", "");
		config.addDefault("DisplayRang8.Command18", "");

		config.addDefault("DisplayRang9.Command1", "");
		config.addDefault("DisplayRang9.Command2", "");
		config.addDefault("DisplayRang9.Command3", "");
		config.addDefault("DisplayRang9.Command4", "");
		config.addDefault("DisplayRang9.Command5", "");
		config.addDefault("DisplayRang9.Command6", "");
		config.addDefault("DisplayRang9.Command7", "");
		config.addDefault("DisplayRang9.Command8", "");
		config.addDefault("DisplayRang9.Command9", "");
		config.addDefault("DisplayRang9.Command10", "");
		config.addDefault("DisplayRang9.Command11", "");
		config.addDefault("DisplayRang9.Command12", "");
		config.addDefault("DisplayRang9.Command13", "");
		config.addDefault("DisplayRang9.Command14", "");
		config.addDefault("DisplayRang9.Command15", "");
		config.addDefault("DisplayRang9.Command16", "");
		config.addDefault("DisplayRang9.Command17", "");
		config.addDefault("DisplayRang9.Command18", "");

		config.addDefault("DisplayRang10.Command1", "");
		config.addDefault("DisplayRang10.Command2", "");
		config.addDefault("DisplayRang10.Command3", "");
		config.addDefault("DisplayRang10.Command4", "");
		config.addDefault("DisplayRang10.Command5", "");
		config.addDefault("DisplayRang10.Command6", "");
		config.addDefault("DisplayRang10.Command7", "");
		config.addDefault("DisplayRang10.Command8", "");
		config.addDefault("DisplayRang10.Command9", "");
		config.addDefault("DisplayRang10.Command10", "");
		config.addDefault("DisplayRang10.Command11", "");
		config.addDefault("DisplayRang10.Command12", "");
		config.addDefault("DisplayRang10.Command13", "");
		config.addDefault("DisplayRang10.Command14", "");
		config.addDefault("DisplayRang10.Command15", "");
		config.addDefault("DisplayRang10.Command16", "");
		config.addDefault("DisplayRang10.Command17", "");
		config.addDefault("DisplayRang10.Command18", "");

		config.addDefault("DisplayShop11.Shop1", "");
		config.addDefault("DisplayShop11.Shop2", "");
		config.addDefault("DisplayShop11.Shop3", "");
		config.addDefault("DisplayShop11.Shop4", "");
		config.addDefault("DisplayShop11.Shop5", "");
		config.addDefault("DisplayShop11.Shop6", "");
		config.addDefault("DisplayShop11.Shop7", "");
		config.addDefault("DisplayShop11.Shop8", "");
		config.addDefault("DisplayShop11.Shop9", "");
		config.addDefault("DisplayShop11.Shop10", "");
		config.addDefault("DisplayShop11.Shop11", "");
		config.addDefault("DisplayShop11.Shop12", "");
		config.addDefault("DisplayShop11.Shop13", "");
		config.addDefault("DisplayShop11.Shop14", "");
		config.addDefault("DisplayShop11.Shop15", "");
		config.addDefault("DisplayShop11.Shop16", "");
		config.addDefault("DisplayShop11.Shop17", "");
		config.addDefault("DisplayShop11.Shop18", "");

		config.addDefault("Lore.Info1.Command1_1", "");
		config.addDefault("Lore.Info1.Command1_2", "");
		config.addDefault("Lore.Info1.Command1_3", "");
		config.addDefault("Lore.Info1.Command1_4", "");
		config.addDefault("Lore.Info1.Command1_5", "");
		config.addDefault("Lore.Info1.Command1_6", "");
		config.addDefault("Lore.Info1.Command1_7", "");
		config.addDefault("Lore.Info1.Command1_8", "");
		config.set("Lore.Info1.Command1", info1Command1);

		config.addDefault("Lore.Info1.Command2_1", "");
		config.addDefault("Lore.Info1.Command2_2", "");
		config.addDefault("Lore.Info1.Command2_3", "");
		config.addDefault("Lore.Info1.Command2_4", "");
		config.addDefault("Lore.Info1.Command2_5", "");
		config.addDefault("Lore.Info1.Command2_6", "");
		config.addDefault("Lore.Info1.Command2_7", "");
		config.addDefault("Lore.Info1.Command2_8", "");
		config.set("Lore.Info1.Command2", info1Command2);

		config.addDefault("Lore.Info1.Command3_1", "");
		config.addDefault("Lore.Info1.Command3_2", "");
		config.addDefault("Lore.Info1.Command3_3", "");
		config.addDefault("Lore.Info1.Command3_4", "");
		config.addDefault("Lore.Info1.Command3_5", "");
		config.addDefault("Lore.Info1.Command3_6", "");
		config.addDefault("Lore.Info1.Command3_7", "");
		config.addDefault("Lore.Info1.Command3_8", "");
		config.set("Lore.Info1.Command3", info1Command3);

		config.addDefault("Lore.Info1.Command4_1", "");
		config.addDefault("Lore.Info1.Command4_2", "");
		config.addDefault("Lore.Info1.Command4_3", "");
		config.addDefault("Lore.Info1.Command4_4", "");
		config.addDefault("Lore.Info1.Command4_5", "");
		config.addDefault("Lore.Info1.Command4_6", "");
		config.addDefault("Lore.Info1.Command4_7", "");
		config.addDefault("Lore.Info1.Command4_8", "");
		config.set("Lore.Info1.Command4", info1Command4);

		config.addDefault("Lore.Info1.Command5_1", "");
		config.addDefault("Lore.Info1.Command5_2", "");
		config.addDefault("Lore.Info1.Command5_3", "");
		config.addDefault("Lore.Info1.Command5_4", "");
		config.addDefault("Lore.Info1.Command5_5", "");
		config.addDefault("Lore.Info1.Command5_6", "");
		config.addDefault("Lore.Info1.Command5_7", "");
		config.addDefault("Lore.Info1.Command5_8", "");
		config.set("Lore.Info1.Command5", info1Command5);

		config.addDefault("Lore.Info1.Command6_1", "");
		config.addDefault("Lore.Info1.Command6_2", "");
		config.addDefault("Lore.Info1.Command6_3", "");
		config.addDefault("Lore.Info1.Command6_4", "");
		config.addDefault("Lore.Info1.Command6_5", "");
		config.addDefault("Lore.Info1.Command6_6", "");
		config.addDefault("Lore.Info1.Command6_7", "");
		config.addDefault("Lore.Info1.Command6_8", "");
		config.set("Lore.Info1.Command6", info1Command6);

		config.addDefault("Lore.Info1.Command7_1", "");
		config.addDefault("Lore.Info1.Command7_2", "");
		config.addDefault("Lore.Info1.Command7_3", "");
		config.addDefault("Lore.Info1.Command7_4", "");
		config.addDefault("Lore.Info1.Command7_5", "");
		config.addDefault("Lore.Info1.Command7_6", "");
		config.addDefault("Lore.Info1.Command7_7", "");
		config.addDefault("Lore.Info1.Command7_8", "");
		config.set("Lore.Info1.Command7", info1Command7);

		config.addDefault("Lore.Info1.Command8_1", "");
		config.addDefault("Lore.Info1.Command8_2", "");
		config.addDefault("Lore.Info1.Command8_3", "");
		config.addDefault("Lore.Info1.Command8_4", "");
		config.addDefault("Lore.Info1.Command8_5", "");
		config.addDefault("Lore.Info1.Command8_6", "");
		config.addDefault("Lore.Info1.Command8_7", "");
		config.addDefault("Lore.Info1.Command8_8", "");
		config.set("Lore.Info1.Command8", info1Command8);

		config.addDefault("Lore.Info1.Command9_1", "");
		config.addDefault("Lore.Info1.Command9_2", "");
		config.addDefault("Lore.Info1.Command9_3", "");
		config.addDefault("Lore.Info1.Command9_4", "");
		config.addDefault("Lore.Info1.Command9_5", "");
		config.addDefault("Lore.Info1.Command9_6", "");
		config.addDefault("Lore.Info1.Command9_7", "");
		config.addDefault("Lore.Info1.Command9_8", "");
		config.set("Lore.Info1.Command9", info1Command9);

		config.addDefault("Lore.Info1.Command10_1", "");
		config.addDefault("Lore.Info1.Command10_2", "");
		config.addDefault("Lore.Info1.Command10_3", "");
		config.addDefault("Lore.Info1.Command10_4", "");
		config.addDefault("Lore.Info1.Command10_5", "");
		config.addDefault("Lore.Info1.Command10_6", "");
		config.addDefault("Lore.Info1.Command10_7", "");
		config.addDefault("Lore.Info1.Command10_8", "");
		config.set("Lore.Info1.Command10", info1Command10);

		config.addDefault("Lore.Info1.Command11_1", "");
		config.addDefault("Lore.Info1.Command11_2", "");
		config.addDefault("Lore.Info1.Command11_3", "");
		config.addDefault("Lore.Info1.Command11_4", "");
		config.addDefault("Lore.Info1.Command11_5", "");
		config.addDefault("Lore.Info1.Command11_6", "");
		config.addDefault("Lore.Info1.Command11_7", "");
		config.addDefault("Lore.Info1.Command11_8", "");
		config.set("Lore.Info1.Command11", info1Command11);

		config.addDefault("Lore.Info1.Command12_1", "");
		config.addDefault("Lore.Info1.Command12_2", "");
		config.addDefault("Lore.Info1.Command12_3", "");
		config.addDefault("Lore.Info1.Command12_4", "");
		config.addDefault("Lore.Info1.Command12_5", "");
		config.addDefault("Lore.Info1.Command12_6", "");
		config.addDefault("Lore.Info1.Command12_7", "");
		config.addDefault("Lore.Info1.Command12_8", "");
		config.set("Lore.Info1.Command12", info1Command12);

		config.addDefault("Lore.Info1.Command13_1", "");
		config.addDefault("Lore.Info1.Command13_2", "");
		config.addDefault("Lore.Info1.Command13_3", "");
		config.addDefault("Lore.Info1.Command13_4", "");
		config.addDefault("Lore.Info1.Command13_5", "");
		config.addDefault("Lore.Info1.Command13_6", "");
		config.addDefault("Lore.Info1.Command13_7", "");
		config.addDefault("Lore.Info1.Command13_8", "");
		config.set("Lore.Info1.Command13", info1Command13);

		config.addDefault("Lore.Info1.Command14_1", "");
		config.addDefault("Lore.Info1.Command14_2", "");
		config.addDefault("Lore.Info1.Command14_3", "");
		config.addDefault("Lore.Info1.Command14_4", "");
		config.addDefault("Lore.Info1.Command14_5", "");
		config.addDefault("Lore.Info1.Command14_6", "");
		config.addDefault("Lore.Info1.Command14_7", "");
		config.addDefault("Lore.Info1.Command14_8", "");
		config.set("Lore.Info1.Command14", info1Command14);

		config.addDefault("Lore.Info1.Command15_1", "");
		config.addDefault("Lore.Info1.Command15_2", "");
		config.addDefault("Lore.Info1.Command15_3", "");
		config.addDefault("Lore.Info1.Command15_4", "");
		config.addDefault("Lore.Info1.Command15_5", "");
		config.addDefault("Lore.Info1.Command15_6", "");
		config.addDefault("Lore.Info1.Command15_7", "");
		config.addDefault("Lore.Info1.Command15_8", "");
		config.set("Lore.Info1.Command15", info1Command15);

		config.addDefault("Lore.Info1.Command16_1", "");
		config.addDefault("Lore.Info1.Command16_2", "");
		config.addDefault("Lore.Info1.Command16_3", "");
		config.addDefault("Lore.Info1.Command16_4", "");
		config.addDefault("Lore.Info1.Command16_5", "");
		config.addDefault("Lore.Info1.Command16_6", "");
		config.addDefault("Lore.Info1.Command16_7", "");
		config.addDefault("Lore.Info1.Command16_8", "");
		config.set("Lore.Info1.Command16", info1Command16);

		config.addDefault("Lore.Info1.Command17_1", "");
		config.addDefault("Lore.Info1.Command17_2", "");
		config.addDefault("Lore.Info1.Command17_3", "");
		config.addDefault("Lore.Info1.Command17_4", "");
		config.addDefault("Lore.Info1.Command17_5", "");
		config.addDefault("Lore.Info1.Command17_6", "");
		config.addDefault("Lore.Info1.Command17_7", "");
		config.addDefault("Lore.Info1.Command17_8", "");
		config.set("Lore.Info1.Command17", info1Command17);

		config.addDefault("Lore.Info1.Command18_1", "");
		config.addDefault("Lore.Info1.Command18_2", "");
		config.addDefault("Lore.Info1.Command18_3", "");
		config.addDefault("Lore.Info1.Command18_4", "");
		config.addDefault("Lore.Info1.Command18_5", "");
		config.addDefault("Lore.Info1.Command18_6", "");
		config.addDefault("Lore.Info1.Command18_7", "");
		config.addDefault("Lore.Info1.Command18_8", "");
		config.set("Lore.Info1.Command18", info1Command18);

		config.addDefault("Lore.Info2.Command1_1", "");
		config.addDefault("Lore.Info2.Command1_2", "");
		config.addDefault("Lore.Info2.Command1_3", "");
		config.addDefault("Lore.Info2.Command1_4", "");
		config.addDefault("Lore.Info2.Command1_5", "");
		config.addDefault("Lore.Info2.Command1_6", "");
		config.addDefault("Lore.Info2.Command1_7", "");
		config.addDefault("Lore.Info2.Command1_8", "");
		config.set("Lore.Info2.Command1", info2Command1);

		config.addDefault("Lore.Info2.Command2_1", "");
		config.addDefault("Lore.Info2.Command2_2", "");
		config.addDefault("Lore.Info2.Command2_3", "");
		config.addDefault("Lore.Info2.Command2_4", "");
		config.addDefault("Lore.Info2.Command2_5", "");
		config.addDefault("Lore.Info2.Command2_6", "");
		config.addDefault("Lore.Info2.Command2_7", "");
		config.addDefault("Lore.Info2.Command2_8", "");
		config.set("Lore.Info2.Command2", info2Command2);

		config.addDefault("Lore.Info2.Command3_1", "");
		config.addDefault("Lore.Info2.Command3_2", "");
		config.addDefault("Lore.Info2.Command3_3", "");
		config.addDefault("Lore.Info2.Command3_4", "");
		config.addDefault("Lore.Info2.Command3_5", "");
		config.addDefault("Lore.Info2.Command3_6", "");
		config.addDefault("Lore.Info2.Command3_7", "");
		config.addDefault("Lore.Info2.Command3_8", "");
		config.set("Lore.Info2.Command3", info2Command3);

		config.addDefault("Lore.Info2.Command4_1", "");
		config.addDefault("Lore.Info2.Command4_2", "");
		config.addDefault("Lore.Info2.Command4_3", "");
		config.addDefault("Lore.Info2.Command4_4", "");
		config.addDefault("Lore.Info2.Command4_5", "");
		config.addDefault("Lore.Info2.Command4_6", "");
		config.addDefault("Lore.Info2.Command4_7", "");
		config.addDefault("Lore.Info2.Command4_8", "");
		config.set("Lore.Info2.Command4", info2Command4);

		config.addDefault("Lore.Info2.Command5_1", "");
		config.addDefault("Lore.Info2.Command5_2", "");
		config.addDefault("Lore.Info2.Command5_3", "");
		config.addDefault("Lore.Info2.Command5_4", "");
		config.addDefault("Lore.Info2.Command5_5", "");
		config.addDefault("Lore.Info2.Command5_6", "");
		config.addDefault("Lore.Info2.Command5_7", "");
		config.addDefault("Lore.Info2.Command5_8", "");
		config.set("Lore.Info2.Command5", info2Command5);

		config.addDefault("Lore.Info2.Command6_1", "");
		config.addDefault("Lore.Info2.Command6_2", "");
		config.addDefault("Lore.Info2.Command6_3", "");
		config.addDefault("Lore.Info2.Command6_4", "");
		config.addDefault("Lore.Info2.Command6_5", "");
		config.addDefault("Lore.Info2.Command6_6", "");
		config.addDefault("Lore.Info2.Command6_7", "");
		config.addDefault("Lore.Info2.Command6_8", "");
		config.set("Lore.Info2.Command6", info2Command6);

		config.addDefault("Lore.Info2.Command7_1", "");
		config.addDefault("Lore.Info2.Command7_2", "");
		config.addDefault("Lore.Info2.Command7_3", "");
		config.addDefault("Lore.Info2.Command7_4", "");
		config.addDefault("Lore.Info2.Command7_5", "");
		config.addDefault("Lore.Info2.Command7_6", "");
		config.addDefault("Lore.Info2.Command7_7", "");
		config.addDefault("Lore.Info2.Command7_8", "");
		config.set("Lore.Info2.Command7", info2Command7);

		config.addDefault("Lore.Info2.Command8_1", "");
		config.addDefault("Lore.Info2.Command8_2", "");
		config.addDefault("Lore.Info2.Command8_3", "");
		config.addDefault("Lore.Info2.Command8_4", "");
		config.addDefault("Lore.Info2.Command8_5", "");
		config.addDefault("Lore.Info2.Command8_6", "");
		config.addDefault("Lore.Info2.Command8_7", "");
		config.addDefault("Lore.Info2.Command8_8", "");
		config.set("Lore.Info2.Command8", info2Command8);

		config.addDefault("Lore.Info2.Command9_1", "");
		config.addDefault("Lore.Info2.Command9_2", "");
		config.addDefault("Lore.Info2.Command9_3", "");
		config.addDefault("Lore.Info2.Command9_4", "");
		config.addDefault("Lore.Info2.Command9_5", "");
		config.addDefault("Lore.Info2.Command9_6", "");
		config.addDefault("Lore.Info2.Command9_7", "");
		config.addDefault("Lore.Info2.Command9_8", "");
		config.set("Lore.Info2.Command9", info2Command9);

		config.addDefault("Lore.Info2.Command10_1", "");
		config.addDefault("Lore.Info2.Command10_2", "");
		config.addDefault("Lore.Info2.Command10_3", "");
		config.addDefault("Lore.Info2.Command10_4", "");
		config.addDefault("Lore.Info2.Command10_5", "");
		config.addDefault("Lore.Info2.Command10_6", "");
		config.addDefault("Lore.Info2.Command10_7", "");
		config.addDefault("Lore.Info2.Command10_8", "");
		config.set("Lore.Info2.Command10", info2Command10);

		config.addDefault("Lore.Info2.Command11_1", "");
		config.addDefault("Lore.Info2.Command11_2", "");
		config.addDefault("Lore.Info2.Command11_3", "");
		config.addDefault("Lore.Info2.Command11_4", "");
		config.addDefault("Lore.Info2.Command11_5", "");
		config.addDefault("Lore.Info2.Command11_6", "");
		config.addDefault("Lore.Info2.Command11_7", "");
		config.addDefault("Lore.Info2.Command11_8", "");
		config.set("Lore.Info2.Command11", info2Command11);

		config.addDefault("Lore.Info2.Command12_1", "");
		config.addDefault("Lore.Info2.Command12_2", "");
		config.addDefault("Lore.Info2.Command12_3", "");
		config.addDefault("Lore.Info2.Command12_4", "");
		config.addDefault("Lore.Info2.Command12_5", "");
		config.addDefault("Lore.Info2.Command12_6", "");
		config.addDefault("Lore.Info2.Command12_7", "");
		config.addDefault("Lore.Info2.Command12_8", "");
		config.set("Lore.Info2.Command12", info2Command12);

		config.addDefault("Lore.Info2.Command13_1", "");
		config.addDefault("Lore.Info2.Command13_2", "");
		config.addDefault("Lore.Info2.Command13_3", "");
		config.addDefault("Lore.Info2.Command13_4", "");
		config.addDefault("Lore.Info2.Command13_5", "");
		config.addDefault("Lore.Info2.Command13_6", "");
		config.addDefault("Lore.Info2.Command13_7", "");
		config.addDefault("Lore.Info2.Command13_8", "");
		config.set("Lore.Info2.Command13", info2Command13);

		config.addDefault("Lore.Info2.Command14_1", "");
		config.addDefault("Lore.Info2.Command14_2", "");
		config.addDefault("Lore.Info2.Command14_3", "");
		config.addDefault("Lore.Info2.Command14_4", "");
		config.addDefault("Lore.Info2.Command14_5", "");
		config.addDefault("Lore.Info2.Command14_6", "");
		config.addDefault("Lore.Info2.Command14_7", "");
		config.addDefault("Lore.Info2.Command14_8", "");
		config.set("Lore.Info2.Command14", info2Command14);

		config.addDefault("Lore.Info2.Command15_1", "");
		config.addDefault("Lore.Info2.Command15_2", "");
		config.addDefault("Lore.Info2.Command15_3", "");
		config.addDefault("Lore.Info2.Command15_4", "");
		config.addDefault("Lore.Info2.Command15_5", "");
		config.addDefault("Lore.Info2.Command15_6", "");
		config.addDefault("Lore.Info2.Command15_7", "");
		config.addDefault("Lore.Info2.Command15_8", "");
		config.set("Lore.Info2.Command15", info2Command15);

		config.addDefault("Lore.Info2.Command16_1", "");
		config.addDefault("Lore.Info2.Command16_2", "");
		config.addDefault("Lore.Info2.Command16_3", "");
		config.addDefault("Lore.Info2.Command16_4", "");
		config.addDefault("Lore.Info2.Command16_5", "");
		config.addDefault("Lore.Info2.Command16_6", "");
		config.addDefault("Lore.Info2.Command16_7", "");
		config.addDefault("Lore.Info2.Command16_8", "");
		config.set("Lore.Info2.Command16", info2Command16);

		config.addDefault("Lore.Info2.Command17_1", "");
		config.addDefault("Lore.Info2.Command17_2", "");
		config.addDefault("Lore.Info2.Command17_3", "");
		config.addDefault("Lore.Info2.Command17_4", "");
		config.addDefault("Lore.Info2.Command17_5", "");
		config.addDefault("Lore.Info2.Command17_6", "");
		config.addDefault("Lore.Info2.Command17_7", "");
		config.addDefault("Lore.Info2.Command17_8", "");
		config.set("Lore.Info2.Command17", info2Command17);

		config.addDefault("Lore.Info2.Command18_1", "");
		config.addDefault("Lore.Info2.Command18_2", "");
		config.addDefault("Lore.Info2.Command18_3", "");
		config.addDefault("Lore.Info2.Command18_4", "");
		config.addDefault("Lore.Info2.Command18_5", "");
		config.addDefault("Lore.Info2.Command18_6", "");
		config.addDefault("Lore.Info2.Command18_7", "");
		config.addDefault("Lore.Info2.Command18_8", "");
		config.set("Lore.Info2.Command18", info2Command18);

		config.addDefault("Lore.Info3.Command1_1", "");
		config.addDefault("Lore.Info3.Command1_2", "");
		config.addDefault("Lore.Info3.Command1_3", "");
		config.addDefault("Lore.Info3.Command1_4", "");
		config.addDefault("Lore.Info3.Command1_5", "");
		config.addDefault("Lore.Info3.Command1_6", "");
		config.addDefault("Lore.Info3.Command1_7", "");
		config.addDefault("Lore.Info3.Command1_8", "");
		config.set("Lore.Info3.Command1", info3Command1);

		config.addDefault("Lore.Info3.Command2_1", "");
		config.addDefault("Lore.Info3.Command2_2", "");
		config.addDefault("Lore.Info3.Command2_3", "");
		config.addDefault("Lore.Info3.Command2_4", "");
		config.addDefault("Lore.Info3.Command2_5", "");
		config.addDefault("Lore.Info3.Command2_6", "");
		config.addDefault("Lore.Info3.Command2_7", "");
		config.addDefault("Lore.Info3.Command2_8", "");
		config.set("Lore.Info3.Command2", info3Command2);

		config.addDefault("Lore.Info3.Command3_1", "");
		config.addDefault("Lore.Info3.Command3_2", "");
		config.addDefault("Lore.Info3.Command3_3", "");
		config.addDefault("Lore.Info3.Command3_4", "");
		config.addDefault("Lore.Info3.Command3_5", "");
		config.addDefault("Lore.Info3.Command3_6", "");
		config.addDefault("Lore.Info3.Command3_7", "");
		config.addDefault("Lore.Info3.Command3_8", "");
		config.set("Lore.Info3.Command3", info3Command3);

		config.addDefault("Lore.Info3.Command4_1", "");
		config.addDefault("Lore.Info3.Command4_2", "");
		config.addDefault("Lore.Info3.Command4_3", "");
		config.addDefault("Lore.Info3.Command4_4", "");
		config.addDefault("Lore.Info3.Command4_5", "");
		config.addDefault("Lore.Info3.Command4_6", "");
		config.addDefault("Lore.Info3.Command4_7", "");
		config.addDefault("Lore.Info3.Command4_8", "");
		config.set("Lore.Info3.Command4", info3Command4);

		config.addDefault("Lore.Info3.Command5_1", "");
		config.addDefault("Lore.Info3.Command5_2", "");
		config.addDefault("Lore.Info3.Command5_3", "");
		config.addDefault("Lore.Info3.Command5_4", "");
		config.addDefault("Lore.Info3.Command5_5", "");
		config.addDefault("Lore.Info3.Command5_6", "");
		config.addDefault("Lore.Info3.Command5_7", "");
		config.addDefault("Lore.Info3.Command5_8", "");
		config.set("Lore.Info3.Command5", info3Command5);

		config.addDefault("Lore.Info3.Command6_1", "");
		config.addDefault("Lore.Info3.Command6_2", "");
		config.addDefault("Lore.Info3.Command6_3", "");
		config.addDefault("Lore.Info3.Command6_4", "");
		config.addDefault("Lore.Info3.Command6_5", "");
		config.addDefault("Lore.Info3.Command6_6", "");
		config.addDefault("Lore.Info3.Command6_7", "");
		config.addDefault("Lore.Info3.Command6_8", "");
		config.set("Lore.Info3.Command6", info3Command6);

		config.addDefault("Lore.Info3.Command7_1", "");
		config.addDefault("Lore.Info3.Command7_2", "");
		config.addDefault("Lore.Info3.Command7_3", "");
		config.addDefault("Lore.Info3.Command7_4", "");
		config.addDefault("Lore.Info3.Command7_5", "");
		config.addDefault("Lore.Info3.Command7_6", "");
		config.addDefault("Lore.Info3.Command7_7", "");
		config.addDefault("Lore.Info3.Command7_8", "");
		config.set("Lore.Info3.Command7", info3Command7);

		config.addDefault("Lore.Info3.Command8_1", "");
		config.addDefault("Lore.Info3.Command8_2", "");
		config.addDefault("Lore.Info3.Command8_3", "");
		config.addDefault("Lore.Info3.Command8_4", "");
		config.addDefault("Lore.Info3.Command8_5", "");
		config.addDefault("Lore.Info3.Command8_6", "");
		config.addDefault("Lore.Info3.Command8_7", "");
		config.addDefault("Lore.Info3.Command8_8", "");
		config.set("Lore.Info3.Command8", info3Command8);

		config.addDefault("Lore.Info3.Command9_1", "");
		config.addDefault("Lore.Info3.Command9_2", "");
		config.addDefault("Lore.Info3.Command9_3", "");
		config.addDefault("Lore.Info3.Command9_4", "");
		config.addDefault("Lore.Info3.Command9_5", "");
		config.addDefault("Lore.Info3.Command9_6", "");
		config.addDefault("Lore.Info3.Command9_7", "");
		config.addDefault("Lore.Info3.Command9_8", "");
		config.set("Lore.Info3.Command9", info3Command9);

		config.addDefault("Lore.Info3.Command10_1", "");
		config.addDefault("Lore.Info3.Command10_2", "");
		config.addDefault("Lore.Info3.Command10_3", "");
		config.addDefault("Lore.Info3.Command10_4", "");
		config.addDefault("Lore.Info3.Command10_5", "");
		config.addDefault("Lore.Info3.Command10_6", "");
		config.addDefault("Lore.Info3.Command10_7", "");
		config.addDefault("Lore.Info3.Command10_8", "");
		config.set("Lore.Info3.Command10", info3Command10);

		config.addDefault("Lore.Info3.Command11_1", "");
		config.addDefault("Lore.Info3.Command11_2", "");
		config.addDefault("Lore.Info3.Command11_3", "");
		config.addDefault("Lore.Info3.Command11_4", "");
		config.addDefault("Lore.Info3.Command11_5", "");
		config.addDefault("Lore.Info3.Command11_6", "");
		config.addDefault("Lore.Info3.Command11_7", "");
		config.addDefault("Lore.Info3.Command11_8", "");
		config.set("Lore.Info3.Command11", info3Command11);

		config.addDefault("Lore.Info3.Command12_1", "");
		config.addDefault("Lore.Info3.Command12_2", "");
		config.addDefault("Lore.Info3.Command12_3", "");
		config.addDefault("Lore.Info3.Command12_4", "");
		config.addDefault("Lore.Info3.Command12_5", "");
		config.addDefault("Lore.Info3.Command12_6", "");
		config.addDefault("Lore.Info3.Command12_7", "");
		config.addDefault("Lore.Info3.Command12_8", "");
		config.set("Lore.Info3.Command12", info3Command12);

		config.addDefault("Lore.Info3.Command13_1", "");
		config.addDefault("Lore.Info3.Command13_2", "");
		config.addDefault("Lore.Info3.Command13_3", "");
		config.addDefault("Lore.Info3.Command13_4", "");
		config.addDefault("Lore.Info3.Command13_5", "");
		config.addDefault("Lore.Info3.Command13_6", "");
		config.addDefault("Lore.Info3.Command13_7", "");
		config.addDefault("Lore.Info3.Command13_8", "");
		config.set("Lore.Info3.Command13", info3Command13);

		config.addDefault("Lore.Info3.Command14_1", "");
		config.addDefault("Lore.Info3.Command14_2", "");
		config.addDefault("Lore.Info3.Command14_3", "");
		config.addDefault("Lore.Info3.Command14_4", "");
		config.addDefault("Lore.Info3.Command14_5", "");
		config.addDefault("Lore.Info3.Command14_6", "");
		config.addDefault("Lore.Info3.Command14_7", "");
		config.addDefault("Lore.Info3.Command14_8", "");
		config.set("Lore.Info3.Command14", info3Command14);

		config.addDefault("Lore.Info3.Command15_1", "");
		config.addDefault("Lore.Info3.Command15_2", "");
		config.addDefault("Lore.Info3.Command15_3", "");
		config.addDefault("Lore.Info3.Command15_4", "");
		config.addDefault("Lore.Info3.Command15_5", "");
		config.addDefault("Lore.Info3.Command15_6", "");
		config.addDefault("Lore.Info3.Command15_7", "");
		config.addDefault("Lore.Info3.Command15_8", "");
		config.set("Lore.Info3.Command15", info3Command15);

		config.addDefault("Lore.Info3.Command16_1", "");
		config.addDefault("Lore.Info3.Command16_2", "");
		config.addDefault("Lore.Info3.Command16_3", "");
		config.addDefault("Lore.Info3.Command16_4", "");
		config.addDefault("Lore.Info3.Command16_5", "");
		config.addDefault("Lore.Info3.Command16_6", "");
		config.addDefault("Lore.Info3.Command16_7", "");
		config.addDefault("Lore.Info3.Command16_8", "");
		config.set("Lore.Info3.Command16", info3Command16);

		config.addDefault("Lore.Info3.Command17_1", "");
		config.addDefault("Lore.Info3.Command17_2", "");
		config.addDefault("Lore.Info3.Command17_3", "");
		config.addDefault("Lore.Info3.Command17_4", "");
		config.addDefault("Lore.Info3.Command17_5", "");
		config.addDefault("Lore.Info3.Command17_6", "");
		config.addDefault("Lore.Info3.Command17_7", "");
		config.addDefault("Lore.Info3.Command17_8", "");
		config.set("Lore.Info3.Command17", info3Command17);

		config.addDefault("Lore.Info3.Command18_1", "");
		config.addDefault("Lore.Info3.Command18_2", "");
		config.addDefault("Lore.Info3.Command18_3", "");
		config.addDefault("Lore.Info3.Command18_4", "");
		config.addDefault("Lore.Info3.Command18_5", "");
		config.addDefault("Lore.Info3.Command18_6", "");
		config.addDefault("Lore.Info3.Command18_7", "");
		config.addDefault("Lore.Info3.Command18_8", "");
		config.set("Lore.Info3.Command18", info3Command18);

		config.addDefault("Lore.Info4.Command1_1", "");
		config.addDefault("Lore.Info4.Command1_2", "");
		config.addDefault("Lore.Info4.Command1_3", "");
		config.addDefault("Lore.Info4.Command1_4", "");
		config.addDefault("Lore.Info4.Command1_5", "");
		config.addDefault("Lore.Info4.Command1_6", "");
		config.addDefault("Lore.Info4.Command1_7", "");
		config.addDefault("Lore.Info4.Command1_8", "");
		config.set("Lore.Info4.Command1", info4Command1);

		config.addDefault("Lore.Info4.Command2_1", "");
		config.addDefault("Lore.Info4.Command2_2", "");
		config.addDefault("Lore.Info4.Command2_3", "");
		config.addDefault("Lore.Info4.Command2_4", "");
		config.addDefault("Lore.Info4.Command2_5", "");
		config.addDefault("Lore.Info4.Command2_6", "");
		config.addDefault("Lore.Info4.Command2_7", "");
		config.addDefault("Lore.Info4.Command2_8", "");
		config.set("Lore.Info4.Command2", info4Command2);

		config.addDefault("Lore.Info4.Command3_1", "");
		config.addDefault("Lore.Info4.Command3_2", "");
		config.addDefault("Lore.Info4.Command3_3", "");
		config.addDefault("Lore.Info4.Command3_4", "");
		config.addDefault("Lore.Info4.Command3_5", "");
		config.addDefault("Lore.Info4.Command3_6", "");
		config.addDefault("Lore.Info4.Command3_7", "");
		config.addDefault("Lore.Info4.Command3_8", "");
		config.set("Lore.Info4.Command3", info4Command3);

		config.addDefault("Lore.Info4.Command4_1", "");
		config.addDefault("Lore.Info4.Command4_2", "");
		config.addDefault("Lore.Info4.Command4_3", "");
		config.addDefault("Lore.Info4.Command4_4", "");
		config.addDefault("Lore.Info4.Command4_5", "");
		config.addDefault("Lore.Info4.Command4_6", "");
		config.addDefault("Lore.Info4.Command4_7", "");
		config.addDefault("Lore.Info4.Command4_8", "");
		config.set("Lore.Info4.Command4", info4Command4);

		config.addDefault("Lore.Info4.Command5_1", "");
		config.addDefault("Lore.Info4.Command5_2", "");
		config.addDefault("Lore.Info4.Command5_3", "");
		config.addDefault("Lore.Info4.Command5_4", "");
		config.addDefault("Lore.Info4.Command5_5", "");
		config.addDefault("Lore.Info4.Command5_6", "");
		config.addDefault("Lore.Info4.Command5_7", "");
		config.addDefault("Lore.Info4.Command5_8", "");
		config.set("Lore.Info4.Command5", info4Command5);

		config.addDefault("Lore.Info4.Command6_1", "");
		config.addDefault("Lore.Info4.Command6_2", "");
		config.addDefault("Lore.Info4.Command6_3", "");
		config.addDefault("Lore.Info4.Command6_4", "");
		config.addDefault("Lore.Info4.Command6_5", "");
		config.addDefault("Lore.Info4.Command6_6", "");
		config.addDefault("Lore.Info4.Command6_7", "");
		config.addDefault("Lore.Info4.Command6_8", "");
		config.set("Lore.Info4.Command6", info4Command6);

		config.addDefault("Lore.Info4.Command7_1", "");
		config.addDefault("Lore.Info4.Command7_2", "");
		config.addDefault("Lore.Info4.Command7_3", "");
		config.addDefault("Lore.Info4.Command7_4", "");
		config.addDefault("Lore.Info4.Command7_5", "");
		config.addDefault("Lore.Info4.Command7_6", "");
		config.addDefault("Lore.Info4.Command7_7", "");
		config.addDefault("Lore.Info4.Command7_8", "");
		config.set("Lore.Info4.Command7", info4Command7);

		config.addDefault("Lore.Info4.Command8_1", "");
		config.addDefault("Lore.Info4.Command8_2", "");
		config.addDefault("Lore.Info4.Command8_3", "");
		config.addDefault("Lore.Info4.Command8_4", "");
		config.addDefault("Lore.Info4.Command8_5", "");
		config.addDefault("Lore.Info4.Command8_6", "");
		config.addDefault("Lore.Info4.Command8_7", "");
		config.addDefault("Lore.Info4.Command8_8", "");
		config.set("Lore.Info4.Command8", info4Command8);

		config.addDefault("Lore.Info4.Command9_1", "");
		config.addDefault("Lore.Info4.Command9_2", "");
		config.addDefault("Lore.Info4.Command9_3", "");
		config.addDefault("Lore.Info4.Command9_4", "");
		config.addDefault("Lore.Info4.Command9_5", "");
		config.addDefault("Lore.Info4.Command9_6", "");
		config.addDefault("Lore.Info4.Command9_7", "");
		config.addDefault("Lore.Info4.Command9_8", "");
		config.set("Lore.Info4.Command9", info4Command9);

		config.addDefault("Lore.Info4.Command10_1", "");
		config.addDefault("Lore.Info4.Command10_2", "");
		config.addDefault("Lore.Info4.Command10_3", "");
		config.addDefault("Lore.Info4.Command10_4", "");
		config.addDefault("Lore.Info4.Command10_5", "");
		config.addDefault("Lore.Info4.Command10_6", "");
		config.addDefault("Lore.Info4.Command10_7", "");
		config.addDefault("Lore.Info4.Command10_8", "");
		config.set("Lore.Info4.Command10", info4Command10);

		config.addDefault("Lore.Info4.Command11_1", "");
		config.addDefault("Lore.Info4.Command11_2", "");
		config.addDefault("Lore.Info4.Command11_3", "");
		config.addDefault("Lore.Info4.Command11_4", "");
		config.addDefault("Lore.Info4.Command11_5", "");
		config.addDefault("Lore.Info4.Command11_6", "");
		config.addDefault("Lore.Info4.Command11_7", "");
		config.addDefault("Lore.Info4.Command11_8", "");
		config.set("Lore.Info4.Command11", info4Command11);

		config.addDefault("Lore.Info4.Command12_1", "");
		config.addDefault("Lore.Info4.Command12_2", "");
		config.addDefault("Lore.Info4.Command12_3", "");
		config.addDefault("Lore.Info4.Command12_4", "");
		config.addDefault("Lore.Info4.Command12_5", "");
		config.addDefault("Lore.Info4.Command12_6", "");
		config.addDefault("Lore.Info4.Command12_7", "");
		config.addDefault("Lore.Info4.Command12_8", "");
		config.set("Lore.Info4.Command12", info4Command12);

		config.addDefault("Lore.Info4.Command13_1", "");
		config.addDefault("Lore.Info4.Command13_2", "");
		config.addDefault("Lore.Info4.Command13_3", "");
		config.addDefault("Lore.Info4.Command13_4", "");
		config.addDefault("Lore.Info4.Command13_5", "");
		config.addDefault("Lore.Info4.Command13_6", "");
		config.addDefault("Lore.Info4.Command13_7", "");
		config.addDefault("Lore.Info4.Command13_8", "");
		config.set("Lore.Info4.Command13", info4Command13);

		config.addDefault("Lore.Info4.Command14_1", "");
		config.addDefault("Lore.Info4.Command14_2", "");
		config.addDefault("Lore.Info4.Command14_3", "");
		config.addDefault("Lore.Info4.Command14_4", "");
		config.addDefault("Lore.Info4.Command14_5", "");
		config.addDefault("Lore.Info4.Command14_6", "");
		config.addDefault("Lore.Info4.Command14_7", "");
		config.addDefault("Lore.Info4.Command14_8", "");
		config.set("Lore.Info4.Command14", info4Command14);

		config.addDefault("Lore.Info4.Command15_1", "");
		config.addDefault("Lore.Info4.Command15_2", "");
		config.addDefault("Lore.Info4.Command15_3", "");
		config.addDefault("Lore.Info4.Command15_4", "");
		config.addDefault("Lore.Info4.Command15_5", "");
		config.addDefault("Lore.Info4.Command15_6", "");
		config.addDefault("Lore.Info4.Command15_7", "");
		config.addDefault("Lore.Info4.Command15_8", "");
		config.set("Lore.Info4.Command15", info4Command15);

		config.addDefault("Lore.Info4.Command16_1", "");
		config.addDefault("Lore.Info4.Command16_2", "");
		config.addDefault("Lore.Info4.Command16_3", "");
		config.addDefault("Lore.Info4.Command16_4", "");
		config.addDefault("Lore.Info4.Command16_5", "");
		config.addDefault("Lore.Info4.Command16_6", "");
		config.addDefault("Lore.Info4.Command16_7", "");
		config.addDefault("Lore.Info4.Command16_8", "");
		config.set("Lore.Info4.Command16", info4Command16);

		config.addDefault("Lore.Info4.Command17_1", "");
		config.addDefault("Lore.Info4.Command17_2", "");
		config.addDefault("Lore.Info4.Command17_3", "");
		config.addDefault("Lore.Info4.Command17_4", "");
		config.addDefault("Lore.Info4.Command17_5", "");
		config.addDefault("Lore.Info4.Command17_6", "");
		config.addDefault("Lore.Info4.Command17_7", "");
		config.addDefault("Lore.Info4.Command17_8", "");
		config.set("Lore.Info4.Command17", info4Command17);

		config.addDefault("Lore.Info4.Command18_1", "");
		config.addDefault("Lore.Info4.Command18_2", "");
		config.addDefault("Lore.Info4.Command18_3", "");
		config.addDefault("Lore.Info4.Command18_4", "");
		config.addDefault("Lore.Info4.Command18_5", "");
		config.addDefault("Lore.Info4.Command18_6", "");
		config.addDefault("Lore.Info4.Command18_7", "");
		config.addDefault("Lore.Info4.Command18_8", "");
		config.set("Lore.Info4.Command18", info4Command18);

		config.addDefault("Lore.Info5.Command1_1", "");
		config.addDefault("Lore.Info5.Command1_2", "");
		config.addDefault("Lore.Info5.Command1_3", "");
		config.addDefault("Lore.Info5.Command1_4", "");
		config.addDefault("Lore.Info5.Command1_5", "");
		config.addDefault("Lore.Info5.Command1_6", "");
		config.addDefault("Lore.Info5.Command1_7", "");
		config.addDefault("Lore.Info5.Command1_8", "");
		config.set("Lore.Info5.Command1", info5Command1);

		config.addDefault("Lore.Info5.Command2_1", "");
		config.addDefault("Lore.Info5.Command2_2", "");
		config.addDefault("Lore.Info5.Command2_3", "");
		config.addDefault("Lore.Info5.Command2_4", "");
		config.addDefault("Lore.Info5.Command2_5", "");
		config.addDefault("Lore.Info5.Command2_6", "");
		config.addDefault("Lore.Info5.Command2_7", "");
		config.addDefault("Lore.Info5.Command2_8", "");
		config.set("Lore.Info5.Command2", info5Command2);

		config.addDefault("Lore.Info5.Command3_1", "");
		config.addDefault("Lore.Info5.Command3_2", "");
		config.addDefault("Lore.Info5.Command3_3", "");
		config.addDefault("Lore.Info5.Command3_4", "");
		config.addDefault("Lore.Info5.Command3_5", "");
		config.addDefault("Lore.Info5.Command3_6", "");
		config.addDefault("Lore.Info5.Command3_7", "");
		config.addDefault("Lore.Info5.Command3_8", "");
		config.set("Lore.Info5.Command3", info5Command3);

		config.addDefault("Lore.Info5.Command4_1", "");
		config.addDefault("Lore.Info5.Command4_2", "");
		config.addDefault("Lore.Info5.Command4_3", "");
		config.addDefault("Lore.Info5.Command4_4", "");
		config.addDefault("Lore.Info5.Command4_5", "");
		config.addDefault("Lore.Info5.Command4_6", "");
		config.addDefault("Lore.Info5.Command4_7", "");
		config.addDefault("Lore.Info5.Command4_8", "");
		config.set("Lore.Info5.Command4", info5Command4);

		config.addDefault("Lore.Info5.Command5_1", "");
		config.addDefault("Lore.Info5.Command5_2", "");
		config.addDefault("Lore.Info5.Command5_3", "");
		config.addDefault("Lore.Info5.Command5_4", "");
		config.addDefault("Lore.Info5.Command5_5", "");
		config.addDefault("Lore.Info5.Command5_6", "");
		config.addDefault("Lore.Info5.Command5_7", "");
		config.addDefault("Lore.Info5.Command5_8", "");
		config.set("Lore.Info5.Command5", info5Command5);

		config.addDefault("Lore.Info5.Command6_1", "");
		config.addDefault("Lore.Info5.Command6_2", "");
		config.addDefault("Lore.Info5.Command6_3", "");
		config.addDefault("Lore.Info5.Command6_4", "");
		config.addDefault("Lore.Info5.Command6_5", "");
		config.addDefault("Lore.Info5.Command6_6", "");
		config.addDefault("Lore.Info5.Command6_7", "");
		config.addDefault("Lore.Info5.Command6_8", "");
		config.set("Lore.Info5.Command6", info5Command6);

		config.addDefault("Lore.Info5.Command7_1", "");
		config.addDefault("Lore.Info5.Command7_2", "");
		config.addDefault("Lore.Info5.Command7_3", "");
		config.addDefault("Lore.Info5.Command7_4", "");
		config.addDefault("Lore.Info5.Command7_5", "");
		config.addDefault("Lore.Info5.Command7_6", "");
		config.addDefault("Lore.Info5.Command7_7", "");
		config.addDefault("Lore.Info5.Command7_8", "");
		config.set("Lore.Info5.Command7", info5Command7);

		config.addDefault("Lore.Info5.Command8_1", "");
		config.addDefault("Lore.Info5.Command8_2", "");
		config.addDefault("Lore.Info5.Command8_3", "");
		config.addDefault("Lore.Info5.Command8_4", "");
		config.addDefault("Lore.Info5.Command8_5", "");
		config.addDefault("Lore.Info5.Command8_6", "");
		config.addDefault("Lore.Info5.Command8_7", "");
		config.addDefault("Lore.Info5.Command8_8", "");
		config.set("Lore.Info5.Command8", info5Command8);

		config.addDefault("Lore.Info5.Command9_1", "");
		config.addDefault("Lore.Info5.Command9_2", "");
		config.addDefault("Lore.Info5.Command9_3", "");
		config.addDefault("Lore.Info5.Command9_4", "");
		config.addDefault("Lore.Info5.Command9_5", "");
		config.addDefault("Lore.Info5.Command9_6", "");
		config.addDefault("Lore.Info5.Command9_7", "");
		config.addDefault("Lore.Info5.Command9_8", "");
		config.set("Lore.Info5.Command9", info5Command9);

		config.addDefault("Lore.Info5.Command10_1", "");
		config.addDefault("Lore.Info5.Command10_2", "");
		config.addDefault("Lore.Info5.Command10_3", "");
		config.addDefault("Lore.Info5.Command10_4", "");
		config.addDefault("Lore.Info5.Command10_5", "");
		config.addDefault("Lore.Info5.Command10_6", "");
		config.addDefault("Lore.Info5.Command10_7", "");
		config.addDefault("Lore.Info5.Command10_8", "");
		config.set("Lore.Info5.Command10", info5Command10);

		config.addDefault("Lore.Info5.Command11_1", "");
		config.addDefault("Lore.Info5.Command11_2", "");
		config.addDefault("Lore.Info5.Command11_3", "");
		config.addDefault("Lore.Info5.Command11_4", "");
		config.addDefault("Lore.Info5.Command11_5", "");
		config.addDefault("Lore.Info5.Command11_6", "");
		config.addDefault("Lore.Info5.Command11_7", "");
		config.addDefault("Lore.Info5.Command11_8", "");
		config.set("Lore.Info5.Command11", info5Command11);

		config.addDefault("Lore.Info5.Command12_1", "");
		config.addDefault("Lore.Info5.Command12_2", "");
		config.addDefault("Lore.Info5.Command12_3", "");
		config.addDefault("Lore.Info5.Command12_4", "");
		config.addDefault("Lore.Info5.Command12_5", "");
		config.addDefault("Lore.Info5.Command12_6", "");
		config.addDefault("Lore.Info5.Command12_7", "");
		config.addDefault("Lore.Info5.Command12_8", "");
		config.set("Lore.Info5.Command12", info5Command12);

		config.addDefault("Lore.Info5.Command13_1", "");
		config.addDefault("Lore.Info5.Command13_2", "");
		config.addDefault("Lore.Info5.Command13_3", "");
		config.addDefault("Lore.Info5.Command13_4", "");
		config.addDefault("Lore.Info5.Command13_5", "");
		config.addDefault("Lore.Info5.Command13_6", "");
		config.addDefault("Lore.Info5.Command13_7", "");
		config.addDefault("Lore.Info5.Command13_8", "");
		config.set("Lore.Info5.Command13", info5Command13);

		config.addDefault("Lore.Info5.Command14_1", "");
		config.addDefault("Lore.Info5.Command14_2", "");
		config.addDefault("Lore.Info5.Command14_3", "");
		config.addDefault("Lore.Info5.Command14_4", "");
		config.addDefault("Lore.Info5.Command14_5", "");
		config.addDefault("Lore.Info5.Command14_6", "");
		config.addDefault("Lore.Info5.Command14_7", "");
		config.addDefault("Lore.Info5.Command14_8", "");
		config.set("Lore.Info5.Command14", info5Command14);

		config.addDefault("Lore.Info5.Command15_1", "");
		config.addDefault("Lore.Info5.Command15_2", "");
		config.addDefault("Lore.Info5.Command15_3", "");
		config.addDefault("Lore.Info5.Command15_4", "");
		config.addDefault("Lore.Info5.Command15_5", "");
		config.addDefault("Lore.Info5.Command15_6", "");
		config.addDefault("Lore.Info5.Command15_7", "");
		config.addDefault("Lore.Info5.Command15_8", "");
		config.set("Lore.Info5.Command15", info5Command15);

		config.addDefault("Lore.Info5.Command16_1", "");
		config.addDefault("Lore.Info5.Command16_2", "");
		config.addDefault("Lore.Info5.Command16_3", "");
		config.addDefault("Lore.Info5.Command16_4", "");
		config.addDefault("Lore.Info5.Command16_5", "");
		config.addDefault("Lore.Info5.Command16_6", "");
		config.addDefault("Lore.Info5.Command16_7", "");
		config.addDefault("Lore.Info5.Command16_8", "");
		config.set("Lore.Info5.Command16", info5Command16);

		config.addDefault("Lore.Info5.Command17_1", "");
		config.addDefault("Lore.Info5.Command17_2", "");
		config.addDefault("Lore.Info5.Command17_3", "");
		config.addDefault("Lore.Info5.Command17_4", "");
		config.addDefault("Lore.Info5.Command17_5", "");
		config.addDefault("Lore.Info5.Command17_6", "");
		config.addDefault("Lore.Info5.Command17_7", "");
		config.addDefault("Lore.Info5.Command17_8", "");
		config.set("Lore.Info5.Command17", info5Command17);

		config.addDefault("Lore.Info5.Command18_1", "");
		config.addDefault("Lore.Info5.Command18_2", "");
		config.addDefault("Lore.Info5.Command18_3", "");
		config.addDefault("Lore.Info5.Command18_4", "");
		config.addDefault("Lore.Info5.Command18_5", "");
		config.addDefault("Lore.Info5.Command18_6", "");
		config.addDefault("Lore.Info5.Command18_7", "");
		config.addDefault("Lore.Info5.Command18_8", "");
		config.set("Lore.Info5.Command18", info5Command18);

		config.addDefault("Lore.Info6.Command1_1", "");
		config.addDefault("Lore.Info6.Command1_2", "");
		config.addDefault("Lore.Info6.Command1_3", "");
		config.addDefault("Lore.Info6.Command1_4", "");
		config.addDefault("Lore.Info6.Command1_5", "");
		config.addDefault("Lore.Info6.Command1_6", "");
		config.addDefault("Lore.Info6.Command1_7", "");
		config.addDefault("Lore.Info6.Command1_8", "");
		config.set("Lore.Info6.Command1", info6Command1);

		config.addDefault("Lore.Info6.Command2_1", "");
		config.addDefault("Lore.Info6.Command2_2", "");
		config.addDefault("Lore.Info6.Command2_3", "");
		config.addDefault("Lore.Info6.Command2_4", "");
		config.addDefault("Lore.Info6.Command2_5", "");
		config.addDefault("Lore.Info6.Command2_6", "");
		config.addDefault("Lore.Info6.Command2_7", "");
		config.addDefault("Lore.Info6.Command2_8", "");
		config.set("Lore.Info6.Command2", info6Command2);

		config.addDefault("Lore.Info6.Command3_1", "");
		config.addDefault("Lore.Info6.Command3_2", "");
		config.addDefault("Lore.Info6.Command3_3", "");
		config.addDefault("Lore.Info6.Command3_4", "");
		config.addDefault("Lore.Info6.Command3_5", "");
		config.addDefault("Lore.Info6.Command3_6", "");
		config.addDefault("Lore.Info6.Command3_7", "");
		config.addDefault("Lore.Info6.Command3_8", "");
		config.set("Lore.Info6.Command3", info6Command3);

		config.addDefault("Lore.Info6.Command4_1", "");
		config.addDefault("Lore.Info6.Command4_2", "");
		config.addDefault("Lore.Info6.Command4_3", "");
		config.addDefault("Lore.Info6.Command4_4", "");
		config.addDefault("Lore.Info6.Command4_5", "");
		config.addDefault("Lore.Info6.Command4_6", "");
		config.addDefault("Lore.Info6.Command4_7", "");
		config.addDefault("Lore.Info6.Command4_8", "");
		config.set("Lore.Info6.Command4", info6Command4);

		config.addDefault("Lore.Info6.Command5_1", "");
		config.addDefault("Lore.Info6.Command5_2", "");
		config.addDefault("Lore.Info6.Command5_3", "");
		config.addDefault("Lore.Info6.Command5_4", "");
		config.addDefault("Lore.Info6.Command5_5", "");
		config.addDefault("Lore.Info6.Command5_6", "");
		config.addDefault("Lore.Info6.Command5_7", "");
		config.addDefault("Lore.Info6.Command5_8", "");
		config.set("Lore.Info6.Command5", info6Command5);

		config.addDefault("Lore.Info6.Command6_1", "");
		config.addDefault("Lore.Info6.Command6_2", "");
		config.addDefault("Lore.Info6.Command6_3", "");
		config.addDefault("Lore.Info6.Command6_4", "");
		config.addDefault("Lore.Info6.Command6_5", "");
		config.addDefault("Lore.Info6.Command6_6", "");
		config.addDefault("Lore.Info6.Command6_7", "");
		config.addDefault("Lore.Info6.Command6_8", "");
		config.set("Lore.Info6.Command6", info6Command6);

		config.addDefault("Lore.Info6.Command7_1", "");
		config.addDefault("Lore.Info6.Command7_2", "");
		config.addDefault("Lore.Info6.Command7_3", "");
		config.addDefault("Lore.Info6.Command7_4", "");
		config.addDefault("Lore.Info6.Command7_5", "");
		config.addDefault("Lore.Info6.Command7_6", "");
		config.addDefault("Lore.Info6.Command7_7", "");
		config.addDefault("Lore.Info6.Command7_8", "");
		config.set("Lore.Info6.Command7", info6Command7);

		config.addDefault("Lore.Info6.Command8_1", "");
		config.addDefault("Lore.Info6.Command8_2", "");
		config.addDefault("Lore.Info6.Command8_3", "");
		config.addDefault("Lore.Info6.Command8_4", "");
		config.addDefault("Lore.Info6.Command8_5", "");
		config.addDefault("Lore.Info6.Command8_6", "");
		config.addDefault("Lore.Info6.Command8_7", "");
		config.addDefault("Lore.Info6.Command8_8", "");
		config.set("Lore.Info6.Command8", info6Command8);

		config.addDefault("Lore.Info6.Command9_1", "");
		config.addDefault("Lore.Info6.Command9_2", "");
		config.addDefault("Lore.Info6.Command9_3", "");
		config.addDefault("Lore.Info6.Command9_4", "");
		config.addDefault("Lore.Info6.Command9_5", "");
		config.addDefault("Lore.Info6.Command9_6", "");
		config.addDefault("Lore.Info6.Command9_7", "");
		config.addDefault("Lore.Info6.Command9_8", "");
		config.set("Lore.Info6.Command9", info6Command9);

		config.addDefault("Lore.Info6.Command10_1", "");
		config.addDefault("Lore.Info6.Command10_2", "");
		config.addDefault("Lore.Info6.Command10_3", "");
		config.addDefault("Lore.Info6.Command10_4", "");
		config.addDefault("Lore.Info6.Command10_5", "");
		config.addDefault("Lore.Info6.Command10_6", "");
		config.addDefault("Lore.Info6.Command10_7", "");
		config.addDefault("Lore.Info6.Command10_8", "");
		config.set("Lore.Info6.Command10", info6Command10);

		config.addDefault("Lore.Info6.Command11_1", "");
		config.addDefault("Lore.Info6.Command11_2", "");
		config.addDefault("Lore.Info6.Command11_3", "");
		config.addDefault("Lore.Info6.Command11_4", "");
		config.addDefault("Lore.Info6.Command11_5", "");
		config.addDefault("Lore.Info6.Command11_6", "");
		config.addDefault("Lore.Info6.Command11_7", "");
		config.addDefault("Lore.Info6.Command11_8", "");
		config.set("Lore.Info6.Command11", info6Command11);

		config.addDefault("Lore.Info6.Command12_1", "");
		config.addDefault("Lore.Info6.Command12_2", "");
		config.addDefault("Lore.Info6.Command12_3", "");
		config.addDefault("Lore.Info6.Command12_4", "");
		config.addDefault("Lore.Info6.Command12_5", "");
		config.addDefault("Lore.Info6.Command12_6", "");
		config.addDefault("Lore.Info6.Command12_7", "");
		config.addDefault("Lore.Info6.Command12_8", "");
		config.set("Lore.Info6.Command12", info6Command12);

		config.addDefault("Lore.Info6.Command13_1", "");
		config.addDefault("Lore.Info6.Command13_2", "");
		config.addDefault("Lore.Info6.Command13_3", "");
		config.addDefault("Lore.Info6.Command13_4", "");
		config.addDefault("Lore.Info6.Command13_5", "");
		config.addDefault("Lore.Info6.Command13_6", "");
		config.addDefault("Lore.Info6.Command13_7", "");
		config.addDefault("Lore.Info6.Command13_8", "");
		config.set("Lore.Info6.Command13", info6Command13);

		config.addDefault("Lore.Info6.Command14_1", "");
		config.addDefault("Lore.Info6.Command14_2", "");
		config.addDefault("Lore.Info6.Command14_3", "");
		config.addDefault("Lore.Info6.Command14_4", "");
		config.addDefault("Lore.Info6.Command14_5", "");
		config.addDefault("Lore.Info6.Command14_6", "");
		config.addDefault("Lore.Info6.Command14_7", "");
		config.addDefault("Lore.Info6.Command14_8", "");
		config.set("Lore.Info6.Command14", info6Command14);

		config.addDefault("Lore.Info6.Command15_1", "");
		config.addDefault("Lore.Info6.Command15_2", "");
		config.addDefault("Lore.Info6.Command15_3", "");
		config.addDefault("Lore.Info6.Command15_4", "");
		config.addDefault("Lore.Info6.Command15_5", "");
		config.addDefault("Lore.Info6.Command15_6", "");
		config.addDefault("Lore.Info6.Command15_7", "");
		config.addDefault("Lore.Info6.Command15_8", "");
		config.set("Lore.Info6.Command15", info6Command15);

		config.addDefault("Lore.Info6.Command16_1", "");
		config.addDefault("Lore.Info6.Command16_2", "");
		config.addDefault("Lore.Info6.Command16_3", "");
		config.addDefault("Lore.Info6.Command16_4", "");
		config.addDefault("Lore.Info6.Command16_5", "");
		config.addDefault("Lore.Info6.Command16_6", "");
		config.addDefault("Lore.Info6.Command16_7", "");
		config.addDefault("Lore.Info6.Command16_8", "");
		config.set("Lore.Info6.Command16", info6Command16);

		config.addDefault("Lore.Info6.Command17_1", "");
		config.addDefault("Lore.Info6.Command17_2", "");
		config.addDefault("Lore.Info6.Command17_3", "");
		config.addDefault("Lore.Info6.Command17_4", "");
		config.addDefault("Lore.Info6.Command17_5", "");
		config.addDefault("Lore.Info6.Command17_6", "");
		config.addDefault("Lore.Info6.Command17_7", "");
		config.addDefault("Lore.Info6.Command17_8", "");
		config.set("Lore.Info6.Command17", info6Command17);

		config.addDefault("Lore.Info6.Command18_1", "");
		config.addDefault("Lore.Info6.Command18_2", "");
		config.addDefault("Lore.Info6.Command18_3", "");
		config.addDefault("Lore.Info6.Command18_4", "");
		config.addDefault("Lore.Info6.Command18_5", "");
		config.addDefault("Lore.Info6.Command18_6", "");
		config.addDefault("Lore.Info6.Command18_7", "");
		config.addDefault("Lore.Info6.Command18_8", "");
		config.set("Lore.Info6.Command18", info6Command18);

		config.addDefault("Lore.Info7.Command1_1", "");
		config.addDefault("Lore.Info7.Command1_2", "");
		config.addDefault("Lore.Info7.Command1_3", "");
		config.addDefault("Lore.Info7.Command1_4", "");
		config.addDefault("Lore.Info7.Command1_5", "");
		config.addDefault("Lore.Info7.Command1_6", "");
		config.addDefault("Lore.Info7.Command1_7", "");
		config.addDefault("Lore.Info7.Command1_8", "");
		config.set("Lore.Info7.Command1", info7Command1);

		config.addDefault("Lore.Info7.Command2_1", "");
		config.addDefault("Lore.Info7.Command2_2", "");
		config.addDefault("Lore.Info7.Command2_3", "");
		config.addDefault("Lore.Info7.Command2_4", "");
		config.addDefault("Lore.Info7.Command2_5", "");
		config.addDefault("Lore.Info7.Command2_6", "");
		config.addDefault("Lore.Info7.Command2_7", "");
		config.addDefault("Lore.Info7.Command2_8", "");
		config.set("Lore.Info7.Command2", info7Command2);

		config.addDefault("Lore.Info7.Command3_1", "");
		config.addDefault("Lore.Info7.Command3_2", "");
		config.addDefault("Lore.Info7.Command3_3", "");
		config.addDefault("Lore.Info7.Command3_4", "");
		config.addDefault("Lore.Info7.Command3_5", "");
		config.addDefault("Lore.Info7.Command3_6", "");
		config.addDefault("Lore.Info7.Command3_7", "");
		config.addDefault("Lore.Info7.Command3_8", "");
		config.set("Lore.Info7.Command3", info7Command3);

		config.addDefault("Lore.Info7.Command4_1", "");
		config.addDefault("Lore.Info7.Command4_2", "");
		config.addDefault("Lore.Info7.Command4_3", "");
		config.addDefault("Lore.Info7.Command4_4", "");
		config.addDefault("Lore.Info7.Command4_5", "");
		config.addDefault("Lore.Info7.Command4_6", "");
		config.addDefault("Lore.Info7.Command4_7", "");
		config.addDefault("Lore.Info7.Command4_8", "");
		config.set("Lore.Info7.Command4", info7Command4);

		config.addDefault("Lore.Info7.Command5_1", "");
		config.addDefault("Lore.Info7.Command5_2", "");
		config.addDefault("Lore.Info7.Command5_3", "");
		config.addDefault("Lore.Info7.Command5_4", "");
		config.addDefault("Lore.Info7.Command5_5", "");
		config.addDefault("Lore.Info7.Command5_6", "");
		config.addDefault("Lore.Info7.Command5_7", "");
		config.addDefault("Lore.Info7.Command5_8", "");
		config.set("Lore.Info7.Command5", info7Command5);

		config.addDefault("Lore.Info7.Command6_1", "");
		config.addDefault("Lore.Info7.Command6_2", "");
		config.addDefault("Lore.Info7.Command6_3", "");
		config.addDefault("Lore.Info7.Command6_4", "");
		config.addDefault("Lore.Info7.Command6_5", "");
		config.addDefault("Lore.Info7.Command6_6", "");
		config.addDefault("Lore.Info7.Command6_7", "");
		config.addDefault("Lore.Info7.Command6_8", "");
		config.set("Lore.Info7.Command6", info7Command6);

		config.addDefault("Lore.Info7.Command7_1", "");
		config.addDefault("Lore.Info7.Command7_2", "");
		config.addDefault("Lore.Info7.Command7_3", "");
		config.addDefault("Lore.Info7.Command7_4", "");
		config.addDefault("Lore.Info7.Command7_5", "");
		config.addDefault("Lore.Info7.Command7_6", "");
		config.addDefault("Lore.Info7.Command7_7", "");
		config.addDefault("Lore.Info7.Command7_8", "");
		config.set("Lore.Info7.Command7", info7Command7);

		config.addDefault("Lore.Info7.Command8_1", "");
		config.addDefault("Lore.Info7.Command8_2", "");
		config.addDefault("Lore.Info7.Command8_3", "");
		config.addDefault("Lore.Info7.Command8_4", "");
		config.addDefault("Lore.Info7.Command8_5", "");
		config.addDefault("Lore.Info7.Command8_6", "");
		config.addDefault("Lore.Info7.Command8_7", "");
		config.addDefault("Lore.Info7.Command8_8", "");
		config.set("Lore.Info7.Command8", info7Command8);

		config.addDefault("Lore.Info7.Command9_1", "");
		config.addDefault("Lore.Info7.Command9_2", "");
		config.addDefault("Lore.Info7.Command9_3", "");
		config.addDefault("Lore.Info7.Command9_4", "");
		config.addDefault("Lore.Info7.Command9_5", "");
		config.addDefault("Lore.Info7.Command9_6", "");
		config.addDefault("Lore.Info7.Command9_7", "");
		config.addDefault("Lore.Info7.Command9_8", "");
		config.set("Lore.Info7.Command9", info7Command9);

		config.addDefault("Lore.Info7.Command10_1", "");
		config.addDefault("Lore.Info7.Command10_2", "");
		config.addDefault("Lore.Info7.Command10_3", "");
		config.addDefault("Lore.Info7.Command10_4", "");
		config.addDefault("Lore.Info7.Command10_5", "");
		config.addDefault("Lore.Info7.Command10_6", "");
		config.addDefault("Lore.Info7.Command10_7", "");
		config.addDefault("Lore.Info7.Command10_8", "");
		config.set("Lore.Info7.Command10", info7Command10);

		config.addDefault("Lore.Info7.Command11_1", "");
		config.addDefault("Lore.Info7.Command11_2", "");
		config.addDefault("Lore.Info7.Command11_3", "");
		config.addDefault("Lore.Info7.Command11_4", "");
		config.addDefault("Lore.Info7.Command11_5", "");
		config.addDefault("Lore.Info7.Command11_6", "");
		config.addDefault("Lore.Info7.Command11_7", "");
		config.addDefault("Lore.Info7.Command11_8", "");
		config.set("Lore.Info7.Command11", info7Command11);

		config.addDefault("Lore.Info7.Command12_1", "");
		config.addDefault("Lore.Info7.Command12_2", "");
		config.addDefault("Lore.Info7.Command12_3", "");
		config.addDefault("Lore.Info7.Command12_4", "");
		config.addDefault("Lore.Info7.Command12_5", "");
		config.addDefault("Lore.Info7.Command12_6", "");
		config.addDefault("Lore.Info7.Command12_7", "");
		config.addDefault("Lore.Info7.Command12_8", "");
		config.set("Lore.Info7.Command12", info7Command12);

		config.addDefault("Lore.Info7.Command13_1", "");
		config.addDefault("Lore.Info7.Command13_2", "");
		config.addDefault("Lore.Info7.Command13_3", "");
		config.addDefault("Lore.Info7.Command13_4", "");
		config.addDefault("Lore.Info7.Command13_5", "");
		config.addDefault("Lore.Info7.Command13_6", "");
		config.addDefault("Lore.Info7.Command13_7", "");
		config.addDefault("Lore.Info7.Command13_8", "");
		config.set("Lore.Info7.Command13", info7Command13);

		config.addDefault("Lore.Info7.Command14_1", "");
		config.addDefault("Lore.Info7.Command14_2", "");
		config.addDefault("Lore.Info7.Command14_3", "");
		config.addDefault("Lore.Info7.Command14_4", "");
		config.addDefault("Lore.Info7.Command14_5", "");
		config.addDefault("Lore.Info7.Command14_6", "");
		config.addDefault("Lore.Info7.Command14_7", "");
		config.addDefault("Lore.Info7.Command14_8", "");
		config.set("Lore.Info7.Command14", info7Command14);

		config.addDefault("Lore.Info7.Command15_1", "");
		config.addDefault("Lore.Info7.Command15_2", "");
		config.addDefault("Lore.Info7.Command15_3", "");
		config.addDefault("Lore.Info7.Command15_4", "");
		config.addDefault("Lore.Info7.Command15_5", "");
		config.addDefault("Lore.Info7.Command15_6", "");
		config.addDefault("Lore.Info7.Command15_7", "");
		config.addDefault("Lore.Info7.Command15_8", "");
		config.set("Lore.Info7.Command15", info7Command15);

		config.addDefault("Lore.Info7.Command16_1", "");
		config.addDefault("Lore.Info7.Command16_2", "");
		config.addDefault("Lore.Info7.Command16_3", "");
		config.addDefault("Lore.Info7.Command16_4", "");
		config.addDefault("Lore.Info7.Command16_5", "");
		config.addDefault("Lore.Info7.Command16_6", "");
		config.addDefault("Lore.Info7.Command16_7", "");
		config.addDefault("Lore.Info7.Command16_8", "");
		config.set("Lore.Info7.Command16", info7Command16);

		config.addDefault("Lore.Info7.Command17_1", "");
		config.addDefault("Lore.Info7.Command17_2", "");
		config.addDefault("Lore.Info7.Command17_3", "");
		config.addDefault("Lore.Info7.Command17_4", "");
		config.addDefault("Lore.Info7.Command17_5", "");
		config.addDefault("Lore.Info7.Command17_6", "");
		config.addDefault("Lore.Info7.Command17_7", "");
		config.addDefault("Lore.Info7.Command17_8", "");
		config.set("Lore.Info7.Command17", info7Command17);

		config.addDefault("Lore.Info7.Command18_1", "");
		config.addDefault("Lore.Info7.Command18_2", "");
		config.addDefault("Lore.Info7.Command18_3", "");
		config.addDefault("Lore.Info7.Command18_4", "");
		config.addDefault("Lore.Info7.Command18_5", "");
		config.addDefault("Lore.Info7.Command18_6", "");
		config.addDefault("Lore.Info7.Command18_7", "");
		config.addDefault("Lore.Info7.Command18_8", "");
		config.set("Lore.Info7.Command18", info7Command18);

		config.addDefault("Lore.Info8.Command1_1", "");
		config.addDefault("Lore.Info8.Command1_2", "");
		config.addDefault("Lore.Info8.Command1_3", "");
		config.addDefault("Lore.Info8.Command1_4", "");
		config.addDefault("Lore.Info8.Command1_5", "");
		config.addDefault("Lore.Info8.Command1_6", "");
		config.addDefault("Lore.Info8.Command1_7", "");
		config.addDefault("Lore.Info8.Command1_8", "");
		config.set("Lore.Info8.Command1", info8Command1);

		config.addDefault("Lore.Info8.Command2_1", "");
		config.addDefault("Lore.Info8.Command2_2", "");
		config.addDefault("Lore.Info8.Command2_3", "");
		config.addDefault("Lore.Info8.Command2_4", "");
		config.addDefault("Lore.Info8.Command2_5", "");
		config.addDefault("Lore.Info8.Command2_6", "");
		config.addDefault("Lore.Info8.Command2_7", "");
		config.addDefault("Lore.Info8.Command2_8", "");
		config.set("Lore.Info8.Command2", info8Command2);

		config.addDefault("Lore.Info8.Command3_1", "");
		config.addDefault("Lore.Info8.Command3_2", "");
		config.addDefault("Lore.Info8.Command3_3", "");
		config.addDefault("Lore.Info8.Command3_4", "");
		config.addDefault("Lore.Info8.Command3_5", "");
		config.addDefault("Lore.Info8.Command3_6", "");
		config.addDefault("Lore.Info8.Command3_7", "");
		config.addDefault("Lore.Info8.Command3_8", "");
		config.set("Lore.Info8.Command3", info8Command3);

		config.addDefault("Lore.Info8.Command4_1", "");
		config.addDefault("Lore.Info8.Command4_2", "");
		config.addDefault("Lore.Info8.Command4_3", "");
		config.addDefault("Lore.Info8.Command4_4", "");
		config.addDefault("Lore.Info8.Command4_5", "");
		config.addDefault("Lore.Info8.Command4_6", "");
		config.addDefault("Lore.Info8.Command4_7", "");
		config.addDefault("Lore.Info8.Command4_8", "");
		config.set("Lore.Info8.Command4", info8Command4);

		config.addDefault("Lore.Info8.Command5_1", "");
		config.addDefault("Lore.Info8.Command5_2", "");
		config.addDefault("Lore.Info8.Command5_3", "");
		config.addDefault("Lore.Info8.Command5_4", "");
		config.addDefault("Lore.Info8.Command5_5", "");
		config.addDefault("Lore.Info8.Command5_6", "");
		config.addDefault("Lore.Info8.Command5_7", "");
		config.addDefault("Lore.Info8.Command5_8", "");
		config.set("Lore.Info8.Command5", info8Command5);

		config.addDefault("Lore.Info8.Command6_1", "");
		config.addDefault("Lore.Info8.Command6_2", "");
		config.addDefault("Lore.Info8.Command6_3", "");
		config.addDefault("Lore.Info8.Command6_4", "");
		config.addDefault("Lore.Info8.Command6_5", "");
		config.addDefault("Lore.Info8.Command6_6", "");
		config.addDefault("Lore.Info8.Command6_7", "");
		config.addDefault("Lore.Info8.Command6_8", "");
		config.set("Lore.Info8.Command6", info8Command6);

		config.addDefault("Lore.Info8.Command7_1", "");
		config.addDefault("Lore.Info8.Command7_2", "");
		config.addDefault("Lore.Info8.Command7_3", "");
		config.addDefault("Lore.Info8.Command7_4", "");
		config.addDefault("Lore.Info8.Command7_5", "");
		config.addDefault("Lore.Info8.Command7_6", "");
		config.addDefault("Lore.Info8.Command7_7", "");
		config.addDefault("Lore.Info8.Command7_8", "");
		config.set("Lore.Info8.Command7", info8Command7);

		config.addDefault("Lore.Info8.Command8_1", "");
		config.addDefault("Lore.Info8.Command8_2", "");
		config.addDefault("Lore.Info8.Command8_3", "");
		config.addDefault("Lore.Info8.Command8_4", "");
		config.addDefault("Lore.Info8.Command8_5", "");
		config.addDefault("Lore.Info8.Command8_6", "");
		config.addDefault("Lore.Info8.Command8_7", "");
		config.addDefault("Lore.Info8.Command8_8", "");
		config.set("Lore.Info8.Command8", info8Command8);

		config.addDefault("Lore.Info8.Command9_1", "");
		config.addDefault("Lore.Info8.Command9_2", "");
		config.addDefault("Lore.Info8.Command9_3", "");
		config.addDefault("Lore.Info8.Command9_4", "");
		config.addDefault("Lore.Info8.Command9_5", "");
		config.addDefault("Lore.Info8.Command9_6", "");
		config.addDefault("Lore.Info8.Command9_7", "");
		config.addDefault("Lore.Info8.Command9_8", "");
		config.set("Lore.Info8.Command9", info8Command9);

		config.addDefault("Lore.Info8.Command10_1", "");
		config.addDefault("Lore.Info8.Command10_2", "");
		config.addDefault("Lore.Info8.Command10_3", "");
		config.addDefault("Lore.Info8.Command10_4", "");
		config.addDefault("Lore.Info8.Command10_5", "");
		config.addDefault("Lore.Info8.Command10_6", "");
		config.addDefault("Lore.Info8.Command10_7", "");
		config.addDefault("Lore.Info8.Command10_8", "");
		config.set("Lore.Info8.Command10", info8Command10);

		config.addDefault("Lore.Info8.Command11_1", "");
		config.addDefault("Lore.Info8.Command11_2", "");
		config.addDefault("Lore.Info8.Command11_3", "");
		config.addDefault("Lore.Info8.Command11_4", "");
		config.addDefault("Lore.Info8.Command11_5", "");
		config.addDefault("Lore.Info8.Command11_6", "");
		config.addDefault("Lore.Info8.Command11_7", "");
		config.addDefault("Lore.Info8.Command11_8", "");
		config.set("Lore.Info8.Command11", info8Command11);

		config.addDefault("Lore.Info8.Command12_1", "");
		config.addDefault("Lore.Info8.Command12_2", "");
		config.addDefault("Lore.Info8.Command12_3", "");
		config.addDefault("Lore.Info8.Command12_4", "");
		config.addDefault("Lore.Info8.Command12_5", "");
		config.addDefault("Lore.Info8.Command12_6", "");
		config.addDefault("Lore.Info8.Command12_7", "");
		config.addDefault("Lore.Info8.Command12_8", "");
		config.set("Lore.Info8.Command12", info8Command12);

		config.addDefault("Lore.Info8.Command13_1", "");
		config.addDefault("Lore.Info8.Command13_2", "");
		config.addDefault("Lore.Info8.Command13_3", "");
		config.addDefault("Lore.Info8.Command13_4", "");
		config.addDefault("Lore.Info8.Command13_5", "");
		config.addDefault("Lore.Info8.Command13_6", "");
		config.addDefault("Lore.Info8.Command13_7", "");
		config.addDefault("Lore.Info8.Command13_8", "");
		config.set("Lore.Info8.Command13", info8Command13);

		config.addDefault("Lore.Info8.Command14_1", "");
		config.addDefault("Lore.Info8.Command14_2", "");
		config.addDefault("Lore.Info8.Command14_3", "");
		config.addDefault("Lore.Info8.Command14_4", "");
		config.addDefault("Lore.Info8.Command14_5", "");
		config.addDefault("Lore.Info8.Command14_6", "");
		config.addDefault("Lore.Info8.Command14_7", "");
		config.addDefault("Lore.Info8.Command14_8", "");
		config.set("Lore.Info8.Command14", info8Command14);

		config.addDefault("Lore.Info8.Command15_1", "");
		config.addDefault("Lore.Info8.Command15_2", "");
		config.addDefault("Lore.Info8.Command15_3", "");
		config.addDefault("Lore.Info8.Command15_4", "");
		config.addDefault("Lore.Info8.Command15_5", "");
		config.addDefault("Lore.Info8.Command15_6", "");
		config.addDefault("Lore.Info8.Command15_7", "");
		config.addDefault("Lore.Info8.Command15_8", "");
		config.set("Lore.Info8.Command15", info8Command15);

		config.addDefault("Lore.Info8.Command16_1", "");
		config.addDefault("Lore.Info8.Command16_2", "");
		config.addDefault("Lore.Info8.Command16_3", "");
		config.addDefault("Lore.Info8.Command16_4", "");
		config.addDefault("Lore.Info8.Command16_5", "");
		config.addDefault("Lore.Info8.Command16_6", "");
		config.addDefault("Lore.Info8.Command16_7", "");
		config.addDefault("Lore.Info8.Command16_8", "");
		config.set("Lore.Info8.Command16", info8Command16);

		config.addDefault("Lore.Info8.Command17_1", "");
		config.addDefault("Lore.Info8.Command17_2", "");
		config.addDefault("Lore.Info8.Command17_3", "");
		config.addDefault("Lore.Info8.Command17_4", "");
		config.addDefault("Lore.Info8.Command17_5", "");
		config.addDefault("Lore.Info8.Command17_6", "");
		config.addDefault("Lore.Info8.Command17_7", "");
		config.addDefault("Lore.Info8.Command17_8", "");
		config.set("Lore.Info8.Command17", info8Command17);

		config.addDefault("Lore.Info8.Command18_1", "");
		config.addDefault("Lore.Info8.Command18_2", "");
		config.addDefault("Lore.Info8.Command18_3", "");
		config.addDefault("Lore.Info8.Command18_4", "");
		config.addDefault("Lore.Info8.Command18_5", "");
		config.addDefault("Lore.Info8.Command18_6", "");
		config.addDefault("Lore.Info8.Command18_7", "");
		config.addDefault("Lore.Info8.Command18_8", "");
		config.set("Lore.Info8.Command18", info8Command18);

		config.addDefault("Lore.Info9.Command1_1", "");
		config.addDefault("Lore.Info9.Command1_2", "");
		config.addDefault("Lore.Info9.Command1_3", "");
		config.addDefault("Lore.Info9.Command1_4", "");
		config.addDefault("Lore.Info9.Command1_5", "");
		config.addDefault("Lore.Info9.Command1_6", "");
		config.addDefault("Lore.Info9.Command1_7", "");
		config.addDefault("Lore.Info9.Command1_8", "");
		config.set("Lore.Info9.Command1", info9Command1);

		config.addDefault("Lore.Info9.Command2_1", "");
		config.addDefault("Lore.Info9.Command2_2", "");
		config.addDefault("Lore.Info9.Command2_3", "");
		config.addDefault("Lore.Info9.Command2_4", "");
		config.addDefault("Lore.Info9.Command2_5", "");
		config.addDefault("Lore.Info9.Command2_6", "");
		config.addDefault("Lore.Info9.Command2_7", "");
		config.addDefault("Lore.Info9.Command2_8", "");
		config.set("Lore.Info9.Command2", info9Command2);

		config.addDefault("Lore.Info9.Command3_1", "");
		config.addDefault("Lore.Info9.Command3_2", "");
		config.addDefault("Lore.Info9.Command3_3", "");
		config.addDefault("Lore.Info9.Command3_4", "");
		config.addDefault("Lore.Info9.Command3_5", "");
		config.addDefault("Lore.Info9.Command3_6", "");
		config.addDefault("Lore.Info9.Command3_7", "");
		config.addDefault("Lore.Info9.Command3_8", "");
		config.set("Lore.Info9.Command3", info9Command3);

		config.addDefault("Lore.Info9.Command4_1", "");
		config.addDefault("Lore.Info9.Command4_2", "");
		config.addDefault("Lore.Info9.Command4_3", "");
		config.addDefault("Lore.Info9.Command4_4", "");
		config.addDefault("Lore.Info9.Command4_5", "");
		config.addDefault("Lore.Info9.Command4_6", "");
		config.addDefault("Lore.Info9.Command4_7", "");
		config.addDefault("Lore.Info9.Command4_8", "");
		config.set("Lore.Info9.Command4", info9Command4);

		config.addDefault("Lore.Info9.Command5_1", "");
		config.addDefault("Lore.Info9.Command5_2", "");
		config.addDefault("Lore.Info9.Command5_3", "");
		config.addDefault("Lore.Info9.Command5_4", "");
		config.addDefault("Lore.Info9.Command5_5", "");
		config.addDefault("Lore.Info9.Command5_6", "");
		config.addDefault("Lore.Info9.Command5_7", "");
		config.addDefault("Lore.Info9.Command5_8", "");
		config.set("Lore.Info9.Command5", info9Command5);

		config.addDefault("Lore.Info9.Command6_1", "");
		config.addDefault("Lore.Info9.Command6_2", "");
		config.addDefault("Lore.Info9.Command6_3", "");
		config.addDefault("Lore.Info9.Command6_4", "");
		config.addDefault("Lore.Info9.Command6_5", "");
		config.addDefault("Lore.Info9.Command6_6", "");
		config.addDefault("Lore.Info9.Command6_7", "");
		config.addDefault("Lore.Info9.Command6_8", "");
		config.set("Lore.Info9.Command6", info9Command6);

		config.addDefault("Lore.Info9.Command7_1", "");
		config.addDefault("Lore.Info9.Command7_2", "");
		config.addDefault("Lore.Info9.Command7_3", "");
		config.addDefault("Lore.Info9.Command7_4", "");
		config.addDefault("Lore.Info9.Command7_5", "");
		config.addDefault("Lore.Info9.Command7_6", "");
		config.addDefault("Lore.Info9.Command7_7", "");
		config.addDefault("Lore.Info9.Command7_8", "");
		config.set("Lore.Info9.Command7", info9Command7);

		config.addDefault("Lore.Info9.Command8_1", "");
		config.addDefault("Lore.Info9.Command8_2", "");
		config.addDefault("Lore.Info9.Command8_3", "");
		config.addDefault("Lore.Info9.Command8_4", "");
		config.addDefault("Lore.Info9.Command8_5", "");
		config.addDefault("Lore.Info9.Command8_6", "");
		config.addDefault("Lore.Info9.Command8_7", "");
		config.addDefault("Lore.Info9.Command8_8", "");
		config.set("Lore.Info9.Command8", info9Command8);

		config.addDefault("Lore.Info9.Command9_1", "");
		config.addDefault("Lore.Info9.Command9_2", "");
		config.addDefault("Lore.Info9.Command9_3", "");
		config.addDefault("Lore.Info9.Command9_4", "");
		config.addDefault("Lore.Info9.Command9_5", "");
		config.addDefault("Lore.Info9.Command9_6", "");
		config.addDefault("Lore.Info9.Command9_7", "");
		config.addDefault("Lore.Info9.Command9_8", "");
		config.set("Lore.Info9.Command9", info9Command9);

		config.addDefault("Lore.Info9.Command10_1", "");
		config.addDefault("Lore.Info9.Command10_2", "");
		config.addDefault("Lore.Info9.Command10_3", "");
		config.addDefault("Lore.Info9.Command10_4", "");
		config.addDefault("Lore.Info9.Command10_5", "");
		config.addDefault("Lore.Info9.Command10_6", "");
		config.addDefault("Lore.Info9.Command10_7", "");
		config.addDefault("Lore.Info9.Command10_8", "");
		config.set("Lore.Info9.Command10", info9Command10);

		config.addDefault("Lore.Info9.Command11_1", "");
		config.addDefault("Lore.Info9.Command11_2", "");
		config.addDefault("Lore.Info9.Command11_3", "");
		config.addDefault("Lore.Info9.Command11_4", "");
		config.addDefault("Lore.Info9.Command11_5", "");
		config.addDefault("Lore.Info9.Command11_6", "");
		config.addDefault("Lore.Info9.Command11_7", "");
		config.addDefault("Lore.Info9.Command11_8", "");
		config.set("Lore.Info9.Command11", info9Command11);

		config.addDefault("Lore.Info9.Command12_1", "");
		config.addDefault("Lore.Info9.Command12_2", "");
		config.addDefault("Lore.Info9.Command12_3", "");
		config.addDefault("Lore.Info9.Command12_4", "");
		config.addDefault("Lore.Info9.Command12_5", "");
		config.addDefault("Lore.Info9.Command12_6", "");
		config.addDefault("Lore.Info9.Command12_7", "");
		config.addDefault("Lore.Info9.Command12_8", "");
		config.set("Lore.Info9.Command12", info9Command12);

		config.addDefault("Lore.Info9.Command13_1", "");
		config.addDefault("Lore.Info9.Command13_2", "");
		config.addDefault("Lore.Info9.Command13_3", "");
		config.addDefault("Lore.Info9.Command13_4", "");
		config.addDefault("Lore.Info9.Command13_5", "");
		config.addDefault("Lore.Info9.Command13_6", "");
		config.addDefault("Lore.Info9.Command13_7", "");
		config.addDefault("Lore.Info9.Command13_8", "");
		config.set("Lore.Info9.Command13", info9Command13);

		config.addDefault("Lore.Info9.Command14_1", "");
		config.addDefault("Lore.Info9.Command14_2", "");
		config.addDefault("Lore.Info9.Command14_3", "");
		config.addDefault("Lore.Info9.Command14_4", "");
		config.addDefault("Lore.Info9.Command14_5", "");
		config.addDefault("Lore.Info9.Command14_6", "");
		config.addDefault("Lore.Info9.Command14_7", "");
		config.addDefault("Lore.Info9.Command14_8", "");
		config.set("Lore.Info9.Command14", info9Command14);

		config.addDefault("Lore.Info9.Command15_1", "");
		config.addDefault("Lore.Info9.Command15_2", "");
		config.addDefault("Lore.Info9.Command15_3", "");
		config.addDefault("Lore.Info9.Command15_4", "");
		config.addDefault("Lore.Info9.Command15_5", "");
		config.addDefault("Lore.Info9.Command15_6", "");
		config.addDefault("Lore.Info9.Command15_7", "");
		config.addDefault("Lore.Info9.Command15_8", "");
		config.set("Lore.Info9.Command15", info9Command15);

		config.addDefault("Lore.Info9.Command16_1", "");
		config.addDefault("Lore.Info9.Command16_2", "");
		config.addDefault("Lore.Info9.Command16_3", "");
		config.addDefault("Lore.Info9.Command16_4", "");
		config.addDefault("Lore.Info9.Command16_5", "");
		config.addDefault("Lore.Info9.Command16_6", "");
		config.addDefault("Lore.Info9.Command16_7", "");
		config.addDefault("Lore.Info9.Command16_8", "");
		config.set("Lore.Info9.Command16", info9Command16);

		config.addDefault("Lore.Info9.Command17_1", "");
		config.addDefault("Lore.Info9.Command17_2", "");
		config.addDefault("Lore.Info9.Command17_3", "");
		config.addDefault("Lore.Info9.Command17_4", "");
		config.addDefault("Lore.Info9.Command17_5", "");
		config.addDefault("Lore.Info9.Command17_6", "");
		config.addDefault("Lore.Info9.Command17_7", "");
		config.addDefault("Lore.Info9.Command17_8", "");
		config.set("Lore.Info9.Command17", info9Command17);

		config.addDefault("Lore.Info9.Command18_1", "");
		config.addDefault("Lore.Info9.Command18_2", "");
		config.addDefault("Lore.Info9.Command18_3", "");
		config.addDefault("Lore.Info9.Command18_4", "");
		config.addDefault("Lore.Info9.Command18_5", "");
		config.addDefault("Lore.Info1.Command18_6", "");
		config.addDefault("Lore.Info9.Command18_7", "");
		config.addDefault("Lore.Info9.Command18_8", "");
		config.set("Lore.Info9.Command18", info9Command18);

		config.addDefault("Lore.Info10.Command1_1", "");
		config.addDefault("Lore.Info10.Command1_2", "");
		config.addDefault("Lore.Info10.Command1_3", "");
		config.addDefault("Lore.Info10.Command1_4", "");
		config.addDefault("Lore.Info10.Command1_5", "");
		config.addDefault("Lore.Info10.Command1_6", "");
		config.addDefault("Lore.Info10.Command1_7", "");
		config.addDefault("Lore.Info10.Command1_8", "");
		config.set("Lore.Info10.Command1", info10Command1);

		config.addDefault("Lore.Info10.Command2_1", "");
		config.addDefault("Lore.Info10.Command2_2", "");
		config.addDefault("Lore.Info10.Command2_3", "");
		config.addDefault("Lore.Info10.Command2_4", "");
		config.addDefault("Lore.Info10.Command2_5", "");
		config.addDefault("Lore.Info10.Command2_6", "");
		config.addDefault("Lore.Info9.Command2_7", "");
		config.addDefault("Lore.Info10.Command2_8", "");
		config.set("Lore.Info10.Command2", info10Command2);

		config.addDefault("Lore.Info10.Command3_1", "");
		config.addDefault("Lore.Info10.Command3_2", "");
		config.addDefault("Lore.Info10.Command3_3", "");
		config.addDefault("Lore.Info10.Command3_4", "");
		config.addDefault("Lore.Info10.Command3_5", "");
		config.addDefault("Lore.Info10.Command3_6", "");
		config.addDefault("Lore.Info10.Command3_7", "");
		config.addDefault("Lore.Info10.Command3_8", "");
		config.set("Lore.Info10.Command3", info10Command3);

		config.addDefault("Lore.Info10.Command4_1", "");
		config.addDefault("Lore.Info10.Command4_2", "");
		config.addDefault("Lore.Info10.Command4_3", "");
		config.addDefault("Lore.Info10.Command4_4", "");
		config.addDefault("Lore.Info10.Command4_5", "");
		config.addDefault("Lore.Info10.Command4_6", "");
		config.addDefault("Lore.Info10.Command4_7", "");
		config.addDefault("Lore.Info10.Command4_8", "");
		config.set("Lore.Info10.Command4", info10Command4);

		config.addDefault("Lore.Info10.Command5_1", "");
		config.addDefault("Lore.Info10.Command5_2", "");
		config.addDefault("Lore.Info10.Command5_3", "");
		config.addDefault("Lore.Info10.Command5_4", "");
		config.addDefault("Lore.Info10.Command5_5", "");
		config.addDefault("Lore.Info10.Command5_6", "");
		config.addDefault("Lore.Info10.Command5_7", "");
		config.addDefault("Lore.Info10.Command5_8", "");
		config.set("Lore.Info10.Command5", info10Command5);

		config.addDefault("Lore.Info10.Command6_1", "");
		config.addDefault("Lore.Info10.Command6_2", "");
		config.addDefault("Lore.Info10.Command6_3", "");
		config.addDefault("Lore.Info10.Command6_4", "");
		config.addDefault("Lore.Info10.Command6_5", "");
		config.addDefault("Lore.Info10.Command6_6", "");
		config.addDefault("Lore.Info10.Command6_7", "");
		config.addDefault("Lore.Info10.Command6_8", "");
		config.set("Lore.Info10.Command6", info10Command6);

		config.addDefault("Lore.Info10.Command7_1", "");
		config.addDefault("Lore.Info10.Command7_2", "");
		config.addDefault("Lore.Info10.Command7_3", "");
		config.addDefault("Lore.Info10.Command7_4", "");
		config.addDefault("Lore.Info10.Command7_5", "");
		config.addDefault("Lore.Info10.Command7_6", "");
		config.addDefault("Lore.Info10.Command7_7", "");
		config.addDefault("Lore.Info10.Command7_8", "");
		config.set("Lore.Info10.Command7", info10Command7);

		config.addDefault("Lore.Info10.Command8_1", "");
		config.addDefault("Lore.Info10.Command8_2", "");
		config.addDefault("Lore.Info10.Command8_3", "");
		config.addDefault("Lore.Info10.Command8_4", "");
		config.addDefault("Lore.Info10.Command8_5", "");
		config.addDefault("Lore.Info10.Command8_6", "");
		config.addDefault("Lore.Info10.Command8_7", "");
		config.addDefault("Lore.Info10.Command8_8", "");
		config.set("Lore.Info10.Command8", info10Command8);

		config.addDefault("Lore.Info10.Command9_1", "");
		config.addDefault("Lore.Info10.Command9_2", "");
		config.addDefault("Lore.Info10.Command9_3", "");
		config.addDefault("Lore.Info10.Command9_4", "");
		config.addDefault("Lore.Info10.Command9_5", "");
		config.addDefault("Lore.Info10.Command9_6", "");
		config.addDefault("Lore.Info10.Command9_7", "");
		config.addDefault("Lore.Info10.Command9_8", "");
		config.set("Lore.Info10.Command9", info10Command9);

		config.addDefault("Lore.Info10.Command10_1", "");
		config.addDefault("Lore.Info10.Command10_2", "");
		config.addDefault("Lore.Info10.Command10_3", "");
		config.addDefault("Lore.Info10.Command10_4", "");
		config.addDefault("Lore.Info10.Command10_5", "");
		config.addDefault("Lore.Info10.Command10_6", "");
		config.addDefault("Lore.Info10.Command10_7", "");
		config.addDefault("Lore.Info10.Command10_8", "");
		config.set("Lore.Info10.Command10", info10Command10);

		config.addDefault("Lore.Info10.Command11_1", "");
		config.addDefault("Lore.Info10.Command11_2", "");
		config.addDefault("Lore.Info10.Command11_3", "");
		config.addDefault("Lore.Info10.Command11_4", "");
		config.addDefault("Lore.Info10.Command11_5", "");
		config.addDefault("Lore.Info10.Command11_6", "");
		config.addDefault("Lore.Info10.Command11_7", "");
		config.addDefault("Lore.Info10.Command11_8", "");
		config.set("Lore.Info10.Command11", info10Command11);

		config.addDefault("Lore.Info10.Command12_1", "");
		config.addDefault("Lore.Info10.Command12_2", "");
		config.addDefault("Lore.Info10.Command12_3", "");
		config.addDefault("Lore.Info10.Command12_4", "");
		config.addDefault("Lore.Info10.Command12_5", "");
		config.addDefault("Lore.Info10.Command12_6", "");
		config.addDefault("Lore.Info10.Command12_7", "");
		config.addDefault("Lore.Info10.Command12_8", "");
		config.set("Lore.Info10.Command12", info10Command12);

		config.addDefault("Lore.Info10.Command13_1", "");
		config.addDefault("Lore.Info10.Command13_2", "");
		config.addDefault("Lore.Info10.Command13_3", "");
		config.addDefault("Lore.Info10.Command13_4", "");
		config.addDefault("Lore.Info10.Command13_5", "");
		config.addDefault("Lore.Info10.Command13_6", "");
		config.addDefault("Lore.Info10.Command13_7", "");
		config.addDefault("Lore.Info10.Command13_8", "");
		config.set("Lore.Info10.Command13", info10Command13);

		config.addDefault("Lore.Info10.Command14_1", "");
		config.addDefault("Lore.Info10.Command14_2", "");
		config.addDefault("Lore.Info10.Command14_3", "");
		config.addDefault("Lore.Info10.Command14_4", "");
		config.addDefault("Lore.Info10.Command14_5", "");
		config.addDefault("Lore.Info10.Command14_6", "");
		config.addDefault("Lore.Info10.Command14_7", "");
		config.addDefault("Lore.Info10.Command14_8", "");
		config.set("Lore.Info10.Command14", info10Command14);

		config.addDefault("Lore.Info10.Command15_1", "");
		config.addDefault("Lore.Info10.Command15_2", "");
		config.addDefault("Lore.Info10.Command15_3", "");
		config.addDefault("Lore.Info10.Command15_4", "");
		config.addDefault("Lore.Info10.Command15_5", "");
		config.addDefault("Lore.Info10.Command15_6", "");
		config.addDefault("Lore.Info10.Command15_7", "");
		config.addDefault("Lore.Info10.Command15_8", "");
		config.set("Lore.Info10.Command15", info10Command15);

		config.addDefault("Lore.Info10.Command16_1", "");
		config.addDefault("Lore.Info10.Command16_2", "");
		config.addDefault("Lore.Info10.Command16_3", "");
		config.addDefault("Lore.Info10.Command16_4", "");
		config.addDefault("Lore.Info10.Command16_5", "");
		config.addDefault("Lore.Info10.Command16_6", "");
		config.addDefault("Lore.Info10.Command16_7", "");
		config.addDefault("Lore.Info10.Command16_8", "");
		config.set("Lore.Info10.Command16", info10Command16);

		config.addDefault("Lore.Info10.Command17_1", "");
		config.addDefault("Lore.Info10.Command17_2", "");
		config.addDefault("Lore.Info10.Command17_3", "");
		config.addDefault("Lore.Info10.Command17_4", "");
		config.addDefault("Lore.Info10.Command17_5", "");
		config.addDefault("Lore.Info10.Command17_6", "");
		config.addDefault("Lore.Info10.Command17_7", "");
		config.addDefault("Lore.Info10.Command17_8", "");
		config.set("Lore.Info10.Command17", info10Command17);

		config.addDefault("Lore.Info10.Command18_1", "");
		config.addDefault("Lore.Info10.Command18_2", "");
		config.addDefault("Lore.Info10.Command18_3", "");
		config.addDefault("Lore.Info10.Command18_4", "");
		config.addDefault("Lore.Info10.Command18_5", "");
		config.addDefault("Lore.Info10.Command18_6", "");
		config.addDefault("Lore.Info10.Command18_7", "");
		config.addDefault("Lore.Info10.Command18_8", "");
		config.set("Lore.Info10.Command18", info10Command18);

		config.addDefault("Lore.Info11.Shop1", "");
		config.set("Lore.Shop1", info11Shop1);

		config.addDefault("Lore.Info11.Shop2", "");
		config.set("Lore.Shop2", info11Shop2);

		config.addDefault("Lore.Info11.Shop3", "");
		config.set("Lore.Shop3", info11Shop3);

		config.addDefault("Lore.Info11.Shop4", "");
		config.set("Lore.Shop4", info11Shop4);

		config.addDefault("Lore.Info11.Shop5", "");
		config.set("Lore.Shop5", info11Shop5);

		config.addDefault("Lore.Info11.Shop6", "");
		config.set("Lore.Shop6", info11Shop6);

		config.addDefault("Lore.Info11.Shop7", "");
		config.set("Lore.Shop7", info11Shop7);

		config.addDefault("Lore.Info11.Shop8", "");
		config.set("Lore.Shop8", info11Shop8);

		config.addDefault("Lore.Info11.Shop9", "");
		config.set("Lore.Shop9", info11Shop9);

		config.addDefault("Lore.Info11.Shop10", "");
		config.set("Lore.Shop10", info11Shop10);

		config.addDefault("Lore.Info11.Shop11", "");
		config.set("Lore.Shop11", info11Shop11);

		config.addDefault("Lore.Info11.Shop12", "");
		config.set("Lore.Shop12", info11Shop12);

		config.addDefault("Lore.Info11.Shop13", "");
		config.set("Lore.Shop13", info11Shop13);

		config.addDefault("Lore.Info11.Shop14", "");
		config.set("Lore.Shop14", info11Shop14);

		config.addDefault("Lore.Info11.Shop15", "");
		config.set("Lore.Shop15", info11Shop15);

		config.addDefault("Lore.Info11.Shop16", "");
		config.set("Lore.Shop16", info11Shop16);

		config.addDefault("Lore.Info11.Shop17", "");
		config.set("Lore.Shop17", info11Shop17);

		config.addDefault("Lore.Info11.Shop18", "");
		config.set("Lore.Shop18", info11Shop18);

		config.options().copyDefaults(true);
		try {
			config.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
