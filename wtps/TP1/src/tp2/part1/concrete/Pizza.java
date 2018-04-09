package tp2.part1.concrete;

import tp2.part1.Pizza_I;

public abstract class Pizza implements Pizza_I {

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
	public abstract String toString();
	
	protected int size;
	protected float price;

}
