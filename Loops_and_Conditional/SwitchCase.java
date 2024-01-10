package Loops_and_Conditional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day){
            case 1:
               System.out.println("Monday");
               break;
            case 2: 
               System.out.println("Tuesday"); 
               break;  
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday"); 
                break; 
            case 5:
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday"); 
                break;
            case 7: 
                System.out.println("Sunday"); 
                break;
        }

         //method 2

          switch (day){
            case 1 -> System.out.println("Monday");
            
            case 2 ->  System.out.println("Tuesday"); 
                
            case 3 -> System.out.println("Wednesday");
            
            case 4 ->  System.out.println("Thursday"); 
                
            case 5 -> System.out.println("Friday");
            
            case 6 ->  System.out.println("Saturday"); 
            
            case 7 -> System.out.println("Sunday"); 
        
        }
         

        //another syntax

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    
    }
}
