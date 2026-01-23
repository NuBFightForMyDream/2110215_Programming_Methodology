package Lecture1_215_OOP_Exception.Example03_Exception;

public class Ex03_03_ThrowExample01 { // throw = pass Exception
    // greetingMessage Method
    static void greetingMessage(String name) throws ClassNotFoundException , InterruptedException {
        // throws exc1 , exc2 ==> meaning that how possible can this method throws exception in different ways
        if (name.equals("John")) throw new InterruptedException() ;
        System.out.println("Hello " + name) ;
    }

    public static void main(String[] args)
            throws ClassNotFoundException , InterruptedException { // throw class... to interrupt...
        try {
            greetingMessage("John") ; // ClassNotFoundException
        }
        catch (InterruptedException e) {
            System.out.println("Bye.") ;
        }
    }
    // greetingMessage method -> throws to main -> main if not try-catch -> throw to exception
}
