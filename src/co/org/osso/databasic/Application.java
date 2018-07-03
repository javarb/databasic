package co.org.osso.databasic;

class Application{

    /*
     * Init application
     * */
    protected void init(String[] args){

        processInput(args);

    }

    /*
     * Process arguments and handle errors/debug display
     * */
    void processInput(String[] args){

        // Check commands
        if (args[0].equals(DataBasicCommands.HELP.toString())) {
            help();
            return;

        }

        /* Questions:
        * why I not need to return anymore from inside try/catch blocks in JacksonObject mapper, etc?
        * I catch all errors here?
        * */
        // Validate input
        try {
            new InputProcessor().validateInput(args);

        } catch (RuntimeException e) {
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
     * */
    private void help() {

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
    private String makeBold(String s) {
        String boldedString = "\u001B[1m";
        boldedString += s + "\u001B[0m";
        return boldedString;

    }


}

