package tp1.parts;

import java.io.Serializable;

public class Part implements Serializable, PartComponent {
	private static final long serialVersionUID = -8298269984120412487L;
	final private String name;
	final private Dimension3D dimensions;
	final private double weight;

	public Part(String name, Dimension3D dimensions, double weight) {
		this.name = name;
		this.dimensions = dimensions;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public Dimension3D getDimensions() {
		return this.dimensions;
	}
	
	public double getVolume() {
		return this.dimensions.x * this.dimensions.y * this.dimensions.z;
	}
	
	@Override
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return "Part[" + this.name + "," + this.dimensions + "," + this.weight + "]";
	}
}
