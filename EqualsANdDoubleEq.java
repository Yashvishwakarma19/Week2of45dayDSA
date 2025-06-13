public class EqualsANdDoubleEq{
    public static void main(String[] args) {
        String s1 = new String("Yash");
        String s2 = "Yash";

        System.out.println(s1.equals(s2));  // (content comparison)
        System.out.println(s1 == s2);       // (reference/memory address comparison)

        System.out.println(s2.length());
        System.out.println(s1.length());
    }
}