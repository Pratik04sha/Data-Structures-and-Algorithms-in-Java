// QUESTION: Write	a	program	to	reverse	the	array.

package Practice;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements of array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            arr[i]= sc.nextInt();
        }
        System.out.println("The reversed array is:");
        for (int i= n-1; i>=0; i-- ){
            System.out.print(arr[i]+" ");
        }
    }
}
