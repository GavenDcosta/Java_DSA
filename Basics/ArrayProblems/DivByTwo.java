package Basics.ArrayProblems;

public class DivByTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5,3};
        int count = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
