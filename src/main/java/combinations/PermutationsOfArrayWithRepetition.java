package combinations;

import java.util.Arrays;

public class PermutationsOfArrayWithRepetition {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        permutationsWithRepetition(nums, 0, new int[nums.length]);
    }

    private static void permutationsWithRepetition(int[] nums, int idx, int[] data) {
        if(idx == nums.length) {
            System.out.println(Arrays.toString(data));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            data[idx] = nums[i];
            permutationsWithRepetition(nums, idx + 1, data);
        }

    }
}
