package inheritance;

/**
 * Interface with abstrac method
 * and default method
 *
 * Within interfaces, all method definitions are implicitly abstract.
 * You can provide the keyword, though, but there won't be any difference.
 *
 * Within abstract classes, however, when you want to denote a method as abstract,
 * you're required to type the abstract keyword.
 * This actually makes the code more readable and easy to be understood.
 * https://stackoverflow.com/a/29967883/4278635
 */

public class InterfaceAbstractDefault implements OperationsInterface {
    public int square(int a) {
        return a*a;
    }
    public static void main(String args[]){
        InterfaceAbstractDefault interfaceSample1 = new InterfaceAbstractDefault();
        System.out.println(interfaceSample1.square(2));
        interfaceSample1.msg();
    }
}

interface OperationsInterface {
    // this is abstract but I don't need to use abstract keyword
    //abstract int square(int a);
    int square(int a);

    default void msg() {
        System.out.println("Default method");
    }
}
