package Problems.Loops;

public class LeftAndRightSumDifference {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};

        int[] leftResult = leftSum(nums);

        for(int i = 0 ; i<leftResult.length; i++){
            System.out.print(leftResult[i] + " ");
        }

        System.out.println();

        int[] rightResult = rightSum(nums);

        for(int i = 0 ; i<rightResult.length; i++){
            System.out.print(rightResult[i] + " ");
        }

        System.out.println();

        int[] ans = leftRightDifference(nums, leftResult, rightResult);

        for(int i = 0 ; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    static int[] leftSum(int[] nums){
        int[] leftAns = new int[nums.length];
        leftAns[0] = 0;

        for(int i = 0; i < nums.length-1; i ++){
            
            leftAns[i+1] = leftAns[i] + nums[i];
        }

        return leftAns;

    }

    static int[] rightSum(int[] nums){
        int[] rightAns = new int[nums.length];

        rightAns[nums.length-1] = 0;

        for(int i = nums.length-1 ; i >0; i --){
            rightAns[i-1] = rightAns[i] + nums[i];
        }

        return rightAns;

    }



    public static int[] leftRightDifference(int[] nums, int[] left, int[] right) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i ++){
            ans[i] = Math.abs(left[i] - right[i]);
        }

        return ans;
    }
}
