package tp2.part1.builder;

import tp2.part1.concrete.PizzaThin;
import tp2.part1.decorator.ingredient.DecoratorHam;
import tp2.part1.decorator.ingredient.DecoratorMozzarella;
import tp2.part1.decorator.ingredient.DecoratorMushroom;
import tp2.part1.decorator.ingredient.DecoratorOrigan;
import tp2.part1.decorator.ingredient.DecoratorPepper;
import tp2.part1.decorator.ingredient.DecoratorSpicySalami;
import tp2.part1.decorator.sauce.DecoratorTomato;

public class UsePizzaBuilder {

	public void main(String[] args) {
		main();
	}

	public void main() {

		try {
			// Margherita : sauce tomate, mozzarella, and origan			
			PizzaBuilder margueritaBuilder = new PizzaBuilder(PizzaThin.class);
			margueritaBuilder.setSize(45);
			margueritaBuilder.sauce(DecoratorTomato.class);
			margueritaBuilder.addIngredient(DecoratorMozzarella.class);
			margueritaBuilder.addIngredient(DecoratorOrigan.class);

			// Profunghi : sauce tomate, mozzarella, jambon, champignon
			PizzaBuilder profunghiBuilder = new PizzaBuilder(PizzaThin.class);
			profunghiBuilder.setSize(20);
			profunghiBuilder.sauce(DecoratorTomato.class);
			profunghiBuilder.addIngredient(DecoratorMozzarella.class);
			profunghiBuilder.addIngredient(DecoratorHam.class);
			profunghiBuilder.addIngredient(DecoratorMushroom.class);
			
			// Diavola : sauce tomate, mozzarella, salami piquant, piment
			PizzaBuilder diavolaBuilder = new PizzaBuilder(PizzaThin.class);
			diavolaBuilder.setSize(18);
			diavolaBuilder.sauce(DecoratorTomato.class);
			diavolaBuilder.addIngredient(DecoratorMozzarella.class);
			diavolaBuilder.addIngredient(DecoratorSpicySalami.class);
			diavolaBuilder.addIngredient(DecoratorPepper.class);

		} catch (Exception e) {
			System.out.println("Error during pizza cooking");
			e.printStackTrace();
		}

	}

}
