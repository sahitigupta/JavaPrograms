package leetcode;
//delete given node, where access to ll is not given (head/linkedlist)
public class DeleteNode {
    static class Node {
        int data;
        Node next;
    
        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
    static void displayLinkedList(Node head)
    {
        while(head!=null)
        {   
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        deleteNode(head.next.next);
        displayLinkedList(head);
    }
}
