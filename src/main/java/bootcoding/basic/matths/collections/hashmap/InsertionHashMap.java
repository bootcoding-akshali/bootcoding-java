package bootcoding.basic.matths.collections.hashmap;

import java.util.HashMap;

public class InsertionHashMap {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String , Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);
    }

}

