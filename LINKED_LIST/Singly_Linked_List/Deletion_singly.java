package Singly_Linked_List;
import java.util.*;
public class Deletion_singly {
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

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        
        System.out.println();
    }
    public static void main(String[] vk) {
        Deletion_singly list = new Deletion_singly();
        
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
              int d = sc.nextInt();
              list.addNode(d);
        }
        
        System.out.print("Original ");
        list.printList();

        list.deleteStart();
        list.printList();
        
        
        list.deleteEnd();
        list.printList();
        
        
        list.deleteAtPos(1);
        list.printList();

       
        sc.close();
    }

}




    
    
    
   
    
   
