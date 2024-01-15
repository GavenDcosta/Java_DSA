package Loops_and_Conditional;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        int result = factorialNum(fact, num);

        System.out.println(result);

    }

    public static int factorialNum(int fact, int num){
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }

        return fact;
    }
}
