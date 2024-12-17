public class Main {
    public static void main(String[] args) {
        System.out.println("===== Stack Operations =====");
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.displayStack();

        System.out.println("Top Element (Peek): " + stack.peek());
        while (!stack.isEmpty()) {
            stack.pop();
        }

        System.out.println("\n===== Queue Operations =====");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.displayQueue();

        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }
}
