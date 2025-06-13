public class StringsJava{
    public static void main(String[] args) {
        // String firstName = "Yash";
        // String lastName = "Yash";
        
        // if(firstName.compareTo(lastName) == 0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        String sent = "hello im Yash";
        String sub = sent.substring(9);
        System.out.println(sub);
        
        String sub1 = sent.substring(9,sent.length());
        System.out.println(sub1);
    }
}