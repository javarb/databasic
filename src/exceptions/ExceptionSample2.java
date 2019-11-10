package exceptions;

public class ExceptionSample2 implements ExceptionThrowerSample2{

    public static void main (String args[]) {
        new ExceptionSample2().run();
    }

    void run(){
        a();
    }

    void a(){
        b();
    }

    void b(){
        c();
    }

    public void c(){
        try {
            throw new Exception("Exception in try/catch block");
        } catch (Exception e){
            e.printStackTrace();
            //System.err.println(e.getMessage());
        }
    }

}

interface ExceptionThrowerSample2 {
    void c ();
}