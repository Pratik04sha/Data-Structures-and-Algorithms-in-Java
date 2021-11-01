package Udemy.Queue.QueueArrayImplementation;

public class Main {
    public static void main(String[] args) {
        QueueOperations newQueue= new QueueOperations(4);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        boolean res= newQueue.isFull();
        System.out.println(res);
        boolean res1= newQueue.isEmpty();
        System.out.println(res1);
        System.out.println(newQueue.peek());
        System.out.println(newQueue.deQueue());
        newQueue.deleteQueue();
        System.out.println(newQueue.deQueue());

    }
}
