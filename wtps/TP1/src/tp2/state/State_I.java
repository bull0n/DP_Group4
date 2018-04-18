package tp2.state;

public interface State_I {

	public float getLactose(ContextPizza pizzaContext) throws Exception;
	
	public String getTaste(ContextPizza pizzaContext) throws Exception;
	
	public String getAroma(ContextPizza pizzaContext) throws Exception;
	
	public String toString();
	
	public void prepare(ContextPizza pizzaContext) throws Exception;
	
	public void cook(ContextPizza pizzaContext) throws Exception;
}
