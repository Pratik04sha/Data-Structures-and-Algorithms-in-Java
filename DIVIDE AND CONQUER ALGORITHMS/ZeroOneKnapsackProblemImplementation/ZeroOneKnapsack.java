package Udemy.DivideAndConquerAlgorithmsImplementations.ZeroOneKnapsackProblemImplementation;

public class ZeroOneKnapsack {
    private int knapsack(int[] profits, int[] weights, int capacity, int currIndex){
        if (capacity<=0 || currIndex<0 || currIndex>= profits.length){
            return 0;
        }
        int profit1=0;
        int profit2=0;
        if (weights[currIndex]<= capacity){
            profit1= profits[currIndex]+ knapsack(profits, weights, capacity-weights[currIndex], currIndex+1);
            profit2= knapsack(profits, weights, capacity, currIndex+1);
        }
        return Math.max(profit1, profit2);
    }

    public int knapsack(int[] profits, int[] weights, int capacity){
        return knapsack(profits, weights, capacity, 0);
    }
}
