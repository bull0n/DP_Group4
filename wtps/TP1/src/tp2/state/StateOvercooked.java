package tp2.state;

public class StateOvercooked implements State_I {

	@Override
	public float getLactose(PizzaContext pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public String getTaste(PizzaContext pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public String getAroma(PizzaContext pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(PizzaContext pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public void cook(PizzaContext pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : overcooked";
	private static String EXCEPTION_MSG = "The pizza is overcooked...";
}
