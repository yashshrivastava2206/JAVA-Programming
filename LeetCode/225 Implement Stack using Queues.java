/*
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
*/
class MyStack {
    List<Integer> list;
    public MyStack() {
        list =new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        int x=list.get(list.size()-1);
        list.remove(list.size()-1);
        return x;
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public boolean empty() {
        return list.size()==0?true:false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
