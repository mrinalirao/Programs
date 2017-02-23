import java.util.Arrays;

/**
 * Created by mrinali.rao on 09/05/16.
 */
public class QueueImplementation {
    public static class Queue{
        int front;
        int rear;
        int[] queue;
        int capacity;

        public Queue(int size){
            this.capacity = size;
            this.queue = new int[capacity];
            this.rear = -1;
            this.front = -1;
        }
    }
    public static Queue q = new Queue(5);

    public static void enqueue(int value){
        if(((q.rear+1)%q.capacity)== q.front)
            throw new IllegalStateException("Queue is full");
        else if(q.front == -1 && q.rear ==-1){
            q.queue[++q.rear] = value;
            ++q.front;
        }
        else{
            q.rear = (q.rear+1)%q.capacity;
            q.queue[q.rear] = value;
        }

    }

    public static void dequeue(){
        if(q.front == -1 && q.rear == -1){
            System.out.println("Queue is empty");
            return;
        }
        else if(q.front == q.rear) {
            System.out.println(q.queue[q.front]);
            q.front = -1;
            q.rear = -1;
        }
            else{
                System.out.println(q.queue[q.front]);
                q.front = (q.front+1)%q.capacity;
            }
        }


    public static void main(String[] args){
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        System.out.println(Arrays.toString(q.queue));
        System.out.println("\n");
        //enqueue(6);
        dequeue();
        enqueue(6);
        System.out.println(Arrays.toString(q.queue));
        dequeue();
        System.out.println(Arrays.toString(q.queue) + q.rear + q.front);
    }
}
