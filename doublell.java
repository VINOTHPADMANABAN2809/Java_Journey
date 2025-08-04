class NODE{
    int data;
    NODE next;
    NODE prev;
    NODE(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
public class doublell{
    private NODE head;
    private NODE tail;
    private NODE current;

    public void add(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    public void insertatstart(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertatend(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void insertatpos(int pos, int data){
        NODE newNode = new NODE(data);
        NODE temp = head;
        NODE jon = head;
        int i = 1;
        while(i<pos){
            jon = temp;
            temp = temp.next;
            i++;
        }
        jon.next = newNode;
        newNode.next = temp;
        newNode.prev = jon;
        temp.prev = newNode;
        
    }

    public void deleteatstart(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteatend(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(tail.next == null){
                tail = tail.prev;
            }
            tail.next = null;

        }
    }

    // public void deleteatpos(int pos){
    //     if(head == null){
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     else{
    //         int i=1;
            
    //         if(i<pos){
    //             NODE temp = head;
    //             temp = temp.next;
                
    //         }
    //     }
    // }
    

    public void display(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        else{
            current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] vk){
        doublell list = new doublell();

        list.add(10);
        list.add(20);
        list.add(30);

        // list.insertatstart(5);
        // list.display();
        // System.out.println();
        // list.insertatend(40);
        // System.out.println();
        // list.display();

        // list.insertatpos(2, 15);
        // System.out.println();
        // list.display();

        // list.deleteatstart();
        // System.out.println();
        // list.display();

        // list.deleteatend();
        // System.out.println();
        // list.display();

        // list.display();
        // System.out.println();
    }
}