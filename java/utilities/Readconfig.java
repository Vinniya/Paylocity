package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties property;
	
	public Readconfig() {
	
		try {
	File src = new File("./Configuration/config.properties");
	FileInputStream fis = new FileInputStream(src);
	property = new Properties();
		property.load(fis);
	} catch (IOException e) {
		System.out.println("Exception is: "+e.getMessage());
	}
	
	}
	
	public String getApplicationURL() {
		String url = property.getProperty("url");
		return url;			
	}
	
	public String getUsername() {
		String username = property.getProperty("username");
		return username;
				
	}
	
	public String getPassword() {
		String password = property.getProperty("password");
		return password;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
