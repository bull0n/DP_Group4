package tp2.builder;

import tp2.Pizza_I;

public class PizzaDirector{

	public PizzaDirector(PizzaBuilder_I pizzaBuilder) {
		this.setPizzaBuilder(pizzaBuilder);
	}
	
	public void setPizzaBuilder(PizzaBuilder_I pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza_I getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	private PizzaBuilder_I pizzaBuilder;
}
