import java.util.Arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return left; // insertion position
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6};
        System.out.println("Input: " + Arrays.toString(arr1) + ", target = 5");
        System.out.println("Output: " + searchInsert(arr1, 5)); // 2

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr1) + ", target = 2");
        System.out.println("Output: " + searchInsert(arr1, 2)); // 1

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr1) + ", target = 7");
        System.out.println("Output: " + searchInsert(arr1, 7)); // 4

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr1) + ", target = 0");
        System.out.println("Output: " + searchInsert(arr1, 0)); // 0
    }
}
