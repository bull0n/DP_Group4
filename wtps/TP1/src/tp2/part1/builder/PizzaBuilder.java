package tp2.part1.builder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import tp2.part1.Pizza_I;
import tp2.part1.decorator.ingredient.DecoratorIngredient;
import tp2.part1.decorator.sauce.DecoratorSauce;

public class PizzaBuilder {
	
	public PizzaBuilder(Class<? extends Pizza_I> c) throws InstantiationException, IllegalAccessException {
		listIngredient = new ArrayList<Class<? extends DecoratorIngredient>>();
		pizza = (Pizza_I) c.newInstance();
	}

	public <SauceClass extends DecoratorSauce> void sauce(Class<SauceClass> sauce) {
		this.sauce = sauce;
	}

	public void addIngredient(Class<DecoratorIngredient> ingredient) {
		if(!listIngredient.contains(ingredient)) {
			this.listIngredient.add(ingredient);
		}
	}

	public void setSize(int radius) {
		this.radius = radius;
	}

	public Pizza_I getPizza() {
		Pizza_I pizza = new Pizza
		pizza.setSize();
		//Build
		try {
			pizza = (Pizza_I)sauce.getDeclaredConstructor(sauce).newInstance(pizza);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	//Input
	int radius;
	Class<? extends DecoratorSauce> sauce;
	List<Class<? extends DecoratorIngredient>> listIngredient;
}
