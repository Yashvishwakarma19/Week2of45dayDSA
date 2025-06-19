public class maximumSumOfSubarrayOptiSlidingWin{
    public static int Subarr(int arr[],int k){
        int windoSize = 0;
        int maxSum = 0;

        for(int i=0;i<k;i++){
            windoSize += arr[i]; 
        }
        maxSum = windoSize;

        for(int i=k;i<arr.length;i++){
            windoSize += arr[i] - arr[i-k];
            maxSum = Math.max(windoSize,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + Subarr(arr,k));
    }
}