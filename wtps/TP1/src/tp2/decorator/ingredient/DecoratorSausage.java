package tp2.decorator.ingredient;

import tp2.Pizza_I;
import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class DecoratorSausage extends DecoratorIngredient {

	public DecoratorSausage(Pizza_I pizza) {
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
	public float getLactose() throws Exception {
		return this.pizza.getLactose();
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public String getTaste() throws Exception {
		return this.pizza.getTaste() + this.taste.toString();
	}

	@Override
	public String getAroma() throws Exception {
		return this.pizza.getAroma() + this.aroma.toString();
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " sausage";
	}

}