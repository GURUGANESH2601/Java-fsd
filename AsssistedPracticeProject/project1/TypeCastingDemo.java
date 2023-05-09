package TypeCastingDemo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		        // Implicit type casting: smaller data type to larger data type
		        int num1 = 10;
		        double num2 = num1;
		        System.out.println("Implicit type casting: " + num1 + " (int) to " + num2 + " (double)");

		        // Explicit type casting: larger data type to smaller data type
		        double num3 = 15.5;
		        int num4 = (int) num3;
		        System.out.println("Explicit type casting: " + num3 + " (double) to " + num4 + " (int)");
		    }
		

	}


