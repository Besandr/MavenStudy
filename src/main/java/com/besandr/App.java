package com.besandr;

import com.besandr.foo.Util;

public class App {
    public static void main(String[] args) {
        int a = 2, b = 7;
        System.out.printf("The delta between a = %d and b = %d is: %d\n", a, b, new Util().getDelta(a, b));
    }
}
