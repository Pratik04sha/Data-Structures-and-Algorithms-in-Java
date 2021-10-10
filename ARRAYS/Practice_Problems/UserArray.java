package Practice;
import java.util.Scanner;
public class UserArray {
    public static void main(String[] args) {
        int arr1[]= new int[10];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Enter the array element ["+(i+1)+"]:");
            arr1[i]= sc.nextInt();
        }
        System.out.println("Array is:");
        for (int i=0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
