package Problems.BitWise_Operators;

public class find_i_value {
    public static void main(String[] args) {
        int n = 10100;
        int i = 2; 
        
        int result = (n & (1 << i)) >> i; 
        
        System.out.println("The value of the " + i + "-th bit of " + n + " is: " + result);
     
    }
}
