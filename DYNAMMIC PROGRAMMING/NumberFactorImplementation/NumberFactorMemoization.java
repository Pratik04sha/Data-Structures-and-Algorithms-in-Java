package Udemy.DynamicProgrammingProblemsImplementations.NumberFactorImplementation;

public class NumberFactorMemoization {
    public int numberFactor(int n, int[] memo){
        if (n==0 || n==1 || n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }
        if (memo[n]==0){
            int rec1= numberFactor(n-1, memo);
            int rec2= numberFactor(n-3, memo);
            int rec3= numberFactor(n-4, memo);

            memo[n]=(rec1+rec2+rec3);
        }
        return memo[n];
    }
    public int numberFactor(int n){
        int[] dp= new int[n+1];
        return numberFactor(n, dp);
    }
}
