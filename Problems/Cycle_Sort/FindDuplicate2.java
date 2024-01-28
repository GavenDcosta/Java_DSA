package Problems.Cycle_Sort;

import java.util.Arrays;

public class FindDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int[] ans = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ans);

        for(int i = 0; i < ans.length; i ++){
            if(ans[i] == ans[i+1]){
                return ans[i];
            }
        }

        return -1;
    }
}
