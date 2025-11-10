
import java.util.Arrays;

public class MergeSortedArray {

    // Method to merge two sorted arrays
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // last valid index in nums1
        int j = n - 1;         // last index in nums2
        int k = m + n - 1;     // last index of merged array (nums1 full size)

        // Merge from the end
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    // Main method to test the merge function
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();

        int[] nums1 = {1, 2, 3,3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Before merge:");
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));

        obj.merge(nums1, m, nums2, n);

        System.out.println("\nAfter merge:");
        System.out.println("nums1 = " + Arrays.toString(nums1));
    }
}
