package tp2.state;

public interface State_I {

	public float getLactose(PizzaContext pizzaContext) throws Exception;
	
	public String getTaste(PizzaContext pizzaContext) throws Exception;
	
	public String getAroma(PizzaContext pizzaContext) throws Exception;
	
	public String toString();
	
	public void prepare(PizzaContext pizzaContext) throws Exception;
	
	public void cook(PizzaContext pizzaContext) throws Exception;
}
