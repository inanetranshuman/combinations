package combinations;

import java.util.Arrays;

// Heap's Algorithm
public class PermutationsOfArray {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        permutations(nums, nums.length);
    }

    private static void permutations(int[] nums, int size) {
        if(size == 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i = 0; i < size; i++) {
            permutations(nums, size - 1);
            boolean odd = (size % 2 == 1);
            // Odds swap first element and last element
            if(odd) {
                int tmp = nums[0];
                nums[0] = nums[size - 1];
                nums[size - 1] = tmp;
            } else { // Even swap ith element with last element
                int tmp = nums[i];
                nums[i] = nums[size - 1];
                nums[size - 1] = tmp;
            }

        }
    }
}
