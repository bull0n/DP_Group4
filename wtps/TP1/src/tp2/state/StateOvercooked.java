package tp2.state;

public class StateOvercooked implements State_I {

	@Override
	public float getLactose(StatePizzaContext pizzaContext) {
		return LACTOSE;
	}

	@Override
	public String getTaste(StatePizzaContext pizzaContext) {
		return null;
	}

	@Override
	public String getAroma(StatePizzaContext pizzaContext) {
		return null;
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizzaContext pizzaContext) throws Exception {
		// Do nothing
	}

	@Override
	public void cook(StatePizzaContext pizzaContext) throws Exception {
		// Do nothing
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : overcooked";
	private static String EXCEPTION_MSG = "The pizza is overcooked...";
}
