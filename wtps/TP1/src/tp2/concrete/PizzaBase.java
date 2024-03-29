package tp2.concrete;

import tp2.Pizza_I;
import tp2.state.StateOrdered;
import tp2.state.State_I;

public abstract class PizzaBase implements Pizza_I {

	@Override
	public abstract float getPrice();

	@Override
	public boolean isSpicy() {
		return false;
	}

	@Override
	public float getLactose() {
		return 0;
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
		return "";
	}

	@Override
	public String getAroma() {
		return "";
	}

	@Override
	public String toString()
	{
		return "diameter : " + this.size + " | type : ";
	}

	protected int size;
	protected final float PRICE = 1f;
	
	public PizzaBase(int size) {
		this.size = size;
	}

}
