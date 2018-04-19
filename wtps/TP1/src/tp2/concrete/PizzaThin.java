package tp2.concrete;

public class PizzaThin extends PizzaBase {

	public PizzaThin(int size) {
		super(size);
	}
	
	@Override
	public float getPrice() {
		return this.getSize() * this.PRICE;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Thin Pizza";
	}
}
