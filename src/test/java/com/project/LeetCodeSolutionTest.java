package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void isArraySpecialTest() {

        int[] nums1 = new int[]{1};
        assertTrue(LeetCodeSolution.isArraySpecial(nums1));

        int[] nums2 = new int[]{2,1,4};
        assertTrue(LeetCodeSolution.isArraySpecial(nums2));

        int[] nums3 = new int[]{4,3,1,6};
        assertFalse(LeetCodeSolution.isArraySpecial(nums3));

    }

}
