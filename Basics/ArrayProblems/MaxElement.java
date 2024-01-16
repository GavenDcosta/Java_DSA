package Basics.ArrayProblems;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,69,3,44};

        System.out.println("Max element is : " + max(arr));

        System.out.println("Max element in range 0-3 is : " + maxRange(arr, 0, 3));
        
    }

    static int max(int[] arr){
        int max = 0;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    static int maxRange(int[] arr, int startIndex, int endIndex){
        int max = 0;

        for(int i = startIndex; i < endIndex; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
