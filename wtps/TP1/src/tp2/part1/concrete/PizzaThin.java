package tp2.part1.concrete;

public class PizzaThin extends Pizza {

	public PizzaThin(int size) {
		super(size);
	}
	@Override
	public float getPrice() {
		return this.getSize() * this.price;
	}
	@Override
	public String toString() {
		return "Thin Pizza";
	}
}
