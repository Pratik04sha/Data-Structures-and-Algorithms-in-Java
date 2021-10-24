package Udemy.Stack.StackArrayImplementation;

public class StackOperations {
    int arr[];
    int topOfStack;

    public StackOperations(int size) {  //Time Complexity: O(1)
        this.arr= new int[size];    //..........O(1)
        this.topOfStack= -1;    //..........O(1)
        System.out.println("The stack has been created of the size "+size); //..........O(1)
    }

    public boolean isEmpty(){   //Time Complexity: O(1)
        if (topOfStack==-1){    //..........O(1)
            return true;
        }
        else {  //..........O(1)
            return false;
        }
    }

    public boolean isFull(){    //Time Complexity: O(1)
        if (topOfStack== arr.length){   //..........O(1)
            System.out.println("Stack is full!!");
            return true;
        }
        else {  //..........O(1)
            return false;
        }
    }

    public void push(int value){    //Time Complexity: O(1)
        if (isFull()){  //..........O(1)
            System.out.println("The Stack is full!!");
        }
        else {  //..........O(1)
            arr[topOfStack+1]= value;
            topOfStack++;
            System.out.println("The value is successfully inserted!!");
        }
    }

    public int pop(){   //Time Complexity: O(1)
        if (isEmpty()){ //..........O(1)
            System.out.println("The stack is empty!!");
            return -1;
        }
        else{   //..........O(1)
            int topStack= arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){  //Time Complexity: O(1)
        if (isEmpty()){ //..........O(1)
            System.out.println("The stack is empty!!");
            return -1;
        }
        else {  //..........O(1)
            return arr[topOfStack];
        }
    }

    public void deleteStack(){  //Time Complexity: O(1)
        arr= null;  //..........O(1)
        System.out.println("The Stack is successfully deleted!!");  //..........O(1)
    }

}
