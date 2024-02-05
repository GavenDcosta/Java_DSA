package Basics.Patterns;

public class Pattern_7 {
    public static void main(String[] args) {
        for(int i = 0; i <= 8; i++){
            for(int j = 0; j <= 8; j++){
                int atEveryIndex = Math.min(Math.min(i,j), Math.min(8-i, 8-j));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }
}


// 0 0 0 0 0 0 0 0 0
// 0 1 1 1 1 1 1 1 0
// 0 1 2 2 2 2 2 1 0
// 0 1 2 3 3 3 2 1 0
// 0 1 2 3 4 3 2 1 0
// 0 1 2 3 3 3 2 1 0
// 0 1 2 2 2 2 2 1 0
// 0 1 1 1 1 1 1 1 0
// 0 0 0 0 0 0 0 0 0
