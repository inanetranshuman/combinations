package combinations.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order. A mapping of digit to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 */

public class LetterCombinationsPhoneNumber {

    static Map<Character, List<String>> numToLettersMap = new HashMap();
    static {
        numToLettersMap.put('0', Arrays.asList("0"));
        numToLettersMap.put('1', Arrays.asList("1"));
        numToLettersMap.put('2', Arrays.asList("A", "B", "C"));
        numToLettersMap.put('3', Arrays.asList("D", "E", "F"));
        numToLettersMap.put('4', Arrays.asList("G", "H", "I"));
        numToLettersMap.put('5', Arrays.asList("J", "K", "L"));
        numToLettersMap.put('6', Arrays.asList("M", "N", "O"));
        numToLettersMap.put('7', Arrays.asList("P", "Q", "R", "S"));
        numToLettersMap.put('8', Arrays.asList("T", "U", "V"));
        numToLettersMap.put('9', Arrays.asList("W", "X", "Y", "Z"));
    }

    public static void main(String[] args) {
        String digits = "1800755345";
        List<List<String>> listOfLists = new ArrayList();
        for(int i = 0; i < digits.length(); i++) {
            listOfLists.add(numToLettersMap.get(digits.charAt(i)));
        }

        permutations(listOfLists, 0, new ArrayList());
    }

    private static void permutations(List<List<String>> listOfLists, int idx, List<String> currList) {
        if(idx == listOfLists.size()) {
            System.out.println(Arrays.toString(currList.toArray()));
            return;
        }

        List<String> newList = listOfLists.get(idx);
        for(int i = 0; i < newList.size(); i++) {
            List<String> copyCurrList = new ArrayList(currList);
            copyCurrList.add(newList.get(i));
            permutations(listOfLists, idx + 1, copyCurrList);
        }
    }
}
