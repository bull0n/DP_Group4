package tp2.state;

import tp2.concrete.Pizza;

public interface State_I {

	public float getLactose(Pizza pizza);
	
	public String getTaste(Pizza pizza);
	
	public String getAroma(Pizza pizza);
	
	public String toString();
	
	public void prepare(Pizza pizza) throws Exception;
	
	public void cook(Pizza pizza) throws Exception;
}
