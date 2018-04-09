package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorMozzarella extends DecoratorIngredient {

	public DecoratorMozzarella(Pizza_I pizza) {
		super(pizza);
	}

	@Override
	public float getPrice() {
		return this.pizza.getPrice() + (float)this.pizza.getSize() * 0.0042f;
	}

	@Override
	public boolean isSpicy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getLactose() {
		return this.pizza.getLactose() + (float)this.pizza.getSize() * 0.2f;
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
