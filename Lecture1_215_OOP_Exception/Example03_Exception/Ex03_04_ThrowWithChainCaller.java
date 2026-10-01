package Lecture1_215_OOP_Exception.Example03_Exception;

public class Ex03_04_ThrowWithChainCaller {
    // main method
    public static void main(String[] args) {
        Ex03_04_ThrowWithChainCaller th = new Ex03_04_ThrowWithChainCaller();
        th.method1(6,3) ;
        th.method2(6,0) ;
    }
    // method1
    public void method1(double num , double den) {
        // try-catch
        try {
            System.out.println( method2(num , den) ) ;
        }
        catch (ArithmeticException ae) {
            System.out.println("Divided By Zero is not allowed");
        }
    }
    // method2
    public String method2(double num , double den) throws ArithmeticException {
        if (den == 0) throw new ArithmeticException() ;
        else return num + " / " + den + " = " + (num/den) ;
    }
}
