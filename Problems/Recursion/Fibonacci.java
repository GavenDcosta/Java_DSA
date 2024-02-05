package Problems.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));

        printFibonacciSeries(6);
    }

    static void printFibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

}
