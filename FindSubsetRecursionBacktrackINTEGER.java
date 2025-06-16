public class FindSubsetRecursionBacktrackINTEGER{
    public static void findSubset(int[] arr, String output, int index){
       if(index == arr.length){
        System.out.print("[" + output + "]"+"");
        return;
       }
       //include
       String include = output.isEmpty() 
                 ? "" + arr[index]     // if it's the first element, just add number
                 : output + ", " + arr[index];  // else add comma then number

        findSubset(arr , include, index + 1);
       //exclude
       findSubset(arr , output, index+1);
    }
    public static void main(String[] args) {
        int[] inp = {1,2,3};
        findSubset(inp, "", 0);
    }
}