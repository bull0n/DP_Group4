package tp2;

import tp2.builder.PizzaBuilder;
import tp2.builder.PizzaBuilderDiavola;
import tp2.builder.PizzaBuilderMarguerita;
import tp2.builder.PizzaBuilderProfunghi;
import tp2.builder.PizzaBuilder_I;
import tp2.builder.PizzaDirector;
import tp2.concrete.PizzaThick;
import tp2.concrete.PizzaThin;
import tp2.decorator.ingredient.DecoratorBacon;
import tp2.decorator.ingredient.DecoratorHam;
import tp2.decorator.ingredient.DecoratorOregano;
import tp2.decorator.sauce.DecoratorCream;

public class Client2 {
	public static void main(String[] args) {
		main();
	}

	public static void main() {
		System.out.println("\n\n-------------------------------- PART 2 --------------------------------\n");

		PizzaBuilder_I builderMarguerita = new PizzaBuilderMarguerita();
		PizzaBuilder_I builderDiavola = new PizzaBuilderDiavola();
		PizzaBuilder_I builderProfunghi = new PizzaBuilderProfunghi();

		PizzaBuilder_I builderAdapted = new PizzaBuilderDiavola();
		builderAdapted.setSize(45);
		builderAdapted.setThickness(PizzaThin.class);
		builderAdapted.addIngredient(DecoratorBacon.class);

		PizzaBuilder_I builderCustom = new PizzaBuilder();
		builderCustom.setSize(18);
		builderCustom.setThickness(PizzaThick.class);
		builderCustom.sauce(DecoratorCream.class);
		builderCustom.addIngredient(DecoratorBacon.class);
		builderCustom.addIngredient(DecoratorHam.class);
		builderCustom.addIngredient(DecoratorOregano.class);

		PizzaDirector pizzaDirector = new PizzaDirector(builderMarguerita);
		Pizza_I marguerita = pizzaDirector.getPizza();
		
		pizzaDirector.setPizzaBuilder(builderProfunghi);
		Pizza_I profunghi = pizzaDirector.getPizza();

		pizzaDirector.setPizzaBuilder(builderDiavola);
		Pizza_I diavola = pizzaDirector.getPizza();

		pizzaDirector.setPizzaBuilder(builderAdapted);
		Pizza_I diavolaAdapted = pizzaDirector.getPizza();
		
		pizzaDirector.setPizzaBuilder(builderCustom);
		Pizza_I custom = pizzaDirector.getPizza();

		System.out.println(marguerita);
		System.out.println(profunghi);
		System.out.println(diavola);
		System.out.println(diavolaAdapted);
		System.out.println(custom);
	}
}
