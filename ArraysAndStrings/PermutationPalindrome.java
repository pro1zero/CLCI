package ArraysAndStrings;

// assumptions
// not case-sensitive - aba and Aba are palindromes
// for this func - assuming only lowercase letters a-z
//
public class PermutationPalindrome {

    public static boolean hasPalindromePermutationUsingBitVector(String s){
        // Time - O(N) | Space - O(1) as we're just using a bit vector.
        // approach flip bits until all chars. In the end, check if more than 1 bit is flipped (> 0) -return false
        int bitVector = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int bitIndex = c - 'a';
            bitVector ^= (1 << bitIndex);
        }
        int oddCounts = 0;
        for(int i = 0; i < 26; i++){
            int leftShift = 1 << i;
            if ((bitVector & leftShift) > 0) oddCounts += 1;
            if (oddCounts > 1) return false;
        }
        return true;
    }

    public static boolean hasPalindromePermutationUsingToggleAndOperation(String s){
        int bitVector = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int bitIndex = c - 'a';
            bitVector ^= (1 << bitIndex);
        }
        return (bitVector & (bitVector - 1)) == 0;
    }

    public static boolean hasPalindromePermutationOnePass(String s){
        // Time - O(N) | Space - O(26) || O(1)
        int[] map = new int[26];
        int oddCount = 0;
        for (char c: s.toCharArray()){
            int index = c - 'a';
            if (index >= 0 && index < map.length){
                map[index]++;
                if (map[index] % 2 == 1){
                    oddCount += 1;
                }else{
                    oddCount -= 1;
                }
            }
        }
        return oddCount <= 1;
    }

    public static boolean hasPalindromePermutationUsingMap(String s){
        // Time - O(N) | Space - O(26) || O(1)
        int[] map = new int[26];
        for (char c: s.toCharArray()){
            int index = c - 'a';
            if (index >= 0 && index < map.length)
                map[index]++;
        }
        boolean oddCount = false;
        for(int i: map){
            if (i % 2 == 1){
                if (oddCount) return false;
                oddCount = true;
            }
        }
        return true;
    }
}
