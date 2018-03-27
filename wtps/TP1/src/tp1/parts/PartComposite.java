package tp1.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public abstract class PartComposite implements Serializable, PartComponent {

	public PartComposite() {
		parts = new LinkedList<PartComponent>();
	}

	@Override
	public void add(PartComponent partComponent) throws Exception {
		this.parts.add(partComponent);
	}

	@Override
	public void remove(PartComponent partComponent) throws Exception {
		this.parts.remove(partComponent);
	}

	@Override
	public PartComponent getChild(int nChild) throws Exception {
		if (parts.size() < nChild) {
			throw new IndexOutOfBoundsException("nChild is too big");
		}

		return parts.get(nChild);
	}

	int getNumberOfElements() {
		return this.parts.size();
	}

	public double getWeight() {
		double w = 0;
		for (PartComponent p : parts)
			w += p.getWeight();
		return w;
	}

	protected List<PartComponent> parts;
}
