package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        for (int count = 1; count <= 10; count++) {
            System.out.print(String.format(count + " x %d = %d \n", numero, count * numero));
        }
    }
}
