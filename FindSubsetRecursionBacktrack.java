public class FindSubsetRecursionBacktrack{
    public static void findSubset(String Input, String Output, int Index){
        if(Index == Input.length()){
            System.out.print("\""+ Output + "\""+" , ");
            return;
        }
        // Include
        findSubset(Input, Output+ Input.charAt(Index), Index+1);

        //Exclude
        findSubset(Input, Output, Index+1);
    }
    public static void main(String[] args) {
        String inp = "abc";
        findSubset(inp,"",0);
    }
}