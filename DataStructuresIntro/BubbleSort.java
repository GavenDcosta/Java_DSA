package DataStructuresIntro;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};

        System.out.println("Before Sorting");
        printArr(nums);

        bubbleSort(nums);

        System.out.println("After sorting");
        printArr(nums);

    }

    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j ++){  //nums.length - i - 1 => Added a "- i" because in the new iterations we wont be needing to comapare the last element again , because in every iteration the largest value always comes at the end
               if(nums[j] > nums[j + 1]){
                swap(nums, j, j+1);
                
                //  int temp = nums[j];
                //  nums[j] = nums[j+1];
                //  nums[j+1] = temp;
               }
            }
        }
    }


    public static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

}


// O(n^2)
