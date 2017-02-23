import java.util.*;
import java.util.LinkedList;

/**
 * Created by mrinali.rao on 02/06/16.
 */
public class GraphProblems {

    public int v;
    public static LinkedList<Integer>[] mylist;

    GraphProblems(int v){
        this.v =v;
        mylist = new LinkedList[v];
        for(int i=0;i<v; i++){
            mylist[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w){
        mylist[v].add(w);
    }

    public static void main(String[] args){
        String wrds[] ={"baa","abcd", "abca", "cab", "cad"};
        printOrder(wrds,4);
    }

    //http://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/
    public static void printOrder(String[] wrds,int v) {
        GraphProblems g = new GraphProblems(v);
        for (int i = 0; i < wrds.length-1; i++) {
            String wrd1 = wrds[i], wrd2 = wrds[i + 1];
            for (int j = 0; j < Math.min(wrd1.length(), wrd2.length()); j++) {

                if (wrd1.charAt(j) != wrd2.charAt(j)) {
                    g.addEdge(wrd1.charAt(j) - 'a', wrd2.charAt(j) - 'a');
                    break;
                }
            }
        }
        boolean[] visited = new boolean[v];
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<v;i++) {
            if(visited[i]==false)
            topoSort(i, visited, s);
        }

        while(!s.isEmpty())
            System.out.println((char)(s.pop()+'a'));
    }


    public static void topoSort(int v, boolean[] visited, Stack s){
        visited[v] = true;
        Iterator<Integer> i = mylist[v].iterator();
        while(i.hasNext()){
            int p = i.next();
            if(visited[p]==false){
                topoSort(p,visited,s);
            }
        }
        s.push(v);
    }



}
