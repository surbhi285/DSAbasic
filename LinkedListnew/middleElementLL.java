package LinkedListnew;

//How will you find the middle element of a singly linked list without iterating the list more than once?
//nth element from the last of the linkedlist
// Find out if the LinkedList contains loop
public class middleElementLL {
    public static void main(String[]args)
    {
        middleElementLL linkedList = new middleElementLL();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(50);
        linkedList.addFirst(70);
        linkedList.addFirst(90);
        linkedList.addFirst(160);
        linkedList.addFirst(130);
        linkedList.addFirst(50);
        linkedList.display();
        System.out.println(linkedList.middleElement());
        System.out.println(linkedList.nth_Element_from_last(2));
        System.out.println(linkedList.isCyclic());

    }
    Node head;
   static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
        } else {
            Node temp = head;
            new_node.next = temp;
            head = new_node;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    public int middleElement()
    {
        Node slow_pointer=this.head;
        Node fast_pointer=this.head;
        while(fast_pointer!=null && fast_pointer.next!=null)
        {
            fast_pointer=fast_pointer.next.next;
            slow_pointer=slow_pointer.next;
        }
        return slow_pointer.data;
    }
    public int nth_Element_from_last(int n)
    {
        Node slow_pointer=this.head;
        Node fast_pointer=this.head;
        while(n!=0)
        {
            fast_pointer=fast_pointer.next;
            n--;
        }
        while(fast_pointer!=null)
        {
            fast_pointer=fast_pointer.next;
            slow_pointer=slow_pointer.next;
        }return slow_pointer.data;
    }
    public boolean isCyclic()
    {
        Node slow_pointer=this.head;
        Node fast_pointer=this.head;
        while(fast_pointer!=null&&fast_pointer.next!=null)
        {
            slow_pointer=slow_pointer.next;
            fast_pointer=fast_pointer.next.next;
            if(slow_pointer==fast_pointer)
            {
                return true;
            }
        }return false;
    }
}
