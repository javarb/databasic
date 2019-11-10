package inheritance;

public class MultipleInheritanceDefaultAndAbstractMethods extends Implementer{

    public static void main (String args[]){
        MultipleInheritanceDefaultAndAbstractMethods instance = new MultipleInheritanceDefaultAndAbstractMethods();
        // implemeter brings default methods messages
        instance.msg();
        System.out.println(instance.operationAdd(1,2));
        System.out.println(instance.operationMutlplication(2,5));
    }

}

abstract class Implementer implements a, b {
    @Override
    public int operationAdd(int a, int b) {
        return a+b;
    }

    @Override
    public double operationMutlplication(double a, double b) {
        return a*b;
    }

    @Override
    public void msg() {
        a.super.msg();
        b.super.msg();
    }
}

interface a {
    int operationAdd(int a, int b);
    default void msg (){
        System.out.println("In Default of a");
    }
}

interface b {
    double operationMutlplication(double a, double b);
    default void msg () {
        System.out.println("In default of b");
    }
}