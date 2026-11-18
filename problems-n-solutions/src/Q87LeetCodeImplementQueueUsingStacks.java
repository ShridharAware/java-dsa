import java.util.Stack;

public class Q87LeetCodeImplementQueueUsingStacks {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public Q87LeetCodeImplementQueueUsingStacks() {
            first = new Stack<>();
            second = new Stack<>();
        }

        // Insert element into queue
        public void push(int x) {
            first.push(x);
        }

        // Remove and return front element
        public int pop() {
            if (empty()) {
                throw new RuntimeException("Queue is empty");
            }

            while (!first.isEmpty()) {
                second.push(first.pop());
            }

            int ele = second.pop();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }

            return ele;
        }

        // Return front element without removing it
        public int peek() {
            if (empty()) {
                throw new RuntimeException("Queue is empty");
            }

            while (!first.isEmpty()) {
                second.push(first.pop());
            }

            int ele = second.peek();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }

            return ele;
        }

        // Check whether queue is empty
        public boolean empty() {
            return first.isEmpty();
        }

        public static void main(String[] args) {

            Q87LeetCodeImplementQueueUsingStacks queue = new Q87LeetCodeImplementQueueUsingStacks();

            queue.push(10);
            queue.push(20);
            queue.push(30);

            System.out.println("Front: " + queue.peek());
            System.out.println("Pop: " + queue.pop());
            System.out.println("Pop: " + queue.pop());

            queue.push(40);

            System.out.println("Front: " + queue.peek());
            System.out.println("Pop: " + queue.pop());
            System.out.println("Pop: " + queue.pop());

            System.out.println("Is Empty: " + queue.empty());
        }
}
