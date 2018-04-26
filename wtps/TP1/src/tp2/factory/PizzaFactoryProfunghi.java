package tp2.factory;

import tp2.concrete.PizzaThin;
import tp2.decorator.ingredient.DecoratorHam;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorMushroom;
import tp2.decorator.sauce.DecoratorTomato;

public class PizzaFactoryProfunghi extends PizzaFactory_A {

	public PizzaFactoryProfunghi() {
		super();
		this.pizza = PizzaThin.class;
		this.sauce = DecoratorTomato.class;
		this.listIngredient.add(DecoratorMozzarella.class);
		this.listIngredient.add(DecoratorHam.class);
		this.listIngredient.add(DecoratorMushroom.class);
	}

}
