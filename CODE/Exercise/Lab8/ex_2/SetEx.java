package ex_2;

import java.util.*;
import java.util.stream.Collectors;

public class SetEx {

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (Integer integer : second) {
            if (first.contains(integer)) {
                intersection.add(integer);
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        for (Integer integer : second) {
            first.add(integer);
        }
        return first;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> newList = new ArrayList<Integer>();
        for (Integer integer : source) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char c = '#';
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if (!map.containsKey(p)) {
                map.put(p, i);
            } else {
                if (map.get(p) < index) {
                    index = map.get(p);
                    c = p;
                }
            }
        }
        return Character.toString(c);
    }

    public static Set<Character> allRecurringChars(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Set<Character> re = new HashSet<Character>();
        char c = '#';
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if (!map.containsKey(p)) {
                map.put(p, i);
            } else {
                c = p;
                re.add(c);
            }
        }
        return re;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] arr = source.stream().toArray(Integer[]::new);
        return arr;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}