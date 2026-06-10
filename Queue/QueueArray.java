package Queue;
// this not efficient way to create queue using array
// rear moves back as we add more element in queue
// front stays same 0
// intially we asign rear as -1 means outside of array
public class QueueArray {
    
    static class Queue {
    static int arr[];
    static int size;
    static int rear;

    Queue (int n){
        arr = new int [n];
        size = n;
        rear = -1;
    }

    public static boolean isEmpty (){
        return rear == -1;
    }
    public static void add(int data){
        if(rear == size-1){
             System.out.println("Queue is full");
             return;
        }
        rear = rear +1;
        arr[rear] = data;
    }

    public static int remove (){
        if (isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0];
        for (int i=0; i<rear; i++){       // we remove element from front so after remove we need to move index ahead
            arr[i] = arr[i+1];
        }
        rear = rear -1;
        return front;
    }
    public static int peek (){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
    }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
