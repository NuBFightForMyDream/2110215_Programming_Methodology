package forStudent;
import logic.main;

public class StandUser extends Character {
	// fields
	private int maxHp ;
	private int currentHp ;
	private boolean isGuard = false;
	private Stand stand = null;

	// constructors
	public StandUser(String name , int Hp , String quote , int strength , int defense) {
		super(name , quote , strength , defense) ;
		// set Hp for StandUser
		this.maxHp = Hp ; this.currentHp = Hp ;
		// assign Hp first then check condition for each maxHp and currentHp
		if ( this.maxHp < 1 ) this.maxHp = 1 ;
		if ( this.currentHp < 1 ) this.currentHp = 1 ;
	}

	// another methods

	// Complete the takeDamage Method below.
	public int takeDamage(int damage) { // note : defense = reduced damage
		// Step 1 : calculate totalDefense first
		int TotalDefense = 0 ;
		if (stand == null) { // no stand , attack standUser directly (get defense)
			 TotalDefense = this.getDefense() ;
		}
		else { // have stand , calculate damage - totalDefense
			// note : only add defense when stand is active
			 TotalDefense = this.getDefense() + (stand.IsActive() ? stand.getDefense() : 0);
		}

		// Step 2 : calculate actualDamage
		int actualDamage = 0 ;
		if (this.isGuard() == true) actualDamage = damage - (2 * TotalDefense) ;
		else actualDamage = damage - TotalDefense ;

		// check if actualDamage is positive
		if (actualDamage < 0) actualDamage = 0 ;

		// Step 3 : calculate currentHp
		setCurrentHp( getCurrentHp() - actualDamage );

		// check if currentHp is positive
		if (getCurrentHp() < 0) setCurrentHp(0);

		return actualDamage ;

	}

	// Complete doDamage Methods below.
	public int doDamage(StandUser target) {
		return target.takeDamage( this.getStrength() + (stand.IsActive() ? stand.getStrength() : 0) );
	}
	
	public int getMaxHp() {
		return maxHp;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int hp) {
		if(hp < 0) {
			this.currentHp = 0;
		}
		else
			this.currentHp = hp;
	}
	
	public boolean isGuard() {
		return isGuard;
	}
	public void setGuard(boolean isGuard) {
		this.isGuard = isGuard;
	}
	
	public void setStand(Stand stand) {
		this.stand = stand;
	}
	

	public void printShowStat() {
		System.out.println("***************************");
		System.out.println(this.getName());
		System.out.println("\"" + this.getQuote()+ "\"" );
		System.out.println("HP = " + this.getMaxHp() );
		System.out.println("Strength = " + this.getStrength() );
		System.out.println("Defense  = " + this.getDefense() );
		System.out.println("***************************");
	}
	
	public StandUser selectStandUser() {
		printShowStat();
		main.kb.nextLine();
		System.out.println("Are you sure ? (Y/N) :");
		String special = main.kb.nextLine().trim().toLowerCase();
		boolean isSelected = special.equals("y") ? true : false ;
		if(isSelected)
			return this;
		else
			return null;
	}
}
	
	
	

