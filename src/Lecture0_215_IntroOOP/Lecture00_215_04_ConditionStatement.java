package Lecture00_2110215;

public class Lecture00_215_04_ConditionStatement {

	public static void main(String[] args) {
		// 1 : Condition Statement - check if type are same
		double firstNumber = 31;
		double secondNumber = 51;
		double thirdNumber = 45.67; // now all are double

		if (firstNumber == secondNumber) {
			System.out.println(firstNumber + " is equal to " + secondNumber);
		} else {
			System.out.println(firstNumber + " is not equal to " + secondNumber);
		}

		System.out.println("-----------------------------------------------------------------");

		// 2 : boolean with condition: Sorting number descending & ascending

		if ((firstNumber <= secondNumber) && (secondNumber <= thirdNumber)) {
			System.out.println("Ascending Number : " + firstNumber + " < " + secondNumber + " < " + thirdNumber);
			System.out.println("Descending Number : " + thirdNumber + " > " + secondNumber + " > " + firstNumber);
		}

		else if ((firstNumber <= thirdNumber) && (thirdNumber <= secondNumber)) {
			System.out.println("Ascending Number : " + firstNumber + " < " + thirdNumber + " < " + secondNumber);
			System.out.println("Descending Number : " + secondNumber + " > " + thirdNumber + " > " + firstNumber);
		}

		else if ((secondNumber <= firstNumber) && (firstNumber <= thirdNumber)) {
			System.out.println("Ascending Number : " + secondNumber + " < " + firstNumber + " < " + thirdNumber);
			System.out.println("Descending Number : " + thirdNumber + " > " + firstNumber + " > " + secondNumber);
		}

		else if ((secondNumber <= thirdNumber) && (thirdNumber <= firstNumber)) {
			System.out.println("Ascending Number : " + secondNumber + " < " + thirdNumber + " < " + firstNumber);
			System.out.println("Descending Number : " + firstNumber + " > " + thirdNumber + " > " + secondNumber);
		}

		else if ((thirdNumber <= firstNumber) && (firstNumber <= secondNumber)) {
			System.out.println("Ascending Number : " + thirdNumber + " < " + firstNumber + " < " + secondNumber);
			System.out.println("Descending Number : " + secondNumber + " > " + firstNumber + " > " + thirdNumber);
		}

		else if ((thirdNumber <= secondNumber) && (secondNumber <= firstNumber)) {
			System.out.println("Ascending Number : " + thirdNumber + " < " + secondNumber + " < " + firstNumber);
			System.out.println("Descending Number : " + firstNumber + " > " + secondNumber + " > " + thirdNumber);
		}
	}
}
