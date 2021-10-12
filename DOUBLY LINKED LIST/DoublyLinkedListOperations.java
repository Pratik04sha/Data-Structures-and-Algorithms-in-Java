package Udemy.DoublyLinkedList;

public class DoublyLinkedListOperations {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue){     // Time Complexity: O(1)
        head= new DoublyNode();     //....................O(1)
        DoublyNode newNode= new DoublyNode();   //....................O(1)
        newNode.value= nodeValue;   //....................O(1)
        newNode.next=null;  //....................O(1)
        newNode.prev=null;  //....................O(1)
        head= newNode;  //....................O(1)
        tail= newNode;  //....................O(1)
        size=1; //....................O(1)

        return head;    //....................O(1)
    }

    public void insertDLL(int nodeValue, int location){ //Time Complexity: O(N)
        DoublyNode newNode= new DoublyNode();   //...................O(1)
        newNode.value= nodeValue;   //...................O(1)
        if (head== null){   //...................O(1)
            createDLL(nodeValue);
            return;
        }
        else if (location==0){  //...................O(1)
            newNode.next= head;
            newNode.prev= null;
            head.prev= newNode;
            head= newNode;
        }
        else if (location>= size){  //...................O(1)
            newNode.next= null;
            tail.next= newNode;
            newNode.prev= tail;
            tail= newNode;
        }
        else {
            DoublyNode tempNode= head;  //...................O(1)
            int index=0;    //...................O(1)
            while (index< location-1){  //...................O(N)
                tempNode= tempNode.next;
                index++;
            }
            newNode.prev= tempNode; //...................O(1)
            newNode.next= tempNode.next;    //...................O(1)
            tempNode.next= newNode; //...................O(1)
            newNode.next.prev= newNode; //...................O(1)
        }
        size++; //...................O(1)
    }

    public void transversalDLL(){   // Time Complexity: O(N)
        if (head!= null){
            DoublyNode tempNode= head;  //............O(1)
            for (int i = 0; i < size; i++) {      //............O(N)
                System.out.print(tempNode.value);
                if (i!= size-1){    //............O(1)
                    System.out.print("-->");
                }
                tempNode= tempNode.next;    //............O(1)
            }
        }
        else {
            System.out.println("The DLL does not exists!!");    //............O(1)
        }
        System.out.println();   //............O(1)
    }

    public void reverseTransversalDLL(){    // Time Complexity: O(N)
        if (head!= null){   //............O(1)
            DoublyNode tempNode= tail;
            for (int i = 0; i < size; i++) {    //............O(N)
                System.out.print(tempNode.value);
                if (i!= size-1){    //............O(1)
                    System.out.print("<--");
                }
                tempNode= tempNode.prev;    //............O(1)
            }
        }
        else {
            System.out.println("The DLL does not exists!!");    //............O(1)
        }
        System.out.println();   //............O(1)
    }

    public boolean searchNode(int nodeValue){   // Time Complexity: O(N)
        if (head!= null){
            DoublyNode tempNode= head;  //...........O(1)
            for (int i = 0; i < size; i++) {    //...........O(N)
                if (tempNode.value== nodeValue){    //...........O(1)
                    System.out.println("Node found at location: "+i);   //...........O(1)
                    return true;    //...........O(1)
                }
                tempNode= tempNode.next;    //...........O(1)
            }
        }
        System.out.println("Node not found!!"); //...........O(1)
        return false;   //...........O(1)
    }

    public void deleteNode(int location){   // Time Complexity: O(N)
        if(head== null){    //.................O(1)
            System.out.println("The DLL does not exists!!");
            return;
        }
        else if (location==0){
            if (size==1){   //.................O(1)
                head= null;
                tail= null;
                size--;
                return;
            }
            else {  //.................O(1)
                head= head.next;
                head.prev= null;
                size--;
            }
        }
        else if (location>= size){
            DoublyNode tempNode= tail.prev; //.................O(1)
            if (size==1){   //.................O(1)
                head= null;
                tail= null;
                size--;
                return;
            }
            else {  //.................O(1)
                tempNode.next= null;
                tail= tempNode;
                size--;
            }
        }
        else{
            DoublyNode tempNode= head;  //.................O(1)
            for (int i = 0; i < location - 1; i++) {    //.................O(N)
                tempNode= tempNode.next;
            }
            tempNode.next= tempNode.next.next;  //.................O(1)
            tempNode.next.prev= tempNode;   //.................O(1)
            size--; //.................O(1)
        }
    }

    public void deleteDLL(){    // Time Complexity: O(N)
        DoublyNode tempNode= head;  //.................O(1)
        for (int i = 0; i < size; i++) {    //.................O(N)
            tempNode.prev= null;
            tempNode= tempNode.next;
        }
        head= null; //.................O(1)
        tail= null; //.................O(1)
        System.out.println("The DLL has been deleted successfully!!");  //.................O(1)
    }
}
