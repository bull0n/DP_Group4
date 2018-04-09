package tp2.part1.decorator;

import tp2.part1.Pizza_I;

public abstract class Decorator implements Pizza_I {

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSpicy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getLactose() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return null;
	}

}
