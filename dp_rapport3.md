---
title: Rapport TP3 - Design Pattern
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

# TP3 - Rapport

## Introduction
Pour ce Travail Pratique, il a été demandé d'améliorer le TP n°2 afin d'ajouter une abstract factory pour la création de Pizza.

Une Factory pour divers type de pizza était demandé :
 - Catania
 - Margherita
 - Palerma
 - Profunghi

 Les décorateurs des ingrédients supplémentaires ont été rajouté avant de commencer le travail sur les Factory.


## Abstract factory
Abstract factory est un pattern qui permet de déleguer la construction d'objets complexes à une autre classe.

### Réalisation
Nous avons couplé l'implémentation de ce pattern avec le pattern Builder que nous avions implémenté lors du TP n°2.

#### Exemple de code
Voici le code de l'`Abstract Factory`, son fonctionnement est très simple.

```java
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
```

Voici l'implémentation d'une `concrete factory`, dans ce cas Margherita.

```Java
public class PizzaFactoryMargherita extends PizzaFactory_A{

	public PizzaFactoryMargherita() {
		super();
		this.pizza = PizzaThin.class;
		this.sauce = DecoratorTomato.class;
		this.listIngredient.add(DecoratorMozzarella.class);
		this.listIngredient.add(DecoratorOregano.class);
	}
}
```

#### Diagramme de classe

![Schema de classe](factory.png)

### Conclusion
L'objectif est atteint. A l'aide de ce patron, nous avons la possibilité de passer une factory à notre "Pizzaiolo" qui va l'utiliser afin de réalsier de nouvelle pizzas.
Ce patron s'avère très utile car il permet de simplifier le code du client qui va utiliser notre code pour la création de pizza, il n'a plus à se soucier de comment la Pizza doit être créée ni de son implémentation.