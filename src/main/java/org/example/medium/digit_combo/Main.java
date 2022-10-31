package org.example.medium.digit_combo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> combos = Main.letterCombinations("234");
//        System.out.println(combos);

        int a = 708;
        String aString = String.valueOf(a);
        char[] aArr = aString.toCharArray();
        System.out.println(Character.getNumericValue(aArr[0]));
    }

    public static List<String> letterCombinations(String digits) {
        String nums = "23456789";
        String[] chars = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> combos = new ArrayList<>();

        if (digits.equals("")) {
            return combos;
        }

        if (digits.length() == 1) {
            int num = Integer.parseInt(digits);
            int index = nums.indexOf(String.valueOf(num));
            String texts = chars[index];
            for (int i = 0; i < texts.length(); i++) {
                combos.add(String.valueOf(texts.charAt(i)));
            }
        } else {
            String[] singleDigits = new String[digits.length()];
            for (int i = 0; i < digits.length(); i++) {
                singleDigits[i] = String.valueOf(digits.charAt(i));
            }

            for (int i = 0; i < singleDigits.length; i++) {
                if (i + 1 >= singleDigits.length) {
                    break;
                }
                String num1 = singleDigits[i];
                String num2 = singleDigits[i + 1];

                int index1 = nums.indexOf(num1);
                int index2 = nums.indexOf(num2);

                String text1 = chars[index1];
                String text2 = chars[index2];

                for (int j = 0; j < text1.length(); j++) {
                    for (int k = 0; k < text2.length(); k++) {
                        combos.add(Character.toString(text1.charAt(j)) + Character.toString(text2.charAt(k)));
                    }
                }
            }
        }

        return combos;
    }
}
