package Basics.Patterns;

public class Pattern_3 {
   public static void main(String[] args) {
       for(int i = 1; i <= 8; i ++ ){
            int totalCount = i > 4 ? 2 * 4 - i : i;
            for(int j = 1; j <= totalCount; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
   } 
}


// *
// **
// ***
// ****
// ***
// **
// *