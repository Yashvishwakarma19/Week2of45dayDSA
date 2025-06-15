public class SumOfFirstNnaturalNum{
    public static int SumOf(int n){
        if(n == 1){
            return 1;
        }
        return n + SumOf(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = SumOf(n);
        System.out.println(sum);
    }
}