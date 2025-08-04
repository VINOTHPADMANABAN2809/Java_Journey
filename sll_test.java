public class sll_test {
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
            return;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }    
       temp.next = newnode;
        
    }

    public void insertatbeg(int data){
        Node newnode = new Node(data);
        Node temp = head;
        
        newnode.next = head;
        head = newnode;
    }

    public void insertatend(int data){
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

    public void insertatpos(int data,int pos){
        Node temp = head;
        Node newnode = new Node(data);
        
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = temp.next;
        
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
           
        }
    }

    public static void main(String[] vk){
        sll_test list = new sll_test();

        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println("List elements:");
        list.display();
        System.out.println("Insert at beginning:");
        list.insertatbeg(80);
        list.display();
        System.out.println("Insert at end");
        list.insertatend(100);
        list.display();
        System.out.println("Insert at pos");
        list.insertatpos(3,70);
        list.display();
    }
}
