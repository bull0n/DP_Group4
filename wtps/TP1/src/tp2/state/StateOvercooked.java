package tp2.state;

import tp2.concrete.Pizza;
import tp2.enums.Tastes;

public class StateOvercooked implements State_I {

	@Override
	public float getLactose(StatePizza pizza) {
		return LACTOSE;
	}

	@Override
	public String getTaste(StatePizza pizza) {
		return null;
	}

	@Override
	public String getAroma(StatePizza pizza) {
		return null;
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizza pizza) throws Exception {
		// Do nothing
	}

	@Override
	public void cook(StatePizza pizza) throws Exception {
		// Do nothing
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : overcooked";
	private static String EXCEPTION_MSG = "The pizza is overcooked...";
}
