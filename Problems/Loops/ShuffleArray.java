package Problems.Loops;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        System.out.println("Before Shuffle");
        printAns(nums);

        System.out.println();

        System.out.println("After Shuffle");

        int[] result = shuffle(nums, n);

        printAns(result);
    }

    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];

        int temp = 0;

        for(int i = 0, j = n; i < nums.length/2; i++, j++){
            ans[temp++] = nums[i];
            ans[temp++] = nums[j];
        }

        return ans;
    }

    static void printAns(int[] result){
        for(int i = 0; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
