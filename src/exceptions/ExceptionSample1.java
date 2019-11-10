package exceptions;

/**
 * throw an exception needs to bubble throw in method definition
 */
public class ExceptionSample1 implements ExceptionThrowerSample1 {

    public static void main (String args[]) throws Exception {
        new ExceptionSample1().run();
    }

    private void run() throws Exception {
        a();
    }

    private void a() throws Exception {
        b();
    }

    public void b() throws Exception {
        throw new Exception("Sample exception!");
    }
}

interface ExceptionThrowerSample1{
    void b() throws Exception;
}