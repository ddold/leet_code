package org.example.hard.median;

public class Main {
    public static void main(String[] args) {
        double ans = findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println("Answer is " + ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length];
        int nums1Position = 0;
        int nums2Position = 0;
        int combinedPosition = 0;

        while (nums1Position < nums1.length && nums2Position < nums2.length) {
            if (nums1[nums1Position] < nums2[nums2Position]) {
                combined[combinedPosition++] = nums1[nums1Position++];
            } else {
                combined[combinedPosition++] = nums2[nums2Position++];
            }
        }

        while (nums1Position < nums1.length) {
            combined[combinedPosition++] = nums1[nums1Position++];
        }

        while (nums2Position < nums2.length) {
            combined[combinedPosition++] = nums2[nums2Position++];
        }

        int length = combined.length;
        if (length % 2 == 0) {
            // length of arr is even
            int midOver = length / 2;
            int midUnder = midOver - 1;
            int mid1 = combined[midOver];
            int mid2 = combined[midUnder];

            return (double) (mid1 + mid2) / 2;
        }

        int mid = length / 2;
        return combined[mid];
    }
}
