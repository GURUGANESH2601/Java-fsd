package AssistedPracticeProject2;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println("Public variable: " + myObj.publicVar);
        System.out.println("Protected variable: " + myObj.getProtectedVar());
        System.out.println("Private variable: " + myObj.getPrivateVar());
    }
}

class MyClass {
    public int publicVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30;

    public int getProtectedVar() {
        return protectedVar;
    }

    public int getPrivateVar() {
        return privateVar;
    

	}

}
