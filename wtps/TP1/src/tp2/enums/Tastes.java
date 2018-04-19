package tp2.enums;

public enum Tastes {
	GOOD(" good"),
	NOT_GOOD(" not good"),
	NO_TASTE("No taste"),
	RAW_TASTE("Raw pizza taste");
	
	private String text;
	
	Tastes(String text) {
        this.text = text;
    }
	
	@Override
	public String toString()
	{
		return this.text;
	}
}
