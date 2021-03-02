package com.company;

import java.util.Scanner;

public class Timur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = a;
        int i = 1;

        if (b > 0) {
            while (i < b) {
                n = n + a;
                i++;
            }
        } else {
            while (i > b) {
                n = n - a;
                i--;
            }
        }
        System.out.println(n);
    }
}
