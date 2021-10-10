package Practice;
import java.util.Scanner;
public class CheckElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter a element that you want to check whether it is present in array or not:");
        int m= sc.nextInt();
        boolean a= false;
        for (int i=0; i< arr.length; i++){
            if(arr[i]==m){
                a= true;
                break;
            }
        }
        System.out.println(a);

    }
}
