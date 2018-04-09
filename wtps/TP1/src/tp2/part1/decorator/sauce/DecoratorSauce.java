package tp2.part1.decorator.sauce;

import tp2.part1.Pizza_I;
import tp2.part1.decorator.Decorator;

public abstract class DecoratorSauce extends Decorator {
	public DecoratorSauce(Pizza_I pizza)
	{
		super(pizza);
	}
}
