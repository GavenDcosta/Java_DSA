package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);


        // Type Casting
        int num2 = (int)(69.69f);
        System.out.println(num2);


        //automatic type promotions in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;

        int f = c * d / e;

        System.out.println(f);


        int number = 'A';
        System.out.println(number);

        System.out.println("您好");


        byte r = 42;
        char t = 'a';
        short s = 1024;
        int i = 50000;
        float j = 5.55f;
        double k = 0.4353;
        double result = (k*t) + (r+s) + (j/k);
        
        System.out.println((k*t) + " " + (r+s) + " " + (j/k));
        System.out.println(result);
   }
}
