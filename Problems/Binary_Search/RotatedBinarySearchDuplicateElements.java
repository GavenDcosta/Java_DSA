package Problems.Binary_Search;

public class RotatedBinarySearchDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4,5,5,6,7,7,0,1,1,2};
        System.out.println(findPivot(arr));

        int target = 1;

        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
          int pivot = findPivot(nums);

          if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
          }

          if(nums[pivot] == target){
            return pivot;
          }

          if(target >= nums[0]){
              return binarySearch(nums, target, 0, pivot - 1);
          }

          return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                 start = mid +1;
            }else{
                end = mid - 1;
            }


        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target, int s, int e){
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
        
        return -1;
    }
}