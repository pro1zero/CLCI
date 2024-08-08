package ArraysAndStrings;

public class StringRotation {
    public static boolean stringRotation(String s, String t){
        return new StringBuilder().append(s).append(s).toString().indexOf(t) > 0;
    }
}
