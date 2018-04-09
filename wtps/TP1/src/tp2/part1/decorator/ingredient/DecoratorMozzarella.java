package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorMozzarella extends DecoratorIngredient {

	public DecoratorMozzarella(Pizza_I pizza) {
		super(pizza);
	}

	@Override
	public float getPrice() {
		return this.pizza.getPrice() + (float)this.pizza.getSize() * 0.0042f;
	}

	@Override
	public boolean isSpicy() {
		return this.pizza.isSpicy();
	}

	@Override
	public float getLactose() {
		return this.pizza.getLactose() + (float)this.pizza.getSize() * 0.2f;
	}

	@Override
	public boolean isVegetarian() {
		return this.pizza.isVegetarian();
	}

	@Override
	public String getTaste() {
		return this.pizza.getTaste() + " good";
	}

	@Override
	public String getAroma() {
		return this.pizza.getAroma() + " savory";
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " mozzarella";
	}

}
