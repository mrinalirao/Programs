import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by mrinali.rao on 14/05/16.
 */
public class Hackerrank {

    //public static void main(String[] args){
//        buildStairCase(6);



    public static void main(String[] args)
    {
        //Map<Integer,Integer> mymap = new HashMap<Integer,Integer>();
        Integer [] someArray = new Integer[]{1,2,3,4,1,2,5,4};
        HashMap<Integer,Integer> repeatationMap= new HashMap<Integer,Integer>();
        for(Integer str : someArray){

            if(repeatationMap.containsKey(str)) {
                repeatationMap.put(str,repeatationMap.get(str) + 1);
            }
            else {
                repeatationMap.put(str, 1);
            }
        }

        int count = 0;
        for(Integer repatCount : repeatationMap.values()){
            if(repatCount > 1) {
                count++;
            }
        }
        System.out.println("Number of Strings repeated : " + count);


        //stkchek();

    }





//    public static void buildStairCase(int n){
//
//        for(int i=0; i<n; i++){
//            int k=n-i-2;
//            for(int j=0; j<=i; j++){
//                while(k>=0){
//                    System.out.print(" ");
//                    k--;
//                }
//                System.out.print("#");
//            }
//            System.out.print("\n");
//        }
//    }
//



    public static void stkchek() {

        Stack<Integer> stk = new Stack<Integer>();
        try{
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            String input;

            Integer n = Integer.parseInt(br.readLine());
            String[] str = new String[n];
            int i =0;

            while((input=br.readLine())!=null) {

                str[i] = input;
                i++;

            }

            while((input=br.readLine())!=null)  {
                String[] splitt = input.split(" ");
                if (splitt[0] == "push") {
                    stk.push(Integer.parseInt(splitt[1]));
                    System.out.println(stk.peek());
                }
                else if (splitt[0] == "pop") {
                    if (stk.isEmpty()) System.out.println("EMPTY");
                    else {
                        stk.pop();
                        System.out.println(stk.peek());
                    }
                }
                else if (splitt[0] == "inc") {
                    Stack<Integer> newStk = new Stack<Integer>();
                    for (int j=0; i< Integer.parseInt(splitt[1]); j++) {
                        newStk.push(stk.pop());
                    }
                    Iterator<Integer> itr = newStk.iterator();
                    while(itr.hasNext()) {
                        stk.push(newStk.pop() + Integer.parseInt(splitt[2]));
                    }
//                    for (Integer s : newStk) {
//                        stk.push(newStk.pop() + Integer.parseInt(splitt[2]));
//                    }
                    System.out.println(stk.peek());
                }
            }

        }catch(IOException io){
            io.printStackTrace();
        }

    }

}
