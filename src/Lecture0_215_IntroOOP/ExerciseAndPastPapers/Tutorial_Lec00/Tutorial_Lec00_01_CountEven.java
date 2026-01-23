package Lecture0_215_IntroOOP.ExerciseAndPastPapers.Tutorial_Lec00;

public class Tutorial_Lec00_01_CountEven {
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
}
