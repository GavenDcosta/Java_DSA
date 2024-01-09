package Basics;

import java.util.Scanner;

public class LoopsConditions {
    public static void main(String[] args) {
        int a = 10;
        if(a==10){
            System.out.println("The no is 10");
        } else if(a<10){
            System.out.println("The no is less than 10");
        }

        int count = 0;
        while(count != 10){
            System.out.println(count);
            count++;
        }

        for(int num = 1; num != 10; num++){
            System.out.println(num);
        }
    }
}
