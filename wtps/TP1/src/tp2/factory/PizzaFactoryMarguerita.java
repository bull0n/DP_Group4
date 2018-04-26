package tp2.factory;

import tp2.concrete.PizzaThin;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorOregano;
import tp2.decorator.ingredient.DecoratorPepper;
import tp2.decorator.ingredient.DecoratorPepperoni;
import tp2.decorator.sauce.DecoratorTomato;

public class PizzaFactoryMarguerita extends PizzaFactory_A{
	
	public PizzaFactoryMarguerita() {
		super();
		this.pizza = PizzaThin.class;
		this.sauce = DecoratorTomato.class;
		this.listIngredient.add(DecoratorMozzarella.class);
		this.listIngredient.add(DecoratorOregano.class);
	}
	
}
