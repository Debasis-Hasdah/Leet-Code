public class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        // If array has 2 or fewer elements, nothing to remove
        if (nums.length <= 2) return nums.length;

        int i = 2; // Start from index 2 (since first two are always allowed)

        for (int j = 2; j < nums.length; j++) {
            // Compare current element with the element two positions behind
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // i = new length (k)
}
}
