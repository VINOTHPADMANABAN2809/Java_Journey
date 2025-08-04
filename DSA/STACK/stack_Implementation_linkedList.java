import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class stack_Implementation_linkedList {

    Node top;
    public stack_Implementation_linkedList() {
        this.top = null;
    }       
    public boolean isEmpty() {
            return top == null;
        }
    public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
