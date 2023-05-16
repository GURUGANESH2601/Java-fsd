package assisted8project;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Inserting elements (push)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack elements after pushing:");
        System.out.println(stack);

        // Removing elements (pop)
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Stack elements after popping:");
        System.out.println(stack);
    }
}
