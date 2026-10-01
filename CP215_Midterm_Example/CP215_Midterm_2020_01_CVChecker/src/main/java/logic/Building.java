package logic;

import java.util.ArrayList;

public class Building {
	// attributes
	private ArrayList<EnterProfile> enterProfileList;

	private int populationCount = 0;
	private int potentialInfectedCount = 0;
	

	// constructors
	public Building() {
		enterProfileList = new ArrayList<EnterProfile>();
	}

	// methods
	public EnterProfile addProfile(Person person, int temperature) {
		//Fill Code Here
		/*
		 * 	Create enterProfile with this person and temperature value as bodyTemperature, and add to this building.
			Check if building already has this person in enterProfileList. If has, remove the old one then add new people
			Hint : Look at method below this one
			Increase populationCount by 1 and if enterProfile hasFever is true, Increase potentialInfectedCount by 1.
			-> This method returns the added EnterProfile object. <-
		 */
		EnterProfile newProfile = new EnterProfile(person , temperature) ;
		// must use loop to check if profile exist in list
		for (int pos = 0 ; pos < enterProfileList.size() ; pos++) {
			EnterProfile eachEnterProfile = enterProfileList.get(pos) ;
			// check if profile exist
			if ( eachEnterProfile.getPerson().equals(person) ) {
				// remove the old one
				removeProfile(pos); // call removeProfile method below
				break ;
			}
		}
		// add new people to list
		enterProfileList.add(newProfile) ;
		// increase populationCount
		populationCount += 1 ;
		if (newProfile.hasFever() == true) {
			this.potentialInfectedCount += 1 ;
		}
		// return new profile
		return newProfile ;
	}
	
	
	public EnterProfile removeProfile(int index) {
		//Fill Code Here
		/*
		 * 	Remove enterProfile from enterProfileList according to the index number. 
			Decrease populationCount by 1 and if that enterProfile hasFever is true, Decrease potentialInfectedCount by 1.
		    -> This method returns the removed EnterProfile object. <-
		 */
		EnterProfile removedProfile = enterProfileList.remove(index) ;
		populationCount -= 1 ;
		if (removedProfile.hasFever() == true) {
			this.potentialInfectedCount -= 1 ;
		}
		return removedProfile ;
	}

	// Getter - setter (on;y getter used)
	public int getPopulationCount() {
		return populationCount;
	}

	public int getPotentialInfectedCount() {
		return potentialInfectedCount;
	}

	public ArrayList<EnterProfile> getEnterProfileList() {
		return enterProfileList;
	}
}
