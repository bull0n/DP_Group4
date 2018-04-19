package tp1.parts;

public interface PartComponent {

	public default void add(PartComponent partComponent) throws Exception {
		throw new Exception("Can't add a child in a leaf");
	}

	public default void remove(PartComponent partComponent) throws Exception {
		throw new Exception("Can't remove in a leaf");
	}

	public default PartComponent getChild(int nChild) throws Exception {
		throw new Exception("It's a leaf!");
	}

	public double getWeight();

	public Dimension3D getDimensions();

	public String toString();

}
