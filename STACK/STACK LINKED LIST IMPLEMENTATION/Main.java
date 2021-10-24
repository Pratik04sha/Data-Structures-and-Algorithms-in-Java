package Udemy.Stack.StackLinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        StackOperations newStack= new StackOperations();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        boolean res= newStack.isEmpty();
        System.out.println(res);
        int val= newStack.pop();
        System.out.println(val);
        int p= newStack.peek();
        System.out.println(p);

        newStack.deleteStack();

    }
}
