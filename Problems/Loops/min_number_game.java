package Problems.Loops;

import java.util.Arrays;

public class min_number_game {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};

        int[] result = numberGame(nums);

        for(int i = 0; i < result.length; i ++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);

        int j = 0;

        for(int i = 1; i < nums.length; i+=2){
            ans[j+1] = nums[i-1];
            ans[j] = nums[i];

            j+=2; 
        }

        return ans;
    }
}
