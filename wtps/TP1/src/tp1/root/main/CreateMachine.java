package tp1.root.main;

import tp1.root.database.Config;
import tp1.root.database.Storage;
import tp1.root.parts.AssembledPart;
import tp1.root.parts.Dimension3D;
import tp1.root.parts.Machine;
import tp1.root.parts.Part;

public class CreateMachine {

	private static String DATA_FILE = "machine.dat";

	public static void main(String[] args) {
		createConfigFile();

		Storage s = new Storage(DATA_FILE);
		System.out.println("Will create a Machine.");
		Machine m = createRandomMachine();
		System.out.println("Created Machine.");
		System.out.println(m);
		s.save(m);
		System.out.println("Machine stored.");
		
	}

	private static void createConfigFile() {
		System.out.println("Creating configuration file...");
		Config c = new Config();
		c.setDatabase(DATA_FILE);
		c.setUsername("golum");
		c.setPassword("myprecious");
		c.save();
	}

	private static Dimension3D createRandomDimension(double min) {
		double x = min + (int) (Math.random() * 5);
		double y = min + (int) (Math.random() * 5);
		double z = min + (int) (Math.random() * 5);
		return new Dimension3D(x, y, z);
	}
	
	private static Part createRandomPart() {
		String tab[] = {"Latch", "Transformer", "Gage", "Screw", "Shaft", "Belt", "Clamp", "Nut", "Spring" };
		int partnum = (int) (Math.random() * tab.length);
		double w = 1 + (int) (Math.random() * 10) / 10.;
		return new Part(tab[partnum], createRandomDimension(1), w);
	}

	private static final int NUM_PARTS = 3;
	private static final int NUM_ASSEMBLED_PARTS = 1;
	private static final int NUM_PARTS_ASSEMBLED = 2;

	private static Machine createRandomMachine() {
		System.out.println("Creating a Machine...");
		Machine m = new Machine();

		for (int i=0; i<NUM_PARTS; i++)
			m.addPart(createRandomPart());

		for (int i=0; i<NUM_ASSEMBLED_PARTS; i++) {
			AssembledPart ap = new AssembledPart(createRandomDimension(10));
			for (int j=0; j<NUM_PARTS_ASSEMBLED; j++)
				ap.addPart(createRandomPart());
			m.addAssembledPart(ap);
		}
		return m;
	}

}
