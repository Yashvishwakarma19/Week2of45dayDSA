public class SlidingWindowBrute {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int k = 3;
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) { 
            int max = arr[i];
            for (int j = i; j <= i + k - 1; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.println("Window starting at index " + i + ": max = " + max);
        }
    }
}
