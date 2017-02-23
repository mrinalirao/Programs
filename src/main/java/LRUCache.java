import java.util.HashMap;

/**
 * Created by mrinali.rao on 07/05/16.
 */
public class LRUCache {

    public class Node{
        int key;
        int value;
        Node left;
        Node right;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    Node head = null, end = null;
    HashMap<Integer, Node> mymap = new HashMap<Integer, Node>();

    LRUCache(int capacity){
        this.capacity = capacity;
    }

    public int getKey(int key){
        if(mymap.containsKey(key)){
            Node n = mymap.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }

    public void remove(Node n){
        if(n.left!=null && n.right!=null) {
            n.left.right = n.right;
            n.right.left = n.left;
        }
        else if(n.left == null){
            head = n.right;
        }
        else if(n.right == null){
            end = end.left;
        }

    }

    public void setHead(Node n){
        n.left = null;

        if(head!=null){
            n.right = head;
            head.left = n;
            head = n;
        }

        else{
            end = n;
            head =n;
        }
    }

    public void set(int key, int value){
        //Node temp = mymap.get(key);
        if(mymap.containsKey(key)){
            Node temp = mymap.get(key);
            temp.value = value;
            remove(temp);
            setHead(temp);
        }
        else{
            Node create = new Node(key,value);
            if(mymap.size()>=capacity){
                mymap.remove(end.key);
                remove(end);
                setHead(create);
            }
            else {
                setHead(create);
            }
            mymap.put(key,create);
        }

    }

    public static void main(String[] args){
        LRUCache lr = new LRUCache(5);
        lr.set(1,1);
        lr.set(2,2);
        lr.set(3,3);
        lr.set(4,4);
        lr.set(5,5);
        int val = lr.getKey(1);
        System.out.println(val);
        lr.set(6,6);
        int val2 = lr.getKey(2);
        System.out.println(val2);

    }



}
