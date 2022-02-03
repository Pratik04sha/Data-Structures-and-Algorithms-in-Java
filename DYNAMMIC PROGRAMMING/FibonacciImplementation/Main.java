package Udemy.DynamicProgrammingProblemsImplementations.FibonacciImplementation;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        FibonacciMemoization fib= new FibonacciMemoization();
        HashMap<Integer, Integer> memo= new HashMap<>();
        System.out.println(fib.fibMemo(5, memo));

        FibonacciTabulation ft= new FibonacciTabulation();
        System.out.println(ft.fibTab(5));
    }
}
