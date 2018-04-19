package tp1.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class Machine extends PartComposite implements Serializable {
	private static final long serialVersionUID = -4131418366537245416L;

	public Machine() {
	}

	public Dimension3D getDimensions() {
		Dimension3D total = new Dimension3D(0, 0, 0);

		for (PartComponent p : this.parts) {
			Dimension3D pd = p.getDimensions();
			double x = total.x + pd.x;
			double y = Math.max(total.y, pd.y);
			double z = Math.max(total.z, pd.z);
			total = new Dimension3D(x, y, z);
		}

		return total;
	}

	public String toString() {
		return "Machine{\n " + this.parts.toString() + "\n " + "dimensions=" + getDimensions() + "\n " + "weight="
				+ getWeight() + "\n}";
	}

}
