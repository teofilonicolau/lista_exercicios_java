package com.example.listadeexerciciosjava;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numero = scanner.nextLine();

        String invertido = new StringBuilder(numero).reverse().toString();

        System.out.println("Número invertido: " + invertido);
        scanner.close();
    }
}