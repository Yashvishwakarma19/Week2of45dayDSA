public class Fibonicci{
    public static int Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 7;

        System.out.println("Sum of last Two Fibonacci Numbers: "+ Fibo(n));
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibo(i) + " ");
    }
}
}