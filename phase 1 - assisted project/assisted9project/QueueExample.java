package assisted9project;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Inserting elements (enqueue)
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue elements after enqueueing:");
        System.out.println(queue);

        // Removing elements (dequeue)
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue elements after dequeuing:");
        System.out.println(queue);
    }
}
