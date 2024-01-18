package Problems.Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int nums[] = {1,2,13,16,18,29};

        int target = 15;

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

        return end;
    }
}


// O(log n)


