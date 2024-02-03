package Basics.Patterns;

public class Pattern_2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j<=i; j ++){
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= 4; i++){
            for(int j = 4; j>=i; j --){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}


// 1
// 12
// 123
// 1234

// 4321
// 432
// 43
// 4