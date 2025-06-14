public class PalendromeTwoPointerApp{
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String inp = "RaceCar";
        if(isPalindrome(inp)){
            System.out.println(inp +" is Palindrome");
        }else{
            System.out.println(inp +" is Not Palindrome");
        }
    }
}