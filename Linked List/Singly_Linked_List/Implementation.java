package Singly_Linked_List;
import java.util.*;
public class Implementation {
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
        Implementation list = new Implementation();
        
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
              int d = sc.nextInt();
              list.addNode(d);
       }
        
        System.out.print("Original ");
        list.printList();
        sc.close();
    }

}




    
    
    
   
    
   
