package tp2.state;

import tp2.enums.Tastes;

public class StateCooked implements State_I {

	@Override
	public float getLactose(StatePizzaContext pizzaContext) {
		return LACTOSE * pizzaContext.getPizza().getLactose();
	}

	@Override
	public String getTaste(StatePizzaContext pizzaContext) {
		return pizzaContext.getPizza().getTaste();
	}

	@Override
	public String getAroma(StatePizzaContext pizzaContext) {
		return pizzaContext.getPizza().getAroma();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizzaContext pizzaContext) throws Exception {
		throw new Exception(EXCEPTION_MSG);
	}

	@Override
	public void cook(StatePizzaContext pizzaContext) throws Exception {
		pizzaContext.setState(new StateOvercooked());
	}
	
	private static float LACTOSE = 0.5f;
	private static String STATE = "state : cooked";
	private static String EXCEPTION_MSG = "Already cooked, can not be prepared...";
}
