package Problems.Cycle_Sort;

public class Set_Mismatch {
    public static void main(String[] args) {
        int nums[] = {3,2,2};

        int result[] = findErrorNums(nums);

        for(int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j ++){
            if(nums[j] != j+1){
                return new int[]{nums[j], j+1};
            }
        }

        return new int[]{-1};
    }
}
