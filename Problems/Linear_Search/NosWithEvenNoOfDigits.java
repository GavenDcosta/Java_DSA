package Problems.Linear_Search;

public class NosWithEvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        

        for(int num : nums){
            if(findNumbers(num) % 2 == 0){
                System.out.println(num + " is even");
            }else{
                System.out.println(num + " is odd");
            }
        }
        
    }

    static int findNumbers(int num) {
        int count = 0;

        while(num > 0){
            num = num/10;
            count++;
        }
        
        return count;

    }

   
}
