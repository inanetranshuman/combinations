package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsOfList {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        permutations(nums, nums.size());
    }

    private static void permutations(List<Integer> nums, int size) {
        if(size == 1) {
            System.out.println(Arrays.toString(nums.toArray()));
            return;
        }

        for(int i = 0; i < size; i++) {
            permutations(nums, size - 1);
            boolean odd = (size % 2 == 1);
            if(odd)
                Collections.swap(nums, 0, size - 1);
            else
                Collections.swap(nums, i, size - 1);

        }
    }
}
