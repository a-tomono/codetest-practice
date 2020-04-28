package com.example.codetest.abc162;

import java.util.Scanner;

public class SumOfGCD {
    public static void main(String[] args) {
        int num = standardInput();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= num; k++) {
                    sum += gcdOf(gcdOf(i, j), k);
                }
            }
        }
        System.out.println("sum is: " + sum);
    }

    public static int standardInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int gcdOf(int a, int b) {
        if (b == 0) return a;

        return gcdOf(b, a % b);
    }
}
