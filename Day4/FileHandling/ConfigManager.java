package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
//Reading and Writing properties files

// Managing user or application on centralized file
public class ConfigManager {
	
	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		// Write config to property files
		
		try(FileOutputStream out = new FileOutputStream("config.properties")){
			
			props.setProperty("username","admin");
			props.setProperty("theme","dark");
			props.store(out,"App cofiguration");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream in = new FileInputStream("config.properties")){
			
			props.load(in);
			System.out.println("Username : " + props.getProperty("username"));
			System.out.println("Theme : " + props.getProperty("theme"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
