package tp2.part1.concrete;

public class PizzaThick extends Pizza {
	public PizzaThick(int size) {
		super(size);
	}

	@Override
	public String toString() {
		return super.toString() + "Thick Pizza";
	}

	@Override
	public float getPrice() {
		return this.price*this.getSize();
	}
	
	private final float price = 1.5f;

}
