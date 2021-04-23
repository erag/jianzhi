import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRU {
    int capacity;
    Map<Integer,Integer> pos=new HashMap<>();
    LinkedList<Pair<Integer,Integer>> cache=new LinkedList<>();
    public LRU(int capacity) {
        this.capacity = capacity;
    }
    public int get(int key) {
        if(pos.containsKey(key)){
            int p=pos.get(key);
            Pair<Integer,Integer> v=cache.get(p);
            cache.remove(p);
            cache.addFirst(v);
            pos.put(key,0);
            return v.getValue();
        }
        else
            return -1;
    }

    public void put(int key, int value) {
        if(pos.containsKey(key)){
            int p=pos.get(key);
            cache.remove(p);
        }
        else if(cache.size()>=capacity){
            Pair<Integer,Integer> v=cache.removeLast();
            pos.remove(v.getKey());
        }
        Pair<Integer,Integer> pair = new Pair<>(key, value);
        cache.addFirst(pair);
        pos.put(key,0);

    }
}
