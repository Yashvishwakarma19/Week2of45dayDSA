import java.util.Arrays;
public class Anagram{
    public static boolean isAnagram(String str1,String str2){
        str1 = str1.replace("\\s","").toLowerCase();
        str2 = str2.replace("\\s","").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String a = "Listen";
        String b = "Silent";

        if(isAnagram(a,b)){
            System.out.println(a +" and "+ b + " are Anagrams");
        }else{
            System.out.println(a +" and "+ b + " are Not Anagrams");
        }
    }
}