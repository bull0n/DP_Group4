package tp2.builder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import tp2.Pizza_I;
import tp2.concrete.Pizza;
import tp2.decorator.ingredient.DecoratorIngredient;
import tp2.decorator.sauce.DecoratorSauce;

public class PizzaBuilder {
	
	public PizzaBuilder(Class<? extends Pizza_I> pizza){
		this.pizza = pizza;
		this.listIngredient = new ArrayList<Class<? extends DecoratorIngredient>>();
	}

	public <SauceClass extends DecoratorSauce> void sauce(Class<SauceClass> sauce) {
		this.sauce = sauce;
	}

	public void addIngredient(Class<? extends DecoratorIngredient> ingredient) {
		if(!listIngredient.contains(ingredient)) {
			this.listIngredient.add(ingredient);
		}
	}

	public void setSize(int radius) {
		this.radius = radius;
	}

	public Pizza_I getPizza() {
		//Build
		Pizza_I newPizza = null;
		try {
			//Création de la pizza
			newPizza = (Pizza_I)pizza.getConstructor(int.class).newInstance(this.radius);
			
			//Ajout de la sauce
			newPizza = (Pizza_I)sauce.getConstructor(Pizza_I.class).newInstance(newPizza);
			
			//Ajout des ingrédients
			for(Class<? extends DecoratorIngredient> ingredient : listIngredient) {
				newPizza = (Pizza_I)ingredient.getConstructor(Pizza_I.class).newInstance(newPizza);
			}
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return newPizza;
	}
	
	//Input
	int radius;
	Class<? extends Pizza_I> pizza;
	Class<? extends DecoratorSauce> sauce;
	List<Class<? extends DecoratorIngredient>> listIngredient;
}
