package Lecture00_2110215;

public class Lecture00_215_03_Character_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 : Character Type
		char myLuckyNumber = '9' ;
		char myIntaniaGroup = 'E' ; 
		System.out.println( myIntaniaGroup + myLuckyNumber ); // we cant concatenate char cuz it will change to decimal and sum each other
		// So , '9' (57) + 'E' (69) = 126 as result
		
		// we can add string with char like this
		System.out.println(myLuckyNumber + " " + myIntaniaGroup + " = " + (myLuckyNumber+myIntaniaGroup)); // cant use comma like in python
			// got 9 E = 126 as result or we can use int(var.) for changing to int -> casting
		
		
		// 2 : Boolean Type
		boolean isCPStudent = true ; // lowercase
		boolean failedCompProg = false ; // lowercase
		boolean passedCompProg = !failedCompProg ; // !var. = not -> will return not of bull as result
		boolean qualifiedCPStudent = isCPStudent && passedCompProg ; // && means and -> do logic operations
		
		System.out.println("Status of Qualified CP Student : " + qualifiedCPStudent);
		 
	}
	

}
