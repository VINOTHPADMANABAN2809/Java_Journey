import java.util.*;


public class reversell{
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
            
        }
        current.next = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
        }
    }
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        reversell list = new reversell();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.insert(data);
        }
        list.display();
        sc.close();

        
    }
}