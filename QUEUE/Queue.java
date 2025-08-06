package QUEUE;
class Queue{

    
    int front = -1;
    int rear = -1;
    int[] arr = new int[5];
    
    public void enque(int n){
        if(rear == arr.length-1) System.out.println("Queue if full");
        else if(rear == -1 && front == -1){
            rear++;
            front++;
            arr[rear] = n;
        }
        else{

            arr[++rear] = n;
        }
    }

    public void deque(){
        if(rear == -1 && front == -1) System.out.println("Queue is empty");
        else{
            System.out.print(arr[front]);
            front++;
        }
    }

    public void peek(){
         if(rear==-1 && front==-1){
             System.out.println("Queue is empty");
        }
        else{
            System.out.println(arr[front]);
        }
    }


    public void display(){
        if(rear==-1 && front==-1){
             System.out.println("Queue is empty");
        }
        else {
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
           
        }
    }                         

    
    public static void main(String[] vk){
        Queue qs = new Queue();     
        qs.enque(10);
        qs.enque(20);
        qs.enque(30);
        qs.enque(40);
        qs.enque(50);

        qs.display();
        System.out.println();
        qs.deque();
        System.out.println();
        qs.display();
        System.out.println();
        qs.peek();
          

          
    }

}
