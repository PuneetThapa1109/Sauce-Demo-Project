package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_Config {

	Properties Pro;

	public Read_Config() {

		File src = new File("./Configuration/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			Pro = new Properties();
			Pro.load(fis);
		} catch (Exception e) {

			System.out.println("The exception is " + e.getMessage());
		}

	}

	public String URL() {
		String url = Pro.getProperty("baseURL");
		return url;
	}

	public String Username() {
		String username = Pro.getProperty("username");
		return username;
	}

	public String Password() {
		String pass = Pro.getProperty("password");
		return pass;
	}

	public String Browser() {
		String chrome = Pro.getProperty("chromepath");
		return chrome;
	}

	public String first_name() {
		String fname = Pro.getProperty("first_name");
		return fname;
	}

	public String last_name() {
		String lname = Pro.getProperty("last_name");
		return lname;
	}

	public String zip_code() {
		String z_code = Pro.getProperty("zip_code");
		return z_code;
	}

}
