package tp2.state;

import tp2.concrete.Pizza;
import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class StatePrepared implements State_I{

	@Override
	public float getLactose(StatePizza context) {
		return LACTOSE;
	}

	@Override
	public String getTaste(StatePizza context) {
		return Tastes.RAW_TASTE.toString();
	}

	@Override
	public String getAroma(StatePizza context) {
		return Aromas.RAW_AROMA.toString();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizza context) {
		// Do nothing
	}

	@Override
	public void cook(StatePizza context) {
		context.setState(new StateCooked());
	}
	
	private static float LACTOSE = 0.0f;
	private static String STATE = "state : prepared";
}
