package Data_structures;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);

        //add() method
        stack.add("Fourth");
        System.out.println(stack);

        //
        stack.pop();
        System.out.println(stack);

        //
        System.out.println(stack.isEmpty());
        System.out.println(stack);

        //peek()- top of the stack element
        System.out.println(stack.peek());

        //poll()- top of the stack element
        System.out.println(stack.poll());
    }
}
