package co.org.osso.databasic;

public class Main {

    public static void main(String[] args) {

        //new Application().init(args);
        System.out.println("We are= " + new Main().finallyTests());

    }

    private String finallyTests() {
        try {
            System.exit(2);
//            System.out.println("Before return");
//            throw new RuntimeException();
//            return "Inside try";

        } catch (RuntimeException e) {

            return "Inside catch";

        } finally {
            // This is executed before to return
            System.out.println("Inside finally");
            // here we close things like databases, opened files, etc.

        }

        System.out.println("Before return");
        return "Outside Try block";
    }

}