package Lecture0_215_IntroOOP.ExerciseAndPastPapers;
import java.io.FileNotFoundException;

public class Tutorial_Lec00_01_to_03 {
    // 1st function : countEven
    public static int countEven(int[] numArr) {
        int evenCount = 0 ;
        for (int pos = 0 ; pos < numArr.length ; pos++) {
            if (numArr[pos] % 2 == 0) {
                evenCount += 1 ;
            }
        }
        return evenCount ;
    }

    // 2nd function : partialArray
    public static int[] partialArray(int[] arr , int i , int j ) { // return array of int
        // define int array
        int lengthNewArr = arr.length - j + i;
        int[] newArr = new int[lengthNewArr] ;
        // loop check
            // case 1 : invalid case
        if (arr == null || i < 0 || j > arr.length || i >= j) {
            return null;
        }
        int newPos = 0 ; // pos for newArr
            // case 2 : general case
        if ((i < j) && (i <= arr.length) && (j <= arr.length)) { // slice some array
            for (int pos = 0 ; pos < arr.length ; pos++) {
                // excluding element as pos i to j (not including j)
                if (pos < i || pos >= j) { // opposite = i <= pos < j
                    newArr[newPos] = arr[pos] ;
                    newPos++ ; // newPos shouldn't move from pos , so create newPos instead
                }
            }
            return newArr ; // return after end loop
        }
        else return null ;
    }

    // 3rd function : convertMapping
    public static String[] convertMapping( String[] satringText ) throws FileNotFoundException {
        return null ;
    }
}
