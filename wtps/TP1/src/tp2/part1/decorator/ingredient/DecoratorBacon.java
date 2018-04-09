package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorBacon extends DecoratorIngredient {


	public DecoratorBacon(Pizza_I pizza) {
		super(pizza);
	}

	@Override
	public float getPrice() {
		return this.pizza.getPrice() + (float)this.pizza.getSize() * 0.7f;
	}

	@Override
	public boolean isSpicy() {
		return this.pizza.isSpicy();
	}

	@Override
	public float getLactose() {
		return this.pizza.getLactose();
	}

	@Override
	public boolean isVegetarian() {
		return false;
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
		return this.pizza.toString() + " bacon";
	}


}
