package inheritance;

class Circle implements Shape{

    // fields
    double radius;

    // Constructor
    Circle(double radius){
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