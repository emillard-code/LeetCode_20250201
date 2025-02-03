package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1};
        System.out.println(specialArrayI(nums1));

        int[] nums2 = new int[]{2,1,4};
        System.out.println(specialArrayI(nums2));

        int[] nums3 = new int[]{4,3,1,6};
        System.out.println(specialArrayI(nums3));

    }

    // This method returns true if the argument is a special array, false otherwise.
    public static boolean specialArrayI(int[] nums) {

        // If there is only one element, array is special by default.
        if (nums.length == 1) { return true; }

        // We check every index and compare it with the previous one.
        // If at any point the two indexes have the same parities, return false.
        for (int i = 1; i < nums.length; i++) {

            if (nums[i]%2 == nums[i - 1]%2) { return false; }

        }

        // If every index had a different parity with the previous index, return true.
        return true;

    }

}
