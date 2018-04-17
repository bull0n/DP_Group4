package tp2.state;

import tp2.concrete.Pizza;
import tp2.enums.Tastes;

public class StateCooked implements State_I {

	@Override
	public float getLactose(StatePizza pizza) {
		return pizza.getLactose()/2;
	}

	@Override
	public String getTaste(StatePizza pizza) {
		return Tastes.GOOD.name();
	}

	@Override
	public String getAroma(StatePizza pizza) {
		return pizza.getAroma();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(StatePizza pizza) throws Exception {
		throw new Exception(EXCEPTION_MSG);
	}

	@Override
	public void cook(StatePizza pizza) throws Exception {
		pizza.setState(new StateOvercooked());
	}
	
	private static String STATE = "state : cooked";
	private static String EXCEPTION_MSG = "Already cooked, can not be prepared...";
}
