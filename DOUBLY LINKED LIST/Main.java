package Udemy.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListOperations dll= new DoublyLinkedListOperations();
        dll.createDLL(5);
        System.out.println(dll.head.value);
        dll.insertDLL(2,0);
        dll.insertDLL(1,2);
        dll.insertDLL(3,7);
//        System.out.println(dll.head.value);
        dll.transversalDLL();
        dll.reverseTransversalDLL();
        dll.searchNode(3);
        dll.deleteNode(7);
        dll.reverseTransversalDLL();
        dll.deleteDLL();
        dll.reverseTransversalDLL();

    }
}
