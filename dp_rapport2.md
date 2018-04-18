---
title: Rapport TP2 - Design Pattern
lang: fr
author:
- Fleury Malik - <malik.fleury@he-arc.ch>
- Wermeille Bastien - <bastien.wermeille@he-arc.ch>
- Bulloni Lucas - <lucas.bulloni@he-arc.ch>
date: \today
pagesize: A4
toc: true
toc-depth: 5
numbersections: true
---

# TP2 - Rapport

## Decorator
### Identification
La class ``
### Réalisation
Pour réaliser ce design pattern, nous avons créé une interface `Pizza_I` afin de définir les fonctions disponibles pour une pizza. Nous avons également créé une class abstraite `Decorator` implémentant l'interface `Pizza_I`. Cette classe contient 3 attributs, 1 Pizza_I, l'élément qu'il décore ainsi que 2 énumérés `Aroma` et `Taste`

```java
code here
```

### Conclusion
#### Diagramme de classe

## Builder
### Identification
### Implémentation
```java
code here
```

### Conclusion
#### Diagramme de classe

## State
### Réalisation
Pour mettre en place de ce patron, nous avons créé une interface "State_I" qui comporte toutes les méthodes relatives aux états de la pizza. Ensuite, plusieurs classes d'état ont été créées sous les noms suivants :
- "StateOrderer" : état commandé
- "StatePrepared" : état préparé
- "StateCooked" : état cuit
- "StateOvercooked" : état râté
Tous ces états effectue des tâches différentes. La classe "PizzaContext" permet d'adapter le comportement selon l'état du moment de la pizza.

#### Diagramme de class

```java
// Interface d'état
public interface State_I {

	public float getLactose(ContextPizza pizzaContext) throws Exception;

	public String getTaste(ContextPizza pizzaContext) throws Exception;

	public String getAroma(ContextPizza pizzaContext) throws Exception;

	public String toString();

	public void prepare(ContextPizza pizzaContext) throws Exception;

	public void cook(ContextPizza pizzaContext) throws Exception;
}

// Exemple d'implémentation d'un état (état commandé)
public class StateOrdered implements State_I{

	@Override
	public float getLactose(ContextPizza pizzaContext) {
		return LACTOSE;	// Pizza is not ready ...
	}

	@Override
	public String getTaste(ContextPizza pizzaContext) {
		return Tastes.NO_TASTE.toString();
	}

	@Override
	public String getAroma(ContextPizza pizzaContext) {
		return Aromas.NO_AROMA.toString();
	}

	@Override
	public String toString()
	{
		return STATE;
	}

	@Override
	public void prepare(ContextPizza pizzaContext) throws Exception{
		pizzaContext.setState(new StatePrepared());
	}

	@Override
	public void cook(ContextPizza pizzaContext) throws Exception{
		throw new Exception(EXCEPTION_MSG);
	}

	private static float LACTOSE = 0.0f;
	private static String STATE = "state : ordered";
	private static String EXCEPTION_MSG = "Can not be cooked...";
}

// Contexte permettant d'appeler les méthodes selon l'état du moment de la pizza
public class ContextPizza implements Pizza_I{

	public ContextPizza(Pizza_I pizza) {
		this(pizza, new StateOrdered());
	}

	public ContextPizza(Pizza_I pizza, State_I state) {
		this.pizza = pizza;
		this.state = state;
	}

	@Override
	public float getPrice() {
		return pizza.getPrice();
	}

	@Override
	public boolean isSpicy() {
		return pizza.isSpicy();
	}

	@Override
	public float getLactose() throws Exception {
		return state.getLactose(this);
	}

	@Override
	public boolean isVegetarian() {
		return pizza.isVegetarian();
	}

	@Override
	public int getSize() {
		return pizza.getSize();
	}

	@Override
	public String getTaste() throws Exception {
		return state.getTaste(this);
	}

	@Override
	public String getAroma() throws Exception {
		return state.getAroma(this);
	}

	@Override
	public String toString() {
		return state.toString() + " | " + pizza.toString();
	}

	public State_I getState(){
		return state;
	}

	public void setState(State_I state) {
		this.state = state;
	}

	public void prepare() throws Exception{
		state.prepare(this);
	}

	public void cook() throws Exception{
		state.cook(this);
	}

	public Pizza_I getPizza() {
		return pizza;
	}

	private Pizza_I pizza;
	private State_I state;
}
```

### Conclusion
L'objectif est atteint. A l'aide de ce patron, nous avons pu réaliser une structure de programme adéquat pour le changement de comportement de nos objets "Pizza" selon leur état.
Ce patron s'avère très pratique dans de telles situations.
