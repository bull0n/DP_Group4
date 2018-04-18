package tp2.builder;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorPepper;
import tp2.decorator.ingredient.DecoratorPepperoni;
import tp2.decorator.sauce.DecoratorTomato;

public class BuilderPizzaDiavola extends BuilderPizza_A {

	public BuilderPizzaDiavola() {
		this.setThickness(PizzaThick.class);
		this.setSize(18);
		this.sauce(DecoratorTomato.class);
		this.addIngredient(DecoratorMozzarella.class);
		this.addIngredient(DecoratorPepperoni.class);
		this.addIngredient(DecoratorPepper.class);
	}
}
