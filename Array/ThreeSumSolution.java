import java.util.*;

public class ThreeSumSolution {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } 
                else if (sum < 0) left++;
                else right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {-1, 0, 1, 2, -1, -4};
        int[] test2 = {0, 0, 0, 0};

        System.out.println("Input: " + Arrays.toString(test1));
        System.out.println("Output: " + threeSum(test1));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(test2));
        System.out.println("Output: " + threeSum(test2));
    }
}
