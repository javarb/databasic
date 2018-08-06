package co.org.osso.databasic;

class Application{

    /**
     * Init application
     * @param args
     */
    protected void init(String[] args){

        try {
            InputProcessor processor = new InputProcessor(args);

        } catch (RuntimeException e) {
            if ("debug".equals(args[args.length - 1])){
                e.printStackTrace();

            } else {
                System.err.println(e.getMessage());
                processor.help();

            }
        }

    }

    /**
     * Process Input handling all errors here
     * @param processor
     * @param args
     */
    void processInput(InputProcessor processor, String[] args){

        try {
            processor.processInput(args);

        } catch (RuntimeException e) {
            if ("debug".equals(args[args.length - 1])){
                e.printStackTrace();

            } else {
                System.err.println(e.getMessage());
                processor.help();

            }
        }
    }

}

