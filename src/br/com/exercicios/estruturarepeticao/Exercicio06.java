package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int somaIdade = 0;

        for (int i =1; i <= 20; i++) {
            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();
            somaIdade = somaIdade + idade;
        }

        System.out.println("Soma total das idades: " +  somaIdade);
    }
}
