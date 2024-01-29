package Problems.Loops;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }

    static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        if(nums.length == 0){
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak,currentStreak);
    }
}
