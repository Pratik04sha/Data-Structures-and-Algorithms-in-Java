package Udemy.Stack.StackArrayImplementation;

public class Main {
    public static void main(String[] args) {
        StackOperations newStack= new StackOperations(5);
        boolean result= newStack.isEmpty();
        System.out.println(result);
        boolean full= newStack.isFull();
        System.out.println(full);
        newStack.push(4);
        newStack.push(14);
        newStack.push(41);
        newStack.push(24);
        newStack.push(49);

        System.out.println(newStack.pop());
        System.out.println(newStack.peek());

        newStack.deleteStack();
    }
}
