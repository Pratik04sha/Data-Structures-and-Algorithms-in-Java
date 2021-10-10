// QUESTION: Given	an	number	n.	Find	the	number	of	occurrences	of	n	in	the	array.	

package Practice;
import java.util.Scanner;
public class Occurrence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements of array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter a number whose occurrence you want to check:");
        int m= sc.nextInt();
        int o= 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==m){
                o++;
            }
        }
        System.out.println("Number of occurrences of "+m+ " is "+o);
    }
}
