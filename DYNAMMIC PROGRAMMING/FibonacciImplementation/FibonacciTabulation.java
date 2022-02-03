package Udemy.DynamicProgrammingProblemsImplementations.FibonacciImplementation;

import java.util.ArrayList;

public class FibonacciTabulation {
    public int fibTab(int n){
        ArrayList<Integer> tb= new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for (int i = 2; i <=n-1; i++) {
            int n1= tb.get(i-1);
            int n2= tb.get(i-2);
            tb.add(n1+n2);
        }
        return tb.get(n-1);
    }
}
