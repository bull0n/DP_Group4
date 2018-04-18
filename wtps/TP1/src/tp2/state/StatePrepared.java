package tp2.state;

import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class StatePrepared implements State_I{

	@Override
	public float getLactose(StatePizzaContext pizzaContext) {
		return LACTOSE;
	}

	@Override
	public String getTaste(StatePizzaContext pizzaContext) {
		return Tastes.RAW_TASTE.toString();
	}

	@Override
	public String getAroma(StatePizzaContext pizzaContext) {
		return Aromas.RAW_AROMA.toString();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizzaContext pizzaContext) {
		// Do nothing
	}

	@Override
	public void cook(StatePizzaContext pizzaContext) {
		pizzaContext.setState(new StateCooked());
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : prepared";
}
