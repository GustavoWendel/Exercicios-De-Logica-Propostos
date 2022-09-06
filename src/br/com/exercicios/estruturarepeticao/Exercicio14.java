package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int soma1 = 0;
        int soma2 = 0;

        while (contador <= 20) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador = contador + 1;
            } else if (numero >= 101 && numero <= 200) {
                soma1 = contador + 1;
            } else {
                soma2 = contador + 1;
            }
        }

        System.out.println("Soma de números entre 0 e 100: " + contador);
        System.out.println("Soma de números entre 101 e 200: " + soma1);
        System.out.println("Soma de números acima de 200: " + soma2);

    }
}
