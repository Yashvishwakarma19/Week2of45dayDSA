public class StringPrintEachChar{
    public static void main(String[] args) {
        String firstName = "Yash";
        String lastName = "Vishwakarma";
        String name = firstName + " " + lastName;
        int n = name.length();

        System.out.println("Length of the string is: "+n);

        for(int i=0;i<n;i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
}