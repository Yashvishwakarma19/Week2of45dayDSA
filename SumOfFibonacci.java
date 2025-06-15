public class SumOfFibonacci{
    public static int Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        int sum = 0;

        System.out.print(n+" Fibonacci numbers are: ");
        for(int i=0;i<n;i++){
            int terms = Fibo(i);
            System.out.print(terms+" ");
            sum += terms;
        }
        System.out.println();
        System.out.println("Sum of " + n + " Fibonacci Numbers is: "+ sum);
}
}