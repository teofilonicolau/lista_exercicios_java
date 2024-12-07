package com.example.listadeexerciciosjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números da sequência de Fibonacci deseja exibir? ");
        int n = scanner.nextInt();

        int a = 0, b = 1, c;

        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        scanner.close();
    }
}
