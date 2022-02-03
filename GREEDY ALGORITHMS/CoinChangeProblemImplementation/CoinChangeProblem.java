package Udemy.GreedyAlgorithmsImplementations.CoinChangeProblemImplementation;
import java.util.Arrays;
public class CoinChangeProblem {
    static void coinChangeProblem(int[] coins, int N){  // Time Complexity: O(NlogN)
        Arrays.sort(coins); //.....O(NlogN)
        int index= coins.length-1;  //.....O(1)
        while (true){   //.....O(N)
            int coinValue= coins[index];    //.....O(1)
            index--;    //.....O(1)
            int maxAmount= (N/coinValue)*coinValue; //.....O(1)
            if (maxAmount>0){   //.....O(1)
                System.out.println("Coin Value: "+coinValue+" taken count: "+(N/coinValue));
                N= N-maxAmount;
            }
            if (N==0){  //.....O(1)
                break;
            }
        }
    }
}
