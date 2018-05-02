package tp2;

import tp2.builder.Pizzaiolo;
import tp2.factory.PizzaFactoryCatania;
import tp2.factory.PizzaFactoryMarguerita;
import tp2.factory.PizzaFactoryPalermo;
import tp2.factory.PizzaFactoryProfunghi;

public class Client {
	public static void main(String[] args) {
		main();
	}

	public static void main() {
		Pizzaiolo pizzaiolo = new Pizzaiolo(new PizzaFactoryMarguerita());
		System.out.println(pizzaiolo.getPizza());
		
		pizzaiolo.setPizzaFactory(new PizzaFactoryProfunghi());
		System.out.println(pizzaiolo.getPizza());
		
		pizzaiolo.setPizzaFactory(new PizzaFactoryPalermo());
		System.out.println(pizzaiolo.getPizza());
		
		pizzaiolo.setPizzaFactory(new PizzaFactoryCatania());
		System.out.println(pizzaiolo.getPizza());
		
	}
}
