package tp1.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class AssembledPart extends PartComposite implements Serializable {
	private static final long serialVersionUID = -2805555670934919157L;
	final private Dimension3D dimensions;

	public AssembledPart(Dimension3D dimensions) {
		this.dimensions = dimensions;
	}

	public Dimension3D getDimensions() {
		return this.dimensions;
	}

	public double getVolume() {
		return this.dimensions.x * this.dimensions.y * this.dimensions.z;
	}

	@Override
	public String toString() {
		return "Assembled[" + this.parts.toString() + ":" + this.dimensions + "]";
	}
}
