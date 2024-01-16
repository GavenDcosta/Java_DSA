package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class twoD_Arrys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[3][4];
        System.out.println(arr.length);

        System.out.println();

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println();

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " "); 
            }
            System.out.println();
        }

        System.out.println();

        for(int row = 0; row < arr.length; row++){
                System.out.println(Arrays.toString(arr[row])); 
        }

        System.out.println();

        for(int[] a : arr){
            System.out.println(Arrays.toString(a)); 
        }
    }
}
