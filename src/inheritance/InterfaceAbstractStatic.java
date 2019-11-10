package inheritance;

public class InterfaceAbstractStatic implements Operations{
    public int square(int a){
        return a*a;
    }

    public static void main(String args[]){
        System.out.println(new InterfaceAbstractStatic());
        // Method is static I don't need to instantiate
        Operations.msg();
    }
}

interface Operations {
    int square (int a);
    static void msg(){
        System.out.println("Static method");
    }
}