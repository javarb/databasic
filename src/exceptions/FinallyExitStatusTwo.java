package exceptions;

/**
 * Final is not reached since program has exited
 */
public class FinallyExitStatusTwo {

    public static void main(String args[]){
        System.out.println("we are in = " + test());
    }

    private static String test() {
        try {
            System.out.println("In try");
            System.exit(2);
            throw new Exception("Exception launched!");
        } catch (Exception e) {
            System.out.println("Before return from catch");
            return "In catch";
        } finally {
            System.out.println("In finally");
        }
    }

}
