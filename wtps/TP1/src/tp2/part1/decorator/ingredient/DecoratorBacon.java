package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;

public class DecoratorBacon extends DecoratorIngredient {

	public DecoratorBacon(Pizza_I pizza) {
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
		//S'il y a du Bacon, ce n'est plus végétarien, pas besoin d'appeler les autres décorators/parents
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
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
