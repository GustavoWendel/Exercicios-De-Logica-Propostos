package br.com.exercicios.estruturarepeticao;

public class Exercicio01 {
    public static void main(String[] args) {

        int contador = 0;
        String mensagem = "Eu gosto de estudar Algoritmos!";

        while(contador <= 20) {
            System.out.println(mensagem);
            contador++;
        }

        for(int contador1 = 0; contador1 <= 20; contador1++) {
            System.out.println(mensagem);
        }
    }
}
