package Lecture00_2110215;

// import Scanner
import java.util.Scanner ; 

public class Lecture00_215_25_Loop_BreakAndContinue {
	public static void main(String[] args) {
		
		// PART 1 : Break structure
		
		// declare var.
		String magicWord ; 
		// create Scanner
		Scanner rubkar = new Scanner(System.in);
	
		
		// while loop : until input correct word
		while (true) { 
			// input word 
			System.out.print("Input the magic word for 215 PROG METH Subject. \n >> ");
			magicWord = rubkar.nextLine();
			
			// check if magic word is "PROG_METH"
			if (magicWord.equals("PROG_METH")) { // maybe because of checking content , so using a.equals(b) is more recommended (a == b means checking if same object?)
				// print congrats & break 
				System.out.println("Congratulations , you guessed the right word. The correct word is : " + magicWord);
				break ;
			}
			
			else {
				// print cmd to run try again
				System.out.println("TwT , You guessed '" + magicWord + "' , which is WRONG , Let's try again.");
			}
		}
		
		System.out.println("------------------------------------------------------------");
		
		// PART 2 : continue structure
			// Key : input some password and check maximum value of integer in this password , if not integer will pass
		
		// 2.1 : declare initial var. (password , maxValue , passwordLength , char ...)
		int passwordLength , maxValue = 0 ;
		String password ; 
		
		// 2.2 : create Scanner (done before) , then define passwordLength & password
		System.out.print("Enter Password : ");
		
		password = rubkar.nextLine(); // read info in that line
		passwordLength = password.length(); // returns int
		
		// 2.3 : for loop -> check char (define char in each loop)
		for (int i = 0 ; i < passwordLength ; i++) {
			// check if char not in '0' to '9'
			char charAtPos = password.charAt(i); // using charAt for checking char on thta pos
			if (! (charAtPos >= '0' && charAtPos <= '9') ) { // if not (checking int cd.)
				continue ; // pass to net position
			}
			
			// will do this below if not continue (digit is between 0 to 9)
			int digit = Character.digit(charAtPos, 10); // define digit for checking value compared to base 10
			if (digit > maxValue) {
				maxValue = digit ; // give new max value
			}
		}
		
		// 2.4 : ending loop , print max value
		System.out.println("Maximum value in this password : " + maxValue);
		
	}
}
