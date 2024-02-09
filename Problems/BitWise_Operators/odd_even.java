package Problems.BitWise_Operators;

public class odd_even {
    public static void main(String[] args) {
        System.out.println(isOdd(69));
        System.out.println(isOdd(70));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
