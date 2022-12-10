package Lab_7;

import java.util.HashMap;

public class settings {
    static HashMap<Integer, String> map = new HashMap<>();

    static public void add(Integer key, String value) {
        map.put(key, value);
    }

    static public String take(int key) {
        return map.get(key);
    }

    static public void print() {
        System.out.println(map.toString());
    }
}
