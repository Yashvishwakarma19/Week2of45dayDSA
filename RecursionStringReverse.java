public class RecursionStringReverse{
    public static String reverse(String str){
        if( str.isEmpty()) return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String inp = "Yash Vishwakarma";
        String reversed = reverse(inp);
        System.out.println(reversed);
    }
}