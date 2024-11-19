class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return queue[front++];
        }
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public int peek() {
        if (!isEmpty()) {
            return queue[front];
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }
}

public class q26 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Elements dequeued from queue: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
