public class ReverseArrayTwoPointer{
    public static void ReverseArr(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Array before reversing is: ");
        for(int num: arr){
            System.out.print(num+ " ");
        }
        ReverseArr(arr);
        System.out.println();
        System.out.print("Array After reversing is: ");
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
}