package ArraysAndStrings;

// assumptions:
// string has no extra leading or trailing spaces
// if it does - ignore it.
// for every space in the string, replace it with `%20`
public class URLify {
    public static String replaceCharsUsingStringBuilder(String s){
        // Time - O(N) | Space O(N) - using SB
        // check if string is not null
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.trim().length(); i++){
            char c = s.charAt(i);
            if (c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // for the below method assuming there's only one space to be considered.
    // use regex to filter extra space
    // trim leading and trailing spaces
    public static String replaceCharsUsingStringBuilderIgnoreMoreThanOneSpace(String s){
        // Time - O(N) | Space - O(N)
        // check if string is not null

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        if (words.length > 0){
            sb.append(words[0]);
        }
        for (int i = 1; i < words.length; i++){
            sb.append("%20");
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
