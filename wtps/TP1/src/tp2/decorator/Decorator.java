package tp2.decorator;

import tp2.Pizza_I;
import tp2.enums.Aromas;
import tp2.enums.Tastes;

public abstract class Decorator implements Pizza_I {

	public Decorator(Pizza_I pizza) {
		this.pizza = pizza;
	}
	
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

	protected Pizza_I pizza;
	protected Aromas aroma;
	protected Tastes taste;
}
