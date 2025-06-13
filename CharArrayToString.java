public class CharArrayToString{
    public static void main(String[] args) {
        char ch[] = {'y','a','s','h'};
        System.out.print("Given characters are: ");
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        String s1 = new String(ch);
        System.out.println("Converted to String: "+ s1);
    }
}