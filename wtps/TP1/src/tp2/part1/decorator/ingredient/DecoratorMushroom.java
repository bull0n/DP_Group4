package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorMushroom extends DecoratorIngredient {

	@Override
	public float getPrice() {
		return this.pizza.getPrice()+2;
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
	public int getSize() {
		return this.pizza.getSize();
	}

	@Override
	public String getTaste() {
		return this.pizza.getTaste() + " not good";
	}

	@Override
	public String getAroma() {
		return this.pizza.getAroma() + " savoury";
	}

	public DecoratorMushroom(Pizza_I pizza) {
		this.pizza = pizza;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
