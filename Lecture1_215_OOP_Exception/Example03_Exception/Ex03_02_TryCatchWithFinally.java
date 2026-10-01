package Lecture1_215_OOP_Exception.Example03_Exception;

public class Ex03_02_TryCatchWithFinally {
    // main function
    public static void main(String[] args) {
        tryCatchWithFinally() ;  // call tryCatchWithFinally function
    }

    // tryCatchWithFinally function
    public static void tryCatchWithFinally() {
        int result = 0 ;
        for (int i = 0 ; i < 4 ; i++) {
            // try - catch in for loop
            try {
                result = 10 / i;
                System.out.println("i = " + i + " and result = " + result);
                if (i == 2) break;
            }
            catch (ArithmeticException ae){
                System.out.println("Catched Arithmetic Exception"); // for zero division
            }
            finally { // will always be executed -> do in case program error
                System.out.println("If Finally is done , this command will show in terminal.");
            }
            // message for new loop
            System.out.println("End Loop , New Loop");
        }
        System.out.println("End Program Ja");
    }
}
