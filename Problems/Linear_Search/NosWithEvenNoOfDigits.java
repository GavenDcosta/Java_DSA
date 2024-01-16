package Problems.Linear_Search;

public class NosWithEvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {-12,345,-2,6,7896};
        

        for(int num : nums){
            if(num < 0){
                num = num * -1;
            }

            if(findNumbers(num) % 2 == 0){
                System.out.println(num + " is of even length");
            }else{
                System.out.println(num + " is of odd length");
            }
        }

        System.out.println();

        for(int num : nums){
            if(num < 0){
                num = num * -1;
            }

            if(optimizedFindNumbers(num) % 2 == 0){
                System.out.println(num + " is of even length");
            }else{
                System.out.println(num + " is of odd length");
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

    static int optimizedFindNumbers(int num) {
        return (int)(Math.log10(num)) + 1;

    }

   
}
