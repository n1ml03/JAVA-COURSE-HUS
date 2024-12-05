package ex_3;

import java.util.*;

public class MapEx {

    public static int count(Map<Integer, Integer> map) {

        return map.size();
    }


    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean cotains(Map<Integer, Integer> map, int key) {

        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    public static Set<Integer> ketSet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> value(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "green");

        return map.get(value);
    }

}
