import ArraysAndStrings.*;
import LinkedLists.InterweavingLinkedLists;
import LinkedLists.LinkedList;
import LinkedLists.RemoveDups;

public class Main {
    public static void main(String[] args) {
        // LINKED LISTS
//        Setup
        LinkedList ll1 = new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(1);
        LinkedList.Node l1 = ll1.add(2);
        LinkedList ll2 = new LinkedList();
        ll2.add(4);
        ll2.add(5);
        LinkedList.Node l2 = ll2.add(6);
//        1. Remove dups
//        RemoveDups.removeDupsUsingSet(l1);
        RemoveDups.deleteDupsNested(l1);

//        0. Interweaving LLs
//        InterweavingLinkedLists.interweavingLLs(l1, l2);
//        InterweavingLinkedLists.interweavingLLsEfficient(l1, l2);


        // 9. String Rotation
//        System.out.println(StringRotation.stringRotation("erbottlewat", "waterbottle"));

        // 8. Zero Matrix
//        ZeroMatrix.zeroMatrixEfficient(new int[][] {{1, 5, 0, 7}, {2, 9, 1, 7}, {5, 0, 5, 5}, {0, 0, 6, 3}});

        // 7. Rotate Matrix In-place
//        RotateMatrix.rotateMatrix(new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
//        RotateMatrix.rotateMatrix(new int[][] {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18},
//                {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36}});
//        RotateMatrix.rotateMatrix(new int[][] {{1, 2}, {3, 4}});
//        RotateMatrix.rotateMatrix(new int[][] {{1}});

        // 6. Compress String
        // System.out.println(CompressString.compressString("aabbccddee"));

        // 5. OneAway
        // System.out.println(OneAway.isOneAway("pale", "ple"));

        // 4. Palindrome Permutation
        // System.out.println(PermutationPalindrome.hasPalindromePermutationUsingMap("ca f f a"));
        // System.out.println(PermutationPalindrome.hasPalindromePermutationUsingToggleAndOperation("racecar"));


        // 3. URLify
        // System.out.println(URLify.replaceCharsUsingStringBuilder("jenish is a   good boy     "));
        // System.out.println(URLify.replaceCharsUsingStringBuilderIgnoreMoreThanOneSpace("a b c dd d"));

        // 2. Check Permutations
        // System.out.println(CheckPermutations.arePermsSameUsingSorting("cat", ""));
        // System.out.println(CheckPermutations.arePermsSameUsingMap("cadt", "tac"));

        // 1. UniqueChars
        // System.out.println(UniqueChars.hasUniqueCharsNestedLoop("jenishj"));
        // System.out.println(UniqueChars.hasUniqueCharsSingleLoop("jenish"));
        // System.out.println(UniqueChars.hasUniqueCharsUsingSorting("jenishj"));


    }
}