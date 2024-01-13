package DataStructuresIntro;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {4,5,3,7,9,2};
        
        System.out.println("Before sorting");
        printArr(nums);

        selectionSort(nums);

        System.out.println("After Sorting");
        printArr(nums);
    }

    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void selectionSort(int[] nums){
 
        int minIndex = -1;

        for(int i=0; i< nums.length; i++){
            minIndex = i;
            for(int j=i+1; j<nums.length; j++){
                 if(nums[minIndex] > nums[j]){
                    minIndex = j;
                 }
            }
            int  temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}

// O(n^2)
