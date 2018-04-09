package tp2.part1.decorator;

import tp2.part1.Pizza_I;

public abstract class Decorator implements Pizza_I {

	@Override
	public abstract float getPrice();

	@Override
	public abstract boolean isSpicy();

	@Override
	public abstract float getLactose();

	@Override
	public abstract boolean isVegetarian();

	@Override
	public int getSize() {
		return this.pizza.getSize();
	}

	@Override
	public abstract String getTaste();

	@Override
	public abstract String getAroma();

	@Override
	public abstract String toString();

	public Decorator(Pizza_I pizza) {
		this.pizza = pizza;
	}

	protected Pizza_I pizza;
}
