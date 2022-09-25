package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int qtd = 0;

        for (int contador = 0; contador <= 3; contador++) {
            System.out.println("Digite um valor: ");
            numero = scan.nextInt();

            if (numero > 8) {
                qtd++;
            }
        }

        System.out.println("Quantidade de valores maiores que 8 = " + qtd);
    }
}
