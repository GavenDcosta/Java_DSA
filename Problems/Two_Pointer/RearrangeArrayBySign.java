package Problems.Two_Pointer;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] nums= {3,1,-2,-5,2,-4};

        int[] result = rearrangeArray(nums);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
 
        int pt1 = 0;
        int pt2 = 1;
 
        for(int num: nums){
            if(num > 0){
                ans[pt1] = num;
                pt1 += 2;
            } else if(num < 0){
                ans[pt2] = num;
                pt2 += 2;
            }
        }
 
        return ans;
     }
}
