package Loops_and_Conditional;

public class Reverse {
    public static void main(String[] args) {
        int num = 23485;
        int ans = 0;
    
        while(num > 0){
            int rem = num%10;
            ans = ans * 10 + rem;
            num = num/10;
        }

        System.out.println(ans);
    
    }
}
