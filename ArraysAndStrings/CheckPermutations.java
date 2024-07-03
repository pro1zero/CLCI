package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutations {
    public static boolean arePermsSameUsingSorting(String s, String t){
        // O(NlogN) Time - since s.length() = t.length() | O(N) Space - array
        checkStringValidity(s);
        checkStringValidity(t);

        if (s.length() != t.length()) return false;

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return new String(array1).equals(new String(array2));
    }

    public static boolean arePermsSameUsingMap(String s, String t){
        // O(N) Time | O(128) || O(1) Space
        checkStringValidity(s);
        checkStringValidity(t);

        if (s.length() != t.length()) return false;

        // assuming an ASCII string
        char[] map = new char[129];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            map[c - '0']++;
            map[d - '0']--;
        }

        for (char c : map) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void checkStringValidity(String s){
        if (s == null){
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
    }
}
