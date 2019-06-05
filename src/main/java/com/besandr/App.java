package com.besandr;

import com.besandr.foo.Util;

public class App {
    public static void main(String[] args) {
        int a = 2, b = 7;
        System.out.printf("The delta between a = %d and b = %d is: %d\n", a, b, Util.getDelta(a, b));

        a = 28;
        b = 8;
        System.out.printf("The %d / %d result is: %.2f\n", a, b, Util.division(a, b));

        System.out.printf("The text representation of number %d is: %s\n", a, Util.textRepresentationNumber(a));
    }
}
