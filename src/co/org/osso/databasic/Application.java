package co.org.osso.databasic;

class Application{

    /**
     * Init application
     * @param args
     */
    protected void init(String[] args){

        processInput(args);

    }

    /**
     * Something
     * @param args
     */
    void processInput(String[] args){

        // Check commands
        if (args[0].equals(DataBasicCommands.HELP.toString())) {
            help();
            return;
        }

        // Validate input, Handling all errors here
        try {
            InputProcessor processor = new InputProcessor();
            processor.validateInput(args);
            processor.processInput(args);

        } catch (RuntimeException e) {
            if ("debug".equals(args[args.length - 1])){
                e.printStackTrace();

            } else {
                System.err.println(e.getMessage());
                help();

            }
        }
    }

    /**
     * Shows help
     */
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

    /**
     * Format text in bold
     * @param s The string to bold
     * @return The emboldened text
     */
    private String makeBold(String s) {
        String boldedString = "\u001B[1m";
        boldedString += s + "\u001B[0m";
        return boldedString;

    }


}

