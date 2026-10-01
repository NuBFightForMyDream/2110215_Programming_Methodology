package Lecture0_215_IntroOOP.ExerciseAndPastPapers.Tutorial_Lec00;

public class Tutorial_Lec00_02_PartialArray {
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
}
