package Udemy.DynamicProgrammingProblemsImplementations.FibonacciImplementation;

import java.util.HashMap;

public class FibonacciMemoization {
    public int fibMemo(int n, HashMap<Integer, Integer> memo){
        if (n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        if (!memo.containsKey(n)){
            memo.put(n, (fibMemo(n-1, memo))+(fibMemo(n-2, memo)));
        }
        return memo.get(n);
    }
}
