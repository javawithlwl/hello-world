package com.careerit.jfs.sample;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int num = 5;
        int res = fact(num);
        System.out.println("Factorial of " + num + " is " + res);
    }

    // Write a recursive method to find gcd of two numbers

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }


    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
