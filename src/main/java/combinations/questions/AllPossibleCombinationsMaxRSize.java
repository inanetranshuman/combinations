package combinations.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Given an array arr[] consisting of N characters, the task is to generate all possible combinations of at most X elements ( 1 ≤ X ≤ N).
 */

public class AllPossibleCombinationsMaxRSize {

    public static void main(String[] args) {
        List<Character> chars = new ArrayList();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        int R = 2;
        for(int i = 1; i <= R; i++)
            combinationsMaxR(chars, 0, chars.size(), i, 0, new LinkedList<Character>());
    }

    private static void combinationsMaxR(List<Character> origList, int start, int end, int R, int idx, LinkedList<Character> charList) {
        if(idx == R) {
            System.out.println(Arrays.toString(charList.toArray()));
            return;
        }

        for(int i = start; i < end && idx < R; i++) {
            charList.addLast(origList.get(i));
            combinationsMaxR(origList, i + 1, end, R, idx + 1, charList);
            charList.removeLast();
        }
    }
}
