package linkedlist;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
    
        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    static Node reverseLinkedList(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node temp=curr.next;
        while(temp!=null)
        {
            curr.next=prev;
            prev = curr;
            curr=temp;
            temp=temp.next;
        }
        curr.next=prev;
        prev=curr;
        return prev;
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

        Node newHead = reverseLinkedList(head);
        displayLinkedList(newHead);
    }
}
