package tp2.factory;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorAnchovy;
import tp2.decorator.ingredient.DecoratorHerbs;
import tp2.decorator.ingredient.DecoratorOnion;
import tp2.decorator.ingredient.DecoratorToma;
import tp2.decorator.ingredient.DecoratorTomato;
import tp2.decorator.sauce.DecoratorCream;

public class PizzaFactoryPalermo extends PizzaFactory_A {

	public PizzaFactoryPalermo() {
		super();
		this.pizza = PizzaThick.class;
		this.sauce = DecoratorCream.class;
		this.listIngredient.add(DecoratorToma.class);
		this.listIngredient.add(DecoratorOnion.class);
		this.listIngredient.add(DecoratorAnchovy.class);
		this.listIngredient.add(DecoratorTomato.class);
		this.listIngredient.add(DecoratorHerbs.class);
	}

}
