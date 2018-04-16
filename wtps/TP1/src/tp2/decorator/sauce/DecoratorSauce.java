package tp2.decorator.sauce;

import tp2.Pizza_I;
import tp2.decorator.Decorator;

public abstract class DecoratorSauce extends Decorator {
	public DecoratorSauce(Pizza_I pizza) {
		super(pizza);
	}
}
