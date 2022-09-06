package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

/*Faça um algoritmo que leia 20 números e, ao final,
escreva quantos estão entre 0 e 100.*/
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;

        while (contador <=3) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            if (numero >= 0 && numero <= 100) {
                contador = contador + 1;
            }
        }

        System.out.println("Soma de números entre 0 e 100: " + contador);
    }
}
