package Problems.Cycle_Sort;

import java.util.ArrayList;
import java.util.List;

public class AllDisappeardNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 0;
       while(i < nums.length){
            int correctIndex = nums[i] - 1;
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

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(j + 1);
            }
        }

        return list;
    }
}
