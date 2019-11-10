package exceptions;

class Application implements ExceptionThrower{

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        a();
    }

    private void a() {
        b();
    }

    private void b() {
        c();
    }

    private void c() {
        d();
    }

    private void d() {
        e();
    }

    /*For throw this exception is needed or try catch block or put Exception in method*/
    public void e() {
        try {
            throw new Exception("Exception here!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}

interface ExceptionThrower{
    void e() throws Exception;
}