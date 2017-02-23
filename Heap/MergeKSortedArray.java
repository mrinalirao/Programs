/**
 * Created by mrinali.rao on 03/06/16.
 */
public class MergeKSortedArray {

   public static class MinHeapNode{
       int ele; // The element to be stored
       int i; // index of the array from which the element is taken
       int j; // index of the next element to be picked from array

       MinHeapNode(){
           this.ele =-1;
           this.i=-1;
           this.j=-1;
       }

   }

   public static class MinHeap{
       MinHeapNode[] harr;
       int heap_size;

       MinHeap(MinHeapNode[] harr, int size){
           this.harr = harr;
           this.heap_size = size;
           int i = (heap_size-1)/2;
           while(i>=0){
               minHeapify(i);
               i--;
           }
       }
       int left(int i){ return 2*i+1;}
       int right(int i){ return 2*i+2;}
       int parent(int i){ return (i-1)/2;}
       MinHeapNode getMin() { return harr[0];}
       void replaceMin(MinHeapNode x) { harr[0]=x; minHeapify(0);}

       public void minHeapify(int i){
           int l = left(i);
           int r = right(i);
           int small = i;
           if(l<heap_size && harr[l].ele<harr[small].ele  )
               small =l;
           if(r<heap_size && harr[r].ele < harr[small].ele )
               small = r;
           if(small!=i){
               int temp = harr[i].ele;
               harr[i].ele = harr[small].ele;
               harr[small].ele = temp;
               int k = harr[i].i;
               harr[i].i = harr[small].i;
               harr[small].i= k;
               int p= harr[i].j;
               harr[i].j = harr[small].j;
               harr[small].j = p;
              // minHeapify(small);
           }
       }

   }

    public static void main(String[] args){
        int arr[][] =  {{2, 6, 12, 34},
            {1, 9, 20, 1000},
            {23, 34, 90, 2000}};
        int k = arr.length;
        int n = arr[0].length;
        int[] output = mergeKArrays(arr,k,n);
        for(int i = 0;i<n*k; i++)
            System.out.print(output[i] + " ");
    }

    public static int[] mergeKArrays(int[][] arr, int k, int n){
        int[] output = new int[n * k];

        MinHeapNode[] harr1 = new MinHeapNode[k];

        for (int i = 0; i < k; i++) {
            harr1[i] = new MinHeapNode();
            harr1[i].ele = arr[i][0];
            harr1[i].i = i;
            harr1[i].j = 1;
        }
        MinHeap mh = new MinHeap(harr1, k);

        for (int count = 0; count < n * k; count++) {
            MinHeapNode root = mh.getMin();
            output[count] = root.ele;

            // Find the next elelement that will replace current
            // root of heap. The next element belongs to same
            // array as the current root.
            if (root.j < n) {
                root.ele = arr[root.i][root.j];
                root.j += 1;
            }
            // If root was the last element of its array
            else root.ele = Integer.MAX_VALUE; //INT_MAX is for infinite
            mh.replaceMin(root);
        }
        return output;
    }

}
