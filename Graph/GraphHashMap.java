import java.util.*;
import java.util.LinkedList;

/**
 * Created by mrinali.rao on 02/06/16.
 */
public class GraphHashMap {
    private int v; // num of vertices
    public static HashMap<Integer,ArrayList<Integer>> mymap = new HashMap<Integer, ArrayList<Integer>>();

    GraphHashMap(int v){
        this.v = v;
        for(int i=0; i<v;i++){
            mymap.put(i,new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int w){
        mymap.get(v).add(w);
    }

    public static void DFS(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = mymap.get(v).iterator();
        while(i.hasNext()){
            int n = i.next();
            if(visited[n]==false){
                DFS(n,visited);
            }
        }
    }

    public static void BFS(int v,boolean[] visited){
        java.util.LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[v]= true;
        queue.add(v);

        while(!queue.isEmpty()){
            int n = queue.poll(); //removes and retrieves front of queue
            System.out.println(n + " ");
            Iterator<Integer> i = mymap.get(n).iterator();
            while(i.hasNext()) {
                int p = i.next();
                if (visited[p] == false) {
                    visited[p] = true;
                    queue.add(p);
                }
            }
        }
    }

    public static void main(String[] args){
        GraphHashMap g = new GraphHashMap(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        boolean[] visited = new boolean[g.v];
       // DFS(2,visited);
        BFS(2,visited);
        }

    }

