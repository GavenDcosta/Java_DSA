package Problems.Cycle_Sort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(correctIndex > nums.length-1){
                i++;
            }else if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;   
             }else{
                 i++;
             }
        }
 
        for(int j = 0; j < nums.length; j ++){
            if(nums[j] != j){
                return j;
            }
        }
 
        return nums[nums.length - 1] + 1;
 
     }
}
