package tp2.concrete;

import tp2.Pizza_I;
import tp2.state.StateOrdered;
import tp2.state.State_I;

public abstract class Pizza implements Pizza_I {

	@Override
	public abstract float getPrice();

	@Override
	public boolean isSpicy() {
		return false;
	}

	@Override
	public float getLactose() {
		return state.getLactose(this);
	}

	@Override
	public boolean isVegetarian() {
		return true;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public String getTaste() {
		return state.getTaste(this);
	}

	@Override
	public String getAroma() {
		return state.getAroma(this);
	}

	@Override
	public String toString()
	{
		return this.state.toString() + " | diameter : " + this.size + " | type : ";
	}

	protected int size;
	protected final float price = 1f;
	
	public Pizza(int size) {
		this(size, new StateOrdered());
	}
	
	// STATE
	
	public Pizza(int size, State_I state) {
		this.size = size;
		this.state = state;
	}
	
	@Override
	public void prepare() throws Exception {
		state.prepare(this);
	}
	
	@Override
	public void cook() throws Exception {
		state.cook(this);
	}
	
	public void setState(State_I state) {
		this.state = state;
	}
	
	public State_I getState() {
		return state;
	}
	
	protected State_I state;

}
