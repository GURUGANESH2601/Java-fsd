package project4;

public class ConstructorDemo {
    private String name;
    private int age;

    // Default constructor
    public ConstructorDemo() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public ConstructorDemo(ConstructorDemo obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        ConstructorDemo obj1 = new ConstructorDemo();
        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge());

        // Creating an object using the parameterized constructor
        ConstructorDemo obj2 = new ConstructorDemo("John", 30);
        System.out.println("Name: " + obj2.getName() + ", Age: " + obj2.getAge());

        // Creating an object using the copy constructor
        ConstructorDemo obj3 = new ConstructorDemo(obj2);
        System.out.println("Name: " + obj3.getName() + ", Age: " + obj3.getAge());
    }
}
