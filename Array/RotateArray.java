public class RotateArray {

    static class Solution {

        public void rotate(int[] nums, int k) {
            if (nums.length == 0) {
                return;
            }

            k %= nums.length;  // to avoid extra rotations

            if (k == 0) {
                return;
            }

            // Step 1: reverse entire array
            reverse(nums, 0, nums.length - 1);

            // Step 2: reverse first k elements
            reverse(nums, 0, k - 1);

            // Step 3: reverse remaining elements
            reverse(nums, k, nums.length - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }

    // Main method (psvm)
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        Solution sol = new Solution();
        sol.rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}