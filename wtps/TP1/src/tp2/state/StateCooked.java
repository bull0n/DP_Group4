package tp2.state;

import tp2.enums.Tastes;

public class StateCooked implements State_I {

	@Override
	public float getLactose(StatePizzaContext pizzaContext) {
		return pizzaContext.getLactose()/2;
	}

	@Override
	public String getTaste(StatePizzaContext pizzaContext) {
		return Tastes.GOOD.name();
	}

	@Override
	public String getAroma(StatePizzaContext pizzaContext) {
		return pizzaContext.getAroma();
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
	
	private static String STATE = "state : cooked";
	private static String EXCEPTION_MSG = "Already cooked, can not be prepared...";
}
