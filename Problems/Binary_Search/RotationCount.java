package Problems.Binary_Search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2};

        System.out.println("Rotation Count : " + findMin(arr));
    }

    static int findMin(int[] nums){
        int s = 0;
        int e = nums.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(mid < e && nums[mid] > nums[mid+1]){
                return mid+1;
            }

            if(mid > s && nums[mid] < nums[mid-1]){
                return mid;
            }

            if(nums[s] > nums[mid]){
                e = mid-1;
            }else{
                s = mid +1;
            }
        }

        return -1;
    }
}
