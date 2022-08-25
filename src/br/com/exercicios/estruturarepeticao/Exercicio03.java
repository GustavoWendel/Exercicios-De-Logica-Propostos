package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        int contador = 1;

        while(contador < 10) {
            System.out.println(nome);
            contador++;
        }

        System.out.println("Repetições do nome = " + contador);
    }
}
