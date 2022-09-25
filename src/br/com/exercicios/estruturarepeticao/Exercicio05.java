package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while (numero <= 10) {

            System.out.println("Digite um valor: ");
            numero = scan.nextInt();
            soma += numero;
        }

        System.out.println(soma);
    }
}
