package Problems.Binary_Search;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(15));
        System.out.println(mySqrt(16));
    }

    public static int mySqrt(int x) {
        long s = 0;
        long e = x - 1;
        long mid = 0;

        if(x == 1 || x == 0){
            return x;
        }

        while(s <= e){
            mid = s + (e-s)/2;

            if(mid*mid == x){
                return (int)mid;
            }else if(mid*mid > x){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return (int)e;
    }
}
