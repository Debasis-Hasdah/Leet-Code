public class RemoveElement {
    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        // Create object of Solution class
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        // Print the result
        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
