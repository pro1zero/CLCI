package ArraysAndStrings;

public class CompressString {
    public static String compressString(String s){
        checkStringValidity(s);
        if (s.isEmpty()) return s;
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        sb.append(prev);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if (sb.length() >= s.length()) return s; // minor optimization
            char current = s.charAt(i);
            if (current == prev){
                count += 1;
            }else{
                sb.append(count);
                prev = current;
                sb.append(prev);
                count = 1;
            }
        }
        sb.append(count);
        return sb.length() >= s.length() ? s : sb.toString();
    }

    public static void checkStringValidity(String s){
        if (s == null){
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
    }
}
