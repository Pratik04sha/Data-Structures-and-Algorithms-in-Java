package Udemy.Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueueOperations newCQ= new CircularQueueOperations(3);
        newCQ.enQueue(5);
        System.out.println(newCQ.isEmpty());
        System.out.println(newCQ.isFull());
        newCQ.enQueue(4);
        newCQ.enQueue(10);
        newCQ.enQueue(1);

        System.out.println(newCQ.deQueue());
        System.out.println(newCQ.peek());
        newCQ.deleteQueue();
    }
}
