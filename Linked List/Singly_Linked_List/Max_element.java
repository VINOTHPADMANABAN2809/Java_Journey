package Singly_Linked_List;
import java.util.*;
public class Max_element {
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
        Max_element list = new Max_element();
        
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
              int d = sc.nextInt();
              list.addNode(d);
        }
        
        System.out.print("Original ");
        list.printList();

        int maxvalue = list.findMax();
        System.out.println("max value in the list: " + maxvalue);
        sc.close();
    }

}




    
    
    
   
    
   
