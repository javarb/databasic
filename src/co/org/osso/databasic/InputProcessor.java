package co.org.osso.databasic;

class InputProcessor {

    /**
     * Process the input args: help, insert or a query
     * @param args
     */
    void validateInput(String[] args) {

        // TODO: Validate empty string

        if (args[0].equals(DataBasicCommands.INSERT.toString())) {
            if (args.length != 2) {
                throw new RuntimeException("Error: You have to provide a path to JSON file");
            }
            return;
        }

        // Default, make a query
        // TODO: Validate and process the query
        System.out.println("Querying...");

    }

    /**
     * Process inserted path to JSON file
     * @param arg
     */
    private void processInsert(String arg) {

        // Corner case: Provided file is empty ""
        if (arg.isEmpty()) {
            throw new RuntimeException("Error: The provided path is empty");
            /*System.err.println("Error: The provided path is empty");
            help();
            return;*/
        }

        new JacksonObjectMapper().processJSONFile(arg);

    }

    public void processInput(String[] args) {
        processInsert(args[1]);
    }
}