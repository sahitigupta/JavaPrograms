package linkedlist;
// 2 linked lists must be sorted before merging
public class MergeLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node (int d)
        {
            this.data=d;
            this.next=null;
        }
    }
    static Node mergeLinkedlists(Node head1, Node head2)
    {
        if (head1 == null)
        {
            return head2;
        }
        if (head2 == null)
        {
            return head1;
        }
        Node res = new Node(-1);
        Node temp = res;
        while (head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1!=null)
        {
            temp.next=head1;
        }
        if(head2!=null)
        {
            temp.next=head2;
        }
        return res.next;
    }
    static void displayLinkedList(Node head)
    {
        if(head==null){
            System.out.println("Empty");
        }
        else {
            while(head!=null)
            {
                System.out.print(head.data+" ");
                head=head.next;
            }
        }
    }
    public static void main(String args[])
    {
        Node head1 = new Node(4);
        head1.next = new Node(75);
        Node head2 = new Node(34);
        head2.next = new Node(234);
        head2.next.next = new Node(743);
        Node res = mergeLinkedlists(head1, head2);
        displayLinkedList(res);
    }
}
