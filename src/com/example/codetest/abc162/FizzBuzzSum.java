package com.example.codetest.abc162;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzzSum {

    public static void main(String[] args) {
        int num = standardInput();

        // overflow when input 1_000_000 into num
        long streamSum = IntStream.rangeClosed(0, num)
                .filter(n -> n % 3 != 0 && n % 5 != 0)
                .sum();
        System.out.println("FizzBuzzSum is: " + streamSum);

        long forSum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 3 != 0 && i % 5 != 0) forSum += i;
        }
        System.out.println("FizzBuzzSum forSum is: " + forSum);

    }

    public static int standardInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
