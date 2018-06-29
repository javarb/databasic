package inheritance;

class Square implements Shape{

    // fields
    private double sideLength;

    // Constructor
    Square(double sideLength) {
        // "this" is needed is because the name is the same that the field
        this.sideLength = sideLength;
    }

    // this is saying this is overriding the method in the superclass or interface
    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double circumference() {
        return sideLength * 4;
    }



}