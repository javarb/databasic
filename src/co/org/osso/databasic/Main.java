package co.org.osso.databasic;

public class Main {

    public static void main(String[] args) {

        // Homework: Application class that handle oll this

        // Check commands
        if (args[0].equals(DataBasicCommands.HELP.toString())) {
            help();
            return;
        }

        // Validate input
        try {
            new InputProcessor().validateInput(args);

        } catch (RuntimeException e) {
            /*
            * primitives: low level datatypes
            * .equals only with objects non primitives
            * Capitalization of primitives in way of objects gives a way to have null values because this cannot be in primitives
            * is prefereable to use .equals because string is not a primitive and because when a value is inserted from command line
            * this is assigned to a new memory address so == compares memory addresses and says it's different
            * */
            // When we create 2 different variables but with equal value, Java place them to the same memory address, so == compares that address
            // while .equals compare the current valur
            /*String a = "2";
            String b = "2";*/
            /*== is comparing memory addresses
            /* .equals() check for the current value
              */
            /*Integer a = 0;
            a.*/
            /* always -equ.. with strings */
            if ("debug".equals(args[args.length - 1])){
                e.printStackTrace();
            } else {
                System.err.println(e.getMessage());
                help();
            }

        }

    }

    /*
    * Shows help
    * here this has to be static 'cause main is static
    * */
    private static void help() {

        String insertCommand = makeBold(DataBasicCommands.INSERT.name() + " <path-to-file>") + "    Inserts an registry into databasic.";
        String queryCommand = makeBold("<id> <json-path>") + "         Executes a query to databasic.";
        String helpCommand = makeBold("help") + "                     Displays this help and exit";

        System.out.println("\nDatabasic");
        System.out.println("-------------------");
        System.out.println("Available commands are:");
        System.out.println(java.util.Arrays.asList(DataBasicCommands.values()) + "\n");
        System.out.println(insertCommand);
        System.out.println(queryCommand);
        System.out.println(helpCommand);
        System.out.println("-------------------");

    }

    /*
    * Format text in bold
    * */
    private static String makeBold(String s) {
        String boldedString = "\u001B[1m";
        boldedString += s + "\u001B[0m";
        return boldedString;

    }

}