package tp2.part1.decorator.sauce;

import tp2.part1.Pizza_I;

public class DecoratorCream extends DecoratorSauce {

	@Override
	public float getPrice() {
		return this.pizza.getPrice() + (float)this.pizza.getSize()*0.04f;
	}

	@Override
	public boolean isSpicy() {
		return this.pizza.isSpicy();
	}

	@Override
	public float getLactose() {
		return this.pizza.getLactose() + (float)this.pizza.getSize() * 0.1f;
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
		return this.pizza.getAroma() + " savory";
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " cream";
	}

	public DecoratorCream(Pizza_I pizza) {
		super(pizza);
	}


}
