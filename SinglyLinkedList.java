import java.util.*;
public class SinglyLinkedList {
    
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            } 
            temp.next = newNode;
        }
    }

    public int sumNodes() {
        if (head == null) {
            return 0;
        }
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public int findMax() {
        if (head == null) {
            System.out.println("List is empty!");
            return Integer.MIN_VALUE;
        }
        int max = head.data;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public int findMin() {
        if (head == null) {
            System.out.println("List is empty!");
            return Integer.MAX_VALUE;
        }
        int min = head.data;
        Node temp = head;
        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
    
    public void insertatstart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        }
    
    
    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Deleted: " + head.data);
        head = head.next;
    }
    
    
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted: " + temp.next.data);
        temp.next = null;
    }
    
    
    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("Lis t is empty!");
            return;
        }
        if (pos == 1) {
            deleteStart();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position not found!");
            return;
        }
        System.out.println("Position: " + pos);
        System.out.println("Deleted: " + temp.next.data);
        temp.next = temp.next.next;
    }

    public Node newheadNode(){
        return head;
    }

    public void append_at_end(Node list1){
        Node temp = head;
        if(head == null){
           head = list1;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = list1;
            

        }
    }

    
    
    
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        // SinglyLinkedList list1 = new SinglyLinkedList();
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
              int d = sc.nextInt();
              list.addNode(d);
       }

    //    int m = sc.nextInt();
    //    for(int i=0;i<m;i++){
    //           int d = sc.nextInt();
    //           list1.addNode(d);
    //    }
        
        System.out.print("Original ");
        list.printList();

        // list.sumNodes();
        // System.out.println("Sum of nodes: " + list.sumNodes());

        // list.findMax();
        // System.out.println("Max value in the list: " + list.findMax());

        // list.findMin();
        // System.out.println("Min value in the list: " + list.findMin());
        
        
        // list.deleteStart();
        // list.printList();
        
        
        // list.deleteEnd();
        // list.printList();
        
        
        // list.deleteAtPos(1);
        // list.printList();

       

        // list.append_at_end(list1.newheadNode());
        // list.printList();
        
        sc.close();
    }
}
