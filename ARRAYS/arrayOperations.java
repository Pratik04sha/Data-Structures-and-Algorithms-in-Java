public class arrayOperations {
    int[] arr= null;

    public arrayOperations(int sizeOfArray){
        arr= new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted){
        try {
            if (arr[location]==Integer.MIN_VALUE){
                arr[location]=valueToBeInserted;
                System.out.println("Successfully Inserted!!");
            }
            else {
                System.out.println("Index already occupied!!");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!!");
        }
    }

    public void searchInArray(int valueToSearch){
        for(int i=0; i<arr.length; i++){
            if (arr[i]==valueToSearch){
                System.out.println("Value found at index "+ i);
                return;
            }else {
                System.out.println("Value not found!!");
            }
        }
    }

    public void deleteValue(int index){
        try {
            arr[index]= Integer.MIN_VALUE;
            System.out.println("Value at that index deleted successfully!!");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index not found!!");
        }
    }

    public void transversal(){
        try{
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
        catch (Exception e){
            System.out.println("Array no longer exists!!");
        }

    }
    public static void main(String[] args) {
        arrayOperations operation= new arrayOperations(5);
        operation.insert(0,10);
        operation.insert(1,20);
        operation.insert(2,30);

        System.out.println("Array transversal:");
        operation.transversal();
        operation.searchInArray(10);

        operation.deleteValue(2);
    }
}
