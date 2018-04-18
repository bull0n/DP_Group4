package tp2.state;

import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class StateOrdered implements State_I{

	@Override
	public float getLactose(PizzaContext pizzaContext) {
		return LACTOSE;	// Pizza is not ready ...
	}

	@Override
	public String getTaste(PizzaContext pizzaContext) {
		return Tastes.NO_TASTE.toString();
	}
	
	@Override
	public String getAroma(PizzaContext pizzaContext) {
		return Aromas.NO_AROMA.toString();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(PizzaContext pizzaContext) throws Exception{
		pizzaContext.setState(new StatePrepared());
	}

	@Override
	public void cook(PizzaContext pizzaContext) throws Exception{
		throw new Exception(EXCEPTION_MSG);
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : ordered";
	private static String EXCEPTION_MSG = "Can not be cooked...";
}
