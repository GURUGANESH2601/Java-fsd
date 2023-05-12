package assistedproject8;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class ObjectOrientedDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", 3);
        Cat cat = new Cat("Whiskers", 2);

        dog.eat();
        cat.sleep();

        dog.bark();
        cat.meow();
    }
}
