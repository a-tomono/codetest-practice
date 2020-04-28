package com.example.codetest.abc162;

import java.util.Arrays;
import java.util.Scanner;

public class RGBTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        long total = 0;
        long rCount = 0;
        long bCount = 0;
        long gCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R') {
                rCount++;
            } else if (c == 'G') {
                gCount++;
            } else {
                bCount++;
            }
        }
        total = rCount * gCount * bCount;


        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = 2 * j - i;
                if (k < n) {
                    if (s.charAt(i) != s.charAt(j)
                            && s.charAt(i) != s.charAt(k)
                            && s.charAt(j) != s.charAt(k)) {
                        total--;
                        System.out.println("j:" + j + " - i:" + i + " != k:" + k + " - j:" + j);
                        System.out.println("j-i:" + (j - i) + " != k-j:" + (k - j));
                    }
                }
            }
        }

        System.out.println("total: " + total);

    }

}
