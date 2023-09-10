package Data_structures;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push() method
        stack.push("First");
        stack.push("Third");
        stack.push("Fourth");

        //add() method
        stack.add("Five");
        System.out.println(stack);

        //add(index,element)
        stack.add(1,"Second");
        System.out.println(stack);

        //set(index,element) - change value
        stack.set(4,"Fifth");
        System.out.println(stack);

        //get(index) element
        System.out.println(stack.get(3));

        //
        stack.pop();
        System.out.println(stack);

        //
        System.out.println(stack.empty());
        System.out.println(stack);

        //
        System.out.println(stack.isEmpty());
        System.out.println(stack);

        //peek()- top of the stack element
        System.out.println(stack.peek());

    }
}
