public class LongestSubarrayWithSumLETarget {
    public static int longestSubarray(int[] arr, int target) {
        int start = 0, sum = 0, maxLength = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink the window until the sum is <= target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            // Now sum <= target, update maxLength
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int target = 4;

        int result = longestSubarray(arr, target);
        System.out.println("Length of longest subarray with sum ≤ " + target + " is: " + result);
    }
}

