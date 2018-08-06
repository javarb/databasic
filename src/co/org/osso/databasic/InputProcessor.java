package co.org.osso.databasic;

class InputProcessor {

    InputProcessor(String[] args) {

        processInput(args);

    }

    /**
     * Process input validating args: Help, insert or query
     * @param args
     */
    void processInput(String[] args) {

        if (args[0].equals(DataBasicCommands.INSERT.toString())) {
            if (args.length != 2) {
                throw new RuntimeException("Error: You have to provide a path to JSON file");

            } else if (args[1].isEmpty()) {
                throw new RuntimeException("Error: The provided path is empty");

            }

            new JacksonObjectMapper().processJSONFile(args[1]);


        } else if (args[0].equals(DataBasicCommands.QUERY.toString())){
            if (args.length != 3) {
                throw new RuntimeException("Error: A valid query needs to have 3 arguments");

            } else if (args[1].isEmpty()) {
                throw new RuntimeException("Error: The provided query is empty");

            } else if (args[2].isEmpty()) {
                throw new RuntimeException("Error: You must to provide a valid JSON path");

            }

            // TODO: Implement query

        } else if (args[0].equals(DataBasicCommands.HELP.toString())) {
            help();

        } else {
            throw new RuntimeException("Error: Command not recognized");

        }

    }

    /**
     * Shows help
     */
    void help() {

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