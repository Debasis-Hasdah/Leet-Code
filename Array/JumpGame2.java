import java.util.Arrays;

public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) break;
            }
        }

        return jumps;
    }

    // Main method to test the jump function
    public static void main(String[] args) {
        JumpGame2 obj = new JumpGame2();

        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {2, 3, 0, 1, 4};

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Minimum jumps = " + obj.jump(nums1));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Minimum jumps = " + obj.jump(nums2));
    }
}
