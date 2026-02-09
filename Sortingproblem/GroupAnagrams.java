package Sortingproblem;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input1 = {"eat","tea","tan","ate","nat","bat","mat"};
        System.out.println(groupAnagrams(input1));

        String[] input2 = {""};
        System.out.println(groupAnagrams(input2));

        String[] input3 = {"a"};
        System.out.println(groupAnagrams(input3));
    }
}
