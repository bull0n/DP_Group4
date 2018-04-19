package tp2.builder;

import tp2.concrete.PizzaThin;
import tp2.decorator.ingredient.DecoratorHam;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorMushroom;
import tp2.decorator.sauce.DecoratorTomato;

public class PizzaBuilderProfunghi extends PizzaBuilder {

	public PizzaBuilderProfunghi() {
		super();
		this.setThickness(PizzaThin.class);
		this.setSize(20);
		this.sauce(DecoratorTomato.class);
		this.addIngredient(DecoratorMozzarella.class);
		this.addIngredient(DecoratorHam.class);
		this.addIngredient(DecoratorMushroom.class);
	}
}
