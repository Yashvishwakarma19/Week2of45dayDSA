public class countSubsets{
    public static int subsetcount(int[] arr,int index){
        if(index == arr.length){
            return 1;
        }
        int include = subsetcount(arr, index+1);
        int exclude = subsetcount(arr, index+1);

        return include+exclude;
    }
    public static void main(String[] args) {
        int[] inp = {1,2,3};
        int ttlsets = subsetcount(inp,0);
        System.out.println("Total subsets: "+ttlsets);
    }
}