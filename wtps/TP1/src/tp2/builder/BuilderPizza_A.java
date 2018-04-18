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

public abstract class BuilderPizza_A {

	public BuilderPizza_A() {
		this.listIngredient = new ArrayList<Class<? extends DecoratorIngredient>>();
	}

	protected void setThickness(Class<? extends Pizza> pizza) {
		this.pizzaBase = pizza;
	}

	protected <SauceClass extends DecoratorSauce> void sauce(Class<SauceClass> sauce) {
		this.sauce = sauce;
	}

	protected void addIngredient(Class<? extends DecoratorIngredient> ingredient) {
		if (!listIngredient.contains(ingredient)) {
			this.listIngredient.add(ingredient);
		}
	}

	protected void setSize(int radius) {
		this.radius = radius;
	}

	public Pizza_I getPizza() {
		return newPizza;
	}
	
	public void createNewPizza() {
		try {
			// Création de la pizza
			newPizza = (Pizza_I) pizzaBase.getConstructor(int.class).newInstance(this.radius);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public void buildSauce(){
		// Ajout de la sauce
		try {
			newPizza = (Pizza_I) sauce.getConstructor(Pizza_I.class).newInstance(newPizza);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public void buildIngredients(){
		// Ajout des ingrédients
		try {
			for (Class<? extends DecoratorIngredient> ingredient : listIngredient) {
				newPizza = (Pizza_I) ingredient.getConstructor(Pizza_I.class).newInstance(newPizza);
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	// Input
	Pizza_I newPizza;
	
	int radius;
	Class<? extends Pizza_I> pizzaBase;
	Class<? extends DecoratorSauce> sauce;
	List<Class<? extends DecoratorIngredient>> listIngredient;


}
