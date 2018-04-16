package tp2.part1.builder;

import tp2.part1.Pizza_I;
import tp2.part1.concrete.PizzaThin;
import tp2.part1.decorator.ingredient.DecoratorMozzarella;
import tp2.part1.decorator.ingredient.DecoratorMushroom;
import tp2.part1.decorator.sauce.DecoratorTomato;

public class UsePizzaBuilder {
	
	public void main(String[] args) {
		main();
	}
	
	public void main() {
		
		try {
			PizzaBuilder marguerita = new PizzaBuilder(PizzaThin.class);
			marguerita.setSize(45);
			marguerita.sauce(DecoratorTomato.class);
			marguerita.addIngredient(DecoratorMozzarella.class);
			marguerita.addIngredient(DecoratorOrigan.class);
			
			
			PizzaBuilder profunghi = new PizzaBuilder(PizzaThin.class);
			profunghi.setSize(20);
			profunghi.sauce(DecoratorTomato.class);
			profunghi.addIngredient(DecoratorMozzarella.class);
			profunghi.addIngredient(DecoratorHam.class);
			profunghi.addIngredient(DecoratorMushroom.class);
			
			
		} catch (Exception e) {
			System.out.println("Error during pizza cooking");
			e.printStackTrace();
		}
		
		
	}
	
}
