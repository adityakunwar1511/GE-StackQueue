import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queueList;

    public Queue() {
        queueList = new LinkedList<>();
    }

    // Enqueue operation (Add an element to the end of the queue)
    public void enqueue(T data) {
        queueList.addLast(data); // Adds element at the end
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation (Remove and return the first element)
    public T dequeue() {
        if (queueList.isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        }
        T removedElement = queueList.removeFirst();
        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // Display queue elements
    public void displayQueue() {
        System.out.println("Queue (Front to End): " + queueList);
    }
}
