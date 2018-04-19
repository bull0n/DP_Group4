package tp2.builder;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import tp2.Pizza_I;
import tp2.concrete.PizzaBase;
import tp2.decorator.ingredient.DecoratorIngredient;
import tp2.decorator.sauce.DecoratorSauce;

public class PizzaBuilder implements PizzaBuilder_I {

	public PizzaBuilder() {
		this.listIngredient = new ArrayList<Class<? extends DecoratorIngredient>>();
	}

	@Override
	public void setThickness(Class<? extends PizzaBase> pizza) {
		this.pizza = pizza;
	}

	@Override
	public void sauce(Class<? extends DecoratorSauce> sauce) {
		this.sauce = sauce;
	}

	@Override
	public void addIngredient(Class<? extends DecoratorIngredient> ingredient) {
		if (!listIngredient.contains(ingredient)) {
			this.listIngredient.add(ingredient);
		}
	}

	@Override
	public void setSize(int radius) {
		this.radius = radius;
	}

	@Override
	public Pizza_I getPizza() {
		// Build
		Pizza_I newPizza = null;
		try {
			// Création de la pizza	
			newPizza = (Pizza_I) pizza.getConstructor(int.class).newInstance(this.radius);

			// Ajout de la sauce
			newPizza = (Pizza_I) sauce.getConstructor(Pizza_I.class).newInstance(newPizza);

			// Ajout des ingrédients
			for (Class<? extends DecoratorIngredient> ingredient : listIngredient) {
				newPizza = (Pizza_I) ingredient.getConstructor(Pizza_I.class).newInstance(newPizza);
			}

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return newPizza;
	}

	// Input
	int radius;
	Class<? extends PizzaBase> pizza;
	Class<? extends DecoratorSauce> sauce;
	List<Class<? extends DecoratorIngredient>> listIngredient;
}