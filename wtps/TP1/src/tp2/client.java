package tp2;

import tp2.builder.BuilderPizza;
import tp2.concrete.PizzaThick;
import tp2.concrete.PizzaThin;
import tp2.decorator.ingredient.DecoratorBacon;
import tp2.decorator.ingredient.DecoratorHam;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorMushroom;
import tp2.decorator.ingredient.DecoratorOregano;
import tp2.decorator.ingredient.DecoratorPepper;
import tp2.decorator.ingredient.DecoratorPepperoni;
import tp2.decorator.sauce.DecoratorTomato;
import tp2.state.ContextPizza;

public class client {

	public static void main(String[] args) {

		part1And2();
		part3();
	}
	
	public static void part1And2() {
		try {
			// Margherita : sauce tomate, mozzarella, and origan			
			BuilderPizza margueritaBuilder = new BuilderPizza();
			margueritaBuilder.setThickness(PizzaThick.class);
			margueritaBuilder.setSize(45);
			margueritaBuilder.sauce(DecoratorTomato.class);
			margueritaBuilder.addIngredient(DecoratorMozzarella.class);
			margueritaBuilder.addIngredient(DecoratorOregano.class);
	
			// Profunghi : sauce tomate, mozzarella, jambon, champignon
			BuilderPizza profunghiBuilder = new BuilderPizza();
			profunghiBuilder.setThickness(PizzaThin.class);
			profunghiBuilder.setSize(20);
			profunghiBuilder.sauce(DecoratorTomato.class);
			profunghiBuilder.addIngredient(DecoratorMozzarella.class);
			profunghiBuilder.addIngredient(DecoratorHam.class);
			profunghiBuilder.addIngredient(DecoratorMushroom.class);
			
			// Diavola : sauce tomate, mozzarella, salami piquant, piment
			BuilderPizza diavolaBuilder = new BuilderPizza();
			diavolaBuilder.setThickness(PizzaThick.class);
			diavolaBuilder.setSize(18);
			diavolaBuilder.sauce(DecoratorTomato.class);
			diavolaBuilder.addIngredient(DecoratorMozzarella.class);
			diavolaBuilder.addIngredient(DecoratorPepperoni.class);
			diavolaBuilder.addIngredient(DecoratorPepper.class);
	
			Pizza_I marguerita = margueritaBuilder.getPizza();
			Pizza_I profunghi = profunghiBuilder.getPizza();
			Pizza_I diavola = diavolaBuilder.getPizza();
			
			System.out.println(marguerita);
			System.out.println(profunghi);
			System.out.println(diavola);
			
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
		}catch(Exception e) {
			//Nothing
		}
	}
	
	public static void part3() {
		// Margherita : sauce tomate, mozzarella, and origan			
		BuilderPizza margueritaBuilder = new BuilderPizza();
		margueritaBuilder.setThickness(PizzaThick.class);
		margueritaBuilder.setSize(45);
		margueritaBuilder.sauce(DecoratorTomato.class);
		margueritaBuilder.addIngredient(DecoratorMozzarella.class);
		margueritaBuilder.addIngredient(DecoratorOregano.class);
		
		Pizza_I marguerita = margueritaBuilder.getPizza();
		
		// Contexte pizza
		ContextPizza pizzaContext = new ContextPizza(marguerita);
		
		printPizzaContext(pizzaContext);
		try {
			pizzaContext.prepare();
		} catch (Exception e) {
			e.printStackTrace();
		}
		printPizzaContext(pizzaContext);
		try {
			pizzaContext.cook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		printPizzaContext(pizzaContext);
		try {
			pizzaContext.cook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		printPizzaContext(pizzaContext);
		
	}
	
	public static void printPizzaContext(ContextPizza pizzaContext)
	{
		try {
		System.out.println("---------------------------------------------------------------------");
		System.out.println(pizzaContext.getState());
		System.out.println("---------------------------------------------------------------------");
		System.out.println(pizzaContext);
		System.out.println(pizzaContext.getLactose());
		System.out.println(pizzaContext.getTaste());
		System.out.println(pizzaContext.getAroma());
		System.out.println("---------------------------------------------------------------------");
		}catch(Exception e) {
			
		}
	}

}
