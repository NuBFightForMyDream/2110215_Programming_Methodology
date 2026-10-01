package Lecture0_215_IntroOOP;

// import Scanner (for input)
import java.util.Scanner ;

public class Lecture00_215_19_IfElse_CaseStudy_ScoreChecker {

	public static void main(String[] args) {
		// create Scanner type
		Scanner rubkar = new Scanner(System.in);
		
		// 1 : declare initial variables
		double score ; 
		String msg , id = null ; // initial value of ID is null
		boolean okToProceed = true ; // status if sth is not error
		
		// 2 : using try-catch for input
		System.out.print("Welcome to Score Calculator , Please Enter Info : ");
		System.out.print("Enter Student ID : ");
	
		try {
			id = rubkar.nextLine(); // read current line & preparing for reading next line (reading string)
		}
		catch (Exception e) {
			okToProceed = false ; // set status to false (meaning sth is error) , but not exit program rn
		}
		
		// 3 : if-else statement for checking score
		if (okToProceed == true) {
			// check student id
			if (id.length() == 10) {
				
				// 3.1 : calculate score
				score = Lecture00_215_18_IfElse_CaseStudy_JavaScoreData.getScoreOf(id); 
					// get score from ... (my lecture name) ... dot (method name (which get id (key) in map) 
				
				// 3.2 :shows message of personal score
				msg = ("The total score is : " + score + " Points.\n"); // \n for new line
				msg += "The student ID " + id + (score >= 50 ? " passes" : " failed") + " the course!" ;
								// LOGIC : if score >= 50 : yes = passes / no = failed
						
				// 3.3 : print out msg (check if that student id in database by -1)
				if (score == -1) {
					System.out.println("ERROR 404 , Student ID " + id + " cannot be found in database");
				}
				else {
				System.out.println(msg);
				}
				
			}
			else {
				System.out.println("Invalid Student ID");
			}
		}
		
		else { // okToProceed = false -> meaning sth error in program
			System.out.println("Oops , Something went wrong !!!");
		}
	}

}
