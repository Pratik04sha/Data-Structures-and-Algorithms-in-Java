package Udemy.Stack.StackOfPlates;

public class Main {
    public static void main(String[] args) {
        SetOfStacks newStack= new SetOfStacks(3);
        newStack.push(2);
        newStack.push(9);
        newStack.push(1);
        newStack.push(10);
        newStack.push(17);
        System.out.println(newStack.popAt(1));
    }
}
