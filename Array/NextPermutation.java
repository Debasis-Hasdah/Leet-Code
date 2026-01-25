import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find element just larger than nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap them
            swap(nums, i, j);
        }

        // Step 3: Reverse the subarray from i+1 to end
        reverse(nums, i + 1, n - 1);
    }

    // Swap helper
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // Reverse helper
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        System.out.println("Next Permutation: " + Arrays.toString(nums1));
        // Output: [1,3,2]

        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println("Next Permutation: " + Arrays.toString(nums2));
        // Output: [1,2,3]

        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println("Next Permutation: " + Arrays.toString(nums3));
        // Output: [1,5,1]

        int[] nums4 = {1, 3, 2};
        nextPermutation(nums4);
        System.out.println("Next Permutation: " + Arrays.toString(nums4));
        // Output: [2,1,3]
    }
}
