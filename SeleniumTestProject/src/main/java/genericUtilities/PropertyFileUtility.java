package genericUtilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\PropertiesFile\\environment.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("phoneNumber"));
		System.out.println(p.getProperty("country"));
	}

}
