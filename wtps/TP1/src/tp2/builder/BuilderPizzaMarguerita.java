package tp2.builder;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorOregano;
import tp2.decorator.sauce.DecoratorTomato;

public class BuilderPizzaMarguerita extends BuilderPizza_A {

	public BuilderPizzaMarguerita() {
		this.setThickness(PizzaThick.class);
		this.setSize(45);
		this.sauce(DecoratorTomato.class);
		this.addIngredient(DecoratorMozzarella.class);
		this.addIngredient(DecoratorOregano.class);
	}
}
