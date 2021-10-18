package Udemy.CircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedListOperations cdll= new CircularDoublyLinkedListOperations();
        cdll.createDLL(10);
        cdll.insertNode(5, 0);
        cdll.insertNode(15, 2);
        cdll.insertNode(50, 3);
        System.out.println(cdll.tail.value);
        cdll.reverseTraversalCDLL();
        cdll.searchNode(15);
        cdll.deleteNode(0);
        cdll.transversalCDLL();
        cdll.deleteCDLL();
        cdll.transversalCDLL();
    }
}
