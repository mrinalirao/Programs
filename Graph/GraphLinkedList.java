import java.util.*;
import java.util.LinkedList;

/**
 * Created by mrinali.rao on 02/06/16.
 */
public class GraphLinkedList {

    private int v;
    List<Integer>[] mylist;

    GraphLinkedList(int v) {
        this.v = v;
        mylist = new LinkedList[v]; //initialize a array of size=num of vertices
        for (int i = 0; i < v; i++) {
            mylist[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w){
        mylist[v].add(w);
    }

    void DFS(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = mylist[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(visited[n]==false){
                DFS(n,visited);
            }
        }
    }

    void BFS(int v, boolean[] visited){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[v]=true;
        queue.add(v);

        while (!queue.isEmpty()){
            int s = queue.poll();
            System.out.println(s+ " ");

            Iterator<Integer> i = mylist[s].listIterator();
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
        GraphLinkedList g = new GraphLinkedList(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        boolean[] visited = new boolean[g.v];
       // g.DFS(2,visited);
        g.BFS(2,visited);

    }

}
