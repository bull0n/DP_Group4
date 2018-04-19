package tp2;

import tp2.concrete.PizzaThick;
import tp2.decorator.ingredient.DecoratorBacon;
import tp2.decorator.ingredient.DecoratorHam;
import tp2.decorator.ingredient.DecoratorMozzarella;
import tp2.decorator.ingredient.DecoratorMushroom;
import tp2.decorator.sauce.DecoratorTomato;

public class Client1 {
	public static void main(String[] args) {
		main();
	}
	
	public static void main() {
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
}
