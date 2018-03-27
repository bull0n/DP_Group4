package tp1.root.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class Machine implements Serializable {
	private static final long serialVersionUID = -4131418366537245416L;
	private final Collection<Part> parts;
	private final Collection<AssembledPart> assembledParts;
	
	public Machine() {
		this.parts = new LinkedList<Part>();
		this.assembledParts = new LinkedList<AssembledPart>();
	}

	public void addPart(Part part) {
		this.parts.add(part);
	}

	public void addAssembledPart(AssembledPart part) {
		this.assembledParts.add(part);
	}

	int getNumberOfElements() {
		return this.parts.size() + this.assembledParts.size();
	}

	public double getWeight() {
		double w = 0;
		for (Part p : parts)
			w += p.getWeight();
		for (AssembledPart p : assembledParts)
			w += p.getWeight();
		return w;
	}

	public Dimension3D getDimensions() {
		Dimension3D total = new Dimension3D(0,0,0);

		for (Part p : parts) {
			Dimension3D pd = p.getDimensions();
			double x = total.x + pd.x;
			double y = Math.max(total.y, pd.y);
			double z = Math.max(total.z, pd.z);
			total = new Dimension3D(x, y, z);
		}

		for (AssembledPart p : assembledParts) {
			Dimension3D pd = p.getDimensions();
			double x = total.x + pd.x;
			double y = Math.max(total.y, pd.y);
			double z = Math.max(total.z, pd.z);
			total = new Dimension3D(x, y, z);
		}
		
		return total;
	}

	public String toString() {
		return "Machine{\n " +
				this.parts.toString() + "\n " +
				this.assembledParts.toString() + "\n " +
				"dimensions=" + getDimensions() + "\n " +
				"weight=" + getWeight() + "\n}";
	}

}
