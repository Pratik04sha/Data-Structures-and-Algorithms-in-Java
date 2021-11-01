package Udemy.Queue.QueueArrayImplementation;

public class QueueOperations {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueOperations(int size){   //Time Complexity: O(1)
        this.arr= new int[size];    //..........O(1)
        this.topOfQueue=-1; //..........O(1)
        this.beginningOfQueue=-1;   //..........O(1)
        System.out.println("Queue of size "+size+" created successfully!!");    //..........O(1)
    }

    public boolean isFull(){    //Time Complexity: O(1)
        if (topOfQueue== arr.length-1){ //..........O(1)
            return true;
        }
        else {  //..........O(1)
            return false;
        }
    }

    public boolean isEmpty(){   // Time Complexity: O(1)
        if (beginningOfQueue== -1 || beginningOfQueue== arr.length){    //..........O(1)
            return true;
        }
        else {  //..........O(1)
            return false;
        }
    }

    public void enQueue(int value){     //Time Complexity: O(1)
        if (isFull()){      //.........O(1)
            System.out.println("The queue is full!!");
        }
        else if (isEmpty()){    //.........O(1)
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted "+value+" in the queue!");
        }
        else {      //.........O(1)
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted "+value+" in the queue!");
        }
    }

    public int deQueue(){   //Time Complexity: O(1)
        if (isEmpty()){ //.........O(1)
            System.out.println("The queue is empty!!");
            return -1;
        }
        int res= arr[beginningOfQueue]; //.........O(1)
        beginningOfQueue++; //.........O(1)
        if (beginningOfQueue> topOfQueue){  //.........O(1)
            beginningOfQueue= -1;
            topOfQueue= -1;
        }
        return res; //.........O(1)
    }

    public int peek(){  //Time Complexity: O(1)
        if (isEmpty()){ //.........O(1)
            System.out.println("The queue is empty!!");
            return -1;
        }
        return arr[beginningOfQueue];   //......O(1)
    }

    public void deleteQueue(){  // Time Complexity: O(1)
        arr= null;  //.......O(1)
        System.out.println("Queue deleted successfully!!"); //.......O(1)
    }
}
