package Basics.ArrayProblems;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,34,69,23};
  
        System.out.println("Before Swapping");
        printArr(arr);

        System.out.println();

        swap(arr, 1, 3);

        System.out.println("After Swapping");
        printArr(arr);
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
