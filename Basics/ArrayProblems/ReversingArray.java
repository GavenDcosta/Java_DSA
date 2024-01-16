package Basics.ArrayProblems;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,80,69,4};

        System.out.println("Before reversing");
        printArr(arr);

        System.out.println();

        System.out.println("Printing in reverse");
        printReverseArr(arr);

        System.out.println();

        reverseArr(arr);

        System.out.println();

        System.out.println("After Reversing");
        printArr(arr);
    }

    static void printReverseArr(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArr(int[] arr){
        int front = 0;
        int back = arr.length - 1;
        
        while(front<=back){
            int temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;  

            front++;
            back--;
        }
    }

    static void printArr(int[] arr){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
