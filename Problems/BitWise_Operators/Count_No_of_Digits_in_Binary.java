package Problems.BitWise_Operators;

public class Count_No_of_Digits_in_Binary {
    public static void main(String[] args) {
        // Method 1

        //count no of digits but in binary form

        int n = 7;
        int count = 0;
        
        while(n > 0){
            n >>= 1;
            count++;
        }

        System.out.println(count);

        //Method 2

        //count no of digits
        int no = 345;

        int b = 10;

        int ans = (int)(Math.log(no) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
