package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int contador = 0;

        while(contador < numero) {
            System.out.println(nome);
            contador++;
        }

    }
}
