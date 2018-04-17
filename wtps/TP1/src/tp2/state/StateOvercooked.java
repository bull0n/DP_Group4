package tp2.state;

import tp2.concrete.Pizza;

public class StateOvercooked implements State_I {

	@Override
	public float getLactose(Pizza pizza) {
		return LACTOSE;
	}

	@Override
	public String getTaste(Pizza pizza) {
		return null;
	}

	@Override
	public String getAroma(Pizza pizza) {
		return null;
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(Pizza pizza) throws Exception {
		// Do nothing
	}

	@Override
	public void cook(Pizza pizza) throws Exception {
		// Do nothing
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : overcooked";
	private static String EXCEPTION_MSG = "The pizza is overcooked...";
}
