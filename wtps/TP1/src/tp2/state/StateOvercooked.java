package tp2.state;

public class StateOvercooked implements State_I {

	@Override
	public float getLactose(ContextPizza pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public String getTaste(ContextPizza pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public String getAroma(ContextPizza pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(ContextPizza pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}

	@Override
	public void cook(ContextPizza pizzaContext) throws Exception {
		throw new Exception("Overcooked");
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : overcooked";
	private static String EXCEPTION_MSG = "The pizza is overcooked...";
}
