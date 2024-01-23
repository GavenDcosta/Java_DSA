package Problems.Binary_Search;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(13));
    }

    public static boolean isPerfectSquare(int num) {
        long s = 1;
        long e = num/2;

        if(num == 1){
            return true;
        }

        while(s<=e){
            long mid = s + (e-s)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid < num){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return false;
    }
}
