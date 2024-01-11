package DataStructuresIntro;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int nums[] = {2,34,56,76,88,99};
        int target = 88;

        int result = binarySearch(nums, target, 0, nums.length-1);

        if(result != -1){
            System.out.println("Element found at index : " + result);
        }else{
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] nums, int target, int start, int end){   
        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                return binarySearch(nums, target, mid+1, end);
            }else{
                return binarySearch(nums, target, start, mid-1);
            }
        }

        return -1; 
    }
}
