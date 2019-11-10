package inheritance;

public class GeometricPractice {
 public static void main(String args[]){
     PracticeSquare square = new PracticeSquare(10);
     PracticeCircle circle = new PracticeCircle(1);
     System.out.println("circle area = " + circle.area());
     System.out.println("circle circumference = " + circle.circumference());
     System.out.println("square area = " + square.area());
     System.out.println("square circumference = " + square.circumference());
 }

}

class PracticeCircle implements shape{
    double radius;

    PracticeCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return Math.PI * 2 * radius;
    }
}

class PracticeSquare implements shape{

    double sideLenght;

    PracticeSquare(double sideLenght){
        this.sideLenght = sideLenght;
    }

    @Override
    public double area() {
        return sideLenght * sideLenght;
    }

    @Override
    public double circumference() {
        return sideLenght*4;
    }
}

interface shape {
    double area();
    double circumference();
}