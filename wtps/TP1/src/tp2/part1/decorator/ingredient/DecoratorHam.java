package tp2.part1.decorator.ingredient;

import tp2.enums.Aromas;
import tp2.enums.Tastes;
import tp2.part1.Pizza_I;

public class DecoratorHam extends DecoratorIngredient {

	public DecoratorHam(Pizza_I pizza) {
		super(pizza);
		this.price = 0.5f;
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
		return this.pizza.getLactose();
	}

	@Override
	public boolean isVegetarian() {
		return false;
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
		return this.pizza.toString() + " ham";
	}

}
