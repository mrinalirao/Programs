import java.util.*;
import java.util.LinkedList;

/**
 * Created by mrinali.rao on 02/06/16.
 */
public class TopologicalSortingGraph {

    //www.geeksforgeeks.org/topological-sorting/

    private int v;
    public static java.util.LinkedList<Integer>[] mylist;

    TopologicalSortingGraph(int v){
        this.v=v;
        mylist = new LinkedList[v];
        for(int i=0;i<v;i++){
            mylist[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w){
        mylist[v].add(w);
    }

    public static void main(String[] args){
        TopologicalSortingGraph g = new TopologicalSortingGraph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        boolean[] visited = new boolean[g.v];

        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<g.v; i++){
            if(visited[i]==false)
            topoSort(i,visited,s);
        }

        while(!s.isEmpty()){
            System.out.print(s.pop() + "  ");
        }

    }

    public static void topoSort(int v, boolean[] visited, Stack s){

        visited[v]= true;

        Iterator<Integer> i = mylist[v].listIterator();
        while(i.hasNext()){
            int p = i.next();
            if(visited[p]==false){
                topoSort(p,visited,s);
            }
        }
        s.push(new Integer(v));
    }
}
