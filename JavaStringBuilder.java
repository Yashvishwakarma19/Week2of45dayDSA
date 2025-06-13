import java.util.*;
public class JavaStringBuilder{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String inp = "Yash Vishwakarma";

        //using String Buffer class
        StringBuffer x = new StringBuffer(inp);
        System.out.println(x.reverse());

        //using String Builder class
        StringBuilder st = new StringBuilder(inp);
        System.out.println(st.reverse());

        System.out.println(inp.charAt(0));

        StringBuilder ss = new StringBuilder("Vishwakarma");
        ss.setCharAt(0,'B');
        System.out.println(ss);

        StringBuilder y = new StringBuilder("Alex");
        y.insert(2,'X');
        System.out.println(y);

        y.delete(2,4);
        System.out.println(y);

        StringBuilder obj = new StringBuilder("h");
        obj.append("e");
        obj.append("l");
        obj.append("l");
        obj.append("o");
        System.out.println(obj);
        System.out.println(obj.length());
    }
}