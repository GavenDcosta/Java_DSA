package Problems.Binary_Search;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {0,2,4,6,8,10,7,5,2};

        int target = 7;

        int result = peakIndexInMountainArray(arr);

        System.out.println("Peek Index is : " + result);

        int ans1 = binarySearch(arr, target, 0, result);
        int ans2 = binarySearch2(arr, target, result+1, arr.length-1);

        if(ans1 == -1){
            System.out.println(ans2);
        }else{
            System.out.println(ans1);
        }
    }

    

    public static int peakIndexInMountainArray(int[] arr) {
       int s = 0;
       int e = arr.length - 1;

       while(s<=e){
           int mid = s + (e-s)/2;

           if(arr[mid] < arr[mid + 1]){
               s = mid + 1;
           }else{
               e = mid - 1;
           }
       }

       return s;
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

    public static int binarySearch2(int[] nums, int target, int s, int e){
    
        int start = s;
        int end = e;
    
        
        while(start <= end){
            int mid = start + (end - start)/2;
    
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
    
        }
    
        return -1;
    }
}
