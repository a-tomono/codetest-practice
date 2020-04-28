package com.example.codetest.abc162;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fibonacci {
    public static void main(String[] args) {

        int num = standardInput();
        int sum = IntStream.rangeClosed(0, num)
                .map(Fibonacci::fibonacci)
                .sum();
        System.out.println("fibonacci sum of 0 to num: " + sum);

        IntStream.rangeClosed(0, num)
                .map(Fibonacci::fibonacci)
                .forEach(n -> System.out.print(n + " "));
    }

    public static int standardInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
