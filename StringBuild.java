public class StringBuild{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yash");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(2,'a');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);

        sb.append('z');
        System.out.println(sb);

    }
}