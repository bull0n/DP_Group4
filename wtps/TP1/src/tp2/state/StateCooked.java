package tp2.state;

import tp2.concrete.Pizza;
import tp2.enums.Tastes;

public class StateCooked implements State_I {

	@Override
	public float getLactose(Pizza pizza) {
		return pizza.getLactose()/2;
	}

	@Override
	public String getTaste(Pizza pizza) {
		return Tastes.GOOD.name();
	}

	@Override
	public String getAroma(Pizza pizza) {
		return pizza.getAroma();
	}

	@Override
	public String toString()
	{
		return STATE;
	}
	
	@Override
	public void prepare(Pizza pizza) throws Exception {
		throw new Exception(EXCEPTION_MSG);
	}

	@Override
	public void cook(Pizza pizza) throws Exception {
		pizza.setState(new StateOvercooked());
	}
	
	private static String STATE = "state : cooked";
	private static String EXCEPTION_MSG = "Already cooked, can not be prepared...";
}
