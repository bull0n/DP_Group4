package tp2.factory;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorBroccoli;
import tp2.decorator.ingredient.DecoratorPotato;
import tp2.decorator.ingredient.DecoratorSausage;
import tp2.decorator.sauce.DecoratorTomato;

public class PizzaFactoryCatania extends PizzaFactory_A {

	public PizzaFactoryCatania() {
		super();
		this.pizza = PizzaThick.class;
		this.sauce = DecoratorTomato.class;
		this.listIngredient.add(DecoratorPotato.class);
		this.listIngredient.add(DecoratorSausage.class);
		this.listIngredient.add(DecoratorBroccoli.class);
	}

}
