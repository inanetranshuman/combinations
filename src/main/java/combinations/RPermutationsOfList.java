package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RPermutationsOfList {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList();
        for(int i = 1; i < 6; i++)
            numList.add(i);

        rpermutations(numList, 3, numList.size());
    }

    private static void rpermutations(List<Integer> numList, int r, int idx) {
        if(r == 0) {
            System.out.println(Arrays.toString(numList.subList(idx, numList.size()).toArray()));
            return;
        }

        for(int i = 0; i < idx; i++) {
            Collections.swap(numList, i, idx - 1);
            rpermutations(numList, r - 1, idx - 1);
            Collections.swap(numList, i, idx - 1);
        }
    }
}
