package com.besandr.foo;

public class Util {

    public static int getDelta(int first, int second) {
        return Math.abs(first - second);
    }

    public static double division(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }
        return dividend / divisor;
    }

    public static String textRepresentationNumber(int number) {
        if (number > 100 || number < 0) {
            throw new IllegalArgumentException("Out of number's range (0 <= number <= 100");
        }

        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};

        String result;
        if (number < 19) {
            result = ones[number];
        } else {
            int tensNumb = (number - number % 10) / 10;
            int onesNumb = number % 10;
            result = tens[tensNumb - 2] + "-" + ones[onesNumb];
        }

        return result;
    }
}
