package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1};
        System.out.println(isArraySpecial(nums1));

        int[] nums2 = new int[]{2,1,4};
        System.out.println(isArraySpecial(nums2));

        int[] nums3 = new int[]{4,3,1,6};
        System.out.println(isArraySpecial(nums3));

    }

    public static boolean isArraySpecial(int[] nums) {

        // Iterate through indexes 0 to n - 1
        for (int index = 0; index < nums.length - 1; index++) {

            // Compare the parities using bitwise operations
            if (((nums[index] & 1) ^ (nums[index + 1] & 1)) == 0) {
                // If the two adjacent numbers have the same parity, return false
                return false;
            }

        }

        // Return true if no pair of adjacent numbers with the same parity are found
        return true;

    }

}
