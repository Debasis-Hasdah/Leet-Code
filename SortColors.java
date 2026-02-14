import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { 
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,0,2,1,1,0};
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1)); 

        int[] nums2 = {2,0,1};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}

