package Udemy.DynamicProgrammingProblemsImplementations.NumberFactorImplementation;

public class Main {
    public static void main(String[] args) {
        NumberFactorMemoization nm= new NumberFactorMemoization();
        System.out.println(nm.numberFactor(5));

        NumberFactorTabulation nt= new NumberFactorTabulation();
        System.out.println(nt.numTab(5));
    }


}
