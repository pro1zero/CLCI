package ArraysAndStrings;

public class OneAway {
    public static boolean isOneAway(String s, String t){
        // Time - (S) where S is the length of the smaller string.
        // Space - O(1) as we don't use any extra space.

        if (Math.abs(s.length() - t.length()) > 1) return false;

        String small = s.length() < t.length() ? s : t;
        String large = s.length() < t.length() ? t : s;

        int i = 0, j = 0;
        boolean diffFound = false;
        while(i < small.length() && j < large.length()){
            if (small.charAt(i) != large.charAt(j)){
                if (diffFound) return false;
                diffFound = true;
                if (small.length() == large.length()){
                    i += 1;
                }
            }else{
                i += 1;
            }
            j += 1;
        }
        return true;
    }
}
