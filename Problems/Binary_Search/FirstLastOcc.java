package Problems.Binary_Search;

public class FirstLastOcc {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,6,6,7,9};
        int target = 6;

        int[] result = searchRange(nums, target);

        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstOcc = -1;
        int lastOcc = -1;

        if(nums.length == 0){
            return new int[]{-1, -1};
        }

        if(nums.length == 1 && target == nums[0]){
            return new int[]{0,0};
        }

        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == target){
                firstOcc = i;
                break;
            }
        }

        for(int j = nums.length-1; j >= 0; j --){
            if(nums[j] == target){
                lastOcc = j;
                break;
            }
        }

        return new int[]{firstOcc, lastOcc};
    }
}

