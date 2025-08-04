

public class sll_practice{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }  

    private Node head; 
    
    public void add(int data){
        Node newnode = new Node(data);
        
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }   
            temp.next = newnode;
        }
    }

    public void insertatstart(int data){
        Node newnode = new Node(data);
        if(head == null){
            newnode = head;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertatops(int data,int pos){
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
       newnode.next = temp.next; 
        temp.next = newnode;
        
    }

    public void deleteatstart(){
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteatend(){
        Node temp = head;
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next = null;


    }

    public void deleteatpos(int pos){
        Node temp = head;
        if(head == null){
            System.out.println("List not found");
        }
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void display(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;   
        }
        System.out.println();
            
        
    }

    public static void main(String[] vk){
        sll_practice s = new sll_practice();
        s.add(10);
        s.add(20);
        s.add(30);
        
        // s.insertatstart(5);

        // s.insertatops(15,2);

        // s.display();
        // System.out.println("Deleted list:");
        // s.deleteatstart();

        // s.deleteatend();
        // System.out.println();
        s.display();
        s.deleteatpos(1);
        System.out.println("After deletion :");
        s.display();
    
    }
}