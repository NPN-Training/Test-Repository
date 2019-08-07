package com.npntraining.pageobjects.utility;

import java.io.IOException;
import java.util.Properties;

public class ConfigTestReader {

	public static String configReader(String key) throws IOException
	{
		Properties prop=new Properties();
		String Propvalue="";
		prop.load(ClassLoader.getSystemResourceAsStream("ConfigTest.properties"));
		Propvalue=prop.getProperty(key);
		return Propvalue;
		
	}
}
