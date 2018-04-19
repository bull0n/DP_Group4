package tp2.concrete;

public class PizzaThick extends PizzaBase {
	public PizzaThick(int size) {
		super(size);
	}

	@Override
	public String toString() {
		return super.toString() + "Thick Pizza";
	}

	@Override
	public float getPrice() {
		return this.getSize() * this.PRICE;
	}
	
	protected final float PRICE = 1.5f;

}
