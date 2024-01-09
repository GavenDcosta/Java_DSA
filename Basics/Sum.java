package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter Second no");
        int b = sc.nextInt();

        c = a + b;
        System.out.println("The Sum is " + c);
    }

}
