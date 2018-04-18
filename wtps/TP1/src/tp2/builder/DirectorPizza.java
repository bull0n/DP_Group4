package tp2.builder;

import tp2.Pizza_I;

public class DirectorPizza {

	public DirectorPizza(BuilderPizza_A builderPizza) {
		this.builderPizza = builderPizza;
	}

	private BuilderPizza_A builderPizza;

	public void setMonteurPizza(BuilderPizza_A builderPizza) {
		this.builderPizza = builderPizza;
	}

	public Pizza_I getPizza() {
		return builderPizza.getPizza();
	}

	public void buildPizza() {
		builderPizza.createNewPizza();
		builderPizza.buildSauce();
		builderPizza.buildIngredients();
	}
}
