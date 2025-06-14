public class PalindromeUsingReverse{
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        String original = str;
        StringBuilder sb = new StringBuilder(str);

        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }
    public static void main(String[] args) {
        String inp = "Madam";
         if(isPalindrome(inp)){
            System.out.println(inp +" is Palindrome");
        }else{
            System.out.println(inp +" is Not Palindrome");
        }
    }
}