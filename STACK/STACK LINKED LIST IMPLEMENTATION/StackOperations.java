package Udemy.Stack.StackLinkedListImplementation;


import Udemy.SingleLinkedList.SingleLinkedListOperations;

public class StackOperations {
   SingleLinkedListOperations linkedList;

   public StackOperations(){
       linkedList= new SingleLinkedListOperations();
   }

   public void push(int value){     //Time Complexity: O(1)
       linkedList.insertInLinkedList(value, 0); //.........O(1)
       System.out.println("Inserted "+value+" in stack!!"); //.......O(1)
   }

   public boolean isEmpty(){    //Time Complexity: O(1)
       if (linkedList.head== null) { //.......O(1)
           return true;
       }
       else {   //.......O(1)
           return false;
       }
   }

   public int pop(){    //Time Complexity: O(1)
       int result=-1;   //.......O(1)
       if (isEmpty()){  //.......O(1)
           System.out.println("The Stack is empty!!");
       }
       else{    //.......O(1)
            result= linkedList.head.value;
            linkedList.deletionOfNode(0);
       }
       return result;   //.......O(1)
   }

   public int peek(){   //Time Complexity: O(1)
       if (isEmpty()){  //.......O(1)
           System.out.println("The Stack is empty!!");
           return -1;
       }
       else{    //.......O(1)
            return linkedList.head.value;
       }
   }

   public void deleteStack(){   //Time Complexity: O(1)
       linkedList.head= null;   //.......O(1)
       System.out.println("The stack is deleted successfully!!");   //.......O(1)
   }
}
