package DataStructuresIntro;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {22,1,33,43,23,11};

        System.out.println("Before Sorting");
        printArr(nums);

        quickSort(nums, 0, nums.length-1);

        System.out.println();

        System.out.println("After Sorting");
        printArr(nums);
    }

 
    public static void printArr(int[] nums){
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void quickSort(int[] nums, int low, int high){
        if(low < high){
            int pi = partition(nums, low, high);

            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }


    private static int partition(int[] nums, int low, int high){
         int pivot = nums[high];
         int i = low - 1;

         for(int j = low; j<high; j++){
            if(nums[j] < pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
         }

         int temp = nums[i+1];
         nums[i+1] = nums[high];
         nums[high] = temp;

         return i+1;
    }
}


// O(n log n)
