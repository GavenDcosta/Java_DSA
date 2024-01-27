package Problems.Loops;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3, n = 3;
        int[] nums2 = {2,5,6};

        for(int i = 0 ; i < nums1.length; i ++){
            System.out.print(nums1[i] + " ");
        }

        System.out.println();

        for(int i = 0 ; i < nums2.length; i ++){
            System.out.print(nums2[i] + " ");
        }

        System.out.println();

        merge(nums1, m, nums2, n);

        for(int i = 0 ; i < nums1.length; i ++){
            System.out.print(nums1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0, j = m; i < n; i++, j ++){
            nums1[j] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
