package tp2;

import tp2.builder.BuilderPizzaDiavola;
import tp2.builder.BuilderPizzaMarguerita;
import tp2.builder.BuilderPizzaProfunghi;
import tp2.builder.DirectorPizza;
import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorBacon;
import tp2.decorator.ingredient.DecoratorHam;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorMushroom;
import tp2.decorator.sauce.DecoratorTomato;
import tp2.state.ContextPizza;

public class Client {

	public static void main(String[] args) {
		part1();
		part2();
		part3();
	}

	public static void part1() {
		System.out.println("\n\n-------------------------------- PART 1 --------------------------------\n");
		
		try {
			Pizza_I pizza = new PizzaThick(15);
			Pizza_I sauce = new DecoratorTomato(pizza);
			Pizza_I mozza = new DecoratorMozzarella(sauce);
			Pizza_I ham = new DecoratorHam(mozza);
			Pizza_I bacon = new DecoratorBacon(ham);
			Pizza_I Mushroom = new DecoratorMushroom(bacon);

			System.out.println("Aromas : " + Mushroom.getAroma());
			System.out.println("Tastes : " + Mushroom.getTaste());
			System.out.println("It's spicy! It's " + Mushroom.isSpicy());
			System.out.println("It's for vegeterian! It's " + Mushroom.isVegetarian());
			System.out.println("Pizza & Ingredients : " + Mushroom);
			System.out.println("Price : " + Mushroom.getPrice() + " CHF");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void part2() {
		System.out.println("\n\n-------------------------------- PART 2 --------------------------------\n");
		
		try {
			// Margherita : sauce tomate, mozzarella, and origan
			DirectorPizza director = new DirectorPizza(new BuilderPizzaMarguerita());
			director.buildPizza();
			Pizza_I marguerita = director.getPizza();

			// Profunghi : sauce tomate, mozzarella, jambon, champignon
			director.setMonteurPizza(new BuilderPizzaProfunghi());
			director.buildPizza();
			Pizza_I profunghi = director.getPizza();

			// Diavola : sauce tomate, mozzarella, salami piquant, piment
			director.setMonteurPizza(new BuilderPizzaDiavola());
			director.buildPizza();
			Pizza_I diavola = director.getPizza();

			System.out.println(marguerita);
			System.out.println(profunghi);
			System.out.println(diavola);
		} catch (Exception e) {
			// Nothing
		}
	}

	public static void part3() {
		System.out.println("\n\n-------------------------------- PART 3 --------------------------------\n");
		
		// Margherita : sauce tomate, mozzarella, and origan
		DirectorPizza director = new DirectorPizza(new BuilderPizzaMarguerita());
		director.buildPizza();
		Pizza_I marguerita = director.getPizza();

		// Contexte pizza
		ContextPizza contextPizza = new ContextPizza(marguerita);

		printPizzaContext(contextPizza);
		try {
			contextPizza.prepare();
		} catch (Exception e) {
			e.printStackTrace();
		}
		printPizzaContext(contextPizza);
		try {
			contextPizza.cook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		printPizzaContext(contextPizza);
		try {
			contextPizza.cook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		printPizzaContext(contextPizza);

	}

	public static void printPizzaContext(ContextPizza pizzaContext) {
		try {
			System.out.println("-----------------------------");
			System.out.println(pizzaContext.getState());
			System.out.println("-----------------------------");
			System.out.println(pizzaContext);
			System.out.println(pizzaContext.getLactose());
			System.out.println(pizzaContext.getTaste());
			System.out.println(pizzaContext.getAroma());
			System.out.println("-----------------------------");
		} catch (Exception e) {

		}
	}

}
