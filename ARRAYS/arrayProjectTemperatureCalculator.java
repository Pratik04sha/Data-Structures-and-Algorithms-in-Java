package Udemy;
import java.util.Scanner;
public class arrayProjectTemperatureCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many days?");
        int numDays= sc.nextInt();
        int[] temps= new int[numDays];
        int sum=0;
        for (int i=0; i<numDays; i++){
            System.out.println("Day "+(i+1)+"'s temperature:");
            temps[i]=sc.nextInt();
            sum+=temps[i];
        }
        double avg= sum/numDays;
        System.out.println();
        System.out.println("Average temperature is: "+avg);
        int counter=0;
        for (int i=0; i<numDays; i++){
            if (temps[i]>avg){
                counter++;
            }
        }
        System.out.println("Number of days having temperature above the average temperature are: "+counter);
    }
}
