package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorMushroom extends DecoratorIngredient {

	@Override
	public float getPrice() {
		return this.pizza.getPrice()+ 0.001f * (float)this.pizza.getSize();
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
		return this.pizza.isVegetarian();
	}

	@Override
	public String getTaste() {
		return this.pizza.getTaste() + " not good";
	}

	@Override
	public String getAroma() {
		return this.pizza.getAroma() + " savoury";
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " mushroom";
	}
	
	public DecoratorMushroom(Pizza_I pizza) {
		super(pizza);
	}


}
