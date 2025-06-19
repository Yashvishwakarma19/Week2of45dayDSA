public class maximumSumOfSubarray{
    public static int Subarray(int[] arr,int k){
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<=arr.length-k;i++){
            int sum = 0;
            for(int j = i; j<i+k;j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " +Subarray(arr, k));
    }
}