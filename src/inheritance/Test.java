package inheritance;

class Person {
    String name, address;
    int age;
    public Person(String name, String address, int age) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
}
class Employee extends Person {
    float salary;
    public Employee (String name, String address, int age, float salary) {
        super(name,address,age);
        this.salary = salary;
    }
}
public class Test {
    public static void main (String args[]) {
        Employee e = new Employee("Javier", "Colombia", 35, 2462000);
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address);
        // final can be only changed first time
        final int i;
        i = 20;
        System.out.println(i);
    }
}