package LinkedListnew;

public class ClientusingOwnLL {
    public static void main(String[]args)
    {
        CreatingOwnLInkedList LL=new CreatingOwnLInkedList();

        LL.addFirst(34);
        LL.addFirst(54);
        LL.addFirst(78);
        LL.addLast(22);
        LL.add_At_Index(2,89);
        LL.display();
        System.out.println(LL.getFirst());
        System.out.println(LL.getLast());
        System.out.println(LL.get_At_index(2));
        LL.display();
        System.out.println(LL.removeLast());
        LL.display();
        System.out.println(LL.remove(2));
        LL.display();
        LL.reverseLL();
        LL.display();
    }
}
