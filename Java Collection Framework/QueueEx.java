package Data_structures;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        System.out.println(queue);
        queue.add("Five");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.contains("Three"));
        System.out.println(queue.isEmpty());
        System.out.println(queue);


        Queue<String> queueDeque = new ArrayDeque<>(queue);
        System.out.println(queueDeque);


        Queue<String> priorityQueue = new PriorityQueue<>(queueDeque);
        System.out.println(priorityQueue);
    }
}
