package Udemy.Queue.CircularQueue;

public class CircularQueueOperations {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueueOperations(int size){      //Time Complexity: O(1)
        this.arr= new int[size];    //......O(1)
        this.topOfQueue=-1; //......O(1)
        this.beginningOfQueue= -1;  //......O(1)
        this.size= size;    //......O(1)
        System.out.println("Successfully created circular queue of size "+size);    //......O(1)
    }

    public boolean isEmpty(){   //Time Complexity: O(1)
        if (topOfQueue==-1){    //.....O(1)
            return true;
        }
        return false;   //....O(1)
    }

    public boolean isFull(){    // Time Complexity: O(1)
        if (topOfQueue+1== beginningOfQueue){   //.........O(1)
            return true;
        }
        else if (beginningOfQueue==0 && topOfQueue+1== size){   //.........O(1)
            return true;
        }
        else {  //.........O(1)
            return false;
        }
    }

    public void enQueue(int value){     // Time Complexity: O(1)
        if (isFull()){  //.........O(1)
            System.out.println("The CQ is full!!");
        }
        else if (isEmpty()){    //.........O(1)
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]= value;
            System.out.println("Successfully inserted "+value+" in the CQ!!");
        }
        else {  //.........O(1)
            if (topOfQueue+1==size){    //.........O(1)
                topOfQueue=0;
            }
            else {  //.........O(1)
                topOfQueue++;
            }
            arr[topOfQueue]= value; //.........O(1)
            System.out.println("Successfully inserted "+value+" in the CQ!!");  //.........O(1)
        }
    }

    public int deQueue(){       // Time Complexity: O(1)
        if (isEmpty()){     //.......O(1)
            System.out.println("The CQ is empty!!");
            return -1;
        }
        else {
            int res= arr[beginningOfQueue]; //.......O(1)
            arr[beginningOfQueue]=0;    //.......O(1)
            if (beginningOfQueue== topOfQueue){ //.......O(1)
                beginningOfQueue= -1;
                topOfQueue=-1;
            }
            else if (beginningOfQueue+1== size){    //.......O(1)
                beginningOfQueue=0;
            }
            else {  //.......O(1)
                beginningOfQueue++;
            }
            return res; //.......O(1)
        }
    }

    public int peek(){      // Time Complexity: O(1)
        if (isEmpty()){     //........O(1)
            System.out.println("The CQ is empty!!");
            return -1;
        }
        else {  //........O(1)
            return arr[beginningOfQueue];
        }
    }

    public void deleteQueue(){      //Time Complexity: O(1)
        arr= null;  //........O(1)
        System.out.println("The queue is successfully deleted");    //........O(1)
    }
}
