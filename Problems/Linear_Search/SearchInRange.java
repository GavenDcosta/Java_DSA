package Problems.Linear_Search;

import java.util.*;

public class SearchInRange{
    public static void main(String[] args) {
        int[] arr = {2,3,-69,45,-40};

        int target = 3;
        int target2 = -69;

        System.out.println(search(arr, target,3,4));

        System.out.println(search(arr, target2,1,3));
    }

    static boolean search(int[] arr, int target, int startIndex, int endIndex){

        if(arr.length == 0){
            return false;
        }

        for(int i = startIndex; i<=endIndex; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }
}