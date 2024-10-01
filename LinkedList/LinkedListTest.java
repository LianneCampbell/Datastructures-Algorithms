package LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        // Test insertNode method
        sda.insertInLinkedList(1, 0);
        sda.insertInLinkedList(2, 1);
        sda.insertInLinkedList(3, 2);
        sda.insertInLinkedList(4, 3);
        sda.insertInLinkedList(5, 4);
        sda.insertInLinkedList(6, 5);

        System.out.println("\n-------------- Linked List Test -------------");
        System.out.println("\nTraverse Linked List:");
        sda.traverseLinkedList();
        System.out.println("\n---------------------------------------------");
        System.out.println("\nSearch for existant value:");
        sda.searchNode(4);
        System.out.println("\n---------------------------------------------");
        System.out.println("\nSearch for non-existant value:");
        sda.searchNode(8);
        System.out.println("\n---------------------------------------------");

        // Test deleteNode method
        System.out.println("\nDelete node at position 2:");
        sda.deleteNode(2); // Delete node at position 2
        sda.traverseLinkedList();
        System.out.println("\n---------------------------------------------");

        System.out.println("\nDelete the first node:");
        sda.deleteNode(0); // Delete first node
        sda.traverseLinkedList();
        System.out.println("\n---------------------------------------------");

        System.out.println("\nDelete the last node:");
        sda.deleteNode(3); // Delete last node
        sda.traverseLinkedList();
        System.out.println("\n---------------------------------------------");

        System.out.println("\nTry to delete a non-existant node:");
        sda.deleteNode(10); // Try to delete non-existent node
        sda.traverseLinkedList();
        System.out.println("\n---------------------------------------------");

    }
}
