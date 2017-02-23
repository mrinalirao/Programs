import com.sun.org.apache.xpath.internal.operations.Bool;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.*;
import java.util.stream.Collector;

/**
 * Created by mrinali.rao on 13/04/16.
 */
public class ArrayPrograms {

    public static char[] data, set;
    public static int[] a, b, d, s, e, f, arr, arr1, arr3, arr4, arr5, arr6,arr7, hist, ar1, ar2;
    public static int capacity = 10;
    public static int top = -1;
    public static String sent = "this is my name";
    public static String num = "-134";
    public static int[][] arr2, mat, mat2;
    public static String str,exp;
    public static HashMap<String, String> mymap;
    public static char[] strperm;

    public static void main(String[] args) {
        data = new char[]{'b', 'g', 'b', 'b', 'r', 'g', 'g', 'r', 'b', 'r', 'g', 'b'};
        a = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        b = new int[]{5, 6, 15};
        d = new int[]{1, 1, 1, 1};
        f = new int[]{1, 9, 0, 0, 0};
        e = new int[]{6, 7, 8, 1, 2, 3, 4, 5};
        s = new int[capacity];
        arr = new int[]{5, 5, 10, 40, 50, 35};
        set = new char[]{'a', 'b', 'c', 'd'};
        arr1 = new int[]{1, 2, 3, 4, 5};
        arr2 = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 4, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9}
        };
        mat = new int[][] {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        mat2 = new int[][] {{1, 2, 3, 4 },{5, 6, 7, 8},{9, 10, 11, 12}};
        arr3 = new int[]{1, 4, 45, 6, 10, 8};
        str = "kincenvizh";
        arr4 = new int[]{15, 2, 4, 8, 9, 5, 10, 23};
        arr5 = new int[]{16,17,4,3,5,2};
        arr6 = new int[]{4,5,2,25};
        arr7 = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        //hist = new int[] {6, 2, 5, 4, 5, 1, 6};
        hist = new int[] {3,4,5,1,2};
        ar1  =new int[] {2, 3, 7, 10, 12, 15, 30, 34};
        ar2=  new int[]{1, 5, 7, 8, 10, 15, 16, 19};
        exp = "((2*5)+(6/2))";
        // firstElem(a,b);
        //closestNum2(a,11);
        //move(a,5,3);
        //bubbleSort(a);
        //insertionSort(a);
        //stackImpl();
        //revWord();
        // maxChar();
        //System.out.println(smallRes(a));
        //findPair(a,15);
        //majEle(a);
        // largestSumContiguousSubarray(a);
        //System.out.println(smallestIntThatCannotBeRepBySubset(d));
        //maxSumContArray(a);
        //findInRotated(e, 5);
        //nextBiggestNumber(f);
        //System.out.println(maxSubseq(arr));
        //printAllKLengthString(set,"",set.length,1);
        //System.out.println(findMininSortedAndPivotedArray(arr1, 0, arr1.length - 1));
        //commonElementInRowwiseSortedMatrix(arr2,4,5);
        //maxSubString(str);
        //matrixInSpiral(mat,4,4);
        //findPairWithSumX(arr3, 16);
        //subArraySum(arr4,33);
        //replaceEleWithGreatest(arr5);
        //rotate2DBy90(mat2,3,4);
        //findSmallestMissingNumber(arr6,0,arr6.length-1);
//        mymap = new HashMap<String, String>();
//        mymap.put("Chennai", "Banglore");
//        mymap.put("Bombay", "Delhi");
//        mymap.put("Goa", "Chennai");
//        mymap.put("Delhi", "Goa");
//        findSourceAndDestination(mymap);
      //  atoi(num);


      //  System.out.println(getMaxAreaOfRectange(hist, hist.length));
      //  System.out.println(addNumToSingleDigit(12345));
     //   System.out.println(isSubStringWithRecur("gksrek", "geeksforgeeks", 6, 13));
     //   System.out.println(longestCommonSubstring("abcdef".toCharArray(),"zcdemf".toCharArray()));
     //   System.out.println(patternMatchingIterative("abcxabcdabcdabcy".toCharArray(),"abcdabcy".toCharArray()));
    //    System.out.println(maxSumPath(ar1,ar2));
//        String input = "xyz";
//        StringBuffer output = new StringBuffer();
//        boolean[ ] used = new boolean[ input.length() ];
//
//        permute(input.toCharArray(),output,used,0,input.length());
//        int num = 15;
//        for(int i=1; i<=num; i++) {
//            System.out.print(fibSeries(i) + " ");

 //       }
     //   System.out.println(evaluateInfixExpression(exp));
     //   printNextGreaterEle(arr6);
       // System.out.println(findEleInSortAndPivot(arr7, 0, arr7.length - 1, 6));
        strperm = "ABC".toCharArray();
        permute2(strperm,0,strperm.length-1);
    }

    //method1
    public static void rgb() {
        int rcount = 0, gcount = 0, bcount = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == 'r')
                rcount++;
            else if (data[i] == 'g')
                gcount++;
            else
                bcount++;

        }
        int i = 0;
        while (i < rcount) {
            data[i++] = 'r';
        }
        while (i < rcount + gcount) {
            data[i++] = 'g';

        }
        while (i < data.length) {
            data[i++] = 'b';
        }

        System.out.println(data);

    }

    //method2
    public static void rgb2() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == 'g' && data[j] == 'r') {
                    char temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                } else if (data[i] == 'b' && data[j] == 'g') {
                    char temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                } else if (data[i] == 'b' && data[j] == 'r') {
                    char temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println(data);
    }

    public static void firstElem(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            else if (a[i] == b[j]) {

                System.out.println(a[i]);
                return;
            }
        }
        System.out.println("no elem found");
    }

    public static int closestNum(int[] a, int n) {
        int diff = 9999;
        int clos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > n && a[i] - n < diff) {
                diff = a[i] - n;
                clos = a[i];
            } else if (a[i] < n && n - a[i] < diff) {
                diff = n - a[i];
                clos = a[i];
            } else if (a[i] == n) {
                clos = a[i];
                return clos;
            }

        }
        return clos;
    }

    public static void closestNum2(int[] a, int n) {
        int i = 0;
        while (a[i] < n && i < a.length) {
            i++;
        }
        if (a[i] == n) {
            System.out.println(a[i]);
        } else {
            int diff1 = n - a[i - 1];
            int diff2 = a[i] - n;
            if (diff1 > diff2)
                System.out.println(a[i]);
            else
                System.out.println(a[i - 1]);
        }
    }

    public static void move(int[] a, int oldpos, int newpos) {

        int temp = a[oldpos - 1];
        int j = oldpos - 1;
        while (j >= newpos - 1) {
            a[j] = a[j - 1];
            j--;
        }
        a[newpos - 1] = temp;

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
    }

    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void insertionSort(int[] a) {
        int temp, j;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void push(int n) {

        if (top >= capacity - 1) {
            System.out.println("stackoverflow");
        } else {
            ++top;
            s[top] = n;
        }
    }

    public static int pop() {
        if (top > -1) {
            return s[top--];
        } else {

            System.out.println("stack underflow");
            return 0;
        }
    }

    public static void stackImpl() {
        push(4);
        push(5);
        push(1);
        for (int i = 0; i <= top; i++)
            System.out.println(s[i]);
        int i = pop();
        System.out.println(i);
    }

    public static void revWord() {
        int len = sent.length() - 1;
        String rev = "", temp = "";
        int j;

        for (int i = 0; i <= len; i++) {
            temp += sent.charAt(i);
            if (sent.charAt(i) == ' ' || i == len) {
                for (j = temp.length() - 1; j >= 0; j--) {
                    rev += temp.
                            charAt(j);

                    if (j == 0 && i != len)
                        rev += ' ';
                }
                temp = "";
            }
        }
        System.out.println(rev);
    }

    public static void maxChar() {
        char p = 0;
        int max = 0;
        HashMap<Character, Integer> mymap = new HashMap<Character, Integer>();
        for (int i = 0; i < data.length; i++) {

            if (mymap.containsKey(data[i])) {
                mymap.put(data[i], mymap.get(data[i]) + 1);
            } else {
                mymap.put(data[i], 1);
            }
        }
        for (char c : mymap.keySet()) {
            if (max < mymap.get(c)) {
                max = mymap.get(c);
                p = c;
            }
        }
        System.out.println(p + "count:" + max);

    }

    public static int smallRes(int[] a) {
        int res = 1;
        for (int i = 0; i < a.length && a[i] <= res; i++) {
            res = res + a[i];
        }
        return res;
    }

    public static void findPair(int[] a, int x) {
        sort(a);
        int i = 0;
        int j = a.length - 1;
        while (j > i) {
            if (x == a[i] + a[j]) {
                System.out.println("pairs:" + a[i] + "," + a[j]);
                return;
            } else if (x < (a[i] + a[j])) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("no match");
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    //majority element in array of size n is element which appears more than  n/2 times
    public static void majEle(int[] a) {
        int len = a.length;
        len = len / 2;
        int max = 0, maxele = 0;
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (myMap.containsKey(a[i]))
                myMap.put(a[i], myMap.get(a[i]) + 1);
            else
                myMap.put(a[i], 1);
        }
        for (int key : myMap.keySet()) {
            if (myMap.get(key) > len && myMap.get(key) > max) {
                max = myMap.get(key);
                maxele = key;
            }

        }
        if (max != 0)
            System.out.println("maj ele:" + maxele + ":" + max);
        else
            System.out.println("no max ele");

    }

    public static void largestSumContiguousSubarray(int[] a) {
        int max_so_far = 0, index = 0, max_end = 0, pos;
        int[] large;
        for (int i = index; i < a.length; i++) {
            max_so_far += a[i];
            if (max_end < max_so_far) {
                max_end = max_so_far;
            }
            if (max_so_far < 0) {
                max_so_far = 0;
                index++;
            }
        }
        System.out.println(max_end);
    }

    //http://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
    public static int smallestIntThatCannotBeRepBySubset(int[] d) {
        int res = 1;
        for (int i = 0; i < d.length && d[i] <= res; i++)
            res += d[i];
        return res;

    }

    public static void maxSumContArray(int[] a) {
        //{-2, -3, 4, -1, -2, 1, 5, -3}
        int i = 0, sum = 0, maxsum = 0;
        while (i != a.length - 1) {
            sum += a[i];
            if (maxsum < sum) {
                maxsum = sum;
            }
            i++;

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxsum);
    }

    public static void findInRotated(int[] e, int key) {
        int pivot = 0;
        for (int i = 0; i < e.length - 1; i++) {
            if (e[i + 1] < e[i]) {
                pivot = i;
                System.out.println(pivot);

            }
        }
        if (key > e[0])
            findEleBinarySearch(e, 0, pivot, key);
        else findEleBinarySearch(e, pivot + 1, e.length - 1, key);
    }

    public static void findEleBinarySearch(int[] e, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (e[mid] == key) {
                System.out.println("key found at:" + mid);
                return;
            } else if (e[mid] < key) {
                low = mid + 1;
            } else if (e[mid] > key) {
                high = mid - 1;
            }
        }
        System.out.println("key not found!!!!");
    }

    public static void nextBiggestNumber(int[] f) {
        int j = f.length - 1;

        //2, 1, 8, 7, 6, 5
        while (j > 0 && f[j] <= f[j - 1]) {
            j--;
        }
        //4321
        if (j == 0) {
            System.out.println("not possible");
            return;
        }

        swapNumber(j, f.length - 1, f);

    }

    public static void swapNumber(int start, int end, int[] f) {
        int i = start, j = end;
        while (j > i) {
            int temp = f[j];
            f[j] = f[i];
            f[i] = temp;
            i++;
            j--;
        }
        if (start != 0) {
            int temp2 = f[start - 1];
            f[start - 1] = f[start];
            f[start] = temp2;
        }
        System.out.println(Arrays.toString(f));
    }

    //http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
    public static int maxSubseq(int[] arr) {
        //5, 5, 10, 40, 50, 35
        int s[] = new int[arr.length];
        s[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i == 1) {
                s[i] = Math.max(s[0], arr[i]);
                continue;
            }
            s[i] = Math.max(arr[i] + s[i - 2], s[i - 1]);
        }
        return s[s.length - 1];
    }

    //add two linked list using recursion - have to do
    //a,b k=3 n=2

    public static void printAllKLengthString(char[] set, String prefix, int n, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            String newpre = set[i] + prefix;
            printAllKLengthString(set, newpre, n, k - 1);
        }

    }
    //find element in sorted and pivoted array
    //http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
    public static int findEleInSortAndPivot(int[] arr7, int l, int h, int key){
        if(l>h)return -1;
        int mid = (l+h)/2;
        if(arr7[mid] == key)
            return mid;
        if(arr7[l]<=arr7[mid]){
            if(key>=arr7[l] && key<=arr7[mid])
               return findEleInSortAndPivot(arr7,l,mid-1,key);
            return findEleInSortAndPivot(arr7,mid+1,h,key);
        }
        if(key>=arr7[mid] && key<=arr7[h])
            return findEleInSortAndPivot(arr7,mid+1,h,key);
        return findEleInSortAndPivot(arr7,l,mid-1,key);

    }


    //http://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
    public static int findMininSortedAndPivotedArray(int arr1[], int l, int h) {
        //if array is not rotated 12345
        //3,4,5,1,2
        if (l > h)
            return arr1[0];
        if (l == h)
            return arr1[l];

        int mid = (l + h) / 2;

        if (mid < h && arr1[mid] > arr1[mid + 1])
            return arr1[mid + 1];

        if (mid > l && arr1[mid] < arr1[mid - 1] && mid != 0)
            return arr1[mid];

        if (arr1[h] > arr1[mid])
            return findMininSortedAndPivotedArray(arr1, l, mid - 1);
        return findMininSortedAndPivotedArray(arr1, mid + 1, h);

    }

    //http://ideone.com/Oc5rVD
    public static void commonElementInRowwiseSortedMatrix(int[][] arr2, int r, int c) {

        HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        int rowfound = 0;
        for (int i = 0; i < c; i++)
            mymap.put(arr2[0][i], 1);
        for (int j = 1; j < r; j++) {
            for (int k = 0; k < c; k++) {

                Integer val = mymap.get(arr2[j][k]);
                if (val != null) {
                    mymap.put(arr2[j][k], mymap.get(arr2[j][k]) + 1);
                    rowfound = j;
                }
                if (rowfound != j) {
                    System.out.println("not found");
                    return;
                }
            }
        }
        for (int key : mymap.keySet()) {
            if (mymap.get(key) == r)
                System.out.println("common element:" + key);
        }
    }

    //maximum substrings of a given string
    public static void maxSubString(String str) {
        int len = str.length();
        HashSet<String> hs = new HashSet<String>();

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                hs.add(str.substring(i, j + 1));
            }
        }
        System.out.println(hs.size());
    }

    //print a twodimensional in spiral
    //http://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/ - hitesh suryavnshi
    public static int matrixInSpiral(int[][] mat, int r, int c) {

        for (int i = 0; i < c; i++)
            System.out.print(mat[0][i] + " ");

        for (int i = 1; i < r; i++)
            System.out.print(mat[i][c - 1] + " ");

        for (int i = c - 2; i >= 0; i--)
            System.out.print(mat[r - 1][i] + " ");

        for (int i = r - 2; i > 0; i--)
            System.out.print(mat[i][0] + " ");
        if (r - 2 <= 0)
            return 0;
        else {
            int[][] newmat = new int[r - 2][c - 2];
            for (int i = 1; i < c - 1; i++) {
                for (int j = 1; j < r - 1; j++) {
                    newmat[i - 1][j - 1] = mat[i][j];
                }
            }

            int row = newmat.length;
            int col = newmat[0].length;

            return matrixInSpiral(newmat, row, col);

        }
    }
//http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 //two pairs in array whose sum is x
    public static void findPairWithSumX(int[] arr3, int x){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i =0; i<arr3.length; i++){
            if(hs.contains(x-arr3[i])){
                System.out.println("pairs are:" + arr3[i] + (x-arr3[i]));
                return;

            }
            else{
                hs.add(arr3[i]);
            }
        }
        System.out.println("pair not found");
    }

    //given an array find the subarray with sum = x
    //http://www.geeksforgeeks.org/find-subarray-with-given-sum/ - only positive integers
    public static int subArraySum(int [] arr4, int sum){

        int curr_sum = arr4[0], start =0;

        for(int i=1; i<arr4.length; i++){
            if(i<arr4.length)
                curr_sum = curr_sum + arr4[i];

            while(curr_sum>sum && start<i-1){
                curr_sum = curr_sum - arr4[start];
                start++;
            }

            if(sum == curr_sum){
                System.out.println("sum found at index:" + start + (i));
                return 1;
            }
        }
        System.out.println("sum not found!");
        return 0;
    }

    //www.geeksforgeeks.org/replace-every-element-with-the-greatest-on-right-side/
    public static void replaceEleWithGreatest(int arr5[]){
        //{16,17,4,3,5,2}
        //ans: {17, 5, 5, 5, 2, -1}
        Stack<Integer> stk = new Stack<Integer>();
        int top =0;
        stk.push(-1);
        for(int i= arr5.length-1; i>0;i--){
            if(arr5[i]>stk.get(stk.size()-1)){
                stk.push(arr5[i]);
            }
            else{
                stk.push(stk.get(stk.size()-1));
            }
        }

        while(!stk.isEmpty())
            System.out.print(stk.pop() + " ");
    }

    //http://www.geeksforgeeks.org/next-greater-element/
    //{4,5,2,10,1,25}

    public static void printNextGreaterEle(int[] arr6){
        int ele, next;
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr6[0]);
        for(int i=1;i<arr6.length;i++) {
            next = arr6[i];
            if (!s.isEmpty()) {
                ele = s.pop();
                while (ele < next) {
                    System.out.println(ele + "-->" + next);
                    if (s.isEmpty())
                        break;
                    ele = s.pop();
                }
                if (ele > next) {
                    s.push(ele);
                }
            }
            s.push(next);
        }

            while(!s.isEmpty()){
                ele = s.pop();
                next = -1;
                System.out.println(ele + "-->" + next);

            }
        }



    //rotate a 2d array by 90 degrees
    //http://www.geeksforgeeks.org/turn-an-image-by-90-degree/
    public static void rotate2DBy90(int[][] mat2, int r, int c){
        // 1 2  3  4        // 9  5 1
        // 5 6  7  8           10 6 2
        // 9 10 11 12          11 7 3
                            // 12 8 4
        int[][] newmat2 = new int[c][r];
        for(int i =0; i<r; i++){
            for(int j=0;j<c; j++){
                newmat2[j][r-i-1] = mat2[i][j];

            }
        }

        //print matrix
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(newmat2[i][j]);
            }
        }
    }

    //find the smallest missing number
    //http://www.geeksforgeeks.org/find-the-first-missing-number/
    static public void findSmallestMissingNumber(int[] arr6, int start, int end){
        if(start>end) {
            System.out.println(arr6[end]+1);
            return;
        }

        if(arr6[start]!=start) {
            System.out.println(start);
            return;
        }

        int mid = (start+end)/2;

        if(arr6[mid]>mid)
             findSmallestMissingNumber(arr6,start, mid);
        else findSmallestMissingNumber(arr6,mid+1, end);
    }

    //http://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets/
    public static void findSourceAndDestination(HashMap<String,String> mymap){

        HashMap<String,String> revmap = new HashMap<String, String>();
        String start = "";
        for(Map.Entry<String,String> ent: mymap.entrySet()){
            revmap.put(ent.getValue(),ent.getKey());
        }

        for(String s1:mymap.keySet()) {
            if (!revmap.containsKey(s1)) {
                System.out.println("source:" + s1);
                start=s1;
            }
        }
        for(String s2:revmap.keySet()) {
            if (!mymap.containsKey(s2)) {
                System.out.println("dest:" + s2);
            }
        }
        String to = mymap.get(start);
        while(to!=null)
        {
            System.out.println(start + "-->" + mymap.get(start));
            start=to;
            to= mymap.get(start);
        }
        }

    public static void atoi(String num){
        //89789
        int sign = 1, i=0;
        int res =0;
        if(num.charAt(0)== '-'){
            sign = -1;
            i++;
        }
        for(;i<num.length(); i++){
            res = res*10 + num.charAt(i) - '0';
        }
        System.out.println(res*sign);
    }

    //http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
    public static int getMaxAreaOfRectange(int[] hist, int n) {
        Stack<Integer> s = new Stack<Integer>();
        int i = 0, area = 0, maxarea = -1, top;

        while (i < n) {
            if (s.isEmpty() || hist[s.peek()] <= hist[i]) {
                s.push(i++);
            } else {
                top = s.pop();
                if (!s.isEmpty()) {
                    area = hist[top] * (i - s.peek() - 1);
                } else {
                    area = hist[top] * i;
                }
                if (maxarea < area)
                    maxarea = area;
            }
        }
        while(s.isEmpty()==false){
            top = s.pop();
            if (!s.isEmpty()) {
                area = hist[top] * (i - s.peek() - 1);
            } else {
                area = hist[top] * i;
            }
            if (maxarea < area)
                maxarea = area;
        }
        return maxarea;
    }


    //http://www.geeksforgeeks.org/maximum-sum-path-across-two-arrays/
    //ar1[] = {2, 3, 7, 10, 12}, ar2[] = {1, 5, 7, 8}
   // Output: 35
   //         35 is sum of 1 + 5 + 7 + 10 + 12.
    public static int maxSumPath(int[] ar1, int[] ar2){
        int i =0,j=0;
        int result =0, sum1=0, sum2=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                sum1 += ar1[i++];
            }
            else if(ar1[i]>ar2[j]){
                sum2 +=ar2[j++];
            }
            else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < ar1.length && j < ar2.length && ar1[i] == ar2[j]) {
                    result += ar1[i++];
                    j++;
                }
            }
        }
        while(i<ar1.length)
            sum1 += ar1[i++];
        while(j<ar2.length)
            sum2 += ar2[j++];
        result += Math.max(sum1,sum2);

        return result;
    }

    //http://stackoverflow.com/questions/21940981/java-program-that-sums-up-the-digits-of-a-number-until-it-is-a-single-number-eg

    //123456789
    public static int addNumToSingleDigit(int num){
        int sum =0;
        while(num>0){
            sum += num %10;
            num = num/10;
        }
        if(sum>9){
            sum = (sum%10 + sum/10);
        }
        return sum;
    }

    //convert roman number to roman number sum : I:1 V:5 X:10 L:50 C:100 D:500 M:1000


    //http://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
    //Input: str1 = "AXY", str2 = "ADXCPY"
    //Output: True (str1 is a subsequence of str2)
    public static boolean isSubStringWithRecur(String str1, String str2, int m, int n){
        if(m==0)return true;
        if(n==0)return false;

        //if last characters are matching
        if(str1.charAt(m-1)==str2.charAt(n-1))
            return isSubStringWithRecur(str1,str2,m-1,n-1);

        //if last characters are not matching
        return isSubStringWithRecur(str1,str2,m,n-1);
    }

    //http://www.geeksforgeeks.org/longest-common-substring/
    //video:https://www.youtube.com/watch?v=BysNXJHzCEs
    //"abcdef"
    //"zcdemf"
    public static int longestCommonSubstring(char[] str1, char[] str2){
        int[][] res = new int[str1.length][str2.length];
        int max=0;
        for(int i=0;i<=str1.length;i++){
            for(int j=i;j<str2.length;j++){
                //if i is zero then you cant find res[i-1][j-1]
                if(str2[i]==str1[j] && i==0) {
                    res[i][j] = 1;
                    if(max<res[i][j])
                        max = res[i][j];
                }
                else
                    if(str2[i]==str1[j] && i!=0){
                        res[i][j] = res[i-1][j-1]+1;
                        if(max<res[i][j])
                            max = res[i][j];
                    }
                else{
                        res[i][j] =0;
                    }
            }
        }
        return max;
    }

    //pattern search
    //String str = "abcxabcdabcdabcy";
    //String subString = "abcdabcy";
    //http://www.geeksforgeeks.org/searching-for-patterns-set-2-kmp-algorithm/
    //https://www.youtube.com/watch?v=GTJr8OvyEVQ
    //https://github.com/mission-peace/interview/blob/master/src/com/interview/string/SubstringSearch.java

    public static boolean patternMatchingIterative(char[] text, char[] pattern){
        int i=0;
        int j=0;
        int k=0;
        while(i<text.length && j<pattern.length){
            if(text[i]==pattern[j]){
                i++;
                j++;
            }
            else{
                j=0;
                k++;
                i=k;
            }
        }
        if(j==pattern.length)
            return true;
        else
            return false;

    }

    //pattern matching using KMP algo
    public static boolean patternMatchingKMP(char[] text, char[] pattern){
        int[] prearr = computeTempArray(pattern);
        //text.toString();
        int i=0,j=0;
        while(i<text.length && j<pattern.length){
            if(text[i]==pattern[j]){
                i++;
                j++;
            }
            else if(j!=0){
                j=prearr[j-1];
            }
            else{
                i++;
            }
        }
        if(j==pattern.length)
            return  true;
        else return false;
    }

    public static int[] computeTempArray(char[] pattern) {
        int[] res = new int[pattern.length];
        int j = 0;
        for (int i = 1; i < pattern.length; ) {
            if (pattern[i] == pattern[j]) {
                res[i] = j + 1;
                j++;
                i++;
            } else if (i != 0) {
                j = res[j - 1];
            } else {
                res[i] = 0;
                i++;
            }
        }
        return res;
    }

//    public static void permute(char[] str55, int front, int back){
//        if(front == back)
//            System.out.println(str55.toString());
//        else{
//            for(int i=front; i<=back; i++){
//                swap(str55, front, i);
//                permute(str55,front+1,back);
//                swap(str55, front,i);
//            }
//        }
//    }
//    public static void swap(char[] str55,int i, int j){
//        char temp = str55[i];
//        str55[i] = str55[j];
//        str55[j] = temp;
//    }
public static void permute(char[] str, StringBuffer output, boolean[] used, int front, int back){
    if(front == back){
        System.out.println(output.toString());
        return;
    }

    for(int i=0; i<back; i++){
        if(used[i]) continue;

        output.append(str[i]);
        used[i] = true;
        permute(str,output,used,front+1,back);
        used[i] =false;
        output.setLength(output.length() -1);
    }
    }


    public static void permute2(char[] str, int l, int r){

        if(l==r) {
            for(int i=0;i<strperm.length;i++)
                System.out.print(str[i]);
                System.out.println("\n");
                return;
        }
        else{
            for(int i=l;i<=r;i++){
              str=swap(str,l,i);
                permute2(str,l+1,r);
              str=swap(str,l,i);
            }
        }
    }
    public static char[] swap(char[] str,int l, int r){
        char temp =str[l];
        str[l] = str[r];
        str[r]= temp;
        return str;
    }


        public static int fibSeries(int num){
        if(num == 1 || num == 2){
            return 1;
        }

        return fibSeries(num-1) + fibSeries(num -2);
    }


    //expression evaluation
    //http://algs4.cs.princeton.edu/13stacks/Evaluate.java.html
    //http://www.java2novice.com/data-structures-in-java/stacks/infix-expression/
    public static String evaluateInfixExpression(String exp){
        //**remove if any spaces from the expression**/
        exp = exp.replaceAll("\\s+","");

        //assume expression is in valid format
        Stack<String> s = new Stack<String>();
        StringTokenizer tokens = new StringTokenizer(exp,"{}()*/+-",true);
        while(tokens.hasMoreTokens()){
            String tkn = tokens.nextToken();
            if(tkn.equals("(")
            || tkn.equals("{")
            || tkn.matches("[0-9]+")
            || tkn.equals("*")
            || tkn.equals("/")
            || tkn.equals("+")
            || tkn.equals("-")) {
                s.push(tkn);
            }else if(tkn.equals(")") || tkn.equals("}")){
                try {
                    int op2 = Integer.parseInt(s.pop());
                    String operand = s.pop();
                    int op1 = Integer.parseInt(s.pop());
                    if (!s.isEmpty())
                        s.pop();
                int res =0;
                    if(operand.equals("*")){
                        res= op2 * op1;
                    }
                    else if(operand.equals("/")){
                        res= op1/op2;
                    }
                    else if(operand.equals("+")){
                        res= op1+op2;
                    }
                    else if(operand.equals("-")){
                        res= op1-op2;
                    }
                    s.push(res+"");
                }
                catch(Exception e){
                    e.printStackTrace();
                    break;
                }

            }
        }
        String finalres=s.pop();
        return finalres;
    }

    //revise:http://www.geeksforgeeks.org/amazon-interview-experience-set-259-1-yr-experienced-for-sde1/

}






