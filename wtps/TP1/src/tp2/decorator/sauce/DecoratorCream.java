package tp2.decorator.sauce;

import tp2.Pizza_I;
import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class DecoratorCream extends DecoratorSauce {

	public DecoratorCream(Pizza_I pizza) {
		super(pizza);
		this.taste = Tastes.NOT_GOOD;
		this.aroma = Aromas.SAVOURY;
		this.taste = Tastes.GOOD;
	}
	
	@Override
	public float getPrice() {
		return this.pizza.getPrice();
	}

	@Override
	public boolean isSpicy() {
		return this.pizza.isSpicy();
	}

	@Override
	public float getLactose() throws Exception {
		return this.pizza.getLactose() + (float)this.pizza.getSize() * this.LACTOSE_CONTENT;
	}

	@Override
	public boolean isVegetarian() {
		return this.pizza.isVegetarian();
	}

	@Override
	public String getTaste() throws Exception {
		return this.pizza.getTaste() + this.taste.toString();
	}

	@Override
	public String getAroma() throws Exception {
		return this.pizza.getAroma() + this.aroma.toString();
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " cream";
	}

	private final float LACTOSE_CONTENT = 0.1f;
}
