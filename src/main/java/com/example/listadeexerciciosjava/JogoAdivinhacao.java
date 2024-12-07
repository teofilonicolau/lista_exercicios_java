package com.example.listadeexerciciosjava;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int palpite;

        do {
            System.out.print("Digite seu palpite (entre 1 e 50): ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Palpite errado. Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}