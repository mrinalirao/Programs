import java.util.Arrays;

/**
 * Created by mrinali.rao on 15/05/16.
 */
public class SortingAlgo {
    public static int[] qarr = new int[]{3, 7, 8, 5, 2, 1, 9, 5, 4};

    public static void main(String[] args){
        qsort(0,qarr.length-1);
        System.out.println(Arrays.toString(qarr));
    }

    //http://www.java2novice.com/java-sorting-algorithms/quick-sort/
    public static void qsort(int l, int h){
        int i = l;
        int j = h;
        int pivot = qarr[(l + (h-l)/2)];

        while(i<=j){
            while(qarr[i]<pivot)
                i++;

            while(qarr[j]>pivot)
                j--;

            if(i<=j){
                int temp = qarr[i];
                qarr[i] = qarr[j];
                qarr[j] = temp;
                i++;
                j--;
            }
        }

        if(l<j)
            qsort(l,j);
        if(i<h)
            qsort(i,h);
    }
}
