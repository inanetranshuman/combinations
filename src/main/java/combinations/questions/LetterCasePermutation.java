package combinations.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string. Return a list of all possible strings we could create. You can return the output in any order.
 */
public class LetterCasePermutation {

    public static void main(String[] args) {
        String S = "a1b2";
        List<List<Character>> charList = new ArrayList();
        for(int i = 0; i < S.length(); i++) {
            List<Character> list = new ArrayList();
            Character c = S.charAt(i);
            if(Character.isAlphabetic(c) && Character.isLowerCase(c)) {
                list.add(Character.toUpperCase(c));
            } else if(Character.isAlphabetic(c)) {
                list.add(Character.toLowerCase(c));
            }

            list.add(c);
            charList.add(list);
        }
        permutateListOfLists(charList, 0, new ArrayList());

    }

    private static void permutateListOfLists(List<List<Character>> listOfLists, int idx, List<Character> currList) {
        if(idx == listOfLists.size()) {
            System.out.println(currList.stream().map(String::valueOf).collect(Collectors.joining()));
            return;
        }

        List<Character> newList = listOfLists.get(idx);
        for(Character c : newList) {
            List<Character> copyCurrList = new ArrayList(currList);
            copyCurrList.add(c);
            permutateListOfLists(listOfLists, idx + 1, copyCurrList);
        }

    }
}
