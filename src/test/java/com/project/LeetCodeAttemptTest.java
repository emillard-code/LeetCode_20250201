package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void specialArrayITest() {

        int[] nums1 = new int[]{1};
        assertTrue(LeetCodeAttempt.specialArrayI(nums1));

        int[] nums2 = new int[]{2,1,4};
        assertTrue(LeetCodeAttempt.specialArrayI(nums2));

        int[] nums3 = new int[]{4,3,1,6};
        assertFalse(LeetCodeAttempt.specialArrayI(nums3));

    }

}
