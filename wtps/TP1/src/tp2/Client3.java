package tp2;

import tp2.builder.PizzaBuilder;
import tp2.builder.PizzaBuilderMarguerita;
import tp2.state.ContextPizza;
import tp2.state.StateOrdered;

public class Client3 {
	public static void main(String[] args) {
		main();
	}

	public static void main() {
		System.out.println("\n\n-------------------------------- PART 3 --------------------------------\n");

		// Margherita : sauce tomate, mozzarella, and origan
		PizzaBuilder builder = new PizzaBuilderMarguerita();
		Pizza_I marguerita = builder.getPizza();

		// Contexte pizza
		ContextPizza contextPizza = new ContextPizza(marguerita, new StateOrdered());

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
