package tp2.state;

import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class StateOrdered implements State_I{

	@Override
	public float getLactose(StatePizza pizza) {
		return LACTOSE;	// Pizza is not ready ...
	}

	@Override
	public String getTaste(StatePizza pizza) {
		return Tastes.NO_TASTE.toString();
	}
	
	@Override
	public String getAroma(StatePizza pizza) {
		return Aromas.NO_AROMA.toString();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizza pizza) throws Exception{
		pizza.setState(new StatePrepared());
	}

	@Override
	public void cook(StatePizza pizza) throws Exception{
		throw new Exception(EXCEPTION_MSG);
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : ordered";
	private static String EXCEPTION_MSG = "Can not be cooked...";
}
