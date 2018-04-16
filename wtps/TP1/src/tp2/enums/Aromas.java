package tp2.enums;

public enum Aromas {
	SWEET(" sweet"),
	SAVOURY(" savoury"),
	SOUR(" sour"),
	BITTER(" bitter");
	
	private String text;
	
	Aromas(String text) {
        this.text = text;
    }
	
	@Override
	public String toString()
	{
		return this.text;
	}
}
