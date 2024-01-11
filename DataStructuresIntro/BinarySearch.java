package DataStructuresIntro;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,6,8,9};

        int target = 8;

        int result = binarySearch(nums, target);

        if(result != -1){
            System.out.println("Element found at index : " + result);
        }else{
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return -1;
    }
}
