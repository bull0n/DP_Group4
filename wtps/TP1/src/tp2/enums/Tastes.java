package tp2.enums;

public enum Tastes {
	GOOD(" good"),
	NOT_GOOD(" not good");
	
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
