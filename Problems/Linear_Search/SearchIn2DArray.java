package Problems.Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
            {3,5,7},
            {44,69,43,56},
            {30,90},
            {9,77,23}
        };

        int target = 90;
        int target2 = 23;
        int target3 = 100;

        searchIn2D(arr, target);
        searchIn2D(arr, target2);
        searchIn2D(arr, target3);

        System.out.println(Arrays.toString(searchIn2D2(arr, target)));
        System.out.println(Arrays.toString(searchIn2D2(arr, target2)));
        System.out.println(Arrays.toString(searchIn2D2(arr, target3)));

    }

    static void searchIn2D(int[][] arr, int target){

        if(arr.length == 0){
            System.out.println("Element not found");
            return;
        }

        boolean found = false; // Flag to track if the element is found

       for(int row = 0; row<arr.length; row++){
        for(int col = 0; col< arr[row].length; col++){
            if(arr[row][col] == target){
                System.out.println("Elemet found at row : " + row + " and column : " + col);
                found = true;
            }
        }

       }

       if (!found) {
        System.out.println("Element not found");
       }
    }

    static int[] searchIn2D2(int[][] arr, int target){

        if(arr.length == 0){
            return new int[]{-1, -1};
        }

       for(int row = 0; row<arr.length; row++){
        for(int col = 0; col< arr[row].length; col++){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
        }

       }

    return new int[]{-1, -1};

    }
}
