package ArraysAndStrings;

public class StringRotation {
    public static boolean stringRotation(String s, String t){
        // Time: O(2S + T) = O(S + T) as the indexOf is a naive string matching algorithm.
        // Space: O(S) as we use a stringBuilder for appending efficiency
        return new StringBuilder().append(s).append(s).toString().indexOf(t) > 0;
    }
}
