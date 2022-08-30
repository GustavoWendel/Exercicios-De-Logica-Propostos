package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;
        do {
            System.out.println("Digite um valor: ");
            numero = scan.nextInt();
            if (numero > 8) {
                count = count + 1;
            }
        } while(count <= 20);

        System.out.println("Quantidade de valores maiores que 8 = " + count);
    }
}
