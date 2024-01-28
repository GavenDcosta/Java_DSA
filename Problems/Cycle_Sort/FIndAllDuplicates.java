package Problems.Cycle_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public interface FIndAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,3,1,4,2,2};

        ArrayList<Integer> result = cyclicSort(nums);

        for(int num : result){
            System.out.print(num + " ");
        }
    }

    static ArrayList<Integer> cyclicSort(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0; 
        while(i < arr.length){

            if(arr[i] != i+1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i , correctIndex);
                }else{
                    i++;

                    // if(list.contains(arr[i])){
                    //     i++;
                    // }else{
                    //     list.add(arr[i]);
                    //     i++;
                    // }
                }
            }else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j ++){
            if(arr[j] != j + 1){
                list.add(arr[j]);
            } 
        }

        return list;
    }

    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
