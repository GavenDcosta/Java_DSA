package Problems.Binary_Search;

public class SearchingInInfiniteArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,6,8,9,12,13,15,16,18,20,23,24,26,27,29};

        int target = 9;
       int[] range = findRange(nums, target); 

        int result = binarySearch(nums, target, range[0], range[1]);

        if(result != -1){
            System.out.println("Element found at index : " + result);
        }else{
            System.out.println("Element not found");
        }
    }

    public static int[] findRange(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(target > end){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return new int[]{start, end};
    }

    public static int binarySearch(int[] nums, int target, int s, int e){

        if(target > nums[nums.length-1] || target < nums[0]){
            return -1;
        }
        
        int start = s;
        int end = e;

        
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

        return end;
    }
}
