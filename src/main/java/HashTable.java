import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrinali.rao on 07/05/16.
 */
public class HashTable {

    public class keyValue {
        Object key;
        Object value;

        keyValue(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public int capacity;
    public Object[] values;

    HashTable(int capacity) {
        values = new Object[capacity];
        this.capacity = capacity;
    }

    public int hash(Object key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void add(Object key, Object value) {

        if (key == null || value == null)
            System.out.println("key or value is null");

        int index = hash(key);
        List<keyValue> list = new ArrayList<keyValue>();
        if (values[index] == null) {
            list.add(new keyValue(key, value));
            values[index] = list;
        } else {
            list = (List<keyValue>) values[index];
            list.add(new keyValue(key, value));
        }
    }

    public Object get(Object key) {
        int index = hash(key);
        List<keyValue> list = (List<keyValue>) values[index];
        if (list == null)
            return -1;
        else {
            for (keyValue kv : list) {
                if (kv.key == key)
                    return kv.value;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        HashTable ht = new HashTable(3);
        for(int i=1; i<=3; i++)
            ht.add(i,i);

        System.out.println(ht.get(3));
    }
}
