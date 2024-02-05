package Problems.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {2,3,4,5,7,8,9,12};

        System.out.println("Element found at position : " + binarySrc(num, 0, num.length - 1, 4));
        System.out.println("Element found at position : " + binarySrc(num, 0, num.length - 1, 7));
        System.out.println("Element found at position : " + binarySrc(num, 0, num.length - 1, 69));
    }

    static int binarySrc(int[] nums, int start, int end, int target){        
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                return binarySrc(nums, mid + 1, end, target);
            }else{
                return binarySrc(nums, start, mid - 1, target);
            }
        }

        return -1;

    }
}
