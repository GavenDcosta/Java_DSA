package Basics.Patterns;

public class Pattern_4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i ++ ){
            int totalCount = i > 4 ? 2 * 4 - i : i;

            int noOfSpaces = 4 - totalCount;
            for(int s = 1; s <= noOfSpaces; s++){
               System.out.print(" ");
            }

            for(int j = 1; j <= totalCount; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    * 