package com.npntraining.pageobjects.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ORPropertyReader {

	public static String ORPropReader(String Key) throws IOException
	{
		String Propval="";
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\eclipse-java-2018-12-R-win32-x86_64\\mavennpn\\src\\main\\resources\\OR.properties");
		prop.load(fis);
		Propval=prop.getProperty(Key);
		
		return Propval;
		
	}
}
