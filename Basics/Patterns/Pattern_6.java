package Basics.Patterns;

public class Pattern_6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++){

            int c = i > 4 ? 2*4 - i : i;

            for(int s = 0; s < 4 - c; s++){
               System.out.print(" ");
            }

            for(int j = c; j >= 1; j--){
                System.out.print(j);
            }

            for(int j = 2; j <= c; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}


//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1