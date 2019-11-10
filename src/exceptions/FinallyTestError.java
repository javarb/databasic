package exceptions;

/**
 * Finally clause is executed before return in catch since error was throwed.
 * Its used for post opeation close files, databases connections, etc.
 * This was more useful before java 7. Now objects
 * implements java.io.Closeable
 */

public class FinallyTestError {
    public static void main(String args[]){
        System.out.println("we are in = " + test());
    }

    private static String test() {
        try {
            System.out.println("In try");
            throw new Exception("Exception launched!");
        } catch (Exception e) {
            System.out.println("Before return from catch");
            return "In catch";
        } finally {
            System.out.println("In finally");
        }
    }


}

