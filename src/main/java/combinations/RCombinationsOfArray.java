package combinations;

import java.util.Arrays;

public class RCombinationsOfArray {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        int r = 3;
        int[] data = new int[r];
        rcombinations(nums, data, 0, nums.length, 0, r);
    }

    private static void rcombinations(int[] nums, int[] data, int start, int end, int idx, int r) {
        if(idx == r) {
            System.out.println(Arrays.toString(data));
            return;
        }

        for(int i = start; i < end && idx < r; i++) {
            data[idx] = nums[i];
            rcombinations(nums, data, i + 1, end, idx + 1, r);
        }
    }

}
