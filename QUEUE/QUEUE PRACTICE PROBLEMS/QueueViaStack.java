package Udemy.Queue;
import java.util.Stack;
public class QueueViaStack {
    Stack<Integer> stackNewest, stackOldest;
    public QueueViaStack(){
        stackNewest= new Stack<Integer>();
        stackOldest= new Stack<Integer>();
    }
    public int size(){
        return stackNewest.size()+ stackOldest.size();
    }

    public void enqueue(int value){
        stackNewest.push(value);
    }
    private void shiftStacks(){
        if (stackOldest.isEmpty()){
            while (!stackNewest.isEmpty()) {
                int popedOut= stackNewest.pop();
                stackOldest.push(popedOut);
            }
        }
    }
    public int deQueue(){
        shiftStacks();
        return stackOldest.pop();
    }
    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }

    public static void main(String[] args) {
        QueueViaStack newQueue= new QueueViaStack();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());
    }
}
