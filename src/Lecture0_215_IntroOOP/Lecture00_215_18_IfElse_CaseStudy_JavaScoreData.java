package Lecture0_215_IntroOOP;

import java.util.HashMap; // import HashMap

public class Lecture00_215_18_IfElse_CaseStudy_JavaScoreData {

	// create Hashmap type with <String , Double> 
	public static HashMap<String , Double> scoreMap = new HashMap<>();
			
	static { // keep data in map
		scoreMap.put("6730084521" , 88.92) ;
		scoreMap.put("6738084521", 75.32);
		scoreMap.put("6830084521", 54.78);
	}
	
    // Method to get the score of a student by ID
    public static double getScoreOf(String id) {
        if (scoreMap.containsKey(id)) {
            return scoreMap.get(id);
        } else {
            return -1.0; // return -1 if student not found
        }
    }


}
