package tp1.database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tp1.parts.Machine;

public class Storage {
	final private String fileName;

	public Storage() {
		Config config = new Config();
		fileName = config.getDatabase();
	}

	public Storage(String fileName) {
		this.fileName = fileName;
	}

	public Machine load() {
		Machine ret = null;

		try (FileInputStream file = new FileInputStream(fileName)) {
			try (ObjectInputStream input = new ObjectInputStream(file)) {
				Object o = input.readObject();
				if (!(o instanceof Machine))
					throw new IOException("file " + fileName + " does not contain a Machine");
				ret = (Machine) o;
			}
		} catch (Exception ex) {
			ret = null;
		}

		return ret;
	}

	public void save(Machine machine) {
		try (FileOutputStream file = new FileOutputStream(fileName)) {
			try (ObjectOutputStream output = new ObjectOutputStream(file)) {
				output.writeObject(machine);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
