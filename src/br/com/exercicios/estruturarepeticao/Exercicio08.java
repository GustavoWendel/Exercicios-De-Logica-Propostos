package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        int count = 0;
        while(count <= 3) {
            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();
            if (idade > 18) {
                count = count + 1;
            }
        }

        System.out.println("Quantidade de pessoas que são maiores de idade: " + count);
    }
}
