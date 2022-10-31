package org.example.medium.longest_substring;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcbb");
        System.out.println("Length is " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < stringLength; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

        return maxLength;
    }

//    public static int lengthOfLongestSubstring(String s) {
//        if (s.isEmpty()) {
//            return 0;
//        } else if (s.isBlank() || s.length() == 1) {
//            return 1;
//        }
//        char[] chars = s.toCharArray();
//        int maxLength = 0;
//        StringBuilder maxString = new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            maxString.append(chars[i]);
//            for (int j = i + 1; j < chars.length; j++) {
//                if (maxString.toString().indexOf(chars[j]) == -1) {
//                    maxString.append(chars[j]);
//                } else {
//                    // found a match
//                    if (maxLength < maxString.toString().length()) {
//                        maxLength = maxString.toString().length();
//                    }
//                    maxString = new StringBuilder();
//                    break;
//                }
//
//                if (j == chars.length - 1) {
//                    if (maxLength < maxString.toString().length()) {
//                        maxLength = maxString.toString().length();
//                    }
//                    maxString = new StringBuilder();
//                }
//            }
//        }
//        return maxLength;
//    }
}
