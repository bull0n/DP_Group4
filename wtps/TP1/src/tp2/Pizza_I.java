package tp2;

import tp2.state.State_I;

public interface Pizza_I {
	
	public float getPrice();
	
	public boolean isSpicy();
	
	public float getLactose();
	
	public boolean isVegetarian();
	
	public int getSize();
	
	public String getTaste();
	
	public String getAroma();
	
	public String toString();
	
}
