package org.example.medium.roman_numerals;

public class RomanNumerals {

    public static void main(String[] args) {
        RomanNumerals romanNumerals = new RomanNumerals();
        int num = 58;

        String converted = romanNumerals.intToRoman(num);
        System.out.println(num + " converted to roman numerals is " + converted);
    }

    public String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanBuilder = new StringBuilder();

        for (int i = 0; i < value.length && num > 0; i++) {
            while (num >= value[i]) {
                romanBuilder.append(roman[i]);
                num -= value[i];
            }
        }
        return romanBuilder.toString();
    }
}
