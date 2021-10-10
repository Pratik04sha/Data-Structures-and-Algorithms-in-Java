package Practice;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size=0;

    static class Node{
        int value;
        Node next;
    }
    public void createLinkedList(int nodeValue){
        head = new Node();
        Node newNode= createNewNode(nodeValue);
        newNode.next= null;
        head= newNode;
        tail= newNode;
        size=1;
    }

    public Node createNewNode(int nodeValue){
        Node newNode= new Node();
        newNode.value= nodeValue;
        return newNode;
    }

    public  void addNodeAtBegin(int nodeValue){
        if(head== null){
            createLinkedList(nodeValue);
            return;
        }
        Node newNode= createNewNode(nodeValue);
        newNode.next= head;
        head= newNode;
        size++;
    }

    public void addNodeAtEnd(int nodeValue){
        if(head== null){
            createLinkedList(nodeValue);
            return;
        }
        Node newNode= createNewNode(nodeValue);
        tail.next= newNode;
        tail= newNode;
        size++;
    }

    public void deleteNode(int index){
        if (head==null){
            return;
        }
        else if (index==0){
            head= head.next;
            size--;
            if (size==0){
                tail= null;
            }
        }
        else if (index>= size){
            Node curr= head;
            for (int i = 0; i < size - 1; i++) {
                curr= curr.next;
            }
            if (curr== head){
                head= tail= null;
                size--;
                return;
            }
            curr.next= null;
            tail=curr;
            size--;
        }
        else{
            Node curr= head;
            for (int i = 0; i < index-1; i++) {
                curr= curr.next;
            }
            curr.next= curr.next.next;
            size--;
        }
    }

    public int length(){
        System.out.println(size);
        return size;
    }

    public void traversal(){
        Node curr= head;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value+" ");
            curr= curr.next;
        }
        System.out.println();
    }

    public void search(int k){
        if (head== null){
            return;
        }
        Node curr= head;
        for (int i = 0; i < size; i++) {
            if (curr.value== k){
                System.out.println("Found at index "+i);
                return;
            }
            curr= curr.next;
        }
        System.out.println("Value not found!!");
    }

    public void getNthNode(int n){
        if (head== null){
            return;
        }
        Node curr= head;
        for (int i = 1; i < n; i++) {
            curr= curr.next;
        }
        System.out.println("Nth node value is:"+ curr.value);
    }

    public void getCount(int nodeValue){
        int count=0;
        Node curr= head;
        for (int i = 0; i < size; i++) {
            if (curr.value== nodeValue){
                count++;
            }
            curr= curr.next;
        }
        System.out.println("Count of "+nodeValue+" in list is:"+ count);
    }

    public void getMinMax(){
        int min= head.value;
        int max= head.value;
        Node curr= head;
        for (int i = 0; i < size; i++) {
            if (curr.value< min){
                min= curr.value;
            }
            if (curr.value> max){
                max= curr.value;
            }
            curr= curr.next;
        }
        System.out.println("Minimum value in the list is:"+ min);
        System.out.println("Maximum value in the list is:"+ max);
    }

    public void convertToCSLL(){
        tail.next= head;
    }

    public static void main(String[] args) {
        SinglyLinkedList s= new SinglyLinkedList();
        s.createLinkedList(5);
        s.addNodeAtBegin(4);
        s.addNodeAtBegin(3);
        s.addNodeAtEnd(6);
        s.addNodeAtEnd(10);
        s.addNodeAtEnd(10);
        s.addNodeAtEnd(10);
        s.length();
        s.traversal();
        s.search(5);
        s.deleteNode(3);
        s.traversal();
        s.getNthNode(4);
        s.getCount(10);
        s.getMinMax();
        s.convertToCSLL();
        System.out.println(s.tail.next.value);
    }
}
