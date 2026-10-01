package Lecture0_215_IntroOOP;

public class Lecture00_215_40_MultiDimArrayTraversal {

	public static void main(String[] args) {
		// define array 
		int [][][] multiDimArr = { // 3D array 
				{ {1, 3, 2}, {5, 4}, {7, 6, 8, 9} },
				{ {3, 2, 1}, {4, 3, 1, 5} } } ;
		
		// 1st sol : for loop 
		for (int i = 0 ; i < multiDimArr.length ; i++) {
			for (int j = 0 ; j < multiDimArr[i].length ; j++) { // multiDimArr[i] = 2D array 
				for (int k = 0 ; k < multiDimArr[i][j].length ; k++) { // multiDimArr[i][j] = 1D array
					// access element multiDimArr[i][j][k]
					System.out.printf("d[%d][%d][%d] = %d\n" , i , j , k , multiDimArr[i][j][k]); 
				}
			}
		}
		
		System.out.println("---------------------------");
		
		// 2nd sol : for each element 
		for (int[][] array2D : multiDimArr) { // each element = array2D
			for (int[] array1D : array2D) { // each element = array1D
				for (int each_data : array1D) { // each element = each_data
					System.out.print(each_data + " ");
				}
				System.out.print(", ");
			}
			System.out.println(); 
		}
	}

}
