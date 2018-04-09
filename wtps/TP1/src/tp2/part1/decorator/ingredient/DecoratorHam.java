package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorHam extends DecoratorIngredient {

	public DecoratorHam(Pizza_I pizza) {
		super(pizza);
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSpicy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getLactose() {
		// TODO Auto-generated method stub
		return 0;
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
