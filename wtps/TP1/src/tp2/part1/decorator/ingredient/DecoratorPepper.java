package tp2.part1.decorator.ingredient;

import tp2.enums.Aromas;
import tp2.enums.Tastes;
import tp2.part1.Pizza_I;

public class DecoratorPepper extends DecoratorIngredient {
	
	public DecoratorPepper(Pizza_I pizza) {
		super(pizza);
		this.taste = Tastes.NOT_GOOD;
		this.aroma = Aromas.SAVOURY;
		this.price = 0.001f;
	}

	@Override
	public float getPrice() {
		return this.pizza.getPrice()+ this.price * (float)this.pizza.getSize();
	}

	@Override
	public boolean isSpicy() {
		return true;
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
		return this.pizza.toString() + " mushroom";
	}

	
}
