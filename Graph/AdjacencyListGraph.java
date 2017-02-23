import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mrinali.rao on 31/05/16.
 */
public class AdjacencyListGraph {


    public static void main(String[] args){
    //empty hashmap
        HashMap<Integer,ArrayList<Integer>> mymap = new HashMap<Integer, ArrayList<Integer>>();

        //Insert empty list for each node
        int n=6;
        for(int i=0; i <n; i++){
            mymap.put(i,new ArrayList<Integer>());
        }

        //insert vertex list pair into map
        mymap.get(0).add(1);
        mymap.get(0).add(2);

        // insert neighbors into list for vertex 1
        // insert neighbors into list for vertex 1
        mymap.get(1).add(2);
        mymap.get(1).add(3);

        // insert neighbors into list for vertex 2
        mymap.get(2).add(4);

        // insert neighbors into list for vertex 3
        mymap.get(3).add(4);
        mymap.get(3).add(5);

        // insert neighbors into list for vertex 4
        mymap.get(4).add(5);

        // insert neighbors into list for vertex 5
        // -> nothing to do since 5 has no neighbors

        // testing
        System.out.println("Neighbors of vertex 0: " + mymap.get(0));

        System.out.println("\nPrint all adjacency lists with corresponding vertex:");
        for(int v=0; v<n; v++){
            System.out.println(v + ": " + mymap.get(v));
        }

    }

}