public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example input array (sorted)
        int[] nums = {1, 1, 2, 3, 3};

        // Create an object of Solution class
        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums); // k = number of unique elements

        // Print results
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
