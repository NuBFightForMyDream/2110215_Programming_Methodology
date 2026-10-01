package forStudent;



public class Character {
	// fields
	private String name;
	private String quote; 
	private int strength;
	private int defense;

	// constructor
	public Character(String name, String quote, int strength, int defense) {
		super();
		this.name = name;
		this.quote = quote;
		this.strength = strength < 0 ? 0 : strength;
		this.defense = defense <= 0 ? 0 : defense;
	}
	
	public String getName() {
		return name;
	}

	public String getQuote() {
		return quote;
	}

	public int getStrength() {
		return strength;
	}

	public int getDefense() {
		return defense;
	}



}
