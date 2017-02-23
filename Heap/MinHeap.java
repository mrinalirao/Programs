/**
 * Created by mrinali.rao on 02/06/16.
 */
public class MinHeap {
    static int[] arr;
    int capacity; //maximum capacity of heap
    int heap_size; //current no of elements in heap

    //constructor
    MinHeap(int size){
        this.capacity = size;
        this.heap_size = 0;
        arr = new int[capacity];
    }

    int parent(int i){ return (i-1)/2;}
    int left(int i) {return 2*i+1;}
    int right(int i) {return 2*i+2;}
    int getMin() { return arr[0];}

    int extractMin(){
        if(heap_size<=0)
            return Integer.MIN_VALUE;
        if(heap_size==1){
            heap_size--;
            return arr[0];
        }
        int n = arr[0];
        arr[0] = arr[heap_size-1];
        heap_size--;
        minHeapify(0);
        return n;
    }

    void minHeapify(int i){
        int l = left(i);
        int r = right(i);
        int small = i;

        if(l<heap_size && arr[l]<arr[i])
            small = l;
        if(r<heap_size && arr[r]<arr[small])
            small=r;
        if(small!=i){
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
            minHeapify(small);
        }
    }

    void swap(int i, int j){
        int temp = i;
        i=j;
        j=temp;
    }

    void decreaseKey(int i, int val){
        arr[i] = val;
        while(i!=0 && arr[i]<arr[parent(i)]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] =temp;
            i = parent(i);
        }
    }

    void deleteKey(int i){
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }

    void insertKey(int key){
        if(heap_size == capacity){
            System.out.println("overflow");
            return;
        }

        heap_size++;
        int i = heap_size-1;
        arr[i] = key;

        while(i!=0 && arr[i]<arr[parent(i)]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i=parent(i);
        }
    }

    public static void main(String[] args){
        //default minHeap implementation from geeks for geeks

//        MinHeap h = new MinHeap(11);
//        h.insertKey(3);
//        h.insertKey(2);
//        h.deleteKey(1);
//        h.insertKey(15);
//        h.insertKey(5);
//        h.insertKey(4);
//        h.insertKey(45);
//        System.out.println(h.extractMin());
//        System.out.println(h.getMin());
//        h.decreaseKey(2,1);
//        System.out.println(h.getMin());

        //http://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/
        int[] len = {4,3,2,6};
        int size = len.length;
        MinHeap h = new MinHeap(size);
        for(int i=0; i<size; i++)
            h.insertKey(len[i]);

        System.out.println(h.minCost());


    }

     int minCost(){
        int cost=0;
        while(heap_size!=1){
            int one= extractMin();
            int two = extractMin();
            cost += one + two;
            insertKey(cost);
        }
        return cost;
    }

}
