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
        int first = firstOcc(nums, target);
        int last = lastOcc(nums,target);

        return new int[]{first, last};
    }

    public static int firstOcc(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                ans = mid;
                e = mid-1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return ans;
    }

    public static int lastOcc(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                ans = mid;
                s = mid + 1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return ans;
    }
}

