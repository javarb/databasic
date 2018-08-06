package co.org.osso.databasic;

/**
 *     Enums always would be uppercase (see comment in GitHub)
 *     https://stackoverflow.com/a/19894176
 */
enum DataBasicCommands {
    INSERT, QUERY, HELP;

    // Type toString and tab/enter
    @Override
    public String toString() {
        return name().toLowerCase();

    }
}