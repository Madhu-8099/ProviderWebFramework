package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtilities 
{
	public static String getvalueForKey(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./PropertiesFile/environment.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
