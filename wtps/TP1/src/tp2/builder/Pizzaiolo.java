package tp2.builder;

import tp2.Pizza_I;
import tp2.decorator.ingredient.DecoratorIngredient;
import tp2.factory.PizzaFactory_A;

public class Pizzaiolo{
	
	public Pizzaiolo(PizzaFactory_A pizzaFactory) {
		this(pizzaFactory, DIAMETER);
	}
	
	public Pizzaiolo(PizzaFactory_A pizzaFactory, int diameter) {
		this.setPizzaFactory(pizzaFactory,diameter);
	}
	
	public void setPizzaSize(int diameter) {
		pizzaBuilder.setSize(diameter);
	}
	
	public void setPizzaFactory(PizzaFactory_A pizzaFactory) {
		setPizzaFactory(pizzaFactory, DIAMETER);
	}
	
	public void setPizzaFactory(PizzaFactory_A pizzaFactory, int diameter) {
		this.pizzaBuilder = new PizzaBuilder();
		this.pizzaFactory = pizzaFactory;
		
		//Configure PizzaBuilder
		pizzaBuilder.setSize(diameter);
		pizzaBuilder.setThickness(pizzaFactory.getNewThickness());
		pizzaBuilder.sauce(pizzaFactory.getNewSauce());
		for(Class<? extends DecoratorIngredient> ingredient: pizzaFactory.getNewIngredients()) {
			pizzaBuilder.addIngredient(ingredient);
		}
	}
	
	public Pizza_I getPizza() {
		return pizzaBuilder.getPizza();
	}

	private PizzaBuilder_I pizzaBuilder;
	private PizzaFactory_A pizzaFactory;
	
	public static final int DIAMETER = 30;
}
