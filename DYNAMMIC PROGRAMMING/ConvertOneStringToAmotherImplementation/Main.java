package Udemy.DynamicProgrammingProblemsImplementations.ConvertOneStringToAmotherImplementation;

public class Main {
    public static void main(String[] args) {
        ConvertStringMemoization csm= new ConvertStringMemoization();
        System.out.println(csm.findMinOp("catch","carch"));
        ConvertStringTabulation cst= new ConvertStringTabulation();
        System.out.println(cst.findMinOp("catch","carch"));
    }
}
