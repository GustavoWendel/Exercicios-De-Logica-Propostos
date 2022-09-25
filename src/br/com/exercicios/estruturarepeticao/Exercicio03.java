package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        /*while(contador < 10) {
            System.out.println(nome);
            contador++;
        }*/

        int contador;
        for (contador = 1; contador < 10; contador++) {
            System.out.println(nome);
        }

        System.out.println("Repetições do nome = " + contador);
    }
}
