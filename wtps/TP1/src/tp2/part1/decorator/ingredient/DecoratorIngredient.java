package tp2.part1.decorator.ingredient;

import tp2.part1.Pizza_I;
import tp2.part1.decorator.Decorator;

public abstract class DecoratorIngredient extends Decorator {
	
	public DecoratorIngredient(Pizza_I pizza)
	{
		super(pizza);
	}
	
	protected float price;
}
