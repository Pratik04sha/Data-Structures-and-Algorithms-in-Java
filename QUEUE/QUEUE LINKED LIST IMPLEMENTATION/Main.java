package Udemy.Queue.QueueLinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        QueueOperations newQ= new QueueOperations();
        System.out.println(newQ.isEmpty());
        newQ.enQueue(5);
        newQ.enQueue(9);
        newQ.enQueue(8);

        System.out.println(newQ.deQueue());
        System.out.println(newQ.peek());

        newQ.deleteQueue();
    }
}
