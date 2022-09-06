package br.com.exercicios.estruturarepeticao;

/*Escreva um algoritmo que leia 20 números do usuário e
exiba quantos números são pares*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int par = 0;


        do {
            System.out.println();
            numero = scan.nextInt();
            contador++;

            if(numero % 2 == 0) {
                par++;
            }
        } while (contador <= 20);

        System.out.println("Quantidade números pares = " + par);
    }
}
