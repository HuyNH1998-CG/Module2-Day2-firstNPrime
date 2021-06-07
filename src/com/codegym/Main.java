package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of prime number to print");
        int number = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            boolean Check = true;
            for (int i = 2; i <= N / 2; i++) {
                if (N % i == 0){
                    Check = false;
                    break;
                }
            }
            if (Check){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
