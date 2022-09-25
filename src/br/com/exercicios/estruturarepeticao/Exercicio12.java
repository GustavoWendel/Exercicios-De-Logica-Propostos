package br.com.exercicios.estruturarepeticao;

/*Escreva um algoritmo que leia 20 números do usuário e
exiba quantos números são pares*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int par = 0;

        for (int contador1 = 0; contador1 <= 20; contador1++) {
            System.out.println();
            numero = scan.nextInt();
            
            if (numero % 2 == 0) {
                par++;
            }
        }

        System.out.println("Quantidade números pares = " + par);
    }
}
