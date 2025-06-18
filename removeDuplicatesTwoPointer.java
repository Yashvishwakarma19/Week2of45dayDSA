public class removeDuplicatesTwoPointer{
    public static int removeDupli(int[] arr){
        int n = arr.length;
        int i = 0;
        for(int j = i; j<n;j++){
            if(arr[j] != arr[i]){
                i++;                        //Time: O(n)
                arr[i] = arr[j];               //Space: O(1) (in-place)
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
         int arr[] = {1,2,3,3,4,4,5};
         int newLen = removeDupli(arr);
         for(int i=0;i<newLen;i++){
            System.out.print(arr[i]+" ");
         }
    }
}