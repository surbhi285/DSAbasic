package LinkedListnew;

public class CreatingOwnLInkedList {
    public Node head;
    public int size;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(this.head==null)
        {
            this.head=newNode;
        }else
        {
            newNode.next=head;
            this.head=newNode;
        }
        this.size+= 1;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(this.head==null)
        {
            this.head=newNode;
        }else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
        this.size+=1;
    }
    public void add_At_Index(int index,int data)
    {
        Node newNode=new Node(data);
        if(index==0)
        {
            this.head=newNode;
        }else {
            Node temp=head;
            while(index-->1)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        this.size+=1;
    }
    public int getFirst()
    {
        if(head==null)
        {
            return 0;
        }
        Node temp=head;
        return temp.data;
    }
    public int getLast()
    {
        if(head==null)
        {
            return 0;
        }else {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public int get_At_index(int index)
    {
        if(index==0)
        {
            return getFirst();
        } else if (index==size) {
            return getLast();
        }else {
            Node temp=head;
            while(index-->0)
            {
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public int removeFirst()
    {
        if(head==null)
        {
            return 0;
        }
            Node temp=head;
            head=temp.next;
            size=-1;
            return temp.data;

    }
    public int removeLast()
    {
        if(head==null)
        {
            return 0;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        int lap= temp.next.data;
        temp.next=null;
        size=-1;
        return lap;
    }
    public int remove(int index)
    {
        if(index==0)
        {
            return removeFirst();
        } else if (index==size) {
            return removeLast();
        }Node temp=head;
        while(index-->1)
        {
            temp=temp.next;
        }
        Node preNode=temp;
        preNode.next=temp.next.next;
        return temp.data;
    }
    public void reverseLL()
    {
        Node prev=null;
        Node current=head;
        Node next;
        while (current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }head=prev;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
