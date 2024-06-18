package com.swades.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path = "C:\\Users\\mdkam\\Desktop\\Automation Testing\\SWADES_Project\\Configuration\\Config.properties";
	public ReadConfig() {
		
		try {
		properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getbaseUrl() {
		String value = properties.getProperty("baseUrl");
		 if (value != null)
			 return value;
		 else
			 throw new RuntimeException("url not specified in config file");
	}
	
	//Master
	/*public String getbaseUrlMaster() {
		String value = properties.getProperty("baseUrlMaster");
		 if (value != null)
			 return value;
		 else
			 throw new RuntimeException("browser not specified in config file");
	}
	//Rainfall
	public String getbaseUrlRain() {
		String value = properties.getProperty("baseUrlRain");
		 if (value != null)
			 return value;
		 else
			 throw new RuntimeException("browser not specified in config file");
	}
	*/

}
