package tp2.builder;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorPepper;
import tp2.decorator.ingredient.DecoratorPepperoni;
import tp2.decorator.sauce.DecoratorTomato;

public class PizzaBuilderDiavola extends PizzaBuilder {

	public PizzaBuilderDiavola() {
		super();
		this.setSize(18);
		this.setThickness(PizzaThick.class);
		this.sauce(DecoratorTomato.class);
		this.addIngredient(DecoratorMozzarella.class);
		this.addIngredient(DecoratorPepperoni.class);
		this.addIngredient(DecoratorPepper.class);
	}
}
