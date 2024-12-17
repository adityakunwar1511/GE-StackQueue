import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stackList;

    public Stack() {
        stackList = new LinkedList<>();
    }

    // Push operation (Add an element to the top of the stack)
    public void push(T data) {
        stackList.addFirst(data); // Adds element at the beginning
        System.out.println("Pushed: " + data);
    }

    // Peek operation (View the top element without removing it)
    public T peek() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackList.getFirst();
    }

    // Pop operation (Remove and return the top element)
    public T pop() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        T removedElement = stackList.removeFirst();
        System.out.println("Popped: " + removedElement);
        return removedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // Display stack elements
    public void displayStack() {
        System.out.println("Stack (Top to Bottom): " + stackList);
    }
}
