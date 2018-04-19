package tp2.state;

import tp2.Pizza_I;

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
