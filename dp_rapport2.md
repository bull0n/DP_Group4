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
### Implémentation
Pour mettre en place de ce patron, nous avons créé une interface "State_I" qui comporte toutes les méthodes relatives aux états de la pizza. Ensuite, plusieurs classes d'état ont été créées sous les noms suivants :
- "StateOrderer" : état commandé
- "StatePrepared" : état préparé
- "StateCooked" : état cuit
- "StateOvercooked" : état râté
Tous ces états effectue des tâches différentes. La classe "PizzaContext" permet d'adapter le comportement selon l'état du moment de la pizza.

### Conclusion
L'objectif est atteint. A l'aide de ce patron, nous avons pu réaliser une structure de programme adéquat pour le changement de comportement de nos objets "Pizza" selon leur état.
Ce patron s'avère très pratique dans de telles situations.

```java
code here
```

#### Diagramme de class
