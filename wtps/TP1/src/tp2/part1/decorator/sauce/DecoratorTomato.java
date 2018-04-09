package tp2.part1.decorator.sauce;

import tp2.enums.Aromas;
import tp2.enums.Tastes;
import tp2.part1.Pizza_I;

public class DecoratorTomato extends DecoratorSauce {
	
	public DecoratorTomato(Pizza_I pizza) {
		super(pizza);
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
	public float getLactose() {
		return this.pizza.getLactose();
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
		return this.pizza.toString() + " tomato sauce";
	}
}
