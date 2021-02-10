package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfListOfList {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList();
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        permutations(listOfLists, 0, new ArrayList());
    }

    private static void permutations(List<List<Integer>> listOfLists, int idx, List<Integer> currList) {
        if(idx == listOfLists.size()) {
            System.out.println(Arrays.toString(currList.toArray()));
            return;
        }

        List<Integer> newList = listOfLists.get(idx);
        for(Integer num : newList) {
            List<Integer> copyCurrList = new ArrayList(currList);
            copyCurrList.add(num);
            permutations(listOfLists, idx + 1, copyCurrList);
        }
    }
}
