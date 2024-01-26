// use this when the Q has a range of numbers "1 to n"

package DataStructuresIntro;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        printArr(arr);
    }

    static void cyclicSort(int[] arr){
        int i = 0; 
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    static void printArr(int[] arr){
         for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
         }
    }
}


// time complexity => O(n)
// space complexity => O(1)