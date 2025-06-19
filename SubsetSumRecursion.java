public class SubsetSumRecursion{
    public static boolean isSubsetSum(int arr[],int index,int target){
        if(target == 0) return true;
        if(index == arr.length) return false;

        if(arr[index] > target){
            return isSubsetSum(arr,index+1,target);
        }

        //include
        boolean include = isSubsetSum(arr, index+1, target -arr[index]);

        //exclude
        boolean exclude = isSubsetSum(arr, index+1, target);

        return include || exclude;
    }
    public static void main(String[] args) {
         int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;

        if (isSubsetSum(arr, 0, target)) {
            System.out.println("Subset with the target sum exists.");
        } else {
            System.out.println("No subset with the target sum.");
        }
    }
}