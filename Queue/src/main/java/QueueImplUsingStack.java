import java.util.Arrays;

/**
 * Created by mrinali.rao on 09/05/16.
 */
public class QueueImplUsingStack {
    public static int size = 5;
    public static class stack{
        int top;
        int[] s;
        stack(int size){
            this.top = -1;
            this.s = new int[size];
        }
    }
    public static stack s1 = new stack(size);
    public static stack s2 = new stack(size);


    public static int pop(stack stk){
        if(stk.top == -1) {
            System.out.println("stack underflow");
            return -1;
        }
        else{
            return stk.s[stk.top--];
        }
    }

    public static void push( int val){
        if(s1.top == size-1)
            System.out.println("stack overflow");
        else{
            s1.s[++s1.top] = val;
        }
    }

    public static void enqueue(int val){
        push(val);
    }

    public static void dequeue(){

        while(s1.top!=-1){
            s2.s[++s2.top] = s1.s[s1.top--];
        }
        System.out.println("dequed:" + s2.s[s2.top]);
        pop(s2);

        while(s2.top!=-1){
            s1.s[++s1.top] = s2.s[s2.top--];
        }
    }

    public static void main(String[] args){
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        System.out.print(Arrays.toString(s1.s)+ " ");
        System.out.println("\n");
        dequeue();
        enqueue(6);
        System.out.print(Arrays.toString(s1.s)+ " ");
    }
}
