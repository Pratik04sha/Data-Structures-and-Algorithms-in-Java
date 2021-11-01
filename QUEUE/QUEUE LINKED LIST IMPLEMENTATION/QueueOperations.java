package Udemy.Queue.QueueLinkedListImplementation;

public class QueueOperations {
    LinkedList list;

    public QueueOperations(){   // Time Complexity: O(1)
        list= new LinkedList(); //.........O(1)
        System.out.println("The Queue is successfully created!!");  //......O(1)
    }

    public boolean isEmpty(){   // Time Complexity: O(1)
        if (list.head== null){  //......O(1)
            return true;
        }
        else {  //....O(1)
            return false;
        }
    }

    public void enQueue(int value){     //Time Complexity: O(1)
        list.insertInLinkedList(value, list.size);  //......O(1)
        System.out.println("Successfully inserted "+value+" in the queue!!"); //......O(1)
    }

    public int deQueue(){   // Time Complexity: O(1)
        int value=-1;   //......O(1)
        if (isEmpty()){ //......O(1)
            System.out.println("The Queue is empty!!");
        }
        else {  //......O(1)
            value= list.head.value;
            list.deletionOfNode(0);
        }
        return value;   //......O(1)
    }

    public int peek(){  // Time Complexity: O(1)
        int value=-1;   //......O(1)
        if (isEmpty()){ //......O(1)
            System.out.println("The Queue is empty!!");
        }
        else {  //......O(1)
            value= list.head.value;
        }
        return value;   //......O(1)
    }

    public void deleteQueue(){
        list.head= null;
        list.tail= null;
        System.out.println("The Queue is successfully deleted!!");
    }
}
