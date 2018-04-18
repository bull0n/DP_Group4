package tp2.state;

import tp2.enums.Aromas;
import tp2.enums.Tastes;

public class StatePrepared implements State_I{

	@Override
	public float getLactose(ContextPizza pizzaContext) throws Exception {
		return pizzaContext.getPizza().getLactose();
	}

	@Override
	public String getTaste(ContextPizza pizzaContext) {
		return Tastes.RAW_TASTE.toString();
	}

	@Override
	public String getAroma(ContextPizza pizzaContext) {
		return Aromas.RAW_AROMA.toString();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(ContextPizza pizzaContext) {
		// Do nothing
	}

	@Override
	public void cook(ContextPizza pizzaContext) {
		pizzaContext.setState(new StateCooked());
	}
	
	private static String STATE = "state : prepared";
}
