package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nome = new String[4];
        int[] idade = new int[4];

        int menorIdade = 0;

        for (int posicao = 1; posicao <= 5; posicao++) {
            System.out.println("Nome " + posicao + ":");
            nome[posicao] = scan.nextLine();
        }

        for (int pos2 = 1; pos2 <= 5; pos2++) {
            System.out.println("Idade " + pos2 + ":");
            idade[pos2] = scan.nextInt();
            if (idade[pos2] < menorIdade) {
                menorIdade = idade[pos2];
            }
        }
        System.out.println();
        System.out.println("Menor idade: " + menorIdade);
    }
}
