package ArraysAndStrings;

import java.util.Arrays;

// Ask if string is ASCII or Unicode.
// assuming the string is only lowercase a-z as I'm using bitVector
public class UniqueChars{
    public static boolean hasUniqueCharsNestedLoop(String s){
        checkStringValidity(s);

        for (int i = 0; i < s.length(); i++){
            char front = s.charAt(i);
            for(int j = i + 1; j <s.length(); j++){
                char rear = s.charAt(j);
                if (front == rear) return false;
            }
        }
        return true;
    }

    public static boolean hasUniqueCharsSingleLoop(String s){
        checkStringValidity(s);

        int bitVector = 0;

        for (int i = 0; i < s.length(); i++){
            int value = s.charAt(i) - 'a';
            if ((bitVector & (1 << value)) > 0){
                return false;
            }
            bitVector |= (1 << value);
        }
        return true;
    }

    public static boolean hasUniqueCharsUsingSorting(String s){
        checkStringValidity(s);

        char[] array = s.toCharArray();
        Arrays.sort(array);
        String sortedString = new String(array);

        char prev = sortedString.charAt(0);
        int i = 1;
        while(i < sortedString.length()){
            char current = sortedString.charAt(i);
            if (prev == current){
                return false;
            }
            prev = current;
            i += 1;
        }
        return true;
    }

    public static void checkStringValidity(String s){
        if (s == null || s.isEmpty()){
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
    }
}
