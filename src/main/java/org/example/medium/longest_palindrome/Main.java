package org.example.medium.longest_palindrome;

public class Main {

    public static void main(String[] args) {
        String isPalindrome = "cbbd";

        String ans = longestPalindrome(isPalindrome);
        System.out.println(ans);
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCentre(s, i, i);
            int len2 = expandAroundCentre(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCentre(String s, int left, int right) {
        int L = left;
        int R = right;

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }

        return R - L - 1;
    }

//    public static String longestPalindrome(String s) {
//        int maxPalindromeLength = 0;
//        String maxPalindrome = "";
//        char[] chars = s.toCharArray();
//
//        for (int firstHalfPosition = 0, lastHalfPosition = s.lastIndexOf(chars[firstHalfPosition]); firstHalfPosition < s.length() / 2; firstHalfPosition++, lastHalfPosition--) {
//            if (chars[firstHalfPosition] == chars[lastHalfPosition] || firstHalfPosition == lastHalfPosition) {
//                System.out.println(s.substring(firstHalfPosition, lastHalfPosition + 1));
//            }
//        }
//
//        return maxPalindrome;
//    }
}
