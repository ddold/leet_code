package org.example.medium.reverse_int;

public class Main {
    public static void main(String[] args) {
        int result = reverse(2147483647);
        System.out.println("Result is " + result);
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;
    }

//    public static int reverse(int x) {
//        boolean negative = false;
//        if (x < 0) {
//            negative = true;
//            x = Math.abs(x);
//        }
//        int reverse = 0;
//        while (x > 0) {
//            int mod = x % 10;
//            reverse = (reverse * 10) + mod;
//            x /= 10;
//        }
//
//        if (negative) {
//            reverse *= -1;
//        }
//
//        if (reverse > Integer.MAX_VALUE / 10) {
//            if (negative && reverse < Integer.MIN_VALUE / 10) {
//                return 0;
//            }
//            return 0;
//        }
//
//        return reverse;
//    }
}
