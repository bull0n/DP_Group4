package tp2.factory;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorPepper;
import tp2.decorator.ingredient.DecoratorPepperoni;
import tp2.decorator.sauce.DecoratorTomato;

public class PizzaFactoryDiavola extends PizzaFactory_A{
	
	public PizzaFactoryDiavola() {
		super();
		this.pizza = PizzaThick.class;
		this.sauce = DecoratorTomato.class;
		this.listIngredient.add(DecoratorMozzarella.class);
		this.listIngredient.add(DecoratorPepperoni.class);
		this.listIngredient.add(DecoratorPepper.class);
	}
	
}
