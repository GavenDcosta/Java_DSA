package Problems.Binary_Search;

//https://leetcode.com/problems/first-bad-version/solutions/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class isBadVersion {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans = 0;


        while(s<=e){
            int mid = s + (e-s)/2;

            if(isBadVersion(mid) == true){
                ans = mid;
                e = mid-1;
            }else if(isBadVersion(mid) == false){
                s = mid+1;
            }
        }

        return ans;
    }

    static boolean isBadVersion(int n){
        if(n > 10){
            return true;
        }

        return false;
    }
}
