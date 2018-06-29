package inheritance;

public class Main {

    //    Alt enter and run this (when there are several main)
    public static void main(String[] args) {

        reportShape(new Square(10));
        reportShape(new Circle(1));
    }

    private static void reportShape(Shape shape) {
        System.out.println("area = " + shape.area());
        System.out.println("circumference = " + shape.circumference());
    }

}