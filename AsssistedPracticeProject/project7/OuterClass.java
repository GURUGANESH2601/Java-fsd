package project7;

public class OuterClass {
    private String message = "Hello, World!";

    public void printMessage() {
        System.out.println(message);
    }

    public class InnerClass {
        public void printMessage() {
            System.out.println("Message from inner class: " + message);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.printMessage();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printMessage();
    }
}
