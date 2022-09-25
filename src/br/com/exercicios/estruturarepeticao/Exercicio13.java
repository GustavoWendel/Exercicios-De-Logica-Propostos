package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

/*Faça um algoritmo que leia 20 números e, ao final,
escreva quantos estão entre 0 e 100.*/
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;

        for (int contador = 0; contador <= 3; contador++) {

            System.out.println("Digite um número:");
            numero = scan.nextInt();

            if (numero >= 0 && numero <= 100) {
                soma += numero;
            }
        }

        System.out.println("Soma de números entre 0 e 100: " + soma);
    }
}
