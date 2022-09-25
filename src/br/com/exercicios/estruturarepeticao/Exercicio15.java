package br.com.exercicios.estruturarepeticao;


import java.util.Scanner;

/*Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado.*/
public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0;
        int soma  = 0;
        int contador = 0;

        while (contador >= 0) {
            // Sempre que o valor for maior que 0, ele entrada no loop
            if (n >= 0) {

                System.out.println("Digite um número inteiro: ");
                n = scan.nextInt();
                contador++;
                soma += n;

            } else {
                System.out.println("Resultado: " + soma);
                System.out.println("Fim.");
                System.exit(0);
            }
        }
    }
}
