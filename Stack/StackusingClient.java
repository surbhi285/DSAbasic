package Stack;

import LinkedListnew.CreatingOwnLInkedList;

public class StackusingClient {
    public static void main(String[]args) {
        CreatingOwnLInkedList stack = new CreatingOwnLInkedList();
        stack.push(21);
        stack.push(34);
        stack.push(11);
        stack.push(8);
        stack.push(25);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
        stack.reverseLL();
        stack.display();
    }
}
