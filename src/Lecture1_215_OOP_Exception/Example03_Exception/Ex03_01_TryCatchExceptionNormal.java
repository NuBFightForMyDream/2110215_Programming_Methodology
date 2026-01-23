package Lecture1_215_OOP_Exception.Example03_Exception;

public class Ex03_01_TryCatchExceptionNormal {
    public static void main(String[] args) {
        // define array
        int dividedByIntegerArray[] = new int[2] ;


        try { // 1st case : try for code
            for (int num = 0 ; num < 3 ; ++num) {
                dividedByIntegerArray[num] = 1 / num ;
                System.out.println("Divided By : " + num + " : " + dividedByIntegerArray[num]) ;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrE) { // pass this exception
            System.out.println(arrE.toString());
        }

        catch (ArithmeticException aE) { // got this exception instead
            aE.printStackTrace();
        }
        catch (Exception E) { // all exception (biggest)
            System.out.println( E.toString() ) ;
        }
        // status of run all exception
        System.out.println("End Checking Exception");

        // ==> Summary : ArithmeticException <== 
    }
}
