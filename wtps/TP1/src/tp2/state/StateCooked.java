package tp2.state;

import tp2.enums.Tastes;

public class StateCooked implements State_I {

	@Override
	public float getLactose(ContextPizza pizzaContext) throws Exception {
		return LACTOSE * pizzaContext.getPizza().getLactose();
	}

	@Override
	public String getTaste(ContextPizza pizzaContext) throws Exception {
		return pizzaContext.getPizza().getTaste();
	}

	@Override
	public String getAroma(ContextPizza pizzaContext) throws Exception {
		return pizzaContext.getPizza().getAroma();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(ContextPizza pizzaContext) throws Exception {
		throw new Exception(EXCEPTION_MSG);
	}

	@Override
	public void cook(ContextPizza pizzaContext) throws Exception {
		pizzaContext.setState(new StateOvercooked());
	}
	
	private static float LACTOSE = 0.5f;
	private static String STATE = "state : cooked";
	private static String EXCEPTION_MSG = "Already cooked, can not be prepared...";
}
