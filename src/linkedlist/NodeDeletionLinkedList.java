package linkedlist;

public class NodeDeletionLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int d) {
            this.data = d;
            this.next = null;
        }
    }
    static Node deleteNodeatFront(Node head)
    {
        if (head==null)
        {
            System.out.println("Empty linked list");
            return head;
        }
        head=head.next;
        return head;
    }
    static Node deleteNodeatEnd(Node head)
    {
        if (head == null)
        {
            System.out.println("Empty");
            return head;
        }
        if (head.next == null)
        {
            System.out.println("Only one node, it is deleted");
            head = null;
            return head;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next = null;
        return head;
    }
    static Node deleteNodeatPosition(Node head, int pos)
    {
        if(head==null)
        {
            System.out.println("empty");
            return head;
        }
        Node temp = head;
        Node prev = null;
        if (pos == 1)
        {
            head = temp.next;
            return head;
        }
        for (int i=1; i<pos && temp!=null; i++)
        {
            prev=temp;
            temp=temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }
        return head;
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
    public static void main(String args[])
    {
        Node head = new Node(4);
        head.next = new Node(34);
        head.next.next = new Node(75);
        head.next.next.next = new Node(234);
        head.next.next.next.next = new Node(743);
        head = deleteNodeatFront(head);
        head = deleteNodeatEnd(head);
        head = deleteNodeatPosition(head,3);
        displayLinkedList(head);
    }
}
