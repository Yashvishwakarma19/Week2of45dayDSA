public class FrequencyOfChar{
    public static void CharCounter(String str){
        str = str.replaceAll("\\s+", "").toLowerCase();

        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        System.out.println("Character frequencies are: ");
        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                System.out.println((char)(i + 'a') + " : " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        String name = "Yash Vishwakarma";
        CharCounter(name);
    }
}