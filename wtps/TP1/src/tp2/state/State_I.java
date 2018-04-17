package tp2.state;

public interface State_I {

	public float getLactose(StatePizza pizza);
	
	public String getTaste(StatePizza pizza);
	
	public String getAroma(StatePizza pizza);
	
	public String toString();
	
	public void prepare(StatePizza pizza) throws Exception;
	
	public void cook(StatePizza pizza) throws Exception;
}
