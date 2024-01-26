package Problems.Loops;

public class RunningSumOfOneDArray{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] result = runningSum(nums);

        for(int i=0; i < result.length; i ++){
             System.out.print(result[i] + " ");  
        }
    }

    static int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }

        return nums;
    }    

    // int ans[] = new int[nums.length];

        // for(int i = 0; i< nums.length; i++){
        //     if(i == 0){
        //         ans[i] = nums[i];
        //     }

        //     if(i>0){
        //         int count = 0;
        //         for(int k = 0; k<=i; k++){
        //             count = count + nums[k];
        //         }
        //         ans[i] = count;
        //     }
        // }
        // return ans;
}