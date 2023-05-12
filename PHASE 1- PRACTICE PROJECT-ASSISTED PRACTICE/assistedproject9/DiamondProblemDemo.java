package assistedproject9;

interface InterfaceA {
    default void print() {
        System.out.println("Printing from InterfaceA");
    }
}

interface InterfaceB extends InterfaceA {
    default void print() {
        System.out.println("Printing from InterfaceB");
    }
}

class ClassC implements InterfaceA, InterfaceB {
    public void print() {
        InterfaceB.super.print();
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.print();
    }
}