package LinkedListnew;

import java.util.LinkedList;

public class defaultLinkedList {
    public static void main(String[]args)
    {
        LinkedList<Integer>ll=new LinkedList<>();
        //default add function of LinkedList
        ll.add(23);
        ll.addFirst(43);
        ll.add(1,54);
        ll.addLast(67);
        System.out.println(ll+" ");
        //default get function of LinkedList
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));
    }
}
