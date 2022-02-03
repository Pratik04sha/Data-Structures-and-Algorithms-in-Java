package Udemy.GreedyAlgorithmsImplementations.CoinChangeProblemImplementation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins= {1, 2, 5, 10, 20, 50, 100, 1000};
        int amount= 2035;
        System.out.println("Coins Available: "+ Arrays.toString(coins));
        System.out.println("Target Amount: "+ amount);
        CoinChangeProblem.coinChangeProblem(coins, amount);
    }
}
