public class TwoPointerSumOfElement{
    public static boolean ElementSum(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println("Elements: "+arr[left]+ " + "+arr[right] + " = "+target);
                System.out.println("Indexes are: "+ left + " and "+ right);
                return true;
            }
            else if(sum < target) left++;
            else right--;
        }
        return false;
    }  
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 5;
        boolean result = ElementSum(arr,target);
        if(!result)
            System.out.println("Present");
    }
}