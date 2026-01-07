package Lecture0_215_IntroOOP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lecture00_215_38_1_ArrayExerciseTest { // created class from JUnit 

	@Test
	void testCountFrequencyCharInArray() {
		// 1st function : check frequency of alphabet in array , returning int 
		char[] alphabets = {'a','b','c','d','e','a','a','b','d','f'} ; 
		
		// define variables from calling functions : filename.functionName(parameters/arguments)
		int countA = Lecture00_215_38_ArrayExercise.countFrequencyCharInArray(alphabets , 'a') ;
		int countB = Lecture00_215_38_ArrayExercise.countFrequencyCharInArray(alphabets , 'b') ;
		int countC = Lecture00_215_38_ArrayExercise.countFrequencyCharInArray(alphabets , 'c') ;
		int countD = Lecture00_215_38_ArrayExercise.countFrequencyCharInArray(alphabets , 'd') ;
		int countE = Lecture00_215_38_ArrayExercise.countFrequencyCharInArray(alphabets , 'e') ;
		int countF = Lecture00_215_38_ArrayExercise.countFrequencyCharInArray(alphabets , 'f') ;
		
		// check by assertEquals
		assertEquals(3 , countA) ; assertEquals(2 , countB) ;  assertEquals(1 , countC) ; 
		assertEquals(2 , countD) ; assertEquals(1 , countE) ;  assertEquals(1 , countF) ; 
	}

	@Test
	void testCheckIfMemberInArray() {
		// Testcase 1 : check is 1 in null -> should return False , so assertFalse
		assertFalse(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(1 , null));
		
		// Create Array to test
		int[] studentID = {6,7,3,0,0,8,4,5,2,1} ; 
		
		// True testcases 
		assertTrue(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(0 , studentID)) ; // should be True
		assertTrue(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(8 , studentID)) ; // should be True
		assertTrue(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(4 , studentID)) ; // should be True
		assertTrue(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(3 , studentID)) ; // should be True
		assertTrue(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(6 , studentID)) ; // should be True
		
		// False Testcases
		assertFalse(Lecture00_215_38_ArrayExercise.checkIfMemberInArray(9 , studentID)) ; // should be False
	
	}

	@Test
	void testIsPalinDrome() {
		// case 1 : test null array -> should return True
		assertTrue(Lecture00_215_38_ArrayExercise.isPalinDrome(null)) ; 
		
		// case 2 : digits (0 t 9) -> should return True
		int[] digit_ex1 = {3} ; int[] digit_ex2 = {7} ; 
		
		assertTrue(Lecture00_215_38_ArrayExercise.isPalinDrome( digit_ex1 )) ; 
		assertTrue(Lecture00_215_38_ArrayExercise.isPalinDrome( digit_ex2 )) ; 
		
		// case 3 : odd number length
		int[] digit_ex3 = {3,4,3} ; int[] digit_ex4 = {4,5,6} ; 
		assertTrue(Lecture00_215_38_ArrayExercise.isPalinDrome( digit_ex3 )) ; 
		assertFalse(Lecture00_215_38_ArrayExercise.isPalinDrome( digit_ex4 )) ; 
		
		// case 4 : even number length 
		int[] digit_ex5 = {3,4,4,3} ; int[] digit_ex6 = {4,5,6,7} ; 
		assertTrue(Lecture00_215_38_ArrayExercise.isPalinDrome( digit_ex5 )) ; 
		assertFalse(Lecture00_215_38_ArrayExercise.isPalinDrome( digit_ex6 )) ; 
		
	}
	
	// passed 3 methods

}
