package tp2.builder;

import tp2.Pizza_I;
import tp2.concrete.PizzaBase;
import tp2.decorator.ingredient.DecoratorIngredient;
import tp2.decorator.sauce.DecoratorSauce;

public interface PizzaBuilder_I {
	
	public void setThickness(Class<? extends PizzaBase> pizza);

	public void sauce(Class<? extends DecoratorSauce> sauce);

	public void addIngredient(Class<? extends DecoratorIngredient> ingredient);

	public void setSize(int radius);

	public Pizza_I getPizza();
}