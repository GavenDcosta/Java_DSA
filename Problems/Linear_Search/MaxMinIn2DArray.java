package Problems.Linear_Search;

public class MaxMinIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
            {3,5,7},
            {44,69,43,56},
            {30,90,1},
            {9,77,23}
        };

        System.out.println("Max is : " + findMax(arr));
        System.out.println("Min is : " + findMin(arr));
    }

    public static int findMax(int[][] arr){
        int max = arr[0][0];  
               
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
         }

        return max;
    }

    public static int findMin(int[][] arr){
        int min = arr[0][0];  
               
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
         }

        return min;
    }
}
