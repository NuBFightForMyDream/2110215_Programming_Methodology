package Lecture0_215_IntroOOP;

public class Lecture00_215_39_MultiDimArrayPeople {

	public static void main(String[] args) {
		
		// define multiDimensional array 
		String[][] friends = { // 2D array 
				{"Ann" , "Betty"} , 
				{"Cathy" , "David" , "Ella"} , 
				{"fred" , "George"} 
			} ; 
		
		// print out some elements 
		System.out.println(friends[0][1]); // Betty
		System.out.println(friends[1][2]); // Ella 
		System.out.println(friends[2].length) ; // 2
		System.out.println(friends.length) ; // 3 -> outest length
		
		System.out.println("----------------------");
		
		// changing element in multi dimensional array
		String[] group = {"Harry", "Ivan" , "Jennie"} ; 
		friends[1] = group ; 
		System.out.println(friends[1][0]) ; // array changed 
		
	}
}
