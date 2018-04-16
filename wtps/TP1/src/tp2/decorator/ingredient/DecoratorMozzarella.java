package tp2.decorator.ingredient;

import tp2.Pizza_I;
import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class DecoratorMozzarella extends DecoratorIngredient {

	public DecoratorMozzarella(Pizza_I pizza) {
		super(pizza);
		this.price = 0.0042f;
		this.aroma = Aromas.SAVOURY;
		this.taste = Tastes.GOOD;
	}

	@Override
	public float getPrice() {
		return this.pizza.getPrice() + (float)this.pizza.getSize() * this.price;
	}

	@Override
	public boolean isSpicy() {
		return this.pizza.isSpicy();
	}

	@Override
	public float getLactose() {
		return this.pizza.getLactose() + (float)this.pizza.getSize() * this.LACTOSE_CONTENT;
	}

	@Override
	public boolean isVegetarian() {
		return this.pizza.isVegetarian();
	}

	@Override
	public String getTaste() {
		return this.pizza.getTaste() + this.taste.toString();
	}

	@Override
	public String getAroma() {
		return this.pizza.getAroma() + this.aroma.toString();
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " mozzarella";
	}
	
	private final float LACTOSE_CONTENT = 0.2f;
}
