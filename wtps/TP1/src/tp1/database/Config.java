package tp1.database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Config {
	private String propertyFileName = null;
	private String database = null;
	private String username = null;
	private String password = null;

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private void load() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(propertyFileName);
			prop.load(input);
			database = prop.getProperty("database");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (IOException ex) {
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public void save() {
		Properties prop = new Properties();
		OutputStream output = null;
		try {
			output = new FileOutputStream(propertyFileName);
			prop.setProperty("database", database);
			prop.setProperty("username", username);
			prop.setProperty("password", password);
			prop.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private Config() {
		this("config.properties");
	}

	private Config(String file) {
		propertyFileName = file;
		load();
	}
	
	
	public String toString() {
		return "db://" + username + ":" + password + "@" + database;
	}

	public static Config getConfig() {
		if (Config.instance == null) {
			Config.instance = new Config();
		}
		return Config.instance;
	}

	private static Config instance = null;
}
