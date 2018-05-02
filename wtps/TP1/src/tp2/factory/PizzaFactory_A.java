package tp2.factory;

import java.util.ArrayList;
import java.util.List;

import tp2.concrete.PizzaBase;
import tp2.decorator.ingredient.DecoratorIngredient;
import tp2.decorator.sauce.DecoratorSauce;

public abstract class PizzaFactory_A {
	
	public PizzaFactory_A() {
		listIngredient = new ArrayList<>();
	}

	public Class<? extends PizzaBase> getNewThickness(){
		return pizza;
	}

	public Class<? extends DecoratorSauce> getNewSauce(){
		return sauce;
	}

	public List<Class<? extends DecoratorIngredient>> getNewIngredients(){
		return listIngredient;
	}
	
	Class<? extends PizzaBase> pizza;
	Class<? extends DecoratorSauce> sauce;
	List<Class<? extends DecoratorIngredient>> listIngredient;
}
