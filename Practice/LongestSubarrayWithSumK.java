public class LongestSubarrayWithSumK {

    public static int longestSubarraySumK(int[] arr, int K) {
        int n = arr.length;
        int maxLen = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == K) {
                    int length = end - start + 1;
                    if (length > maxLen) {
                        maxLen = length;
                    }
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -1, 5, -2, 3};
        int K1 = 3;
        System.out.println("Output: " + longestSubarraySumK(arr1, K1));
        // Explanation: longest subarray with sum 3 is [1, -1, 5, -2] or [5, -2], but longest is length 4

        int[] arr2 = {-2, -1, 2, 1};
        int K2 = 1;
        System.out.println("Output: " + longestSubarraySumK(arr2, K2));
        // Explanation: longest subarray with sum 1 is [-1, 2], length 2
    }
}
