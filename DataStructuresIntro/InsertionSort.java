package DataStructuresIntro;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {34,12,3,55,7,1};

        System.out.println("Before Sorting");
        printArr(nums);

        insertionSort(nums);

        System.out.println();

        System.out.println("After Sorting");
        printArr(nums);
    }

    public static void printArr(int[] nums){
        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void insertionSort(int[] nums){
        for(int i = 1; i<nums.length; i++){
            int j = i-1;
            int key = nums[i];

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = key;
        }
    }
}
