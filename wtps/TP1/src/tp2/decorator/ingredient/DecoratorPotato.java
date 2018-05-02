package tp2.decorator.ingredient;

import tp2.Pizza_I;
import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class DecoratorPotato extends DecoratorIngredient {
	
	public DecoratorPotato(Pizza_I pizza) {
		super(pizza);
		this.taste = Tastes.NO_TASTE;
		this.aroma = Aromas.SAVOURY;
		this.price = 0.001f;
	}

	@Override
	public float getPrice() {
		return this.pizza.getPrice()+ this.price * (float)this.pizza.getSize();
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
		return this.pizza.isVegetarian();
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
		return this.pizza.toString() + " potato";
	}

	
}
