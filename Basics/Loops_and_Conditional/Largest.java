package Basics.Loops_and_Conditional;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + " is the largest");
            }else{
                System.out.println(c + " is the largest");
            }
        }else{
            System.out.println(b + " is the largest");
        }


        /* 
         Another method
         
         int max = a;

         if(b>max){
            max = b;
         }

         if(c>max){
            max = c;
         }

         System.out.println(max)
         
        */


        /* 
         using the Math
         
         int max = Math.max(c, Math.max(a, b))

         System.out.println(max)
         
        */
    }
}
