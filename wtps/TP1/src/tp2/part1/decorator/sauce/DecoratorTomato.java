package tp2.part1.decorator.sauce;

import tp2.part1.Pizza_I;

public class DecoratorTomato extends DecoratorSauce {

	@Override
	public float getPrice() {
		return this.pizza.getPrice() + (float)this.pizza.getSize()*DecoratorTomato.PRICE;
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
		return this.pizza.getTaste() + " bon";
	}

	@Override
	public String getAroma() {
		return this.pizza.getAroma() + " savoury";
	}

	@Override
	public String toString() {
		return this.pizza.toString() + " tomato sauce";
	}
	
	public DecoratorTomato(Pizza_I pizza) {
		super(pizza);
	}
	
	private final static float PRICE = 0.05f;

}
