package tp2.state;

public interface State_I {

	public float getLactose(StatePizzaContext pizzaContext);
	
	public String getTaste(StatePizzaContext pizzaContext);
	
	public String getAroma(StatePizzaContext pizzaContext);
	
	public String toString();
	
	public void prepare(StatePizzaContext pizzaContext) throws Exception;
	
	public void cook(StatePizzaContext pizzaContext) throws Exception;
}
