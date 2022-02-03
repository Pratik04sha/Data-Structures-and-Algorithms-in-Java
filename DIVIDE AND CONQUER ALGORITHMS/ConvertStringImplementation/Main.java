package Udemy.DivideAndConquerAlgorithmsImplementations.ConvertStringImplementation;

public class Main {
    public static void main(String[] args) {
        ConvertOneStringToAnother str= new ConvertOneStringToAnother();
        System.out.println(str.findMinimumOperation("table","tbres"));
        System.out.println(str.findMinimumOperation("table","tble"));
        System.out.println(str.findMinimumOperation("table","tables"));
    }
}
