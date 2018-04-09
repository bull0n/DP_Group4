package tp2.part1.concrete;

import tp2.part1.Pizza_I;

public class PizzaThin implements Pizza_I {

	@Override
	public float getPrice() {
		return this.getSize()*1f;
	}

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
		return 20;
	}

	@Override
	public String getTaste() {
		return "";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String toString() {
		return "Think Pizza";
	}

}
